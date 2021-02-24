package Java1.Lab10.Example2;

public class Dog extends Animal {
    @Override
    public void greeting() {
        System.out.println("Dog!");
    }

    public void greeting(Dog another) {
        System.out.println("Dog!");
    }
}
