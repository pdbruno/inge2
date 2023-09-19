from random import choice, randint, choices
from string import printable

def mutate(individual):
    """ 
        Muta un test suite o un test case
    """
    if isinstance(individual, str):
        return mutate_string(individual)
    elif isinstance(individual, list):
        return mutate_test_suite(individual)
    else:
        raise ValueError(f"Not a valid individual {individual}")
    
def mutate_string(individual):
    """ 
        Muta un test case según lo establecido en la consigna.
    """
    def is_elimination_candidate(individual):
        return len(individual) > 1
    
    def is_addition_candidate(individual):
        return len(individual) < 10
    
    def is_modification_candidate(individual):
        return len(individual) >= 1
    
    def eliminate_mutation(s):
        index = randint(0, len(s)-1)
        return s[:index] + s[index+1:]
    
    def adition_mutation(s):
        index = randint(0, len(s))
        new_adition = choice(printable)
        return s[:index] + new_adition + s[index:]

    def modification_mutation(s):
        index = randint(0, len(s)-1)
        return s[:index] + choice(printable) + s[index+1:] 

    potential_mutations = [
        (eliminate_mutation, is_elimination_candidate),
        (adition_mutation, is_addition_candidate),
        (modification_mutation, is_modification_candidate)
    ]
    candidate_mutations = [method for method, candidate_filter in potential_mutations if candidate_filter(individual)]
    mutation_method = choice(candidate_mutations)

    return mutation_method(individual)

def mutate_test_suite(individual):
    """ 
        Muta un test suite según lo establecido en la consigna.
    """
    def is_elimination_candidate(individual):
        return len(individual) > 1
    
    def is_addition_candidate(individual):
        return len(individual) < 15
    
    def is_modification_candidate(individual):
        return len(individual) >= 1
    
    def eliminate_mutation(s):
        index = randint(0, len(s)-1)
        return s[:index] + s[index+1:]
    
    def adition_mutation(s):
        index = randint(0, len(s))
        k = randint(0, 10)
        new_adition = "".join(choices(printable, k=k))
        
        return s[:index] + [new_adition] + s[index:]

    def modification_mutation(individual):
        test_to_mutate_index = randint(0, len(individual) - 1)
        test_mutated = mutate_string(individual[test_to_mutate_index])
        
        return individual[:test_to_mutate_index] + [test_mutated] + individual[test_to_mutate_index + 1:]

    potential_mutations = [
        (eliminate_mutation, is_elimination_candidate),
        (adition_mutation, is_addition_candidate),
        (modification_mutation, is_modification_candidate)
    ]
    candidate_mutations = [method for method, candidate_filter in potential_mutations if candidate_filter(individual)]
    mutation_method = choice(candidate_mutations)

    return mutation_method(individual)
