#!./venv/bin/python
import unittest
import random
from src import my_parser
from src import magic_fuzzer

""" 
Ejecutar 5 campañas de fuzzing usando n = 5000 sobre la función my_parser del archivo
my_parser.py usando como input inicial   (i.e. caracter en blanco), function_name_to_call el
parámetro vacío. Modique el archivo test_ejercicio_5.py para dejar constancia de los resultados
obtenidos. El test debe indicar la cantidad máxima de líneas cubiertas del programa en cada campaña.
Utilice una semilla (distinta para cada campaña) en los tests para que los resultados sean determinísticos. Nota: en algunas ocasiones se ha observado que la función my_parser puede llegar a comportarse
de manera no determinística, incluso utilizando una semilla para el random. Si ese fuera el caso, utilice
el script run_tests.sh para correr los tests de este ejercicio. Adenás considere implementar cada campaña de fuzzing en un test distinto para evitar que la ejecución de una campaña afecte a la siguiente
 """

class TestEjercicio5(unittest.TestCase):

    def test1(self):
        random.seed(1)
        f = magic_fuzzer.MagicFuzzer(' ', my_parser.my_parser)
        f.run_iterations(5000)
        cantidad_maxima_lineas_cubiertas = len(f.get_covered_locations())
        self.assertEqual(cantidad_maxima_lineas_cubiertas, 480)

    def test2(self):
        random.seed(2)
        f = magic_fuzzer.MagicFuzzer(' ', my_parser.my_parser)
        f.run_iterations(5000)
        cantidad_maxima_lineas_cubiertas = len(f.get_covered_locations())
        self.assertEqual(cantidad_maxima_lineas_cubiertas, 169)

    def test3(self):
        random.seed(3)
        f = magic_fuzzer.MagicFuzzer(' ', my_parser.my_parser)
        f.run_iterations(5000)
        cantidad_maxima_lineas_cubiertas = len(f.get_covered_locations())
        self.assertEqual(cantidad_maxima_lineas_cubiertas, 178)

    def test4(self):
        random.seed(4)
        f = magic_fuzzer.MagicFuzzer(' ', my_parser.my_parser)
        f.run_iterations(5000)
        cantidad_maxima_lineas_cubiertas = len(f.get_covered_locations())
        self.assertEqual(cantidad_maxima_lineas_cubiertas, 193)

    def test5(self):
        random.seed(5)
        f = magic_fuzzer.MagicFuzzer(' ', my_parser.my_parser)
        f.run_iterations(5000)
        cantidad_maxima_lineas_cubiertas = len(f.get_covered_locations())
        self.assertEqual(cantidad_maxima_lineas_cubiertas, 169)
