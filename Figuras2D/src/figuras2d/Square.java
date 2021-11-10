package figuras2d;

/**
 *
 * @author Eber MD
 */
public class Square implements Shape{
    
    private float base;
    private float altura;
    
    @Override
    public double getArea(float lado) {
        // formula: base * altura o lado^2
        double area = 0;
        base = lado; altura = lado;
        area = base*altura;
        return area;
    }

    @Override
    public float getPerimeter(int lado) {
        // formula: Perimetro = 4*lado
        float perimetro;
        perimetro = 4*lado;
        return perimetro;
    }
}
