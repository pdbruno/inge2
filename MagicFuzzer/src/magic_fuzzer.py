from typing import List, Set
from fuzzingbook.Coverage import Location
from fuzzingbook.MutationFuzzer import FunctionCoverageRunner
import random
from src.roulette_input_selector import RouletteInputSelector 
from src.mutation_utils import insert_random_character, delete_random_character, change_random_character
from src.get_source_lines import get_source_lines

class MagicFuzzer:
    def __init__(self, initial_inputs, function_to_call, function_name_to_call = None) -> None:
        """Ejecuta inputs iniciales, almacenando la cobertura obtenida"""
        self.source_lines = get_source_lines(function_to_call)
        self.method_name = function_name_to_call
        self.runner = FunctionCoverageRunner(function_to_call)
        self.lines_covered = {}
        self.contributing_inputs = []
        self.covered_locations = set()
        self.roulette_input_selector = RouletteInputSelector(2)
        for input in initial_inputs:
            self.run_input(input)

    def run_input(self, input):
        result, outcome = self.runner.run(input)

        locations = self.runner.coverage()

        self.roulette_input_selector.add_new_execution(input, locations)

        for location in locations:
            nombreFuncion, numeroDeLinea = location
            if nombreFuncion not in self.lines_covered or numeroDeLinea not in self.lines_covered[nombreFuncion]:
                if input not in self.contributing_inputs:
                    self.contributing_inputs.append(input)
                
                if nombreFuncion not in self.lines_covered:
                    self.lines_covered[nombreFuncion] = [numeroDeLinea]
                elif numeroDeLinea not in self.lines_covered[nombreFuncion]:
                    self.lines_covered[nombreFuncion].append(numeroDeLinea)

            self.covered_locations.add(location)
                

    def get_contributing_inputs(self) -> List[str]:
        """Retorna la lista de los inputs que aumentaron la cobertura en el orden que fueron ejecutados"""
        return self.contributing_inputs

    def get_covered_locations(self) -> Set[Location]:
        """Retorna el conjunto de locaciones cubiertas de todas las ejecuciones"""
        return self.covered_locations.difference([('run_function', 410), ('trace', 378), ('coverage', 382)])

    def mutate(self, s: str) -> str:
        """Aplica al azar alguna de las tres operaciones de mutacion definidas en el archivo mutation_utils.py"""
        return random.choice([insert_random_character, delete_random_character, change_random_character])(s)

    def fuzz(self):
        """
        Elije aleatoriamente un input s usando seleccion de ruleta sobre e(s),
        muta el input s utilizando la función mutate(s), y ejecuta el s mutado
        """
        
        input_seleccionado = self.roulette_input_selector.select()
        input_mutado = self.mutate(input_seleccionado)
        self.run_input(input_mutado)


    def run_until_covered(self, n = None) -> int:
        """
        Corre una campania del MagicFuzzer hasta cubrir todas las lineas del programa.
        Retorna la cantidad de iteraciones realizadas.
        """
        iteraciones = 0
        covered = []
        while len(covered) != self.source_lines:
            iteraciones+=1
            self.fuzz()
            covered = [f_line for f_name, f_line in self.covered_locations if f_name == self.method_name]
        return iteraciones

    def run(self, n = None) -> int:
        """
        Corre una campaña del MagicFuzzer.
        La campaña debe ser ejecutada por n iteraciones (si n no es None), o hasta cubrir todas las líneas del programa.
        Retorna la cantidad de iteraciones realizadas.
        """
        pass