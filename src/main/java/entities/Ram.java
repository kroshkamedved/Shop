package entities;


public class Ram extends AbstractEntity {
    private int ramCapacity;

    public Ram(int id, int manufactureId, int ramCapacity) {
        super(id, manufactureId);
        this.ramCapacity = ramCapacity;

    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
    }
}
