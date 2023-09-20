#!./venv/bin/python
import unittest
import random
from . import crashme
from src import magic_fuzzer

class TestEjercicio4(unittest.TestCase):

    def test(self):
        random.seed(69)
        f = magic_fuzzer.MagicFuzzer(' ', crashme.crashme, 'crashme')
        iteraciones = f.run_until_covered()
        print(f'iteraciones = {iteraciones}')
        print(f'contributing_inputs = {f.contributing_inputs}')