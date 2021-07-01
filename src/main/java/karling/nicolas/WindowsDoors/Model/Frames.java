package karling.nicolas.WindowsDoors.Model;

public abstract class Frames {
    protected double length;
    protected double height;
    protected String type;


    public Frames() {
    }

    public Frames(double length, double height, String type) {
        this.height = height;
        this.length = length;
        this.type = type;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double ToCalculatesArea(){
        return height+length;

    }

    @Override
    public String toString() {
        return
                "\nlength = " + length + "cm" +
                "\nheight = " + height + "cm" +
                "\n area = " + ToCalculatesArea() + "cm" +
                "\ntype = " + type;
    }
}
