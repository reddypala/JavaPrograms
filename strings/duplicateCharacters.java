package strings;

public class duplicateCharacters {
    public static void main(String[] args) {
        String s = "code decode";
        int count = 0;
        char[] inp = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (inp[i] == inp[j]) {
                    System.out.println(inp[j]);
                    count++;
                    break;
                }
            }
        }
        System.out.println("count of duplicate characters are:"+count);
    }
}
