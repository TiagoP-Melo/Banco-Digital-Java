package Principal;

public class Main {
    public static void main(String [] args){
        Cliente Tiago = new Cliente();
        Tiago.setNome("Tiago Portella");

        Conta cc = new ContaCorrente(Tiago);
        Conta poupanca = new ContaPoupanca(Tiago);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();




    }

}
