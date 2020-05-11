package com.problems.removeduplicates;

public class RemoveDuplicates {
  public int removeduplicates(int[] input){
    
    if(input.length == 0 || input.length ==1)
      return input.length;

    int j =0;

    // [0,1,2,0,1,1,1,1,2,2,2]
    for(int i=0; i< input.length -1; i++){
      if(input[i] != input[i+1]){
        input[j] = input[i];
        j++;
      }
    }

    input[j] = input[input.length -1];
    return j+1;
  }
}


// return the size of the unique element
//  create a new array with unique elements