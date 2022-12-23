import time
from win32api import GetKeyState

'''
nao necessário se vc fazer: import Importes

space = GetKeyState(0x20)
w = GetKeyState(0x57)
a = GetKeyState(0x41)
s = GetKeyState(0x53)
d = GetKeyState(0x44)

'''
out = 0 #variável que exporta a tecla

while True:  #faz loop que detecta suas tecladas o tempo todo
    if space < 0:
        out = 32
    if w < 0:
        out = 87
    if a < 0:
        out = 65
    if s < 0:
        out = 83
    if d < 0:
        out = 68
    else: 
        out = 0 # "destecla" a tecla

    time.sleep(0.1)
