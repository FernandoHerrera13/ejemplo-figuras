/**
 * Ejercicio para la practica de Herencia y Polimorfismo
 * Esta clase es una superclase para representar las caracteristicas comunes de muchas figuras
 * @author Luis Fernando Herrera Gonzalez
 * @version 2.0 (9-Sept-17)
 */

public class Figura
{
    //Variables de instancia
    protected float area;
    protected float perimetro;
    
    /**
     * Constructor de la clase Figura.
     */
    public Figura()
    {
        area=0;
        perimetro=0;
    }
    
    /**
     * Calcula el area de la figura.
     */
    public void calcularArea()
    {
        System.out.println("No se como calcular el area porque no se de que figura se trata");
    }
    
    /**
    * Calcula el perimetro de la figura.
    */
    public void calcularPerimetro()
    {
        System.out.println("No se como calcular el perimetro porque no se de que figura se trata");
    }
    
    /**
     * Imprime el area de la figura.
     */
    public void imprimirArea()
    {
        System.out.println("El area de la figura es: "+area);
    }
    
    /**
    * Imprime el perimetro de la figura.
    */
    public void imprimirPerimetro()
    {
        System.out.println("El perimetro de la figura es: "+perimetro);
    }
}
    