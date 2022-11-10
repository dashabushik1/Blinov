package chapter4.task2;

public class Computer { // компьютер

    private String typeOS;  // тип ОС
    private Hdd hdd; // винчестер
    private CdRom cdRom; // дисковод
    private Ram ram; // оперативная память
    private Cpu cpu; // процессор

    public Computer(String typeOS) {
        this.typeOS = typeOS;
    }

    public void switchOn() {
        System.out.println("Hello!");
    }

    public void switchOff() {
        System.out.println("Good night.");
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public void showHddCapacity() {
        System.out.println("The capacity of HDD is " + hdd.getCapacity() + ".");
    }

    public void virusTest() {
        String capacityOfHdd = hdd.getCapacity();
        if (this.typeOS.equals("macOS")) {
            System.out.println("HDD (" + capacityOfHdd + ") was checked. There is a danger of the viruses!");
        } else {
            System.out.println("HDD (" + capacityOfHdd + ") was checked. There is no danger in the system");
        }
    }
}
