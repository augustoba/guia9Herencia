
package Service;

import entity.Animal;
import java.util.*;

public class ServiceAnimal {
    
    List<Animal> animales;
    private Scanner read;

    public ServiceAnimal() {
        this.read =new Scanner(System.in);
          this.animales=new ArrayList();
    }
    
    
    
    public Animal crearAnimal(){
        
        
        Animal animal = new Animal();
        return animal;
    }
    
    public void cargarAnimal(){
        
        for (int i = 0; i < 4; i++) {
        Animal animal = crearAnimal();
        
        System.out.println("ingrese el nombre del animal");
        animal.setNombre(read.nextLine());
        System.out.println("ingrese el alimento que come");
        animal.setAlimento(read.nextLine());
        System.out.println("ingrese la edad");
        animal.setEdad(read.nextInt());
        read.nextLine();
        System.out.println("ingrese la raza");
        animal.setRaza(read.nextLine());
        animales.add(animal);
            
        }
        
        
        
    }
    
    public void Alimentar(){
        System.out.println(animales.size()); 
        for (Animal aux : animales) {
            System.out.println("El animal: "+ aux.getNombre() + ", de raza: "+ aux.getRaza()+ ", come: " + aux.getAlimento());
            
        }
        
    }
    

}
