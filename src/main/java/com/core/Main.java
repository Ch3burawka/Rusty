package com.core;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Functions functions = new Functions();
        int constructionIndex = functions.enterConstruction();
        int toolIndex = functions.enterTool();
        functions.calc(constructionIndex, toolIndex);
    }
}
