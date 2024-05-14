public class aula {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic flet";
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.carga = 30;
        System.out.println("_________________________________");
        c1.status();
        c1.desenhar();


        Caneta c2 = new Caneta();
        c2.modelo = "Canetao Anark";
        c2.cor = "Preta";
        c2.ponta = 1.2f;
        c2.tampar();
        c2.carga = 50;
        System.out.println("_________________________________");
        c2.status();
        c2.desenhar();
    }

}
