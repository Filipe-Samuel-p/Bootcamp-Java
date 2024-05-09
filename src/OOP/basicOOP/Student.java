package OOP.basicOOP;

public class Student {
    public String name;
    public double num1;
    public double num2;
    public double num3;

    public double media(){
        return (num1 + num2 + num3);
    }
    public void verification(){
        if(media() > 60){
            System.out.println("pass");
        }
        else{
            System.out.println("Failed");
        }
    }

    public void showStudentData(){
        System.out.println("student " + this.name);
        System.out.println(this.num1);
        System.out.println(this.num2);
        System.out.println(this.num3);
    }
}

