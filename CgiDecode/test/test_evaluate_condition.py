#!./venv/bin/python
import unittest
from src.evaluate_condition import evaluate_condition


class TestEvaluateCondition(unittest.TestCase):
    def testFalseEquals(self):
        res = evaluate_condition(1, "Eq", 10, 20)
        self.assertEqual(res, False)

    def testTrueEquals(self):
        res = evaluate_condition(1, "Eq", 20, 20)
        self.assertEqual(res, True)
        
    def testTrueNe(self):
        res = evaluate_condition(1, "Ne", 10, 20)
        self.assertEqual(res, True)

    def testFalseNe(self):
        res = evaluate_condition(1, "Ne", 20, 20)
        self.assertEqual(res, False)

    def testTrueLe(self):
        res = evaluate_condition(1, "Le", 10, 20)
        self.assertEqual(res, True)

    def testFalseLe(self):
        res = evaluate_condition(1, "Le", 21, 20)
        self.assertEqual(res, False)

    def testTrueGe(self):
        res = evaluate_condition(1, "Ge", 20, 10)
        self.assertEqual(res, True)

    def testFalseGe(self):
        res = evaluate_condition(1, "Ge", 20, 21)
        self.assertEqual(res, False)

    def testTrueLt(self):
        res = evaluate_condition(1, "Lt", 10, 20)
        self.assertEqual(res, True)

    def testFalseLt(self):
        res = evaluate_condition(1, "Lt", 21, 20)
        self.assertEqual(res, False)

    def testTrueGt(self):
        res = evaluate_condition(1, "Gt", 20, 10)
        self.assertEqual(res, True)

    def testFalseGt(self):
        res = evaluate_condition(1, "Gt", 20, 21)
        self.assertEqual(res, False)

    def testTrueIn(self):
        res = evaluate_condition(1, "In", 20, [20])
        self.assertEqual(res, True)

    def testFalseInEmpty(self):
        res = evaluate_condition(1, "In", 20, [])
        self.assertEqual(res, False)

    def testFalseInNotEmpty(self):
        res = evaluate_condition(1, "In", 20, [21, 22])
        self.assertEqual(res, False)

    def testEqualStrings(self):
        res = evaluate_condition(1, "Eq", "a", "b")
        self.assertEqual(res, False)