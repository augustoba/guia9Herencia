
package ejercicio2y3.entity;

import ejercicio2y3.Service.ServiceElectrodomestico;
import java.util.Scanner;

public class Lavadora extends Electrodomestico {
    
    ServiceElectrodomestico electro = new ServiceElectrodomestico();

    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Integer precio, String color, Character consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora: " + "precio: $" + precio + ", color: " + color + ", consumo Energetico: " 
		+ consumoEnergetico + ", peso: " + peso +"Kg."+ ", carga: " + carga ;
    }

   

    

    
    
}
