//Initial Template for Java
import java.util.*;
class ModifyQueue{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            Queue<Integer> q=new LinkedList<>();
            while(n-->0){
                q.add((int)sc.nextInt());
            }
            GfG g=new GfG();
            Queue<Integer> ans=g.modifyQueue(q,k);
            while(!ans.isEmpty()){
                int a=ans.peek();
                ans.poll();
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}

/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class GfG
{
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
        Stack<Integer> s = new Stack<>();
        Queue<Integer> q1 = new LinkedList<>();
        
        while(k>0){
            s.push(q.peek());
            q.remove();
            k--;
        }
        
        while(!s.isEmpty()){
            q1.add(s.pop());
        }
        
        while(!q.isEmpty()){
            q1.add(q.peek());
            q.remove();
        }
        
        return q1;
    }
}
