package guruqa.eltsovnik;

public class Dog {
    String breed;
    int age;
    int weight;
    int height;
    String character;

    public void ShowDogParams(){
        System.out.println(breed);
        System.out.println(age + "лет");
        System.out.println(weight + "кг");
        System.out.println(height + "см");
        System.out.println(character);
    }
}
