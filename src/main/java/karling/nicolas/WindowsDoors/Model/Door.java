package karling.nicolas.WindowsDoors.Model;

public class Door extends Frames {
    private String doorHandleType;
    private String doorColor;
    private String doorHandleColor;
    private String doorLock;

    public Door() {
    }

    public Door(double length, double height, String type, String doorColor, String doorLock, String doorHandleType, String doorHandleColor) {
        super(length, height, type);
        this.doorColor = doorColor;
        this.doorLock = doorLock;
        this.doorHandleType = doorHandleType;
        this.doorHandleColor = doorHandleColor;
    }

    public String getDoorHandleType() {
        return doorHandleType;
    }

    public void setDoorHandleType(String doorHandleType) {
        this.doorHandleType = doorHandleType;
    }

    public String getDoorColor() {
        return doorColor;
    }

    public void setDoorColor(String doorColor) {
        this.doorColor = doorColor;
    }

    public String getDoorHandleColor() {
        return doorHandleColor;
    }

    public void setDoorHandleColor(String doorHandleColor) {
        doorHandleColor = doorHandleColor;
    }

    public String getDoorLock() {
        return doorLock;
    }

    public void setDoorLock(String doorLock) {
        this.doorLock = doorLock;
    }

    @Override
    public String toString() {
        return
                "\ndoorColor = " + doorColor +
                "\ndoorLock = " + doorLock+
                "\ndoorHandleType = " + doorHandleType +
                "\ndoorHandleColor = " + doorHandleColor +
                super.toString();
    }
}
