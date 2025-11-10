package String;

public class StringImmutable {

    public static void main(String[] args) {

        String s = "Java";
        System.out.println(s); // Java
        s.replace('J','j');
        System.out.println(s); //Java --> even after replacing character 's' is pointing to original value
        //this is the reason String is immutable in nature


        s = s.replace('J','j');
        System.out.println(s);
    }
}
