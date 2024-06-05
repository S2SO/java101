package Day10.Interfase;

// 다중 상속 안 됨
// camera watchVideo pay

interface Camera{
    default void takePhoto(){
        System.out.println("찰칵");
    }
}

interface Pay{
    default void payMoney(){
        System.out.println("결제합니다.");
    }
}

public class SmartPhone extends Phone implements Camera,Pay{


}
