package entities;


public class Gpu extends AbstractEntity {
    private int vRamCapacity;

    public Gpu(int id, int manufactureId, int vRamCapacity) {
        super(id, manufactureId);
        this.vRamCapacity = vRamCapacity;

    }

    public int getvRamCapacity() {
        return vRamCapacity;
    }

    public void setvRamCapacity(int vRamCapacity) {
        this.vRamCapacity = vRamCapacity;
    }
}
