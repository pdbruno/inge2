#!./venv/bin/python
import unittest
from src.create_population import create_population
from src.evaluate_population import evaluate_population
from src.get_fitness_cgi_decode import get_fitness_cgi_decode


class TestEvaluatePopulation(unittest.TestCase):

    def testEmptyPopulation(self):
        population = create_population(0)
        self.assertEquals(evaluate_population(population), {})

    def testManyPopulation(self):
        population = create_population(5)
        evauation = evaluate_population(population)
        for test_suite, test_suite_fitness in evauation.items():
            self.assertEqual(test_suite_fitness, get_fitness_cgi_decode(test_suite))