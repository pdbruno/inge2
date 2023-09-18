import sys
from typing import Dict

# Inicializar mappings globales
distances_true: Dict[int, int] = {}
distances_false: Dict[int, int] = {}


def update_maps(condition_num, d_true, d_false):
    global distances_true, distances_false

    if condition_num in distances_true.keys():
        distances_true[condition_num] = min(
            distances_true[condition_num], d_true)
    else:
        distances_true[condition_num] = d_true

    if condition_num in distances_false.keys():
        distances_false[condition_num] = min(
            distances_false[condition_num], d_false)
    else:
        distances_false[condition_num] = d_false


def clear_maps():
    global distances_true, distances_false
    distances_true.clear()
    distances_false.clear()


def get_true_distance(condition_num):
    global distances_true
    if condition_num in distances_true.keys():
        return distances_true[condition_num]
    else:
        return None


def get_false_distance(condition_num):
    global distances_false
    if condition_num in distances_false.keys():
        return distances_false[condition_num]
    else:
        return None


def has_reached_condition(condition_num):
    global distances_true, distances_false
    return condition_num in distances_true.keys() or condition_num in distances_false.keys()


def evaluate_condition(condition_num, op, lhs, rhs):
    if isinstance(lhs, str) and op != "In":
        lhs = ord(lhs)

    if isinstance(rhs, str):
        rhs = ord(rhs[0])

    d_true, d_false = distanceOpDicc[op](lhs, rhs)

    update_maps(condition_num, d_true, d_false)

    return opDicc[op](lhs, rhs)

opDicc = {
    'Eq': lambda x, y: x==y,
    'Ne': lambda x, y: x!=y,
    'Lt': lambda x, y: x<y,
    'Gt': lambda x, y: x>y,
    'Le': lambda x, y: x<=y,
    'Ge': lambda x, y: x>=y,
    'In': lambda x, y: x in y,
}
K=1
distanceOpDicc = {
    'Eq': lambda a, b: (0, K) if a==b else (abs(a-b), 0),
    'Ne': lambda a, b: (0, abs(a-b)) if a!=b else (K, 0),
    'Lt': lambda a, b: (0, abs(a - b)) if a<b else (abs(a - b)+K, 0),
    'Gt': lambda a, b: (0, abs(a - b)) if a>b else (abs(a - b)+K, 0),
    'Le': lambda a, b: (0, abs(a - b)+K) if a<=b else (abs(a - b), 0),
    'Ge': lambda a, b: (0, abs(a - b)+K) if a>=b else (abs(a - b), 0),
    'In': lambda a, b: (0, K) if a in b else (list_false_distance(a, b), 0),
}

def list_false_distance(a, b):
    if not b:
        return sys.maxsize
    
    distance_list = [abs(a - elem if isinstance(elem, int) else ord(elem)) for elem in b]
    return min(distance_list)
