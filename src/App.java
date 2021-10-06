import java.util.Scanner;

import modelo.Piloto;

public class App {
    public static void main(final String[] args) throws Exception {

        final Scanner ler = new Scanner(System.in);
        int op;

        System.out.println("Digite quantos pilotos quer cadastrar: ");
        final int tamanho = ler.nextInt();

        final Piloto piloto = new Piloto();
    
        final Piloto[] pilotos = new Piloto[tamanho];
    
        for(int i = 0; i < tamanho; i++){

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

        System.out.println("MENU:");
        System.out.println("1 - Ver pilotos listados");
        System.out.println("2 - Procurar piloto atraves do CPF");
        System.out.println("3 - Expandir pilotos listados");
        System.out.println("4 - Sair");
        System.out.println("Digite uma opção: ");
        final int opcao = ler.nextInt();

        switch(opcao){

            case 1:

                for(int i = 0; i < pilotos.length; i++){

                    System.out.println("O nome do piloto cadastrado é : " + pilotos[i].getNome());
                    System.out.println("O cpf do piloto cadastrado é : " + pilotos[i].getCpf());
                    System.out.println("A habilitação do piloto cadastrado é : " + pilotos[i].getHabilitacao());
                    System.out.println();
                    System.out.println("-----------------------------------------------------------");
                    System.out.println();
                }
            break;

            case 2:

                System.out.println("Digite o CPF: ");
                final int proccpf = ler.nextInt();
                ler.nextLine();

                for(int i = 0; i < pilotos.length; i++){

                    if(pilotos[i].getCpf() == proccpf){

                        System.out.println("O nome do piloto cadastrado é: "+ pilotos[i].getNome());
                    }
                }
            break;

            case 3:

                System.out.println("Digite o novo tamanho do vetor: ");
                final int newTamanho = ler.nextInt();

                final Piloto[] newPilotos = new Piloto[newTamanho];

                for(int i = 0; i < pilotos.length; i++){

                    newPilotos[i] = pilotos[i];
                }

                System.out.println("Digite 1 para retornar ao cadastro");
                op = ler.nextInt();
            break;

            case 4:
                System.out.println("--------------Programa Encerrado----------------");
                break;
        
            default:
                System.out.println("DIGITE UMA OPÇÃO VÁLIDA");
                break;
        }
        
        ler.close();
    }
}
