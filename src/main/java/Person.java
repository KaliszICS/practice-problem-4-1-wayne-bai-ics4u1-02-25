public class Person {
    private String name;
    private int age;
    private String eyeColor;
    private String hairColor;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight, String eyeColor, String hairColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.height = height;
        this.weight = weight;
    }   

    // Getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getEyeColour() {
        return this.eyeColor;
    }

    public String getHairColour() {
        return this.hairColor;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }
}


/*
  3. Create a Person class

It should have _name_, _age_, _height_, _weight_, _eyeColour_, and _hairColour_ as instance variables<br>
_height_ and _weight_ should be integers.<br>
Create a constructor that takes in the each of the instance variables and sets them from parameters.<br>
Create getters for all instance varaibles.<br>

*/