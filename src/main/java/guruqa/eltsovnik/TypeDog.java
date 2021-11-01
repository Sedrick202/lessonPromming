package guruqa.eltsovnik;

public class TypeDog {
    public static void main(String[] args) {
        Dog bob = new Dog();
        Dog lafi = new Dog();
        Dog marli = new Dog();

        bob.breed = "Корги";
        bob.age = 2;
        bob.character = "Добрый";
        bob.weight = 15;
        bob.height = 30;

        lafi.breed = "Овчкарка";
        lafi.age = 5;
        lafi.character = "Умеренный";
        lafi.weight = 45;
        lafi.height = 100;

        marli.breed = "Мопс";
        marli.age = 7;
        marli.character = "Злой";
        marli.weight = 30;
        marli.height = 25;

        bob.ShowDogParams();
        System.out.println("");
        lafi.ShowDogParams();
        System.out.println("");
        marli.ShowDogParams();


    }
}
