import java.util.Scanner; 
public class ExercicioCalcMedia {
    public static void main(String[] args) {
        //Uso do Scanner para entrada de dados
        try (Scanner scan = new Scanner(System.in)) {
       //Entrada de dados AC1
       System.out.print("Digite sua nota na AC1: ");
            double AC1 = scan.nextDouble();

        //Entrada de dados AC2
        System.out.print("Digite sua nota na AC2: ");
            double AC2 = scan.nextDouble();

        //Entrada de dados AG 
        System.out.print("Digite sua nota na AG: ");
            double AG = scan.nextDouble();

        //Entrada de dados AF
        System.out.print("Digite sua nota na AF: ");
            double AF = scan.nextDouble();

        //Calculo da Media Final
        double notaf = ( AC1 * 0.15 ) + (AC2 * 0.30) + (AG * 0.10) + (AF * 0.45);

        //Condicional para identificação se o aluno foi Aprovado ou Reprovado
        if (notaf >= 5) 
        { System.out.printf("Voce foi aprovado com " + notaf + " de media!"); }

        else 
        { System.out.printf("Voce foi reprovado, sua media foi " + notaf + "!"); }

    } 

    } 
}