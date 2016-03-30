package entities;


public class Screen extends AbstractEntity {
    private int size;

    public Screen(int id, int manufactureId, int size) {
        super(id, manufactureId);
        this.size = size;

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
