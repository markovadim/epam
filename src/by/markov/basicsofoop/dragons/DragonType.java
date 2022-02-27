package by.markov.basicsofoop.dragons;

public enum DragonType {
    DIAMOND_WINGED("Diamond Wigned"),
    WHITE_DRAGON("White dragon"),
    VENTURIS("Venturis"),
    DEFENDER("Defender"),
    STONE_DRAGON("Stone dragon"),
    MONARCH("Monarch"),
    ASHEN("Ashen"),
    SAPPHIRE("Sapphire");

    private String dragonType;

    DragonType(String dragonType) {
        this.dragonType = dragonType;
    }

    public String getDragonType() {
        return dragonType;
    }

    @Override
    public String toString() {
        return dragonType;
    }
}
