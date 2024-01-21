from typing import List
from behavioral.strategy.Strategy import Strategy

class ConcreteStrategyB(Strategy):

    def do_algorithm(self, data: List) -> List:
        return reversed(sorted(data))
