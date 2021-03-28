package mcm.edu.ph.takumicorporation_inheritancerpg20;

public class Monsters extends GameUnit{

    int exp;
    String monsterType;
    String element;
    int monsterParry;
    int monsterEvasion;
    String unitName;

    public Monsters(){}
    public Monsters(String unitName, int HP, int minDMG, int maxDMG, String monsterType,
                    String element, int monsterParry, int monsterEvasion){
        this.unitName = unitName;
        super.HP = HP;
        super.minDMG = minDMG;
        super.maxDMG = maxDMG;
        super.DEF = DEF;
        super.MP = MP;
        this.monsterType = monsterType;
        this.element = element;
        this.monsterEvasion = monsterEvasion;
        this.monsterParry = monsterParry;
    }
/**
 Monsters GeoSlime = new Monsters("Geo Slime", 150, 50, 90, "Slime", "Geo", 100, 20);
 Monsters RelicBeast = new Monsters("Relic Beast", 900, 100, 160, "Beast", "Nature", 200, 25);
 Monsters Automaton = new Monsters("Automaton", 600, 85, 135, "Machine", "Unknown", 90, 40);
 Monsters PlagueWitch = new Monsters("Plague Witch", 400, 120, 180, "Witch", "Dark", 250, 10);
 **/

}
