public class Main {
    public static void main(String[] args) {
        Animal an = new Animal("Bear", 10);
        Cat cat = new Cat("Murka", 2);
        Dog dog = new Dog("Baron", 3);
        AngryDog angryDog =  new AngryDog("Zluka", 1);
        Cow cow = new Cow("Milka", 5);
        Animal[] animals = new Animal[]{an, cat, dog, angryDog, cow};
        for(Animal animal: animals){
            animal.voice();
        }
    }
}
