from typing import List
from behavioral.strategy.Strategy import Strategy

class ConcreteStrategyA(Strategy):

    def do_algorithm(self, data: List) -> List:
        return sorted(data)
