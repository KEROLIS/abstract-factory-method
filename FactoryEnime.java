
public class FactoryEnime implements FactoryEnimeInter {

    Enemies f = null;

    @Override
    public Enemies creatObj(String tybe) {
        if ("Goblin".equals(tybe)) {
            f = new Goblin();
        } else {
            f = new Ghost();
        }
        return f;
    }

}
