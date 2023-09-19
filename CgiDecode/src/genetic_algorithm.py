from random import random, uniform
from src.create_population import create_population
from src.crossover import crossover
from src.evaluate_population import evaluate_population
from src.mutate import mutate
from src.selection import selection

class GeneticAlgorithm():
    def __init__(self):
        self.population_size = 100
        self.tournament_size = 5
        self.p_crossover = 0.70
        self.p_mutation = 0.20

        self.generation = 0
        self.best_individual = None
        self.fitness_best_individual = None

    def get_best_individual(self):
        return self.best_individual
    
    def get_fitness_best_individual(self):
        return self.fitness_best_individual
    
    def get_generation(self):
        return self.generation
    
    def _best_individual(self, fitness_by_individual):
        """ 
        Obtener el individuo con mejor fitness de la poblacion.
        """
        best_individual, max_fitness = next(iter(fitness_by_individual.items()))
        for individual, fitness in fitness_by_individual.items():
            if fitness < max_fitness:
                max_fitness = fitness
                best_individual = individual
        return individual
        
    def run(self):
        # Generar y evaluar la poblacion inicial
        population = create_population(self.population_size)
        fitness_by_individual = evaluate_population(population)

        # Imprimir el mejor valor de fitness encontrado
        self.best_individual = self._best_individual(fitness_by_individual)
        self.fitness_best_individual = fitness_by_individual[self.best_individual]

        # Continuar mientras la cantidad de generaciones es menor que 1000
        # y no haya ningun individuo que cubra todos los objetivos
        while self.fitness_best_individual > 0 and self.generation < 1000:

            new_population_selection = []
            while len(new_population_selection) < self.population_size:
                # Elijo padres con reposición
                parent_1, parent_2 = selection(fitness_by_individual, self.tournament_size), selection(fitness_by_individual, self.tournament_size)
                # Elijo si cruzo o no con probabilidad p_crossover
                selected_1, selected_2 = crossover(parent_1, parent_2) if uniform(0, 1) < self.p_crossover else (parent_1, parent_2)
                new_population_selection.append(selected_1)
                new_population_selection.append(selected_2)

            # Mutar la nueva poblacion con probabilidad p_mutation
            population = [mutate(element) if uniform(0, 1) < self.p_mutation else element for element in new_population_selection]

            self.generation += 1

            # Evaluar la nueva poblacion e imprimir el mejor valor de fitness
            fitness_by_individual = evaluate_population(population)
            self.best_individual = self._best_individual(fitness_by_individual)
            self.fitness_best_individual = fitness_by_individual[self.best_individual]

        # retornar el mejor individuo de la ultima generacion
        return list(self.best_individual)