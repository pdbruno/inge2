#!./venv/bin/python
import unittest

from random import seed
from src.create_population import create_population
from src.crossover import crossover


class TestCrossover(unittest.TestCase):
    def setUp(self):
        seed(0)

    def testExample(self):
        population = create_population(2)
        offspring1, offspring2 = crossover(population[0], population[1])
        self.assertEqual(['\rR5x$!P', 'ZJ-r#', 'Ah\n', '<w'], offspring1)
        self.assertEqual(['4;[','Y8b]\n','j4a','^O{&z%ur]','{:iDc~9^G','*cJTE;>q','ZU%x7)1b}','{\\=0;"G','~F{8','+sui','VbaE$!dC)','{f)G(',':).A','b/NE,uBn'], offspring2)