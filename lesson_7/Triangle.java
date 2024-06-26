package lesson_7;

public class Triangle implements GeometricFigure {
    float a, b, c;
    String bgColor, borderColor;

    /**
     * Геометрическая фигура "Треугольник"
     * @param a длина стороны a
     * @param b длина стороны b
     * @param c длина стороны c
     * @param bgColor цвет звливки
     * @param borderColor цвет границы
     */
    public Triangle(float a, float b, float c, String bgColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.bgColor = bgColor;
        this.borderColor = borderColor;
    }

    public void info() {
        System.out.println("Треугольник > Периметр: " + getPerimeter() +
                ", Площадь: " + getArea() +
                ", Цвет заливки: " + bgColor +
                ", Цвет границы: " + borderColor + ";");
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
