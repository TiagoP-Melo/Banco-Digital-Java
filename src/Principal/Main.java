package Principal;

public class Main {
    public static void main(String [] args){
        Cliente Tiago = new Cliente();
        Tiago.setNome("Tiago Portella");

        Conta cc = new ContaCorrente(Tiago);
        Conta poupanca = new ContaPoupanca(Tiago);

        cc.depositar(1200);
        cc.transferir(600, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Cliente Heloisa = new Cliente();
        Heloisa.setNome("Heloisa Prado");

        Conta cc1 = new ContaCorrente(Heloisa);
        Conta poupanca1 = new ContaPoupanca(Heloisa);

        cc1.depositar(4200);
        cc1.transferir(1600, poupanca1);

        cc1.imprimirExtrato();
        poupanca1.imprimirExtrato();



    }

}
