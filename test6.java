import java.util.Arrays;

public class test6 {
    public static void main(String[] args) {
       
        String[] str=new String[]{"mom","omm","cat","act"};
        int count=0;
        for(int i=0;i<str.length;i++){
            for(int j=i+1;j<str.length;j++){
                char[] a=str[i].toCharArray();
                char[] b=str[j].toCharArray();
                Arrays.sort(a);
                Arrays.sort(b);
                boolean ans=Arrays.equals(a,b);
                if(ans==true){
                    count++;
                   
        
                }

            }
        }

        System.out.println(count);
        // char[] a=s1.toCharArray();
        // char[] b=s2.toCharArray();
        // Arrays.sort(a);
        // Arrays.sort(b);
        // boolean ans=Arrays.equals(a,b);
        // if(ans==true){
        //     System.out.print("same");

        // }else{
        //     System.out.print("different");

        // }
        

    }
}
