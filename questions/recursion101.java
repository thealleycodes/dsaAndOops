


public class recursion101 {
    public static void printX(Integer x,Integer n){
        if(n==0){
            return;
        }
        System.out.println(x);
        printX(x,n-1);
    }
   
    public static void print1toN(Integer x,Integer n){
            if(x>n){
                return;
            }
            System.out.println(x);
            print1toN(x+1, n);
    }
   
   public static void printNatural(Integer sum,Integer n){
        if(n==0){
            System.out.println(sum);
            return ;
        }
        // System.out.println(sum);
        
        printNatural(sum+=n, n-1);
   }
   
   public static void printFactorial(Integer output,Integer n){
    
   
    if(n==1){
        return;
    }
    System.out.println(output);
    // System.out.println(n);
    // System.out.println(output);
    printFactorial(output += n*(n-1), n-1);

   }
    public static int sumOfArrayElement(int[] nums){
        
        if(nums.length){
            return 0;
        }
        return sumOfArrayElement(nums);
    }
   public static void main(String[] args) {
        //print X exactly N times
        // printX(0,4);

        // int n =5;
        //print 1 to n
        // print1toN(1,n);

        //sum of first N natural numbers 
        // int n = 5;
        // int sum =0;
        // printNatural(sum,n); // 5 + 4 + 3 + 2 + 1 

        //print factorial
        // int n =3;
        // int output = 0;
        // printFactorial(output,n);
        int[] nums ={1,2,3};
        int ans = sumOfArrayElement(nums);
        System.out.println(ans);
    }
}
