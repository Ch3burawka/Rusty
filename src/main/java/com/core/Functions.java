package com.core;

import java.util.Scanner;

public class Functions {
    ReidInfo reid = new ReidInfo();
    Scanner sc = new Scanner(System.in);

    public Functions() {
    }

    public int enterConstruction() {
        System.out.println("Choose construction:");
        for (String obj : reid.objectsList) {
            System.out.println(obj);
        }
        boolean correct = false;
        int in = -1;
        while (!correct) {
            try {
                System.out.println("Enter construction number;");
                in = Integer.parseInt(sc.nextLine());
                if (in > 0 && in <= reid.objectsList.size()) {
                    correct = true;
                } else {
                    System.out.println("Invalid input");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            }

        }
        System.out.println("You selected: " + reid.objectsList.get(in - 1));
        return in - 1;
    }

    public int enterTool() {
        System.out.println("Choose Weapon:");
        for (String wep : reid.weaponList) {
            System.out.println(wep);
        }
        boolean valid = false;
        int in1 = -1;
        while (!valid) {
            try {
                System.out.println("Enter Weapon number;");
                in1 = Integer.parseInt(sc.nextLine());
                if (in1 > 0 && in1 <= reid.weaponList.size()) {
                    valid = true;
                } else {
                    System.out.println("Invalid input");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            }

        }
        System.out.println("You selected: " + reid.weaponList.get(in1 - 1));
        return in1 - 1;
    }

    public void calc(int construction, int tool) {
        if (construction >= 0 && construction < reid.objectsList.size() && tool >= 0 && tool < reid.weaponList.size()) {
            String obj = reid.objectsList.get(construction);
            String wep = reid.weaponList.get(tool);
            Integer numb;
            numb = reid.requiredWeapons.get(obj).get(wep);
            if (numb != null) {
                String objCutted = extract(obj);
                String wepCutted = extract(wep);
                System.out.println("To destroy " + objCutted + " you will need " + numb + " " + wepCutted);
            } else {
                System.out.println("No data.");
            }
        } else System.out.println("Invalid input");
    }
    public String extract(String input) {
        int spaceIndex = input.indexOf(" ");
        return (spaceIndex != -1) ? input.substring(spaceIndex + 1) : input;
    }
}
