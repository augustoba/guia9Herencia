
package ejercicio2y3.Service;

import ejercicio2y3.entity.Electrodomestico;
import ejercicio2y3.entity.Lavadora;
import ejercicio2y3.entity.Televisor;
import java.util.ArrayList;
import java.util.Scanner;


public class ServiceTelevisor {
    private Scanner read;
   
    private ServiceElectrodomestico servElectro;

    public ServiceTelevisor() {
        this.read = new Scanner(System.in);
        this.servElectro = new ServiceElectrodomestico();

    }
    
    
    public void crearTelevisor(ArrayList<Electrodomestico>electrodomesticos) {
            Televisor televisor = new Televisor();

        System.out.println("ingrese el precio del televisor");
        televisor.setPrecio(read.nextInt());
        read.nextLine();

        System.out.println("ingrese el color del televisor ( BLANCO - NEGRO - ROJO - AZUL - GRIS)");
        String color = read.nextLine();
        televisor.setColor(servElectro.comprobarColor(color));
        
        
        System.out.println("ingrese el consumo energetico A-B-C-D-E-F");
        char letra = read.next().charAt(0);
        letra= Character.toUpperCase(letra); // convertir char to Uppercase.
        televisor.setConsumoEnergetico(servElectro.comprobarConsumoEnergetico(letra));
        
        read.nextLine();
        System.out.println("ingrese el peso del televisor");
        televisor.setPeso(read.nextInt());
        
        read.nextLine();
        televisor.setSintonizadorTdt(sintonizador());
        
        System.out.println("ingrese la resolucion en pulgadas");
        televisor.setResolucion(read.nextDouble());
        
         precioFinal(televisor);
         electrodomesticos.add(televisor);
        
    }
    
    
    public Boolean sintonizador(){
        Boolean tieneTdt=false;
        System.out.println("tiene sintonizador? si/no");
       String opc=read.nextLine();
        if (opc.equalsIgnoreCase("si")) {
            tieneTdt=true;
        }
         return tieneTdt;
    }
    
    
    public void precioFinal(Televisor televisor){
        servElectro.precioFinal(televisor);
        if (televisor.getResolucion()>40) {
            
            double precio = televisor.getPrecio()*1.3;
            int precio1 = (int) Math.round(precio);
            televisor.setPrecio(precio1);
        }
        
    }
    

}
