
public abstract class Enemies extends Charchters{

    @Override
     void display(){System.out.println("attack = "+getAttackPoints()+"\n"
         +"Defence = "+getDefencePints()+"\n"+"Class : "+getClass().toString()
         +"\n");}
    

    @Override
    public void setAbnormal(String abnormal) {
        super.setAbnormal(abnormal); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAbnormal() {
        return super.getAbnormal(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDefencePints(int defencePints) {
        super.setDefencePints(defencePints); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDefencePints() {
        return super.getDefencePints(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAttackPoints(int attackPoints) {
        super.setAttackPoints(attackPoints); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAttackPoints() {
        return super.getAttackPoints(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    void attacked(int peat) {
        setDefencePints(getDefencePints()-peat);
    }
}
