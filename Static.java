public class Static {
    String name;
    String phone;
    static String firstname = "kond";

    public void show() {
        System.out.println(name + phone + firstname);
    }

    public static void main(String[] args) {
        Static obj = new Static();
        obj.name = "chai";
        obj.phone = "iphone";

        Static obj1 = new Static();
        obj1.name = "kkkk";
        obj1.phone = "android";

        obj.show();
        obj1.show();
    }
}
