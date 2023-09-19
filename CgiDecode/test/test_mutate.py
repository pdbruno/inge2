#!./venv/bin/python
import unittest

from random import seed
from src.create_population import create_population
from src.mutate import mutate


class TestMutate(unittest.TestCase):

    def testAllSequencially(self):

        def testAditionTestCase(test_case):
            mutated_test_suite = mutate(test_case)
            self.assertEqual(mutated_test_suite, "0hola")

        def testEliminationTestCase(test_case):
            mutated_test_suite = mutate(test_case)
            self.assertEqual(mutated_test_suite, "hla")
        
        def testModificationTestCase(test_case):
            mutated_test_suite = mutate(test_case)
            self.assertEqual(mutated_test_suite, "Sola")

        def testEliminationTestSuite(test_suite):
            mutated_test_suite = mutate(test_suite)
            self.assertEquals(mutated_test_suite, ['pepito'])

        def testAditionTestSuite(test_suite):
            mutated_test_suite = mutate(test_suite)
            self.assertEqual(mutated_test_suite, ["hola", "pepito", "t7IK"])

        def testModificationTestSuite(test_suite):
            mutated_test_suite = mutate(test_suite)
            self.assertEqual(mutated_test_suite, ['hola', 'peJpito'])
            
        test_case = "hola"
        test_suite = ["hola", "pepito"]

        # Set seed respectively for each case, empirically tested
        seed(1234)
        testAditionTestCase(test_case)
        testEliminationTestSuite(test_suite)
        seed(14)
        testEliminationTestCase(test_case)
        testAditionTestSuite(test_suite)
        seed(10)
        testModificationTestCase(test_case)

        seed(1460)
        testModificationTestSuite(test_suite)