public class aulaswitch {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando q como domingo;
        byte dia = 9;
        // Podemos usar String, char , byte, short, enum, int

        switch (dia) {
            case 1:
            System.out.println("Domingo");
            break;
            case 2:
            System.out.println("Segunda");
            break;

            case 3:
            System.out.println("Terça");
            
            break;

            case 4:
            System.out.println("Quarta");
                        break;

            case 5:
            System.out.println("Quinta");
                        break;

            case 6:
            System.out.println("Sexta");
                        break;

            case 7:
            System.out.println("Sábado");
                        break;
        default:
        System.out.println("Oh seu besta, a semana so tem 7 dias porra");
        break;
        }

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Cuie");

            default:
            System.out.println("Para de inventar genero arrombado");
                break;
        }
    }
}
