#!./venv/bin/python
import unittest
from random import seed

from src.create_population import create_population
from src.evaluate_population import evaluate_population
from src.selection import selection


class TestSelection(unittest.TestCase):
    def setUp(self):
        seed(0)

    def testMany(self):
        population = create_population(5)
        fitness_by_individual = evaluate_population(population)
        winner_pred = selection(fitness_by_individual, 3)
        self.assertEqual(("S<cx8s9?C",), winner_pred)