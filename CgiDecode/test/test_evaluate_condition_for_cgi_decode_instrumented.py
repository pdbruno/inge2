#!./venv/bin/python
import sys
import unittest
from src.evaluate_condition import evaluate_condition
from src.cgi_decode_instrumented import cgi_decode_instrumented
from src.evaluate_condition import clear_maps, get_true_distance, get_false_distance


class TestEvaluateConditionForCgiDecodeInstrumented(unittest.TestCase):
    def testIdentity(self):
        res = cgi_decode_instrumented("Hello World")
        self.assertEqual(res, "Hello World")

    def testPlusCharacter(self):
        res = cgi_decode_instrumented("Hello + World")
        self.assertEqual(res, "Hello   World")

    def testValidHexa(self):
        res = cgi_decode_instrumented("Hello %0A World")
        self.assertEqual(res, "Hello \n World")

    def testInvalidLow(self):
        self.assertRaises(ValueError, cgi_decode_instrumented, "Hello %QA World")

    def testInvalidHigh(self):
        self.assertRaises(ValueError, cgi_decode_instrumented, "Hello %AQ World")


    def setUp(self):
        clear_maps()


    def testFalseEquals(self):
        res = evaluate_condition(1, "Eq", 20, 10)
        self.assertEqual(res, False)
        self.assertEqual(get_true_distance(1), 10)
        self.assertEqual(get_false_distance(1), 0)

    def testTrueEquals(self):
        res = evaluate_condition(1, "Eq", 20, 20)
        self.assertEqual(res, True)
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), 1)
        
    def testTrueNe(self):
        res = evaluate_condition(1, "Ne", 20, 10)
        self.assertEqual(res, True)
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), 10)

    def testFalseNe(self):
        res = evaluate_condition(1, "Ne", 20, 20)
        self.assertEqual(res, False)
        self.assertEqual(get_true_distance(1), 1)
        self.assertEqual(get_false_distance(1), 0)

    def testTrueLe(self):
        res = evaluate_condition(1, "Le", 10, 20)
        self.assertEqual(res, True)
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), 11)

    def testFalseLe(self):
        res = evaluate_condition(1, "Le", 20, 10)
        self.assertEqual(res, False)
        self.assertEqual(get_true_distance(1), 10)
        self.assertEqual(get_false_distance(1), 0)

    def testTrueLeEquals(self):
        res = evaluate_condition(1, "Le", 20, 20)
        self.assertEqual(res, True)
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), 1)


    def testTrueLt(self):
        res = evaluate_condition(1, "Lt", 10, 20)
        self.assertEqual(res, True)
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), 10)

    def testFalseLt(self):
        res = evaluate_condition(1, "Lt", 20, 10)
        self.assertEqual(res, False)
        self.assertEqual(get_true_distance(1), 11)
        self.assertEqual(get_false_distance(1), 0)

    def testFalseLtEquals(self):
        res = evaluate_condition(1, "Lt", 20, 20)
        self.assertEqual(res, False)
        self.assertEqual(get_true_distance(1), 1)
        self.assertEqual(get_false_distance(1), 0)

    def testTrueIn(self):
        res = evaluate_condition(1, "In", 20, [20])
        self.assertEqual(res, True)
        self.assertEqual(get_true_distance(1), 0)
        self.assertEqual(get_false_distance(1), 1)

    def testFalseInEmpty(self):
        res = evaluate_condition(1, "In", 10, [])
        self.assertEqual(res, False)
        self.assertEqual(get_true_distance(1), sys.maxsize)
        self.assertEqual(get_false_distance(1), 0)

    def testFalseInNotEmpty(self):
        res = evaluate_condition(1, "In", 10, [1, 2, 3])
        self.assertEqual(res, False)
        self.assertEqual(get_true_distance(1), 7)
        self.assertEqual(get_false_distance(1), 0)

