import java.util.*; //In this code we replace the character 'e' with character 'i' in a string.

public class j {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i;
        String result = "", n;
        char k;
        System.out.println("Enter the string :");
        n = sc.next();
        for (i = 0; i < n.length(); i++) {
            k = n.charAt(i);
            if (k == 'e') {
                k = 'i';
            }
            result = result + k;
        }
        System.out.println(result);
    }
}
