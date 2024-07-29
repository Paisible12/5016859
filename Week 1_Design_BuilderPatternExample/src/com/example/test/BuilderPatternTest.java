package com.example.test;

import com.example.builder.Computer;

public class BuilderPatternTest {
    public static void main(String[] args) {
       
        Computer basicComputer = new Computer.ComputerBuilder("Intel i5", "8GB").build();
        System.out.println(basicComputer);

    
        Computer advancedComputer = new Computer.ComputerBuilder("Intel i7", "16GB")
                .setStorage("512GB SSD")
                .setGraphicsCard("NVIDIA GTX 1660")
                .setOperatingSystem("Windows 10")
                .build();
        System.out.println(advancedComputer);

        
        Computer customComputer = new Computer.ComputerBuilder("AMD Ryzen 5", "16GB")
                .setStorage("1TB HDD")
                .setGraphicsCard("AMD Radeon RX 580")
                .setOperatingSystem("Linux")
                .build();
        System.out.println(customComputer);
    }
}

