import random
import string

def insert_random_character(s: str) -> str:
    """Retorna s con un caracter random insertado en una posicion al azar"""
    index = random.randint(0, len(s))
    return s[:index] + random.choice(string.printable) + s[index:] 


def delete_random_character(s: str) -> str:
    """Retorna s con un caracter random eliminado.
    Si la cadena esta vacia, no la modifica"""
    if not s:
        return s
    index = random.randint(0, len(s)-1)
    return s[:index] + s[index+1:]


def change_random_character(s: str) -> str:
    """Retorna s con un caracter modificado en una posicion al azar.
    El caracter a modificar es reemplazado por otro caracter random.
    Si la cadena esta vacia, no la modifica."""
    if not s:
        return s
    index = random.randint(0, len(s)-1)
    return s[:index] + random.choice(string.printable) + s[index+1:] 
