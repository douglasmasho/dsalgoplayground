public class HighArrayApp {
    public static void main(String[] args) {
        HighArrayUO arr = new HighArrayUO(20);
        HighArrayO arro =  new HighArrayO(20);


        arro.Insert(4);
        arro.Insert(9);
        arro.Insert(2);
        arro.Insert(5);
        arro.Insert(3);

        arro.Delete(3);
        System.out.println(arro.findInt(9));


//        arr.Insert(1);
//        arr.Insert(2);
//        arr.Insert(3);
//        arr.Insert(4);
//        arr.Insert(5);
//
//        arr.Delete(3);
//        System.out.println(arr.findInt(2));
//
        arro.display();
    }
}
