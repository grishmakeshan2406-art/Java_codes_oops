import java.util.Scanner;
public class BMI {
    String name;
    int age;
    String gender;
    float height;
    int weight;

    BMI(String n,int a,String g,float h, int w){
        name=n;
        age=a;
        gender=g;
        height=h;
        weight=w;
    }

  void calculateBMI(){
  float bmi=weight/(height*height);
  String Category;
  String message;
  if(bmi<18.5){
    Category="UnderWeight";
    message="Focus on building strength through nutrient-dense meals and consistent, structured nourishment.";
  }
  else if(bmi>=18.5 && bmi<=24.9){
     Category="NormalWeight";
    message="Keep up your consistent habits with balanced eating and regular physical activity.";
  }
  
  else if(bmi>=25.0 && bmi<=29.9){
    Category="OverWeight";
    message="Take sustainable steps toward better health by tracking portions and increasing movement.";
  }
  else{
    Category="obese";
    message="Prioritise small, consistent lifestyle changes and seek professional guidance to protect your long-term health.";
  }

  System.out.println("Person Name:" +name);
  System.out.println("Person age:" +age);
  System.out.println("Person gender(MALE/FEMALE):" +gender);
  System.out.println("Person Height(in m):" +height);
  System.out.println("Person weight(in kgs):" +weight);
  System.out.println("Person BMI:" +bmi);
  System.out.println("Category is:" +Category);
  System.out.println("Message is:" +message);
    }
     public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter person name:");
     String name=scanner.nextLine();
     System.out.println("Enter person age:");
     int age=scanner.nextInt();
     scanner.nextLine();
     System.out.println("Enter person gender(MALE/FEMALE):");
     String gender=scanner.nextLine();
     System.out.println("Enter person height(in m):");
     float height=scanner.nextFloat();
     System.out.println("Enter person weigth(in kgs):");
     int weight=scanner.nextInt();

     BMI Bodymassindex=new BMI(name, age, gender, height, weight);
     Bodymassindex.calculateBMI();
     scanner.close();
     }
}
