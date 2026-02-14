public class hashing {
    public static int main(String[] args) {
        int largestNumberOccurence =0;
        int[] arr ={1,1,2,2,2,3,3,3,4};
        int[]  hashTable = new int[10];
        for(int nums:arr){
            hashTable[nums]++;
        }
        for(int i=0;i<=hashTable.length;i++){
            if(largestNumberOccurence>hashTable[i]){
                largestNumberOccurence=hashTable[i];
            }
          
        }
        System.out.println(hashTable[3]);
        return largestNumberOccurence;
        
    }
}
