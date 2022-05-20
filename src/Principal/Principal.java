package Principal;
import Vista.Ventana_01_Inicio;
public class Principal {
    public static void main(String[] args){
        Ventana_01_Inicio inicio = new Ventana_01_Inicio();
        inicio.setVentana(inicio);
        inicio.setVisible(true);
    }
}
