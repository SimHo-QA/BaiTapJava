import java.util.ArrayList;

public class app {

    public static ArrayList<BinhSi> getNhomBinhSi(){
        ArrayList<BinhSi> list=new ArrayList<BinhSi>();
        list.add(new BinhSi(true));
        list.add( new BinhSi(false));
        list.add( new BinhSi(false));
        return list;
    }

    static  boolean isPerfectSquare(int x)
    {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }

    static boolean isFibonacci(int n)
    {
        return isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4);
    }

    public static void main(String[] args) {
        NguLamQuan Artagnan=new NguLamQuan();

        ArrayList<Coin> coins= new ArrayList<Coin>();

        while (coins.size()<5){
            ArrayList<BinhSi> NhomBinhSi=getNhomBinhSi();

            BinhSi b = NhomBinhSi.get((int) Math.floor(Math.random() * (3)));

            int n=(int)Math.floor(Math.random()*(10)+1);

            if(n%2==0) {
                b.setHP(b.getHP() - (Artagnan.getInteligent() + Artagnan.getStrength()) * Artagnan.getDame());
                if(b.getHP()<=0){
                    int quantity= (int)Math.floor(Math.random()*(5)+1);

                    for (int i=0;i<quantity;i++){
                        coins.add(new Coin());
                    }
                }
            }
            else{
                Artagnan.setHP(
                        Artagnan.getHP()-((b.getInteligent()+b.getStrength())*b.getDame()+b.getDameBonus())
                );
            }
            Artagnan.setHP(100);
        }

        int sumValue=0;
        boolean isReal;

        for (int i=0;i<coins.size();i++){
            sumValue+=coins.get(i).getValue();
        }

        if(isFibonacci(sumValue)){
            isReal=true;
        }else{
            isReal=false;
        }

        if (isReal){
            System.out.println("Thử thách thành công");
        }else{
            System.out.println("Thử thách thất bại");
        }
    }
}
