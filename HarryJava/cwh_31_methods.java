package HarryJava;

public class cwh_31_methods {

    public static int logic(int x , int y){
        int z;

        if(x>y){
            z = x+y;
        }
        else{
            z = (x+y)*5;
        }
    
        return z;

    }
    public static void main(String[] args) {
        
        // Logic 1
        int a = 5;
        int b = 7;


        int c;
        c = logic(a,b);


        // Using non static method.
        // cwh_31_methods obj = new cwh_31_methods();
        // c = obj.logic(a,b);



        // Logic

        // if(a>b){
        //     c = a+b;
        // }
        // else{
        //     c = (a+b)*5;
        // }
        // System.out.println(c);

        // Logic 2
        int a1 = 2;
        int b1 = 1;
        int c1;

        c1 = logic(a1,b1);

        System.out.println("The output of first logic is "+c);
        System.out.println("The output of second logic is "+c1);


        
    }
}
