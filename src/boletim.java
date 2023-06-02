import java.util.*;

public class boletim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, double[]> boletim = new HashMap<>();
//        double[] notas = new double[2];
        String nome;

        System.out.println("Boletim vazio");
        System.out.print("Deseja adicionar novo aluno e suas notas? (S/N) ");
        for(String adiciona = input.next(); adiciona.equalsIgnoreCase("s"); adiciona = input.next()){
            System.out.print("Qual o nome do aluno? ");
            nome = input.next();
            double[] notas = new double[2];
            for (int i = 0; i<2; i++){
                System.out.print("Digite a nota "+ (i+1)+": ");
                notas[i] = input.nextDouble();
            }
//            System.out.println("Nome lido: "+ nome + "  notas digitadas: " + Arrays.toString(notas));
            boletim.put(nome,notas);
//            System.out.printf("Put no map: %s  %s", nome, Arrays.toString(boletim.get(nome)));
            System.out.print("\n\nDeseja adicionar novo aluno e suas notas? (S/N) ");
        }

        System.out.println("\nBoletim: ");

        for(String key : boletim.keySet()){
            System.out.printf("%-30s",key);
            for(double nota : boletim.get(key)){
                System.out.printf("%-5s", nota);
            }
            System.out.println();
        }
    }
}
