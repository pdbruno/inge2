from random import choices

def selection(fitness_by_individual, tournament_size):
    """ 
        Elige el individuo con mejor fitness entre una seleccion aleatoria de individuos.
    """
    individuals = choices(list(fitness_by_individual.keys()), k=tournament_size)

    winner = individuals[0]
    for individual in fitness_by_individual:
        if fitness_by_individual[individual] < fitness_by_individual[winner]:
            winner = individual
    return list(winner)
