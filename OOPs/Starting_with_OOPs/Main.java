class Name{
    String Names;
    int Age;

    public void write(){
        System.out.println(this.Names +" "+this.Age);
    }
}

public class Main{
    public static void main(String[] args){
        Name Name1 = new Name();
        Name1.Names = "Lucky";
        Name1.Age = 20;
        Name1.write();

    }
}