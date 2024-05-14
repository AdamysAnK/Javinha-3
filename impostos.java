public class impostos {
    public static void main(String[] args) {
        double MeuSalario = 1200.25;
        // condições
        double taxa1 = 9.70;
        double taxa2 = 37.35;
        double taxa3 = 49.50;

        if (MeuSalario <= 34.712 && MeuSalario>=0 ){
           double Imposto = (MeuSalario/100)*taxa1;
            System.out.println("Você pagará "+taxa1+"% de impostos ou seja "+Imposto+" Euros");
        }

        else if (MeuSalario >= 68.507 ){
            double Imposto = (MeuSalario/100)*taxa2;
            System.out.println("Você pagará "+taxa2+"% de impostos ou seja "+Imposto+" Euros");

        }

        else if (MeuSalario >= 68.508 ){
            double Imposto = (MeuSalario/100)*taxa3;
            
            System.out.println("Você pagará "+taxa3+"% de impostos"+"% de impostos ou seja "+Imposto+" Euros");

        }


    }
}
