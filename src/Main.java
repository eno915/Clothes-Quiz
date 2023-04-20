import java.util.ArrayList;

public class Main {
    
    public static void main(String[]args) throws Exception{


       Shirt shirt1 = new Shirt(2, true, "Blouse", 20.00);
       Shirt shirt2 = new Shirt(4, true, "Sweater", 30.00);
       Shirt shirt3 = new Shirt(5, false, "T-Shirt", 10.00);
       Shirt shirt4 = new Shirt(1, false, "Sweatshirt", 25.00);

       ArrayList<Shirt> list = new ArrayList<Shirt>();
        list.add(shirt1);
        list.add(shirt2);
        list.add(shirt3);
        list.add(shirt4);
       
        
        for(Shirt item : list) {
            System.out.println(item.type);
        }


    }
}