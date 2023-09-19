#!./venv/bin/python
import unittest

from random import seed
from src.genetic_algorithm import GeneticAlgorithm


class TestGeneticAlgorithm(unittest.TestCase):
    """
    Todos los test chequean implicitamente que haya branch coverage 100% porque la generación es menor a 1000 en todos los casos
    """
    def test1(self):
        seed(1)
        ga = GeneticAlgorithm()
        result = ga.run()
        self.assertEqual(result, ['k+a>', 'r@D*\x0c4CB', 'w?$', 'YhTG%', ')5%5\x0c3z\\gi', 'qz5D#,', '"CxkB', 'GjxN]', '["}lN5b-', 'E6%\t/', '5Rd<=', 'g1I~<J', 'T|u%a4G2@'])
        self.assertEqual(ga.generation, 4)

    def test2(self):
        seed(44)
        ga = GeneticAlgorithm()
        result = ga.run()
        self.assertEqual(result, ['[dzDu~\x0bA+/', 'Y*\x0c;u:t', "]tFkz02'b", 'Y*\x0c\r;u:t', ';PL%5fLy95', ';PL%5\\Ly95', 'I', '(DLjll\tY', '1kx', '~?R4x(80', '#\x0c%lV==/j+', 'N?`x1n', '?}', '?}'])
        self.assertEqual(ga.generation, 22)

    def test3(self):
        seed(2)
        ga = GeneticAlgorithm()
        result = ga.run()
        self.assertEqual(result, ['cN*\x0b', '!;h1', 'Nzbq4qC', ']TZw$+mX|q', 'wW>g,', "'\\[8\n.!]", '6k"', '&(%b&A*,', 'X]Bj1A*', 'HY_f/<;\r&', '"@hZ_', '|C9xEC?G?D', 'X5y%<$^~:', '|C9xECG?D', '%b8$>qO/'])
        self.assertEqual(ga.generation, 39)

    def test4(self):
        seed(3)
        ga = GeneticAlgorithm()
        result = ga.run()
        self.assertEqual(result, ['tK ', '!xo', '+Y\r', '.Ul\nPwM\r,', 'bqM@dq\n', '.Ul\nPwM\r,', 'bqM@dq\n', '\rz~oo~_O@-', 'j?I%9+F', 'j?I%9AF', '\rz~oo~_O@r', '%tL.', 'Vv@\nff'])
        self.assertEqual(ga.generation, 15)

    def test5(self):
        seed(4)
        ga = GeneticAlgorithm()
        result = ga.run()
        self.assertEqual(result, ['rfonqV%0X', 'pj~~igS6n', 'Z', 'R4TCb', '\tzZ:', "\t9^E'", '%a5!\x0b"y', 'R4TCb', 'R4TCb', "!|%'Tu", '`', "6;'y?M9rc", '\'[OY"', 'A9t/[+'])
        self.assertEqual(ga.generation, 46)

    def test6(self):
        seed(5)
        ga = GeneticAlgorithm()
        result = ga.run()
        self.assertEqual(result, ['_ :;*q', '%bfuH(SO', 'Sap', '%bfuH(SO', 'w$n|fB/NN', 'D\x0b-%|;yf', 'y<99', 'rB', '" ', '\x0bns@8++', 'y<9l9', '~QRtSZ&/v', '<sj', 'Eo', 'k%1S&'])
        self.assertEqual(ga.generation, 44)

    def test7(self):
        seed(6)
        ga = GeneticAlgorithm()
        result = ga.run()
        self.assertEqual(result, [';N2', ';N2', 'Otqb+TlcD', 'H]', '\np', 'c5.psl', 'e5', '!o$,?`', ',k7=%W\nXA+', '3>Kv:TCJ.', '3>Kv:CJ.', 'sh/q`%1o', 'Uf\x0cYsl"j*}', "w0'%88\tp[m"])
        self.assertEqual(ga.generation, 40)

    def test8(self):
        seed(7)
        ga = GeneticAlgorithm()
        result = ga.run()
        self.assertEqual(result, ['=\rmc[n4R', '/XN', '/XN', 'R4E', 's$,%EK2t6', 'T', 'T', '?:w"+%5f\x0cR', 'Y\x0bQ', 'da?Yrj=1S', '1', 'x', 'z', 'z', '%"p&\\\''])
        self.assertEqual(ga.generation, 42)

    def test9(self):
        seed(8)
        ga = GeneticAlgorithm()
        result = ga.run()
        self.assertEqual(result, ['\rkXa;q\rb1', 'gy', '\\q[4Rj"^\r', '+CQq3P', 'R%C2QtL', 'nEr_ggKw', 'j', 'o8\t)%', '', 'X9&<}4', '5)H8q.', '!G%k\t\ri-', '!G%1k\tX\r-', '\x0b<N"s*{]P0'])
        self.assertEqual(ga.generation, 32)

    def test10(self):
        seed(9)
        ga = GeneticAlgorithm()
        result = ga.run()
        self.assertEqual(result, ['(8&I\n,"AJ$', 'H\nm1+Z', '`zN#', 'H\nqx', '>&Bk\t3%iBK', ';v~', 'AV$ !{', 'r_Sfty/pr', '>n', 'NzGI#%C-', 'Nz|I#%C5-', '+l!>_)t', 'Nz|GI#%C5G', '\t_f&9y2A?'])
        self.assertEqual(ga.generation, 18)