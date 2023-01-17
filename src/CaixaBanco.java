public class CaixaBanco extends Banco{

    public CaixaBanco(String agencia,int numeroConta){
        super(agencia,numeroConta);
    }

    //    sacar(double)
    public void sacar(double valor) {
        System.out.println("Você sacou " + valor);
    }

    //sacar(String)
    public void sacar(String operacao){
        System.out.println("Você efetuou uma operação de "+operacao);
    }

    //depositar(double)
    public void depositar(double valor) {
        System.out.println("Você depositou " + valor);
    }

    //depositar(String)
    public void depositar(String operacao){
        System.out.println("Você efetuou uma operação de "+operacao);
    }

    @Override
    public void pagarBoleto(){
        System.out.println("Você pagou o boleto");
    }

   @Override
    public void atenderCliente(){
       System.out.println("Atendendo cliente...\nChamando o gerente...");
   }


}
