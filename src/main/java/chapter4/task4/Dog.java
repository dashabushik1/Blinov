package chapter4.task4;

public class Dog extends Animal {

    public Dog(String name) {
        super("Rosie", "Dog");
    }

    public String getVoice() {
        return "Woof";
    }

    public String getJump() {
        return "Jump";
    }

    public String getRun() {
        return "Run";
    }

    public String getBite() {
        return "Bite";
    }
}
