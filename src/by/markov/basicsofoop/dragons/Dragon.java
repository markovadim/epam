package by.markov.basicsofoop.dragons;

public class Dragon {
    private String name;
    private int age;
    private DragonType dragonType;
    private DragonColor dragonColor;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public DragonType getDragonType() {
        return dragonType;
    }

    public DragonColor getDragonColor() {
        return dragonColor;
    }

    public Dragon(String name, int age, DragonType dragonType, DragonColor dragonColor) {
        this.name = name;
        this.age = age;
        this.dragonType = dragonType;
        this.dragonColor = dragonColor;
    }
}
