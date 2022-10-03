package MainEjercicio2y3;

import ejercicio2y3.entity.Electrodomestico;
import ejercicio2y3.Service.ServiceElectrodomestico;
import ejercicio2y3.Service.ServiceTelevisor;
import ejercicio2y3.Service.ServiceLavadora;
import java.util.*;

public class Ejercicio2y3 {
    
    public static void main(String[] args) {
        
        ServiceElectrodomestico serv = new ServiceElectrodomestico();
        ServiceLavadora servLav = new ServiceLavadora();
        ServiceTelevisor servTel = new ServiceTelevisor();
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        Scanner read = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("-----------MENU--------------");
            System.out.println("1- para cargar lavarropas ");
            System.out.println("2- para cargar televisor ");
            int opc = read.nextInt();
            
            switch (opc) {
                case 1:
                    servLav.crearLavadora(electrodomesticos);
                    break;
                    case 2:
                        servTel.crearTelevisor(electrodomesticos);
                    
                    break;
                default:
                    System.out.println("ingrese una opcion correcta");
            }
        }
       
        serv.mostrar(electrodomesticos);
        serv.precioTotal(electrodomesticos);
       
      
    }
    
}
