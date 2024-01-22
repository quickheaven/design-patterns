import random
from texttable import Texttable

from wumpusworld.enums.Percept import Percept
from wumpusworld.env.dto.Cell import Cell
from wumpusworld.env.dto.Gold import Gold
from wumpusworld.env.dto.Pit import Pit
from wumpusworld.env.dto.Wumpus import Wumpus

'''
Wumpus World HAS-A Environment:
Environment HAS-A Matrix.
Each element of Matrix IS-A Cell.
The Cell HAS-A Item and Sensor State.
The Item in the Cell can be Gold, Pit and Wumpus (extends the Item).
The Cell HAS-A Sensor State: Stench, Breeze, Glitter, Scream. 

Wumpus World HAS-A Agent:
The Agent have 6 actions (Forward, Turn Left, Turn Right, Shoot, Grab and Climb)
'''


class Environment:

    def __init__(self, width, height, allow_climb_without_gold, pit_prob):
        self._width = width
        self._height = height
        self._allow_climb_without_gold = allow_climb_without_gold
        self._pit_prob = pit_prob

        self.__reset()

    def __reset(self):
        # Build the initial matrix
        # The matrix is also the Cave while the Cell is the Room.
        self._matrix = [[Cell(x, y) for y in range(self._height)] for x in range(self._width)]

        # Put the Gold, Pit and Wumpus in random Cell (excluding the first Cell).
        matrix_excluding_first_element = [x[1:] for x in self._matrix]

        cell_gold = random.choice(random.choice(matrix_excluding_first_element))
        cell_gold.add_item(Gold())
        print(f"The randomly selected cell for Gold is {cell_gold}")

        cell_pit = random.choice(random.choice(matrix_excluding_first_element))
        cell_pit.add_item(Pit())
        print(f"The randomly selected cell for Pit is {cell_pit}")

        cell_wumpus = random.choice(random.choice(matrix_excluding_first_element))
        cell_wumpus.add_item(Wumpus())
        print(f"The randomly selected cell for Wumpus is {cell_wumpus}")

        # Put the Sensor State Glitter on Gold.
        cell_gold.add_percept(Percept.GLITTER)

        # Put the Sensor State Breeze in random (5).
        for num in range(5):
            cell_breeze = random.choice(random.choice(matrix_excluding_first_element))
            cell_breeze.add_percept(Percept.BREEZE)

        # Put the Sensor State Stench beside Wumpus (4).
        # if cell_wumpus.x - 1 > 0:
        # cell_stench = self._matrix[cell_wumpus.x - 1][cell_wumpus.y]
        # cell_stench.add_sensor_state(Percept.STENCH)
        # print(f"The cell with STENCH is {cell_stench}.")

        table = Texttable()
        table.add_rows(self._matrix[::-1]
                       # This will reverse the order so the bottom index [0][0] will be displayed in the bottom.
                       , header=None)
        # table.add_rows(self._matrix, header=None)
        print(table.draw())


def reset_env(self):
    self.__reset()


if __name__ == '__main__':
    print('Creating environment')
    env = Environment(4, 4, True, 0.2)
    # print('Reset the environment')
    # env.reset_env()
