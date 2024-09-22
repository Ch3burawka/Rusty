package com.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ReidInfo {
    ArrayList<String> objectsList = new ArrayList();
    ArrayList<String> weaponList = new ArrayList();
    Map<String, Map<String, Integer>> requiredWeapons = new HashMap<>();

    public ReidInfo() {
        initObjectList();
        initWeaponList();
        initRequiredTools();
    }

    public void initObjectList() {
        objectsList.add("1. Wood Door");
        objectsList.add("2. Sheet Metal Door ");
        objectsList.add("3. Garage Door");
        objectsList.add("4. Armored Door");
        objectsList.add("5. Wall Wood");
        objectsList.add("6. Wall Stone");
        objectsList.add("7. Wall Metal");
        objectsList.add("8. Wall TopTier");
        objectsList.add("9. Metal Shop Front");
    }

    public void initWeaponList() {
        weaponList.add("1. Satchel charge");
        weaponList.add("2. C4 charge");
        weaponList.add("3. Explosive ammo");
        weaponList.add("4. Rocket");
    }

    public void initRequiredTools() {
        for (String object : objectsList) {
            Map<String, Integer> weaponCounts = new HashMap<>();

            if (object.equals("1. Wood door")) {
                weaponCounts.put("1. Satchel charge", 2);
                weaponCounts.put("2. C4 charge", 1);
                weaponCounts.put("3. Explosive ammo", 16);
                weaponCounts.put("4. Rocket", 1);
                requiredWeapons.put(object, weaponCounts);
            } else {
                if (object.equals("2. Sheet Metal Door")) {
                    weaponCounts.put("1. Satchel charge", 4);
                    weaponCounts.put("2. C4 charge", 1);
                    weaponCounts.put("3. Explosive ammo", 63);
                    weaponCounts.put("4. Rocket", 2);
                } else if (object.equals("3. Garage Door")) {
                    weaponCounts.put("1. Satchel charge", 9);
                    weaponCounts.put("2. C4 charge", 2);
                    weaponCounts.put("3. Explosive ammo", 150);
                    weaponCounts.put("4. Rocket", 3);
                } else if (object.equals("4. Armored Door")) {
                    weaponCounts.put("1. Satchel charge", 15);
                    weaponCounts.put("2. C4 charge", 3);
                    weaponCounts.put("3. Explosive ammo", 250);
                    weaponCounts.put("4. Rocket", 5);
                } else if (object.equals("5. Wall Wood")) {
                    weaponCounts.put("1. Satchel charge", 3);
                    weaponCounts.put("2. C4 charge", 1);
                    weaponCounts.put("3. Explosive ammo", 42);
                    weaponCounts.put("4. Rocket", 2);
                } else if (object.equals("6. Wall Stone")) {
                    weaponCounts.put("1. Satchel charge", 10);
                    weaponCounts.put("2. C4 charge", 2);
                    weaponCounts.put("3. Explosive ammo", 167);
                    weaponCounts.put("4. Rocket", 4);
                } else if (object.equals("7. Wall Metal")) {
                    weaponCounts.put("1. Satchel charge", 23);
                    weaponCounts.put("2. C4 charge", 4);
                    weaponCounts.put("3. Explosive ammo", 399);
                    weaponCounts.put("4. Rocket", 8);
                } else if (object.equals("8. Wall Top Tier")) {
                    weaponCounts.put("1. Satchel charge", 46);
                    weaponCounts.put("2. C4 charge", 8);
                    weaponCounts.put("3. Explosive ammo", 797);
                    weaponCounts.put("4. Rocket", 15);
                } else if (object.equals("9. Metal Shop Front")) {
                    weaponCounts.put("1. Satchel charge", 18);
                    weaponCounts.put("2. C4 charge", 3);
                    weaponCounts.put("3. Explosive ammo", 299);
                    weaponCounts.put("4. Rocket", 6);
                }
                requiredWeapons.put(object, weaponCounts);
            }
        }
    }
}
