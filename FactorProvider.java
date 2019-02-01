
public class FactorProvider {

    private Frinds frinds = null;
    private Enemies enm = null;

    public FactorProvider(String tybe, String abnormal, int attackPoints, int defencePoints) {
        FactoryEnime f = new FactoryEnime();
        enm = f.creatObj(tybe);
        enm.setAbnormal(abnormal);
        enm.setAttackPoints(attackPoints);
        enm.setDefencePints(defencePoints);
    }

    public FactorProvider(String tybe, String abnormal, int attackPoints, int defencePoints, int dargetTa7mol) {
        FactroyFrinds s = new FactroyFrinds();
        frinds = s.creatObj(tybe);
        frinds.setAbnormal(abnormal);
        frinds.setAttackPoints(attackPoints);
        frinds.setDefencePints(defencePoints);
        frinds.setDargetTa7mol(dargetTa7mol);

    }

    Frinds getFrindObj() {
        return frinds;
    }
    Enemies getEnemiobj(){return enm;}
}
