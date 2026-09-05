public class Main {
    public static void main(String[]args){
    //casting are of 2 types implicit and explicit

    // Implicit casting 
    double price = 100.00;
    double gst = 18;// This is implicit casting in this java changed int to double automatically because double has high bit value than int
    
    System.out.println(gst);
    // Explicit Casting
    int p = (int)18.91; //Explicit casting all values after . will disappear or information loss
    System.out.println(p);
 // Casting will only work in if data type are compatable
 //eg -> String can not be converted in Int but double can be converted in Int

}
}