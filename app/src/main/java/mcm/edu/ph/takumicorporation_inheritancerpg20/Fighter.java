package mcm.edu.ph.takumicorporation_inheritancerpg20;

public class Fighter extends GameUnit{

    int level;
    String unitName;
    double evasion;
    double luck;
    int accuracy;

    public Fighter(){}
    public Fighter(String unitName, int HP, int MP, int DEF, double evasion, double luck, int minDMG, int maxDMG, int accuracy){
        this.unitName = unitName;
        super.HP      = HP;
        super.MP      = MP;
        super.DEF     = DEF;
        this.evasion  = evasion;
        this.luck     = luck;
        this.level    = 1;
        super.minDMG  = minDMG;
        super.maxDMG  = maxDMG;
        this.accuracy = accuracy;


    }





}
