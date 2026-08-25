import java.util.Scanner;
class Engine{
    int engine_no;
    String engine_type;
    Engine(int no,String type){
        engine_no=no;
        engine_type=type;
    }
}
class Car{
    String car_model;
    Engine engine;


Car(String model,int no,String type){
    car_model=model;
    engine=new Engine(no, type); //composition
}
void displaydetails(){

    System.out.println("car model:"+car_model);
    System.out.println("Engine no:"+engine.engine_no);
    System.out.println("Engine type:"+engine.engine_type);
}
}

public class carinfo {
    public static void main(String[] args){
        Car c1=new Car("Mercedes",2378,"Diesel");
        c1.displaydetails();
    }
}
