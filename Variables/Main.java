public class Main {
    public static void  main(String[] args){
        //first code in java
        /*Multi line comment
        1 line of code
         */
        System.out.println("Hello Lucky");
        System.out.println("sout is short form for output");

        //variables
        String name = "Lucky";
        int age = 21;
        String neighbour = "Luck";
        String frnd = neighbour;

        //Java types
        /*1. primitive -> byte - 1 [-128 to 127]
        -> short - 2
        -> int - 4
        -> long - 8
        -> float - 4
        -> double - 7
        -> char - 2
        -> boolean - 1 [true/false]
        */
        int a = 12;
        long b = 1234567890L;
        float c = 1.22f;
        short d = -123;
        double e = 90.333;
        char f = '@';
        boolean g = true;

        /*2. Non primited / Reference type
        ->String
        */
       String n = "Lakshya";
       System.out.println(n.length());
        String name2 = n+" is "+name;
        System.out.println(name2);
        System.out.println(n.charAt(0));
        System.out.println(n.replace('a', 'A')); //string in java are immutable
        String name_3 = "Lakshya and Lucky";
        System.out.println(name_3.substring(0,8)); //use to get only portion of the tring that will be used
        
        

    }    
}
