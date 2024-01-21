from structural.adapter.Adaptee import Adaptee
from structural.adapter.Target import Target


class Adapter(Target, Adaptee):

    def request(self) -> str:
        return f"Adapter: (TRANSLATED) {self.specific_request()[::-1]}"
