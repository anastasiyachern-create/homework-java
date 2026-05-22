package Lesson4;

public class FigureColor {

    protected String fillColor;

    protected String borderColor;

    public FigureColor(String fillColor,
                       String borderColor) {

        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public String getFillColor() {

        return fillColor;
    }

    public String getBorderColor() {

        return borderColor;
    }
}
