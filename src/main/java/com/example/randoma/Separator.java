package com.example.randoma;

import java.util.*;
import java.lang.*;


public class Separator {

    public void separateOddEven(ArrayDeque<String>theList){

        ArrayList<String>evenArray = new ArrayList<String>();
        ArrayList<String>oddArray = new ArrayList<String>();


        while (theList.size() > 0) {

            String aObject = theList.poll();
            if(aObject.length() % 2 != 0) {

                evenArray.add(aObject);

            }else{

                oddArray.add(aObject);

            }
        }

        System.out.println("evenArray: \n" + evenArray);
        System.out.println("oddArray: \n" + oddArray);
    }

}
