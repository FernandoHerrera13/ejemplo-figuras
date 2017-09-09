/**
 * Ejercicio para la practica de Herencia y Polimorfismo
 * Esta clase representa objetos Triangulo con una base y una altura
 * @author Luis Fernando Herrera Gonzalez
 * @version 2.0 (9-Sept-17)
 */
public class Triangulo extends Figura
{
    //Variables de instancia
    private float altura;
    private float base;
    
    /**
     * Constructor de la clase Triangulo
     */
    public Triangulo(float unaAltura, float unaBase)
    {
        altura=unaAltura;
        base=unaBase;
    }
    
    /**
     * Método encargado de calcular el área del triangulo
     */
    @Override
    public void calcularArea()
    {
        area= (base * altura)/2;
    }
    
    /**
     * Método encargado de calcular el perimetro del triangulo
     */
    @Override
    public void calcularPerimetro()
    {
        perimetro= (base + altura) *2;
    }
}