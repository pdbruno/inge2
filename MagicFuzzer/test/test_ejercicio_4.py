#!./venv/bin/python
import unittest
import random
from src import crashme
from src import magic_fuzzer

class TestEjercicio4(unittest.TestCase):

    def test1(self):
        random.seed(1)
        f = magic_fuzzer.MagicFuzzer(' ', crashme.crashme, 'crashme')
        iteraciones = f.run_until_covered()
        self.assertEqual(iteraciones, 1615)
        self.assertEqual(len(f.contributing_inputs), 5)

    def test2(self):
        random.seed(2)
        f = magic_fuzzer.MagicFuzzer(' ', crashme.crashme, 'crashme')
        iteraciones = f.run_until_covered()
        self.assertEqual(iteraciones, 2503)
        self.assertEqual(len(f.contributing_inputs), 4)

    def test3(self):
        random.seed(3)
        f = magic_fuzzer.MagicFuzzer(' ', crashme.crashme, 'crashme')
        iteraciones = f.run_until_covered()
        self.assertEqual(iteraciones, 2456)
        self.assertEqual(len(f.contributing_inputs), 5)

    def test4(self):
        random.seed(4)
        f = magic_fuzzer.MagicFuzzer(' ', crashme.crashme, 'crashme')
        iteraciones = f.run_until_covered()
        self.assertEqual(iteraciones, 1536)
        self.assertEqual(len(f.contributing_inputs), 5)

    def test5(self):
        random.seed(5)
        f = magic_fuzzer.MagicFuzzer(' ', crashme.crashme, 'crashme')
        iteraciones = f.run_until_covered()
        self.assertEqual(iteraciones, 6435)
        self.assertEqual(len(f.contributing_inputs), 5)