class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int j;
            for(j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    break;
                }
            }
            if(j==n){
                list.add(arr[i]);
            }
            
            
        }
        return list;
    }
}
