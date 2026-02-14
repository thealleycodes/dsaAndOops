package oops;


public class basics {
    public static void main(String[] args) {
        
        String greeting = "Hello, World!";
        // System.out.println(greeting.length());
        // System.out.println(greeting.charAt(1));
        // System.out.println(greeting.substring(2,5));

        int typeConvert = 12;
        double intoBool  = typeConvert; // when we are doing conversion from lower to higher there is no need to specify it 
        int AgainConver = (int) intoBool; // as we are converting from a double to int which is large to small we will explicitly write it 
        // System.out.println(intoBool + " "+ AgainConver);

        final int constants = 12;
        // constants+= 15;
        // System.out.println(constants);


        //arrays
        int[] arr = {1,2,3,4,5};
      
        int[][] arr1 = {{1,2,3},{2,3}};
        // int [] zeroThindex = arr1[0];
        // System.out.println(arr1[0][2]);

        for(int i:arr){
            // System.out.println(i);
        }
        // System.out.println(arr1.length);

        // for(int i=0; i<arr1.length;i++){
        //     for(int j=0; j<arr1[i].length; j++){
        //         System.out.print(arr1[i][j]);
        //     }
        //     System.out.println();
        // }
        
        for(int[] row:arr1){
            for(int val:row){
                System.out.print(val+" ");
            }
            System.out.println();
        }

        
    }
}
