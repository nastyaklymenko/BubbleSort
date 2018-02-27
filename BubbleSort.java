/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author klyme
 */
public class BubbleSort {

  public static void bubbleSort(int arr[])
    {
        int size = arr.length;
        for (int i = 0; i < size-1; i++)
            for (int j = 0; j < size-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    public static void main(String args[])
    {
        int arr[] = {11,300,56,25,43,786,223,10,501,345,8};
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        int size = arr.length;
        for (int i=0; i<size; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
       
    }
    
}
