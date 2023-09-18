#!./venv/bin/python
import unittest
from src.get_fitness_cgi_decode import get_fitness_cgi_decode


class TestGetFitnessCgiDecode(unittest.TestCase):
    # def testx1(self):
    #     fitness = get_fitness_cgi_decode(['%AA'])
    #     self.assertEquals(fitness, 2.857142857142857)
    # def testx2(self):
    #     fitness = get_fitness_cgi_decode(['%AU'])
    #     self.assertEquals(fitness, 3.107142857142857)
    # def testx3(self):
    #     fitness = get_fitness_cgi_decode(['%UU'])
    #     self.assertEquals(fitness, 4.086734693877551)
    # def testx4(self):
    #     fitness = get_fitness_cgi_decode(['Hello+Reader'])
    #     self.assertEquals(fitness, 2.9722222222222223)
    # def testx5(self):
    #     fitness = get_fitness_cgi_decode([''])
    #     self.assertEquals(fitness, 4.5)
    # def testx6(self):
    #     fitness = get_fitness_cgi_decode(['%'])
    #     self.assertEquals(fitness, 3.857142857142857)
    # def testx7(self):
    #     fitness = get_fitness_cgi_decode(['%1'])
    #     self.assertEquals(fitness, 4.023809523809524)
    # def testx8(self):
    #     fitness = get_fitness_cgi_decode(['+'])
    #     self.assertEquals(fitness, 3.5)
    # def testx9(self):
    #     fitness = get_fitness_cgi_decode(['+%1'])
    #     self.assertEquals(fitness, 3.1666666666666665)
    # def testx10(self):
    #     fitness = get_fitness_cgi_decode(['%1+'])
    #     self.assertEquals(fitness, 3.107142857142857)
    
    def testx11(self):
        fitness = get_fitness_cgi_decode(['+', 'a', '%AA', '%AU', '%UA', ""])
        self.assertEquals(fitness, 0)    