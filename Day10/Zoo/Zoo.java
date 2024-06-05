package Day10.Zoo;

import java.sql.Statement;

public class Zoo {
    // static 공유성 변수
    // utility
    static int animals = 30;
    public void showAnimals(){
        System.out.println(animals);
    }
    public void upAnimas(){
        animals++;
    }


}
