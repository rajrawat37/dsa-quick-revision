 static int count(int arr[], int n)
    {
        int sum=0,c=0;
        HashMap<Integer,Integer> map= new HashMap<>();
         for(int i=0;i<n;i++){
                
                if(arr[i]==0)
                 arr[i]=-1;
                 
                 sum+=arr[i];
                 
                 if(sum==0)
                 c++;
                 
                 if(map.containsKey(sum))
                   c+=map.get(sum);


                if(!map.containsKey(sum))
                 map.put(sum,1);
                 else
                 map.put(sum,map.get(sum)+1);
         }
         return c;
         
    }
