
public abstract class Charchters {
private int attackPoints    ;
private int defencePints    ;
private String abnormal     ;


    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getDefencePints() {
        return defencePints;
    }

    public void setDefencePints(int defencePints) {
        this.defencePints = defencePints;
    }

    public String getAbnormal() {
        return abnormal;
    }

    public void setAbnormal(String abnormal) {
        this.abnormal = abnormal;
    }
abstract void attacked(int peat);

   abstract void display();

}
