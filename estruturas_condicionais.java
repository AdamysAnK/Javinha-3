public class estruturas_condicionais {
    public static void main(String[] args) {
        double salario = 5000.00;
        String MensagemDoar = "Vou doar";
        String Danao =  "Vou doar nao pae";
        // (Condicao) ? verdadeiro : falso;
        String resultado = salario > 5000 ? MensagemDoar : Danao;
        System.out.println(resultado);
    }
}
