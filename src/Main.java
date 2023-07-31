import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Bem Vindo ao Progama de Atividades JAVA-1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha qual Atividade você quer executar!(De 2 a 12 apenas): ");
        String atividade = scanner.next();
        if(Atividades.isNumeric(atividade)){
            int escolha = Integer.parseInt(atividade);
            if(escolha < 2 || escolha > 12 ){
                System.out.println("Escolha uma Opção valida");
            }else {
                switch (escolha) {
                    case 2 -> Atividades.Atividade2(scanner);
                    case 3 -> Atividades.Atividade3(scanner);
                    case 4 -> Atividades.Atividade4(scanner);
                    case 5 -> Atividades.Atividade5(scanner);
                    case 6 -> Atividades.Atividade6();
                    case 7 -> Atividades.Atividade7();
                    case 8 -> Atividades.Atividade8(scanner);
                    case 9 -> Atividades.Atividade9(scanner);
                    case 10 -> Atividades.Atividade10(scanner);
                    case 11 -> Atividades.Atividade11(scanner);
                    case 12 -> Atividades.Atividade12(scanner);
                    default -> System.out.println("Não entendi o que você quis dizer tente novamente por favor");
                }
            }

        }else{
            System.out.println("Escolha uma Valor valido");
        }

    }

}