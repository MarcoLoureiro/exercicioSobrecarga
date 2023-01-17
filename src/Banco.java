public abstract class Banco {
    private String agencia;
    private int numeroConta;



    public Banco(String agencia,int numeroConta){
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public abstract void pagarBoleto();

    public abstract void atenderCliente();


}
