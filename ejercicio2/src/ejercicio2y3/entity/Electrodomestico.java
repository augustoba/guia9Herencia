
package ejercicio2y3.entity;

public class Electrodomestico {
    protected Integer precio;
    protected String color;
    protected Character consumoEnergetico;
    protected Integer peso;

    public Electrodomestico() {
        this.precio=1000;
    }

    public Electrodomestico(Integer precio, String color, Character consumoEnergetico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Character consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return  "Precio: " + precio + ", Color: " + color + ", Consumo Energetico: " + consumoEnergetico + ", Peso: " + peso ;
    }
    
    
    

}
