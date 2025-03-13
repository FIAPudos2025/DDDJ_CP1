# Banco FIAP

## Relatório de Implementação

### O que foi implementado

- **Classe `ContaBancaria`**: Implementamos uma classe que representa uma conta bancária com métodos para depositar, sacar e consultar saldo.
- **Classe `Main`**: Criamos uma classe principal que interage com o usuário para realizar operações na conta bancária.

### Conceito de Encapsulamento

O encapsulamento é um dos pilares da programação orientada a objetos e foi aplicado da seguinte forma:

- **Atributos Privados**: Os atributos `saldo` e `titular` da classe `ContaBancaria` são privados, garantindo que só possam ser acessados e modificados através dos métodos públicos da classe.
- **Métodos Públicos**: Foram criados métodos públicos (`depositar`, `sacar`, `consultarSaldo`, `setTitular`, `getTitular`) para permitir a interação controlada com os atributos privados.
- **Validação Interna**: A lógica de validação, como verificar se há saldo suficiente para saque, está encapsulada dentro dos métodos da classe, garantindo que a integridade dos dados seja mantida.

### Benefícios do Encapsulamento

- **Segurança**: Protege os dados sensíveis da classe contra acessos não autorizados.
- **Manutenção**: Facilita a manutenção e evolução do código, pois as mudanças internas não afetam outras partes do sistema.
- **Reusabilidade**: Permite a reutilização de código de forma segura e controlada.

### Exemplo de Código

```java
public class ContaBancaria {
    private double saldo = 0.0;
    private String titular;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente, impossível realizar saque");
        } else {
            System.out.println("Saque realizado com sucesso");
            this.saldo -= valor;
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return this.titular;
    }
}
```

### Conclusão

O uso do encapsulamento na classe `ContaBancaria` garante que os dados sejam manipulados de forma segura e controlada, promovendo a integridade e a manutenção do código.

### Integrantes

Athos Alves - RM555515
Pedro Schmitz - RM555758
Rafael Porto - RM554939
