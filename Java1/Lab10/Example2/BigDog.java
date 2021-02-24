package Java1.Lab10.Example2;

public class BigDog extends Dog {
    @Override
    public void greeting() {
        System.out.println("DOG!");
    }

    @Override
    public void greeting(Dog another) {
        System.out.println("DOG!");
    }
}
