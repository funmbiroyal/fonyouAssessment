package com.fonyouAssesment.productApi.fonyouJavaAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class ListTask {

        public static void main(String[] args) {
            List<String> colours = new ArrayList<>();
            colours.add("Red");
            colours.add("Green");
            colours.add("Blue");

            System.out.println("Contents of the list:");
            for (String color : colours) {
                System.out.println(color);
            }
        }
    }


