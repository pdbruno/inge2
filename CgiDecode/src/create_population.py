from random import choice,randint
from string import printable


def get_random_character():
    return choice(printable)


def create_test_case():
    return ''.join([get_random_character() for _ in range(randint(1,10))])


def create_individual():
    return [create_test_case() for _ in range(randint(1,15))]


def create_population(population_size):
    return [create_individual() for _ in range(population_size)]
