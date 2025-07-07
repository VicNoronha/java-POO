package Exercicios.ModificadoresAcesso;
/*
Crie uma classe ContaBancaria com os seguintes atributos:
numeroConta (privado), saldo (privado) e titular (publico).
Implemente métodos getters e setters para os atributos privados.
*/

public class ContaBancaria {
    // Atributos privados, como solicitado
    private int numeroConta;
    private double saldo;

    // Atributo publico, como solicitado
    public String titular;


    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0; // Saldo inicial geralmente comeca em zero
    }


    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Opcional: Metodos para operacoes mais reais, que usariam o setter de saldo
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Deposito de R$" + String.format("%.2f", valor) + " realizado. Novo saldo: R$" + String.format("%.2f", this.saldo));
        } else {
            System.out.println("Valor de deposito invalido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + String.format("%.2f", valor) + " realizado. Novo saldo: R$" + String.format("%.2f", this.saldo));
        } else if (valor <= 0) {
            System.out.println("Valor de saque invalido.");
        } else {
            System.out.println("Saldo insuficiente para o saque de R$" + String.format("%.2f", valor) + ". Saldo atual: R$" + String.format("%.2f", this.saldo));
        }
    }

    // Metodo toString() para uma representacao legivel do objeto (boa pratica)
    @Override
    public String toString() {
        return "ContaBancaria [Numero da Conta=" + numeroConta + ", Titular=" + titular + ", Saldo=R$" + String.format("%.2f", saldo) + "]";
    }
}