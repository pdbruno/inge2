from src.get_fitness_cgi_decode import get_fitness_cgi_decode

def evaluate_population(population):
    """ 
        Las claves son tuplas porque tiene que ser un objeto hasheable, y por lo tanto, inmutable
    """
    return {
        tuple(test_suite): get_fitness_cgi_decode(test_suite=test_suite)
        for test_suite in population
    }