/**
 * Ejercicio para la practica de Herencia y Polimorfismo
 * Esta clase representa objetos Cuadrado con cuatro lados iguales.
 * @author Luis Fernando Herrera Gonzalez
 * @version 2.0 (9-Sept-17)
 */
public class Cuadrado extends Figura
{
    //Variables de instancia
    private float lado;

    /**
     * Constructor de la clase Cuadrado
     */
    public Cuadrado(float unLado)
    {
        lado=unLado;
    }
    
    /**
     * Método encargado de calcular el área del cuadrado
     */
    @Override
    public void calcularArea()
    {
        area= lado * lado;
    }
    
    /**
     * Método encargado de calcular el perimetro del cuadrado
     */
    @Override
    public void calcularPerimetro()
    {
        perimetro= 4 * lado;
    }
}