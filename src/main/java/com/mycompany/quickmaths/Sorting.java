
package com.mycompany.quickmaths;

public class Sorting {
    public void sort(String name[]){
        if(name.length<2){
            return;
        }
        
        int arrLength= name.length;
        int mid= arrLength/2;
        int nL=mid;
        int nR= name.length -mid;
        String nameLeft[] = new String[nL];
        String nameRight[] = new String[nR];
        
        for(int i=0; i< mid; i++){
            nameLeft[i]= name[i];
        }
        
        for(int i=mid; i<arrLength; i++){
            nameRight[i]=name[i];
        }
        
        sort(nameLeft);
        sort(nameRight);
        merge(name,nameLeft,nameRight);
        
        
    }
    
    public void merge(String name[],String nameLeft[], String nameRight[] ){
        int i=0,j=0,k=0;
        
        while(i<nameLeft.length&&j<nameRight.length){
            if(nameLeft[i].compareTo(nameRight[j])<0){
                name[k]=nameLeft[i];
                i++;
            }
            else{
                name[k]=nameRight[j];
                j++;
            }
            k++;
        }
        
        while (i<nameLeft.length){
            name[k]=nameLeft[i];
            i++;
            k++;
        }
        
        while(j<nameRight.length){
            name[k]=nameRight[j];
            j++;
            k++;
        }
        
    }
    
    
}
