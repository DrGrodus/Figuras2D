package figuras2d;

/**
 *
 * @author Eber MD
 */
public class Circle implements Shape{

    private float radio;
    
    @Override
    public double getArea(float lado) {
        // formula: Area = Pi * radio^2
        double area;
        radio = lado;
        area = Math.PI*Math.pow(radio, 2);
        return area;
    }

    @Override
    public float getPerimeter(int lado) {
        // formula: Perimetro = 2 * Pi * radio
        float perimetro;
        perimetro = (float) (2*Math.PI*lado);
        return perimetro;
    }
}
