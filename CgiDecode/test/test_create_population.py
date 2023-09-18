#!./venv/bin/python
import unittest
from random import seed
from src.create_population import create_population


class TestCreatePopulation(unittest.TestCase):
    def setUp(self):
        seed(0)

    def testPopulation(self):
        self.assertEqual(create_population(2), [['\rR5x$!P', 'ZJ-r#', 'Ah\n', '<w', '{:iDc~9^G', '*cJTE;>q', 'ZU%x7)1b}', '{\\=0;"G', '~F{8', '+sui', 'VbaE$!dC)', '{f)G(', ':).A', 'b/NE,uBn'], ['4;[', 'Y8b]\n', 'j4a', '^O{&z%ur]']])

    def testEmptyPopulation(self):
        self.assertEqual(create_population(0), []) 

    def testEmptyPopulation(self):
        self.assertEqual(create_population(1), [['\rR5x$!P', 'ZJ-r#', 'Ah\n', '<w', '{:iDc~9^G', '*cJTE;>q', 'ZU%x7)1b}', '{\\=0;"G', '~F{8', '+sui', 'VbaE$!dC)', '{f)G(', ':).A', 'b/NE,uBn']]) 