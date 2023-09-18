from random import randint

def crossover(parent1, parent2):
    point = randint(0, min(len(parent1), len(parent2)))
    offspring1 = parent1[:point] + parent2[point:]
    offspring2 = parent2[:point] + parent1[point:]
    return offspring1, offspring2
