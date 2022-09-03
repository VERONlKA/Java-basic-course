public class AngryDog extends Dog{
    String name;
    int age;
    public AngryDog(String name, int age) {
        super(name, age);
        name = this.name;
        age = this.age;
    }

    private Dog angrDog = new Dog(name, age);
    @Override
    public void voice() {
        angrDog.voice();
        System.out.println("Grrr");
    }
}
