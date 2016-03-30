package entities;


public class Processor extends AbstractEntity {

    private String clockSpeed;

    public Processor(int id, int manufactureId, String clockSpeed) {
        super(id, manufactureId);
        this.clockSpeed = clockSpeed;

    }

    public String getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(String clockSpeed) {
        this.clockSpeed = clockSpeed;
    }
}
