public class ContaCorrente extends  Conta{


    @Override
    public Pessoa getPessoa() {
        return super.getPessoa();
    }

    @Override
    public void setPessoa(Pessoa pessoa) {
        super.setPessoa(pessoa);
    }

    @Override
    public int getAgencia() {
        return super.getAgencia();
    }

    @Override
    public void setAgencia(int agencia) {
        super.setAgencia(agencia);
    }

    @Override
    public int getNumeroConta() {
        return super.getNumeroConta();
    }

    @Override
    public void setNumeroConta(int numeroConta) {
        super.setNumeroConta(numeroConta);
    }

    @Override
    public void setSaldo(Double saldo) {
        super.setSaldo(saldo);
    }
    public void depositar(Double valor) {
        if (valor < 0){
            throw new RuntimeException("Você não pode depositar um valor negativo!!!");
        }

        this.Saldo += valor;
    }

    public void sacar(Double valor) {
        if(valor > this.Saldo){
            throw new RuntimeException("Valor de saque maior que o saldo atual!!!");
        }

        this.Saldo -= valor;
    }

    public void transferir(Double valor) {
        if(valor > this.Saldo){
            throw new RuntimeException("Valor de transferência maior que o saldo atual!!!");
        }

        this.Saldo -= valor;
    }

    @Override
    public Double getSaldo() {
        return this.Saldo;
    }

}
