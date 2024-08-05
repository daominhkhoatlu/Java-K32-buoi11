package baitap2;

public class Bird extends Animal {
    @Override
    public String makeSound() {
        String hello = "eeee";
        return "Bird makeSound!!!";
    }

    public String fly() {
        return "Bird fly";
    }

}
