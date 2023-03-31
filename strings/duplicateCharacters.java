package strings;

public class duplicateCharacters {
    public static void main(String[] args) {
        String s = "ABCCABEGGGRABCHICKHICK";
        int count = 0;
        char[] inp = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (inp[i] == inp[j]) {
                    System.out.print(inp[j]+" ");
                    count++;
                    break;
                }
            }
        }

        System.out.println("\ncount of duplicate characters are:"+count);
    }
}
