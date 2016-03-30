package entities;

public abstract class AbstractEntity {
    private int id;
    private int manufacturerId;

    public AbstractEntity(int id, int manufacturerId) {
        this.id = id;
        this.manufacturerId = manufacturerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getManufacture() {
        return manufacturerId;
    }

    public void setManufacture(int manufacture) {
        this.manufacturerId = manufacture;
    }
}
