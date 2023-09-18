#!./venv/bin/python
import unittest
from random import seed
from src.mutation_utils import insert_random_character, delete_random_character, change_random_character


class TestMutationUtils(unittest.TestCase):

    def setUp(self):
        seed(0)
    
    def testInsertNotEmpty(self):
        new = insert_random_character("hola")
        self.assertEqual(new, 'hol\ra')

    def testInsertEmpty(self):
        new = insert_random_character("")
        self.assertEqual(new, '\r')

    def testDeleteNotEmpty(self):
        new = delete_random_character("hola")
        self.assertEqual(new, 'hol')

    def testDeleteEmpty(self):
        new = delete_random_character("")
        self.assertEqual(new, '')

    def testChangeNotEmpty(self):
        new = change_random_character("hola")
        self.assertEqual(new, 'hol\r')

    def testChangeEmpty(self):
        new = change_random_character("")
        self.assertEqual(new, '')