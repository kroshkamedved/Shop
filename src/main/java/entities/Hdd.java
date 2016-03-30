package entities;


public class Hdd extends AbstractEntity {
    private int capacity;

    public Hdd(int id, int manufactureId, int capacity) {
        super(id, manufactureId);
        this.capacity = capacity;

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
