package com.core;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        boolean b = true;
        Functions functions = new Functions();
        int i = functions.enterConstruction();
        int u = functions.enterTool();
        functions.calc(i, u);
    }
}
