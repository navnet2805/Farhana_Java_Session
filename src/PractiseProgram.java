public class PractiseProgram {
    public static void main(String[] args) {
        //program to reverse the given number input=14578 , output=87541

        int num = 14578;
        String result = "";

        while (num>0)
        {
           result= result + num%10; //last number
            num=num/10;
        }
        System.out.println(result);
    }
}
