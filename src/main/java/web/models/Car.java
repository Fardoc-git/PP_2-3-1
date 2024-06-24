package web.models;

public class Car {

    private int id;
    private String model;
    private String type;

    public Car(int id, String model, String type) {
        this.id = id;
        this.model = model;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "%d %s %s".formatted(getId(), getModel(), getType());
    }
}
