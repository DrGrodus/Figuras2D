package figuras2d;

/**
 *
 * @author Eber MD
 */
public class Triangle implements Shape{

    private float base;
    private float altura;
    
    @Override
    public double getArea(float lado) {
        // formula: Area = (base * altura)/2
        double area;
        base = lado; altura = lado;
        area = (base*altura)/2;
        return area;
    }

    @Override
    public float getPerimeter(int lado) {
        // formula: Perimetro = L + L + L = 3L
        float perimetro = 0;
        for(int i = 0; i < 3; i++){ perimetro += lado; }
        return perimetro;
    }
}
