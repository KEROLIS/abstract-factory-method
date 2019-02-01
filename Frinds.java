
public abstract class Frinds extends Charchters{
 private int dargetTa7mol    ;
    public Frinds(int dargetTa7mol) {
        this.dargetTa7mol = dargetTa7mol;
    }

    public Frinds() {
    }
   
   
   

    public void setDargetTa7mol(int dargetTa7mol) {
        this.dargetTa7mol=dargetTa7mol;
    }

    @Override
     void display(){
         System.out.println("attack = "+getAttackPoints()+"\n"
         +"Defence = "+getDefencePints()+"\n"+"Class : "+getClass().toString()
         +"\n");
     }

    
    public int getDargetTa7mol() {
        return dargetTa7mol;
    }

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
        setDefencePints(getDefencePints()-(peat/dargetTa7mol) );
         
    }
   
   
   
}
