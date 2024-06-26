package lesson_7;

public class Rectangle implements GeometricFigure {
    float a, b;
    String bgColor, borderColor;

    /**
     * Геометрическая фигура "Квадрат"
     * @param a длина стороны a
     * @param b длина стороны b
     * @param bgColor цвет звливки
     * @param borderColor цвет границы
     */
    public Rectangle(float a, float b, String bgColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.bgColor = bgColor;
        this.borderColor = borderColor;
    }

    public void info() {
        System.out.println("Прямоугольник > Периметр: " + getPerimeter() +
                ", Площадь: " + getArea() +
                ", Цвет заливки: " + bgColor +
                ", Цвет границы: " + borderColor + ";");
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public double getArea() {
        return a * b;
    }
}