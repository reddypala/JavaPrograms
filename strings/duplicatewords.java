package strings;

public class duplicatewords {
    public static void main(String[] args) {
        String s1 = "Big black bug bit a big black dog on his big black nose";
        int count=0;
        s1=s1.toLowerCase();
        String words[] = s1.split(" ");
        // for (String string : words) {
        //     System.out.print(string+",");
        // }
        // System.out.println();
        System.out.println("duplicate words in a given string are:");
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(words[j])){
                    System.out.print(words[j]+",");
                    count++;
                }

            }
        }
        
        System.out.println("\ncount of the duplicate words:"+count);

    }
}
