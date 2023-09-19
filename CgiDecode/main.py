import random
from src.genetic_algorithm import GeneticAlgorithm

for i in range(10, 11):
  random.seed(i)
  ga = GeneticAlgorithm()
  result = ga.run()
  print(f'def test{i}(self):')
  print(f'  seed({i})')
  print(f'  ga = GeneticAlgorithm()')
  print(f'  result = ga.run()')
  print(f'  self.assertEqual(result, {result})')
  print(f'  self.assertEqual(ga.generation, {ga.generation})')