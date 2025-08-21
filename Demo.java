import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Demo {
    static class Solution {
        private  
        int fun(int a) {
            return a;
        }
    
    }
    private  int fun1(int a) {
        return a;
    } 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n; 
        n=Integer.parseInt(sc.nextLine());
        int k=Integer.parseInt(sc.nextLine());
                int[] arr =new int[n];   
                for(int i=0;i<n;i++){
                    arr[i]=Integer.parseInt(sc.nextLine());
                }
                int c=1;
                List<Integer> list = new ArrayList<>();
                for(int i=1;i<n;i++){
                    if(arr[i]==arr[i-1])c++;
                    else{
                        list.add(c);c=1;
                    }
                }
                list.add(c);
                n=list.size();
                for(int i=1;i<n;i++)
                {
                    list.set(i,list.get(i)+list.get(i-1));
                }
                int ans=list.get(k-1);
                for(int i=k;i<n;i++)
                {
                    ans=Math.max(ans,list.get(i)-list.get(i-k));
                }
                System.out.println("ans= "+ans);

    
    }}
      