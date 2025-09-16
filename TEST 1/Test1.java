public class Test1 {
    int x =10;
    public static void main(String[]args){
        int a =1;
        System.out.println(Integer.toString(a));

        String name = "Aagama AR";
        System.out.println(name);

        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int n4 = 4;
        int n5 = 5;
        int n6 = 6;
        int n7 = 7;
        int n8 = 8;
        int n9 = 9;
        
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
        System.out.println(n7);
        System.out.println(n8);
        System.out.println(n9);
        System.out.println("************************************************************");
        //DRY : DO NOT REPEAT YOURSELF

        for (int i =1; i<=10 ;i++){
            System.out.println(i);
        }
        System.out.println("************************************************************");

        int i=1;
        while(++i<10){
            System.out.println(i);
 
        }
    }
}
