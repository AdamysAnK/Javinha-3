import java.awt.Dimension;
import java.awt.Toolkit;
public class ResolucaoSistema {
    public static void main(String[] args) {
        Toolkit tk;
        tk= Toolkit.getDefaultToolkit();
        Dimension d =tk.getScreenSize();
        System.out.println("Sua resulução atual é "+ d.width +"X"+d.getHeight());
        int numero1 = 1280;
        int numero2= 720;
        if (d.width==numero1 && d.height==numero2){
            System.out.println("Default");

        }
    }
}
