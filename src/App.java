import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite quantos pilotos quer cadastrar: ");
        int tamanho = ler.nextInt();

        Piloto[] pilotos = new Piloto[tamanho];

        for(int i = 0; i < tamanho; i++){

            Piloto piloto = new Piloto();

            ler.nextLine();
            System.out.println("Informe o nome do piloto: ");
            piloto.setNome(ler.nextLine());

            ler.nextLine();
            System.out.println("Informe o CPF do piloto: ");
            piloto.setCpf(ler.nextInt());

            System.out.println("Informe a habilitação do piloto: ");
            piloto.setHabilitacao(ler.nextInt());

            pilotos[i] = piloto;
        }
        
        System.out.println("Voce deseja:");
        System.out.println("1 - Ver pilotos listados");
        System.out.println("2 - Procurar piloto atraves do CPF");
        System.out.println("Digite uma opção: ");
        int opcao = ler.nextInt();

        if(opcao == 1){

            for(int i = 0; i < pilotos.length; i++){

                System.out.println("O nome do piloto cadastrado é : " + pilotos[i].getNome());
                System.out.println("O cpf do piloto cadastrado é : " + pilotos[i].getCpf());
                System.out.println("A habilitação do piloto cadastrado é : " + pilotos[i].getHabilitacao());
                System.out.println();
                System.out.println("--------------------------------------------------------------");
                System.out.println();
            }

        }else if(opcao == 2){

            System.out.println("Digite o CPF: ");
            int proccpf = ler.nextInt();
            ler.nextLine();

            for(int i = 0; i < pilotos.length; i++){

                if(pilotos[i].getCpf() == proccpf){

                    System.out.println("O nome do piloto cadastrado é: "+ pilotos[i].getNome());
                }
            }
        }

        ler.close();
       
    }
}
