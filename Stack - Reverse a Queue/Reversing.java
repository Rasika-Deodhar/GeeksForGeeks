import java.util.*;
import java.io.*;
class Reversing{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            Queue<Integer> q=new LinkedList<>();
            String s=br.readLine();
            String[] a=s.split(" ");
            for(String b:a){
                int x=Integer.parseInt(b);
                q.add(x);
            }
            GfG g=new GfG();
            q=g.rev(q);
            while(!q.isEmpty()){
                int x=q.peek();
                q.poll();
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/*Complete the function below*/
class GfG{
    public Queue<Integer> rev(Queue<Integer> q){
        
        Stack<Integer> s = new Stack<>();
        Queue<Integer> q1 = new LinkedList<>();
        
        // for(Integer i : q){
        //     s.push(q.poll());
        // }
        
        // for(Integer i : s){
        //     q1.add(s.pop());
        // }
        
        while(!q.isEmpty()){
            s.push(q.peek());
            q.remove();
        }
        
        while(!s.isEmpty()){
            q1.add(s.pop());
        }
        
        return q1;
    }
}