from behavioral.strategy.ConcreteStrategyA import ConcreteStrategyA
from behavioral.strategy.ConcreteStrategyB import ConcreteStrategyB
from behavioral.strategy.Context import Context

if __name__ == "__main__":
    context = Context(ConcreteStrategyA())
    print("Client: Strategy is set to normal sorting.")
    context.do_some_business_logic()
    print()

    print("Client: Strategy is set to reverse sorting.")
    context.strategy = ConcreteStrategyB()
    context.do_some_business_logic()
