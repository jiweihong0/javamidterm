# draw circle 

import pygame
from pygame.locals import *
from sys import exit

pygame.init()
screen = pygame.display.set_mode((640, 480), 0, 32)
pygame.display.set_caption("Hello, World!")

while True:
    for event in pygame.event.get():
        if event.type == QUIT:
            exit()

    screen.lock()
    for x in range(0, 640):
        for y in range(0, 480):
            screen.set_at((x, y), (0, 0, 0))
    screen.unlock()

    pygame.draw.circle(screen, (0, 0, 255), (320, 240), 200)
    pygame.display.update()