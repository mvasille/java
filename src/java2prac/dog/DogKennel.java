package java2prac.dog;


public class DogKennel {
    private Dog[] dogs;
    private int count;

    public DogKennel(int capacity) {
        dogs = new Dog[capacity];
        count = 0;
    }

    public void addDog(Dog dog) {
        if (count < dogs.length) {
            dogs[count] = dog;
            count++;
            System.out.println("Собака " + dog.getName() + " добавлена в приют.");
        } else {
            System.out.println("Приют полон, невозможно добавить больше собак.");
        }
    }

    public void displayDogs() {
        System.out.println("Список собак в приюте:");
        for (int i = 0; i < count; i++) {
            System.out.println(dogs[i]);
        }
    }

    public static void main(String[] args) {
        DogKennel kennel = new DogKennel(3);

        Dog dog1 = new Dog("Шармель", 3);
        Dog dog2 = new Dog("Лиза", 9);
        Dog dog3 = new Dog("Гена", 5);

        kennel.addDog(dog1);
        kennel.addDog(dog2);
        kennel.addDog(dog3);

        Dog dog4 = new Dog("Джеки", 2);
        kennel.addDog(dog4);

        kennel.displayDogs();


    }
}