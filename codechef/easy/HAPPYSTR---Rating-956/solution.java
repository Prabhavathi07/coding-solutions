import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();
        int l=s.length();
        int c=0;
        for(int i=0;i<l;i++){
            char p=s.charAt(i);
            if(p=='a' || p=='e' || p=='i'|| p=='o'|| p=='u'){
                c++;
            }
            else{
                c=0;
            }
            if(c>=3)
            break;
        }
        if(c>=3){
            System.out.println("Happy");
        }
        else{
            System.out.println("Sad");
        }

            // Your code goes here
        }
    }
}
