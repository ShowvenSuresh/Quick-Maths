
package com.mycompany.quickmaths;

public class Searching {
    public int name(String name[], String target){
        int low=0, high=name.length;
        
          while (high -low>=0)
        {
           int mid = (low+high)/2;
           int cmp= target.compareTo(name[mid]);
           
           if (cmp==0)
           {
               return mid;
           }
           
           else if (cmp>0)
           {
               low = mid +1;
           }
           
           else if (cmp<0)
           {
               high = mid-1;
           }
            
        }
        
        return -1;
    }
}
