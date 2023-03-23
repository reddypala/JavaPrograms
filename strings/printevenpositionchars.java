package strings;

public class printevenpositionchars {
    public static void main(String[] args) {
        String s = "QUALITYASSURANCEENGINEER";

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && i % 2 == 0) {
                System.out.print(s.charAt(i) + ",");
            }
        }
    }
}
