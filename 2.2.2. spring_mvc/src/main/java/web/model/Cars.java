package web.model;

import org.springframework.stereotype.Component;

@Component
public class Cars {

    String model;
    int series;
    String color;

    public Cars(String model, int series, String color) {
        this.model = model;
        this.series = series;
        this.color = color;
    }

    public Cars() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Model='" + model + '\'' +
                ", series=" + series +
                ", color=" + color +
                '}';
    }
}