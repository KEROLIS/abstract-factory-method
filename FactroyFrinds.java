
public class FactroyFrinds implements FactoryFrindesInter {

    Frinds f = null;

    @Override
    public Frinds creatObj(String tybe) {
        if ("Waior".equals(tybe)) {
            f = new Waior();
        } else {
            f = new solder();
        }
        return f;
    }

    
   

}
