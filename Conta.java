public class Conta {
    
    private int numero;
    private int saldo;
    
    public Conta(int numero, int saldo) {
        this.numero = numero;
        this.saldo = saldo;

    }
    
    public void depositar(int valor) {
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        System.out.println("Seu saldo é de: " + (this.saldo += valor));
    }

    
    public void sacar(int saque){
        if (saque > this.saldo){
            System.out.println("Você não pode sacar esse valor, tente novamente.");
        } 
        else{
            System.out.println("Saque de R$" + saque + " realizado com sucesso.");
        }
        System.out.println("Seu saldo atual é " + (this.saldo - saque));

        }
    }
