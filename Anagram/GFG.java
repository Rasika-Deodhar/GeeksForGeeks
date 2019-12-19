import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
        int t;
        String arr[],a,b,c;
        
        
        Scanner sc = new Scanner(System.in);
        
        t = sc.nextInt();
        sc.nextLine();
        
        List<String> ans = new ArrayList<String>();
        
        while(t>0){
            
            c = sc.nextLine();
            arr = c.split(" ");
            
            a = arr[0];
            b = arr[1];
            
            char a1[] = a.toLowerCase().toCharArray();
            char b1[] = b.toLowerCase().toCharArray();
            
            Arrays.sort(a1);
            Arrays.sort(b1);
            
            a = new String(a1);
            b = new String(b1);
            
            if(a.equals(b)){
                ans.add("YES");
            }
            else{
                ans.add("NO");
            }
            
            t--;
        }
        
        for(String s : ans)
            System.out.println(s);

        sc.close();
	}
}