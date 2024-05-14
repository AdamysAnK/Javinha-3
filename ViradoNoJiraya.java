import java.util.Scanner;

public class ViradoNoJiraya {
        public static void main(String[] args) {

        Scanner nome = new Scanner(System.in);  //Criando uma nova variavel
        System.out.println("What your name?: "); //Print para a variavel

        String Nome = nome.nextLine(); //Receber a variavel em outra variavel??, acho q nao precisa disso


        Scanner peso = new Scanner(System.in);
        System.out.println("How many do you weigh?");

        float Peso = peso.nextFloat();

        Scanner estado = new Scanner(System.in);
        System.out.println("How are you from?: ");

        String Estado = estado.nextLine();

        Scanner nascimento = new Scanner(System.in);
        System.out.println("Qual o ano de nascimento? ");

        int idade = nascimento.nextInt();


        int calculo=2024-idade;
           
        int i=1;
        while (i<70){
            System.out.print("=+");
            i++;
        }
        System.out.println("\nUser: " + Nome +"\nPeso: "+Peso+" KG"+"\nEstado: "+Estado+"\nIdade: "+calculo);
        System.out.print("Obrigado por usar o Sistema!");
    }

}
// comentario de uma linha
 /* comentario
  em várias
  linhas
  */
