package com.example.builder;

public class Computer {
  
    private String CPU;
    private String RAM;

 
    private String storage;
    private String graphicsCard;
    private String operatingSystem;

 
    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage 
            + ", graphicsCard=" + graphicsCard + ", operatingSystem=" + operatingSystem + "]";
    }

  
    public static class ComputerBuilder {
        
        private String CPU;
        private String RAM;

     
        private String storage;
        private String graphicsCard;
        private String operatingSystem;

      
        public ComputerBuilder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

      
        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public ComputerBuilder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
