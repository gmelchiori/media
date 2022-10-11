import java.util.Scanner;

public class nota {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a nota do 1° bimestre: ");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Digite a nota do 2° bimestre: ");
        double nota2 = scanner.nextDouble();
        
        System.out.println("Digite a nota do 3° bimestre: ");
        double nota3 = scanner.nextDouble();
        
        System.out.println("Digite a nota do 4° bimestre: ");
        double nota4 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média final do aluno é: " + media + ".\n");
    }
}