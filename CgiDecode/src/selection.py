from random import choices

def selection(fitness_by_individual, tournament_size):
    individuals = choices(list(fitness_by_individual.keys()), k=tournament_size)

    winner, max_fitness = individuals[0], fitness_by_individual[individuals[0]]
    for individual, fitness in fitness_by_individual.items():
        if fitness > max_fitness:
            winner, max_fitness = individual, fitness
    return winner
