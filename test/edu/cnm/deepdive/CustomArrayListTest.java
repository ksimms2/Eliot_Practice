package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomArrayListTest {

  CustomArrayList arrlist1;

  @BeforeEach
  void setUp(){
    arrlist1 = new CustomArrayList();

  }


  @Test
  void afterCreationStackIsEmpty(){

    arrlist1.isEmpty();
    assertTrue(arrlist1.isEmpty());
  }

  @Test
  void afterPushingToStackSizeIsOne(){

    arrlist1.push(9);
    assertTrue(!arrlist1.isEmpty());
  }

  @Test
  void afterTwoPushesToStackSizeIsThree(){

    arrlist1.push(9);
    arrlist1.push(3);
    arrlist1.push(7);

    assertTrue(arrlist1.size == 3);
  }

  @Test
  void afterOnePushOnePopStackIsEmpty(){
    arrlist1.push(4);
    arrlist1.push(5);
    arrlist1.push(6);
    arrlist1.pop();


    assertTrue(arrlist1.isEmpty());

  }
  // test for underflow
  //test for overflow
  // do a copy of array to end of first array without toCopy()
  // hint for loop... store it in new array


}