class One{
	int x;
	One(int x){
		this.x=x;
		System .out.println("One(int) x = " +x);
}}

class Two extends One{
	Two(int x){
		super(x);
		System.out.println("Two(int) called");
	}
}

public class Q3{
	public static void main
(String[] args){
Two t = new Two(10);
}}
