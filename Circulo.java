/**
 * Ejercicio para la practica de Herencia y Polimorfismo
 * Esta clase representa objetos circulo con un radio.
 * @author Luis Fernando Herrera Gonzalez
 * @version 1.0 (8-Sept-17)
 */
public class Circulo extends Figura
{
    private float radio;
    private float diametro;
    
    public Circulo(float unradio, float undiametro)
    {
        radio=unradio;
        diametro=undiametro;
    }
    
    @Override
    public void calcularArea()
    {
        area= 3.14f *radio *radio;
    }
    
    @Override
    public void calcularPerimetro()
    {
        perimetro= 3.14f *diametro;
    }
}