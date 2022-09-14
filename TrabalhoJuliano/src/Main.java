import java.util.Scanner;

public class Main {

    public static void menu(){
        System.out.println("BANCO UNICT");
        System.out.println("1 -- Cadastro de Cliente");
        System.out.println("2 -- Cadastro Conta Corrente");
        System.out.println("3 -- Cadastrar Conta Poupança");
        System.out.println("4 -- Efetuar Deposito");
        System.out.println("5 -- Efetuar Saque");
        System.out.println("6 -- Efetuar Transferencia");
        System.out.print("Opcao: ");
    }

    public static void main(String[] args) {
        int opcao;
        Scanner sc = new Scanner(System.in);

        do {
            menu();
            opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    Execultar.CadastroCliente();
                    break;

                case 2:
                    Execultar.CadastroContaCorrente();
                    break;

                case 3:
                    Execultar.CadastroContaPoupanca();
                    break;

                case 4:
                    Execultar.Deposit();

                    break;

                case 5:
                    break;

                case 6:

                default:
                    break;

            }
        } while (opcao != 6);
    }
}
