package com.workintech.main;
import com.workintech.enums.LampType;
import com.workintech.enums.PaintColor;
import com.workintech.model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------bedroom--------");

        Bedroom bedroom = new Bedroom("first",
                        new Wall("North"),
                        new Wall("South"),
                        new Wall("East"),
                        new Wall("West"),
                        new Ceiling(3, PaintColor.WHITE),
                new Lamp(LampType.FLUORESCENT, true, 3),
                new Bed("Double", 2, 1, 2, 2),
                        new Wardrobe(2, 4, 50),
                        new Carpet(3, 5, PaintColor.BLUE));
        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();

        System.out.println(bedroom);

        System.out.println(bedroom.getWall3());
    }
}