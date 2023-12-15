package adivinanúmero_cod;

import javax.swing.JOptionPane;

public class AdivinaNúmero_COD {

public static void main(String[] args) {
        
// Declaración de los datos
    
    /**
     * Botón que definirá que acción harás
     */
    double BotónPresionado;
    
 // Creamos el objeto
    Datos Instancia = Datos.GetInstancia();
    
// Creación del menú
    do{
        BotónPresionado = Double.parseDouble(JOptionPane.showInputDialog("Escribe la el número de la acción deseada" + "\n1: Jugar" + "\n0: Salir" + "\n" + "\nRecord: " + Datos.GetInstancia()));
        
        
        
        
        
        
        
    }while (BotónPresionado > 0);
    }
    
}
