package Day07;

public class MegaCoffee {
    public static void main(String[] args) {

        Coffee[] a = new Coffee[3];
        a[0] = new Coffee("iceame",2000,2,true,20);
        a[1] = new Coffee("latte",2900,2,true,60);
        a[2] = new Coffee("vanilla",3500,2,true,100);

        Beverage[] b = {new Beverage("체리콕",3500,260),
                new Beverage("에이드",2500,200),new Beverage("스무디",4000,300)};
        Bread[] c = new Bread[3];

        for (int i = 0; i<b.length; i++){
            System.out.println(b[i].name + " " + b[i].price);
        }
    }
}
