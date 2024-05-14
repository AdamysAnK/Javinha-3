import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Variaveis
            /* tipo nome = valor;*/
            int idade = 23;
            // podemos colocar o tipo da variavel, e dps colocar o valor na outra linha 
            int salario;
            salario = 400;
            // o var usamos para escopo local, ele msm coloca o tipo da variavel
            var nome = "AnarK";

        // Tipo primitivos

            // byte, short , int, long
            /*Byte = representa inteiros pequenos -127 - 128
            * Short = -32,728 - 32,767
            * int = -2,147,483.648 - 2,147,483,647
            * long = Grande pra caralho
            */ 

            //  Boleanos = boolean (True; False)

            // char = armazenar caracteres('a')

            // numeros flutuantes
                // double, float
                // Double = é mais preciso. ex = 1.2321313;
                // Float = menos preciso. ex = 1.20F;
        // Condicionais
            // if(idade > 50){
            //     System.out.println("Tá velho");

            // }else if(idade == 23){
            //     System.out.println("Flor da idade");

            // }
            // else{
            //     System.out.println("Tá novo ainda po");
            // }
        // Array
                /*
                * tipo[] nome
                */
                // int[] idades = new int[2];
                // idades[0] = 4;
                // idades[1] = 2;
                // String[] nomes = {"macaco"};
                //     System.out.println(nomes);
                // }

    // Array List
        // ArrayList<Integer> idades = new ArrayList<Integer>();
        // idades.add(22);
        // idades.add(30);
        // idades.add(21);
        // System.out.println(idades.size());
        // 


            // loops
            // while, for
            // For:
                int idades = 10;
            //     for(var i = 0; i<idades; i++){
            //         System.out.println("Meu valor é "+i);

            //     }

            // While
                // int i = 0;
                // while(i<idades){
                //     i++;
                //     System.out.println("Meu valor é "+i);

                // }
            // Casting
                
                int idade1 = 22;
                // Idade2 tá recebendo double de idade1, ou seja, idade2.0.
                double idade2 = idade1;

                //idade1 tá recebendo o int de idade2, ou seja, idade1(sem flutuantes), ele era uma floot e virou int
                idade1 = (int)idade2;

                // letra recebe = 'a'
                char letra = 'a';
                //transformamos a letra em uma string e jogamos ela para o nome1
                String nome1 = String.valueOf(letra);
                
                // Pegamos um caractere de uma string e jogamos para letra
                letra = nome.charAt(1);

                // transformar um inteiro em uma string
                String nome2 = String.valueOf(idade1);
                // Transformar uma string em int(n sei pra que serve isso)
                idade1 = Integer.parseInt(nome2);
    }           

}