package ejercicio2y3.Service;

import ejercicio2y3.entity.Electrodomestico;
import ejercicio2y3.entity.Lavadora;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceLavadora {

    private Scanner read;
   
    private ServiceElectrodomestico servElectro;

    public ServiceLavadora() {
        this.read = new Scanner(System.in);
               this.servElectro = new ServiceElectrodomestico();

    }

    public void crearLavadora(ArrayList<Electrodomestico>electrodomesticos) {
    Lavadora lavadora = new Lavadora();

        System.out.println("ingrese el precio de la lavadora");
        lavadora.setPrecio(read.nextInt());
        read.nextLine();

        System.out.println("ingrese el color de la lavadora ( BLANCO - NEGRO - ROJO - AZUL - GRIS)");
        String color = read.nextLine();
        lavadora.setColor(servElectro.comprobarColor(color));
        
        
        System.out.println("ingrese el consumo energetico A-B-C-D-E-F");
        char letra = read.next().charAt(0);
        letra= Character.toUpperCase(letra); // convertir char to Uppercase.
        lavadora.setConsumoEnergetico(servElectro.comprobarConsumoEnergetico(letra));
        
        System.out.println("ingrese el peso de la lavadora");
        lavadora.setPeso(read.nextInt());
        
        System.out.println("ingrese el peso de carga");
        lavadora.setCarga(read.nextInt());
        
         precioFinal(lavadora);
         electrodomesticos.add(lavadora);
        
    }
    
    public void precioFinal(Lavadora lavadora){
       
        if (lavadora.getCarga()>30) {
            lavadora.setPrecio(lavadora.getPrecio()+500);
            
        }
        servElectro.precioFinal(lavadora);
        System.out.println("el precio final es: ");
        System.out.println("-" +lavadora);
    }

}
