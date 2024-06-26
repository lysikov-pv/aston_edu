package lesson_7;

public class Circle implements GeometricFigure {
    float r;
    String bgColor, borderColor;

    /**
     * Геометрическая фигура "Круг"
     * @param r радиус окружности
     * @param bgColor цвет звливки
     * @param borderColor цвет границы
     */
    public Circle(float r, String bgColor, String borderColor) {
        this.r = r;
        this.bgColor = bgColor;
        this.borderColor = borderColor;
    }

    public void info() {
        System.out.println("Круг > Периметр: " + getPerimeter() +
                ", Площадь: " + getArea() +
                ", Цвет заливки: " + bgColor +
                ", Цвет границы: " + borderColor + ";");
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
}
