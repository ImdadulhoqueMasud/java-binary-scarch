/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work.pkg1;

import java.util.Scanner;

/**
 *
 * @author Shiplu L
 */
public class Binary {

    public static void main(String[] args) {
        int i,counter,num,item,array[],fist,last,mid;
        Scanner input=new Scanner(System.in);
        System.out.println("Number of element : ");
        num=input.nextInt();
        array=new int[num];
        System.out.println("Array : ");
        for(i=0;i<num;i++)
            array[i]=input.nextInt();
        System.out.println("Search the value : ");
        item=input.nextInt();
        fist=0;
        last=num-1;
        mid=(fist+last)/2;
        while(fist<=last){
            if(array[mid]<item)
                fist=mid+1;
            else if(array[mid]==item){
                System.out.println(item+"Found the location "+(mid+1)+".");
                break;
            }
            else{
                last=mid-1;
               
            }
            mid=(fist+last)/2;
            
        }
        if(fist>last)
            System.out.println(item+"is not found");
    }
}
