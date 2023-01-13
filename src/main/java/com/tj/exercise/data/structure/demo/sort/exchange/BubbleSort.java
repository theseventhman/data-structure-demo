package com.tj.exercise.data.structure.demo.sort.exchange;

import com.tj.exercise.data.structure.demo.sort.base.SqlList;

/**
 * @Author: tj
 * @Date: 2023/1/13 20:20
 */

public class  BubbleSort{
    public static void sortBasic(SqlList sqlList){

       for(int i = 0; i < sqlList.length-2; i++){
           for(int j = i+1; j < sqlList.length-1; j++){
               if(sqlList.myarr[i] > sqlList.myarr[j]){
                   sqlList.swap(i,j);
               }
           }
       }
    }

    public static void sortStandard(SqlList sqlList){
        Boolean swaped = true;
        for(int i = 0; i < sqlList.length && swaped; i++){
            swaped = false;
            for(int j = sqlList.length-1; j>i; j--){
                if(sqlList.myarr[j-1] > sqlList.myarr[j]){
                    sqlList.swap(j-1,j);
                    swaped = true;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        SqlList sqlList = new SqlList();
        sqlList.initMyarr(new int[]{33,79 ,93, 78, 65, 72, 36, 97, 7, 96});
        // sqlList.init(10);
        sqlList.showList();
        sortStandard(sqlList);
        sqlList.showList();
    }
}