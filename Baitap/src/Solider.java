public class Solider {
    private int HP;
    private int Inteligent;
    private int Strength;
    private int Dame;

    public Solider(int HP, int Inteligent, int Strength,int Dame){
        setHP(HP);
        setInteligent(Inteligent);
        setStrength(Strength);
        setDame(Dame);
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setDame(int dame) {
        Dame = dame;
    }

    public void setInteligent(int inteligent) {
        Inteligent = inteligent;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public int getHP() {
        return HP;
    }

    public int getDame() {
        return Dame;
    }

    public int getInteligent() {
        return Inteligent;
    }

    public int getStrength() {
        return Strength;
    }

}
