public class BinhSi extends Solider{
    private static final int maxHP  = 100;
    private static final int minHP = 50;
    private static final int maxDame = 10;
    private static final int minDame = 1;
    private boolean isLeader;

    public BinhSi(boolean isLeader){
        super(
                (int)Math.floor(Math.random()*(maxHP-minHP+1)+minHP),
                5,
                10,
                (int)Math.floor(Math.random()*(maxDame-minDame+1)+minDame)
        );
        setLeader(isLeader);
    }

    public void setLeader(boolean leader) {
        isLeader = leader;
    }

    public boolean isLeader() {
        return isLeader;
    }

    public int getDameBonus(){
        if(isLeader){
            return 50;
        }
        return 10;
    }
}
