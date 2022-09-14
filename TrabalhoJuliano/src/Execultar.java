import java.util.*;

public class Execultar {
    private static Pessoa pessoa = new Pessoa();
    private static ContaCorrente contaCorrente = new ContaCorrente();
    private static ContaPoupanca contaPoupanca = new ContaPoupanca();

    private static String cpf;
    private static int agencia;
    private static int numeroConta;
    static Double valor;
    static Scanner sc = new Scanner(System.in);
    static Random numero = new Random();
    static Hashtable<String, Pessoa> hashtablePessoa = new Hashtable<String, Pessoa>();
    static Hashtable<Integer, ContaCorrente> hashtableContaCorrente = new Hashtable<Integer, ContaCorrente>();
    static Hashtable<Integer, ContaPoupanca> hashtableContaPoupanca = new Hashtable<Integer, ContaPoupanca>();

    public static void CadastroCliente() {

        System.out.println("-- Cadastro de Cliente --");
        System.out.print("Nome: ");
        pessoa.setNome(sc.next());
        System.out.print("CPF: ");
        pessoa.setCPF(sc.next());
        hashtablePessoa.put(pessoa.getCPF(), pessoa);

    }

    public static void CadastroContaCorrente() {
        System.out.println("-- Cadastro Conta Corrente --");
        System.out.println("CPF: ");
        cpf = sc.next();
        if (hashtablePessoa.containsKey(cpf)){
            try {

        hashtablePessoa.containsKey(cpf);
        for (Map.Entry<Integer, ContaCorrente> conta : hashtableContaCorrente.entrySet()) {
            if (conta.getValue().getPessoa().getCPF().equals(cpf)){
                throw new RuntimeException("CPF já está vinculado em uma conta corrente existente");
            }
        }
        contaCorrente.setPessoa(hashtablePessoa.get(cpf));
        contaCorrente.setNumeroConta(numero.nextInt(9999));
        contaCorrente.setAgencia(123);

        hashtableContaCorrente.put(contaCorrente.getNumeroConta(), contaCorrente);
        System.out.println("Conta Cadastrada! ");
        System.out.println("CPF: "+ cpf);
        System.out.println("Conta: "+ contaCorrente.getNumeroConta());
        System.out.println("Agencia: "+contaCorrente.getAgencia());
            } catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        } else{
            System.out.println("Esse CPF não encontrado!");
        }
    }

    public static void CadastroContaPoupanca(){
        System.out.println("-- Cadastro Conta Poupança --");
        System.out.println("CPF: ");
        cpf = sc.next();

        if (hashtablePessoa.containsKey(cpf)){
            try {
                for (Map.Entry<Integer, ContaPoupanca> conta : hashtableContaPoupanca.entrySet()) {
                    if (conta.getValue().getPessoa().getCPF() == cpf){
                        throw new RuntimeException("CPF já está vinculado em uma conta poupança existente");
                    }
                }

                contaPoupanca.setPessoa(hashtablePessoa.get(cpf));
                contaPoupanca.setNumeroConta(numero.nextInt(9999));
                contaPoupanca.setAgencia(123);

                hashtableContaPoupanca.put(contaPoupanca.getNumeroConta(), contaPoupanca);

            } catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        } else{
            System.out.println("Esse CPF não encontrado");
        }

    }

    public static void Deposit() {

            System.out.println("Informe seu CPF: ");
            cpf = sc.next();

            for (Map.Entry<String, Pessoa> pessoas : hashtablePessoa.entrySet()) {
            }

            System.out.println("Agencia ");
            agencia = sc.nextInt();

            while(agencia != 123){
                System.out.println("Agência inválida!");

                System.out.println("Informe novamente a agência: ");
                agencia = sc.nextInt();
            }

            System.out.println("Conta: ");
            numeroConta = sc.nextInt();

            System.out.println("Valor: ");
            valor = sc.nextDouble();

            System.out.println("Valor de deposito: " + valor);
            hashtableContaCorrente.get(numeroConta).depositar(valor);
            System.out.println("Depósito realizado com sucesso.");
    }

    public static void Saque(){

    }

}