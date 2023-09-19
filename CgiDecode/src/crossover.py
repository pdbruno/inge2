from random import randint


def crossover(parent1, parent2):
    """
        Recibe dos padres y devuelve dos hijos.
        El punto de corte se elige aleatoriamente.
        Elegir un único punto en los padres y dividir/unir en ese punto.
    """
    point = randint(0, min(len(parent1), len(parent2)))
    offspring1 = parent1[:point] + parent2[point:]
    offspring2 = parent2[:point] + parent1[point:]
    return offspring1, offspring2
