# ISoccer2
Sistema de gestão de um clube de futebol.

[Descrição detalhada](https://docs.google.com/viewer?a=v&pid=sites&srcid=aWMudWZhbC5icnxjb21wMjE1fGd4OjE3OWMwM2Y1NDRjNzRiNmM)

## Instruções
Exporte a pasta interna ISoccer2 no Eclipse ou a pasta raiz no Visual Studio Code e execute a
classe [ISoccer](ISoccer2/src/isoccer/ISoccer.java). Se preferir, compile os códigos manualmente
e execute da mesma maneira.

Dados de acesso:
- Login: admin
- Senha: 12345

## Padrões de projeto implementados
- **Command**: todas as implementações de [Command](ISoccer2/src/isoccer/command/Command.java).
- **Factory Method**: todas as implementações de
[Factory](ISoccer2/src/isoccer/factory/Factory.java).
- **Singleton**: a classe [Model](ISoccer2/src/isoccer/Model.java) e todas as implementações de
Command, Factory e [Report](ISoccer2/src/isoccer/command/report/Report.java).