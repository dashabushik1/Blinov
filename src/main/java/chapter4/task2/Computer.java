package chapter4.task2;

public class Computer { // компьютер

    private String name;  // имя
    private String model;  // модель
    private String typeOS;  // тип ОС
    private String manufacturer;  // производитель
    private Hdd hardDisk; // винчестер
    private CdRom cdRom; // дисковод
    private Ram ram; // оперативная память
    private Processor processor; // процессор

    public Computer(String name, String model, String typeOS) {
        this.name = name;
        this.model = model;
        this.typeOS = typeOS;
    }

    public void switchOn() {
        System.out.println("Hello!");
    }

    public void switchOff() {
        System.out.println("Good night.");
    }

    public void virusTest() {
        String capacityOfHDD = hardDisk.getCapacity();

        if (this.typeOS.equals("Windows")) {
            System.out.println("HDD (" + capacityOfHDD + ") was checked. There is a danger of the viruses!");
        } else {
            System.out.println("HDD (" + capacityOfHDD + ") was checked. There is no danger in the system");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypeOS() {
        return typeOS;
    }

    public void setTypeOS(String typeOS) {
        this.typeOS = typeOS;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Hdd getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(Hdd hardDisk) {
        this.hardDisk = hardDisk;
    }

    public CdRom getCdRom() {
        return cdRom;
    }

    public void setCdRom(CdRom cdRom) {
        this.cdRom = cdRom;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }
}
