package com.tj.exercise.data.structure.demo.sort.base;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author: tj
 * @Date: 2023/1/13 20:24
 */
public class SqlList {
    public int[] myarr;
    public int length;
    public SqlList()
    {
        myarr = new int [1000];
        length = 0;
    }
    public void swap(int i, int j)
    {
        if (i==j) return;
        myarr[i] = myarr[i]+ myarr[j];
        myarr[j] = myarr[i] - myarr[j];
        myarr[i] = myarr[i] - myarr[j];
    }
    public void init(int length){

        Random rand = new Random();

        for (int i=0;i<length;i++)
        {
            myarr[i] = rand.nextInt(99)+1;
        }
        this.length = length;
    }
    private static Scanner scanner = new Scanner( System.in );

    public static int inputLength()
    {
        int length=0;
        System.out.print("请输入数组长度");
        length = scanner.nextInt();
        return length;
    }
    public static SqlList initWithInput()
    {
        SqlList sl = new SqlList();
        int length = SqlList.inputLength();
        int i = 0;
        while (i<length)
        {
            int temp = scanner.nextInt();
            sl.myarr[i] = temp;
            i++;
        }
        sl.length = length;
        return sl;
    }
    public void showList()
    {
        System.out.print("数组内容是：\n");
        for(int i = 0; i < this.length;i++)
        {
            System.out.print(this.myarr[i]+" ");
        }
        System.out.println("");
    }

    public void initMyarr(int[] myarr) {
        this.myarr = myarr;
        this.length = this.myarr.length;
    }


}


