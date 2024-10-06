import java.util.*;
public class Main
{
    public static void solve(int[] arr,int i,List<List<Integer>> l,List<Integer> list){
        if(i==arr.length){
            l.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[i]);
        solve(arr,i+1,l,list);
        list.remove(list.size()-1);
        solve(arr,i+1,l,list);
    }
	public static void main(String[] args) {
	    int[] arr={1,2,3};
	    List<List<Integer>> l=new ArrayList<>();
	    List<Integer> list=new ArrayList<>();
	    
	    solve(arr,0,l,list);
	    
	    for(List<Integer> e:l){
	        for(int i:e){
	            System.out.print(i+" ");
	        }
	        System.out.println();
	    }
	}
}
