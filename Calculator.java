import java.util.Scanner;

public class Calculator {
    public int add(int x, int y) {

        int result = x + y;
        System.out.println(result);
        return result;
    }

    public void daddy() {
        System.out.println("go slow daddy");
    }

    public String getmepen(int cost) {
        if (cost >= 10)
            return "pen";
        else
            return "no money no hny daddy";

    }

    /**
     * @param args
     */
    public static void main(String args[]) {

        Calculator myobj = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur numbers fucker");
        int x = sc.nextInt();
        int y = sc.nextInt();
        // int nextInt = sc.nextInt();
        int result = myobj.add(x, y);

        myobj.daddy();
        System.out.println("enter cost");
        int cost = sc.nextInt();
        String str = myobj.getmepen(cost);
        System.out.println(str);

    }

}
