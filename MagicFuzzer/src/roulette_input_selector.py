from typing import Set
from fuzzingbook.Coverage import Location
from fuzzingbook.GreyboxFuzzer import getPathID
import random

class RouletteInputSelector:

    def __init__(self, exponent: int):
        """Guarda el exponente"""
        self.exponent = exponent
        self.executions = {}
        self.s_to_path = {}

    def add_new_execution(self, s: str, s_path: Set[Location]):
        """Agrega una nueva ejecución del input s y su path"""
        id = getPathID(s_path)
        self.s_to_path[s] = id
        if id not in self.executions:
            self.executions[id] = 0

        self.executions[id] += 1
        

    def get_frequency(self, s: str) -> int:
        """Retorna la cantidad de apariciones del path_id de s. Retorna 0 si el input no fue ejecutado"""
        if s not in self.s_to_path:
            return 0
        
        return self.executions[self.s_to_path[s]]

    def get_energy(self, s: str) -> float:
        """Retorna el valor actual de e(s). Levanta una excepción si el input no fue ejecutado"""
        return 1 / (self.get_frequency(s)**self.exponent)

    def select(self) -> str:
        """Elije aleatoriamente un s usando seleccion de ruleta sobre e(s)"""
        inputs = list(self.s_to_path.keys())
        inputs_energies = [self.get_energy(s) for s in inputs]
        sum_energies = sum(inputs_energies)
        inputs_probs = [e/sum_energies for e in inputs_energies]
        return random.choices(inputs, weights=inputs_probs, k=1)[0]