public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;


    void status(){
        System.out.println("Cor caneta: " + this.cor);
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Carga: "+ this.carga+"%");
        System.out.println("Ponta: "+this.ponta);
        if(this.tampada == false){
            System.out.println("A caneta está "+"destampada");
        }
        else{
            System.out.println("A caneta está "+"tampada");

        }
        // carga
        if(this.carga >=100){System.out.println("A carga está cheia!");}
        else if(this.carga<=60){System.out.println("A carga está média!");}
        else if(this.carga<=30){System.out.println("A carga está baixa!");}
        else if (this.carga<=15){System.out.println("A carga está presta a acabar!");}
        else if(this.carga<=5){System.out.println("A carga acabou!");}
    }

    void tampar(){
        this.tampada = true;

    }

     void destampar(){
        this.tampada = false;

     }

     void desenhar(){
        if(tampada==true){
            System.out.println("Error!! Não posso desenhar se a caneta estiver tampada!");
        } else{
            System.out.println("*Desenhando*");
        }

     }

     void rabiscar (){
        if(tampada==true){
            System.out.println("Error!! Não posso rabiscar se a caneta estiver tampada!");
        }else{
            System.out.println("*rabiscando*");
        }


     }
 
 
}

