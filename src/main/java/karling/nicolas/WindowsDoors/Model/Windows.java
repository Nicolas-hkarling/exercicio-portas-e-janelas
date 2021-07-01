package karling.nicolas.WindowsDoors.Model;

public class Windows extends Frames {
    private String windowsFormat;
    private String windowsColor;

    public Windows() {
    }

    public Windows(double length, double height, String type, String windowsFormat, String windowsColor) {
        super(length, height, type);
        this.windowsFormat = windowsFormat;
        this.windowsColor = windowsColor;
    }

    public String getWindowsFormat() {
        return windowsFormat;
    }

    public void setWindowsFormat(String windowsFormat) {
        this.windowsFormat = windowsFormat;
    }


    public String getWindowsColor() {
        return windowsColor;
    }

    public void setWindowsColor(String windowsColor) {
        this.windowsColor = windowsColor;
    }

    @Override
    public String toString() {
        return
                "\nwindowsFormat = " + windowsFormat +
                "\nwindowsColor = " + windowsColor +
                super.toString();
    }
}
