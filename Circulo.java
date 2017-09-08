/**
 * Ejercicio para la practica de Herencia y Polimorfismo
 * Esta clase representa objetos circulo con un radio.
 * @author Luis Fernando Herrera Gonzalez
 * @version 1.0 (8-Sept-17)
 */
public class Circulo extends Figura
{
    private float radio;
    
    public Circulo(float unradio)
    {
        radio=unradio;
    }
    
    @Override
    public void calcularArea()
    {
        area= 3.14f *radio *radio;
    }
}