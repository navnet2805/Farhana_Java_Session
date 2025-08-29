package DecisionStatement;

public class Switch_syntax2 {
    public static void main(String[] args) {
        int day = 2;

        String result = switch (day)
        {
            case 1 ->"Sunday";
            case 2 ->"Monday";
            case 3 ->"Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "friday";
            case 7 -> "Saturday";
            default -> "No days are matched.";

        };
        System.out.println(result);
    }
}
