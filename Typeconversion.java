package day3;

public class Typeconversion {
    public static void main(String[] args) {
        String contactName = "Madhuri Reddy";
        System.out.println(contactName.toLowerCase());
        Object obj1 = contactName;//Upcasting
        //since object doesn't have upper case method
        //System.out.println(obj1.toUppercase);
        System.out.println(obj1);
        obj1 = 12.5;//upcasting
        System.out.println(obj1);
        Object obj2 = false;
        Boolean data = (Boolean) obj2;//down casting
        System.out.println(data);
    }
}
