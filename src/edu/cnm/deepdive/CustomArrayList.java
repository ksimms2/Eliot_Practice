package edu.cnm.deepdive;

public class CustomArrayList {

  int[] customArray = new int[3];
  public int size = 0;

  public boolean isEmpty(){

 if( size == 0){
   return true;
 }else{
   return false;
 }

  }

  public void push(int n){

    // take a number n

    // and put into the first index [0]
    // of the array customArray[]

    customArray[size++] = n;


    System.out.println(customArray);
    // size + 1
  }

  public int pop(){

    // Last in First Out... remove the last one that was put in
    --size;
    customArray[size] = 0;
    int popresult = customArray[size];
    return popresult;
  }

}
