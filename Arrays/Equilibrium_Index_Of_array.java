 public static int findEquilibrium(int arr[], int n)
          {   
                int sum=0;    
               for(int i=0;i<n;i++)
                  sum+=arr[i];
               int left_sum=0;
             for(int i=0;i<n;++i){
                    sum-=arr[i];
              if(left_sum==sum)
                 return i;
                left_sum+=arr[i];
             }
    return -1;
