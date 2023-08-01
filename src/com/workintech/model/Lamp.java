package com.workintech.model;
import com.workintech.enums.LampType;

public class Lamp {
    private LampType style;
    private boolean battery;
    private int globRating;

    public Lamp(LampType style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public LampType getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("\n" + "Style: " + style + "\n");
        build.append("Battery: " + battery + "\n");
        build.append("Glob Rating: " + globRating + "\n");
        return build.toString();
        //return "style: " + style + ", battery: " + battery + ", globRating: " + globRating;
    }
}
