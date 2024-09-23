package com.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ReidInfo {
    ArrayList<String> objectsList = new ArrayList<>();
    ArrayList<String> weaponList = new ArrayList<>();
    Map<String, Map<String, Integer>> requiredWeapons = new HashMap<>();

    public ReidInfo() {
        initObjectList();
        initWeaponList();
        initRequiredTools();
    }

    public void initObjectList() {
        objectsList.add("1. Wood Door");
        objectsList.add("2. Sheet Metal Door");
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

            if (object.equals("1. Wood Door")) {
                weaponCounts.put("1. Satchel charge", 2);
                weaponCounts.put("2. C4 charge", 1);
                weaponCounts.put("3. Explosive ammo", 16);
                weaponCounts.put("4. Rocket", 1);
                requiredWeapons.put(object, weaponCounts);
            } else {
                if (object.equals("2. Sheet Metal Door")) {
                    addWeaponToMap(object, 4, 1, 63, 2);
                } else if (object.equals("3. Garage Door")) {
                    addWeaponToMap(object, 9, 2, 150, 3);
                } else if (object.equals("4. Armored Door")) {
                    addWeaponToMap(object, 15, 3, 250, 5);
                } else if (object.equals("5. Wall Wood")) {
                    addWeaponToMap(object, 3, 1, 42, 2);
                } else if (object.equals("6. Wall Stone")) {
                    addWeaponToMap(object, 10, 2, 167, 4);
                } else if (object.equals("7. Wall Metal")) {
                    addWeaponToMap(object, 23, 4, 399, 8);
                } else if (object.equals("8. Wall Top Tier")) {
                    addWeaponToMap(object, 46, 8, 797, 15);
                } else if (object.equals("9. Metal Shop Front")) {
                    addWeaponToMap(object, 18, 3, 299, 6);
                }
            }
        }
    }

    public void addWeaponToMap(String object, int satchel, int c4, int explosiveAmmo, int rocket) {
        Map<String, Integer> weaponCounts = new HashMap<>();
        weaponCounts.put("1. Satchel charge", satchel);
        weaponCounts.put("2. C4 charge", c4);
        weaponCounts.put("3. Explosive ammo", explosiveAmmo);
        weaponCounts.put("4. Rocket", rocket);
        requiredWeapons.put(object, weaponCounts);
    }
}
