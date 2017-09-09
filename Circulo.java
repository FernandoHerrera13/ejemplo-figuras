/**
 * Ejercicio para la practica de Herencia y Polimorfismo
 * Esta clase representa objetos circulo con un radio.
 * @author Luis Fernando Herrera Gonzalez
 * @version 2.0 (9-Sept-17)
 */
public class Circulo extends Figura
{
    //Variables de instancia
    private float radio;
    private float diametro;
    
    /**
     * Constructor de la clase Circulo
     */
    public Circulo(float unradio, float undiametro)
    {
        radio=unradio;
        diametro=undiametro;
    }
    
    /**
     * Método encargado de calcular el área del circulo
     */
    @Override
    public void calcularArea()
    {
        area= 3.14f *radio *radio;
    }
    
    /**
     * Método encargado de calcular el perimetro del circulo
     */
    @Override
    public void calcularPerimetro()
    {
        perimetro= 3.14f *diametro;
    }
}