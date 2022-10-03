
package ejercicio2y3.entity;


public class Televisor extends Electrodomestico{
    
    private Double resolucion;
    private Boolean sintonizadorTdt;

    public Televisor() {
    }

    public Televisor(Double resolucion, Boolean sintonizadorTdt, Integer precio, String color, Character consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTdt = sintonizadorTdt;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTdt() {
        return sintonizadorTdt;
    }

    public void setSintonizadorTdt(Boolean sintonizadorTdt) {
        this.sintonizadorTdt = sintonizadorTdt;
    }

    @Override
    public String toString() {
        return "Televisor " + "precio: $" + precio + ", color: " + color + ", consumo Energetico: " + consumoEnergetico +
                ",\n peso: " + peso +" Kg."+ "Resolucion: "+ resolucion + " pulgadas" + ", sintonizadorTdt: " + sintonizadorTdt ;
        
    }
    

}
