// This needs to be done in O(1) space

static int missingNumber(int arr[], int size)
    {
        for(int i=0;i<size;i++){
            int correctPos=arr[i]-1;
            while(arr[i]>=1  && arr[i]<=size && arr[i]!=arr[correctPos]){
                int temp=arr[correctPos];
                arr[correctPos]=arr[i];
                arr[i]=temp;
                correctPos=arr[i]-1;
            }
        }
        
        for(int i=0;i<size;i++){
            if(arr[i]!=i+1)
            return i+1;
        }
        return size+1;
    }
// T.C - O(n)
// S.c - O(1)
