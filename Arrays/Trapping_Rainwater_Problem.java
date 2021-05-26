//Approach-1(Optimal)

//T.C - O(n)
//S.C - O(1)

static int trappingWater(int arr[], int n) { 
        
      int left=0,right=n-1;
      int ml=0,mr=0;
      int sum=0;
      
      while(left<=right){
          if(arr[left]<=arr[right]){
              if(arr[left]>=ml) ml=arr[left];
              else sum+=ml-arr[left];
              left++;
          }
          else{
              if(arr[right]>=mr) mr=arr[right];
              else sum+=mr-arr[right];
              right--;
          }
      }
      return sum;
    } 

//Approach-2

//T.C - O(n)
//S.C - O(n)
static int trappingWater(int arr[], int n) { 
        
      int []l= new int[n];
      int []r= new int[n];
      int ml=l[0]=arr[0];
      int mr=r[n-1]=arr[n-1];
      
      for(int i=1;i<n;i++){
        ml=Math.max(ml,arr[i]);
        l[i]=ml;
      }
      for(int i=n-2;i>=0;i--){
          mr=Math.max(mr,arr[i]);
          r[i]=mr;
      }
      int sum=0;
      for(int i=0;i<n;i++){
          sum+=Math.min(l[i],r[i])-arr[i];
      }
      return sum;  
    } 

