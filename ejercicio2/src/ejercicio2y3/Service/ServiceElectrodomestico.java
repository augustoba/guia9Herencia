package ejercicio2y3.Service;

import ejercicio2y3.entity.Electrodomestico;
import java.util.*;


public class ServiceElectrodomestico {

    
    private Scanner read;

    public ServiceElectrodomestico() {
     
        this.read = new Scanner(System.in);
    }

    public Electrodomestico crearElectrodomestico() {

        Electrodomestico electrodomestico = new Electrodomestico();
        return electrodomestico;
    }

    public Electrodomestico cargarElectrodomestico() {
        Electrodomestico electrodomestico = crearElectrodomestico();

        System.out.println("ingrese el precio del electrodomestico");
        electrodomestico.setPrecio(read.nextInt());
        System.out.println("ingrese el peso");
        electrodomestico.setPeso(read.nextInt());
        read.nextLine();
        System.out.println("ingrese el color");
        String color = read.nextLine();
        electrodomestico.setColor(comprobarColor(color));

        System.out.println("ingrese el consumo energetico (A-B-C-D-E-F)");
        char letra = read.next().charAt(0);
        letra= Character.toUpperCase(letra); // convertir char to Uppercase.

        electrodomestico.setConsumoEnergetico(comprobarConsumoEnergetico(letra));

        return electrodomestico;
    }

    public void llenarArray(ArrayList<Electrodomestico>electrodomesticos) {
        electrodomesticos.add(cargarElectrodomestico());

    }

    public Character comprobarConsumoEnergetico(Character letra) {

        if (!(letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F')) {

        }

        return letra;
    }

    public String comprobarColor(String color) {

        if (!(color.equalsIgnoreCase("BLANCO") || color.equalsIgnoreCase("NEGRO") || color.equalsIgnoreCase("ROJO")
                || color.equalsIgnoreCase("AZUL") || color.equalsIgnoreCase("GRIS"))) {

            color = "BLANCO";
        }

        return color;
    }

    public void mostrar(ArrayList<Electrodomestico>electrodomesticos) {
        System.out.println("lista de electrodomesticos: ");
        for (Electrodomestico aux : electrodomesticos) {
            System.out.println("-"+ aux);
        }
    }

    public void precioFinal(Electrodomestico a) {
        
              

           
            if (a.getPeso() > 80) {
                a.setPrecio(a.getPrecio() + 1000);

            } else if (a.getPeso() >= 50 && a.getPeso() < 80) {
                a.setPrecio(a.getPrecio() + 800);

            } else if (a.getPeso() >= 20 && a.getPeso() < 50) {
                a.setPrecio(a.getPrecio() + 500);

            } else if (a.getPeso() >= 1 && a.getPeso() < 20) {
                a.setPrecio(a.getPrecio() + 100);

            }
            
            
            char opc = a.getConsumoEnergetico();
            
            
            switch(opc){
                
                case 'A':
                    a.setPrecio(a.getPrecio()+1000);
                    break;
                  case 'B':
                    a.setPrecio(a.getPrecio() + 800);
                    break;
                   case 'C':
                    a.setPrecio(a.getPrecio() + 600);
                    break;
                    case 'D':
                    a.setPrecio(a.getPrecio() + 500);
                    break;
                case 'E':
                    a.setPrecio(a.getPrecio() + 300);
                    break;
  
            }
            

        }
    
    public void precioTotal(ArrayList<Electrodomestico> electrodomesticos){
        
        Integer total=0;
        for (Electrodomestico aux : electrodomesticos) {
           total= total+ aux.getPrecio();
            
        }
        
        System.out.println("el precio total de los electrodomesticos es: $" + total);
    }
    
          

    }
    
   

