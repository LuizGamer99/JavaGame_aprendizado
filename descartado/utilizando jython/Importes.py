import win32api
from win32api import GetKeyState #importa win32api para detecçao de teclas
                        #var = funçao(codigo da tecla) para from ... import ou
                        #var = win32api.funçao(codigo da tecla) para import win32api
space = GetKeyState(0x20)
w = GetKeyState(0x57)
a = GetKeyState(0x41)
s = GetKeyState(0x53)
d = GetKeyState(0x44)

