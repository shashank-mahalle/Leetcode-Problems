//{ Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG {
    int convertfive(int num) {
        // Your code here
        
        if(num == 0){
            return 1;
        }
        
        int ans = 0,tmp = 1;
        
        while(num > 0){
            
            int rem = num % 10;
            if(rem == 0){
                rem = 5;
            }
            
            ans = rem *tmp+ans;
            num = num / 10;
            tmp = tmp *10;
            
        }
        return ans;
    }
}