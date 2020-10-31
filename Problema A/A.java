public class A { 
    public static int maxWater(int arr[], int n) 
    { 
        int size = n - 1; 
  
        int prev = arr[0]; 

        int prev_index = 0; 
        int water = 0; 

        int temp = 0; 
        for (int i = 1; i <= size; i++) { 
  
            if (arr[i] >= prev) { 
                prev = arr[i]; 
                prev_index = i; 
  
                temp = 0; 
            } 
            else { 

                water += prev - arr[i]; 

                temp += prev - arr[i]; 
            } 
        } 

        if (prev_index < size) { 
  
            water -= temp; 

            prev = arr[size]; 
  
            for (int i = size; i >= prev_index; i--) { 
  
                if (arr[i] >= prev) { 
                    prev = arr[i]; 
                } 
                else { 
                    water += prev - arr[i]; 
                } 
            } 
        } 

        return water; 
    } 
  
} 