#!./venv/bin/python
import unittest

from random import seed
from src.genetic_algorithm import GeneticAlgorithm


class TestGeneticAlgorithm(unittest.TestCase):
    def test1(self):
        seed(1)
        ga = GeneticAlgorithm()
        result = ga.run()
        self.assertEqual(result, ('', '', '4', ''))
        self.assertEqual(ga.generation, 1000)

    def test2(self):
        seed(44)
        ga = GeneticAlgorithm()
        result = ga.run()
        self.assertEqual(result, ('', '', '$'))
        self.assertEqual(ga.generation, 1000)

    def test3(self):
        # COMPLETAR
        pass

    def test4(self):
        # COMPLETAR
        pass

    def test5(self):
        # COMPLETAR
        pass

    def test6(self):
        # COMPLETAR
        pass

    def test7(self):
        # COMPLETAR
        pass

    def test8(self):
        # COMPLETAR
        pass

    def test9(self):
        # COMPLETAR
        pass

    def test10(self):
        # COMPLETAR
        pass