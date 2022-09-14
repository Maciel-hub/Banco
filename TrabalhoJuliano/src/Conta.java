public abstract class Conta {

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public int getAgencia() {
        return Agencia;
    }

    public void setAgencia(int agencia) {
        Agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(Double saldo) {
        Saldo = saldo;
    }
    private Pessoa pessoa;
    private int Agencia;
    private int numeroConta;
    Double Saldo = 0.00;

}

