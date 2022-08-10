
import java.util.*;

public class App {
    public static void main (String[] args) {
        // Your code here
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(happy(n));

}
static HashMap<Integer,Integer> hs=new HashMap<>();

public static boolean happy(int n){
if(hs.containsKey(n)){
return false;
}
else{
hs.put(n,1);
}
int sum=0;
while(n>0){
int x=n%10;
n=n/10;
sum=sum+x*x;
}
if(sum==1){
return true;
}
return happy(sum);


}
}
