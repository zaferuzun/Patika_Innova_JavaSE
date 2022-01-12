package com.innova;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Zafer UZUN");
        int i =0;
        AtomicInteger atomicInteger= new AtomicInteger(0);
        Integer integer = new Integer(0);
        denemePri(i);
        denemeAtomicObj(atomicInteger);
        ArrayList arrayList = new ArrayList();
        denemeObj(integer);
        denemeArrList(arrayList);
        //atomicInteger=new AtomicInteger(15);
        System.out.println("denemePri Fonk çalıştı ve i deger = "+i+"\n"
                +"denemeAtomicObj fonk çalıştı ve atomicInteger degeri= "+atomicInteger+"\n"
                +"denemeObj fonk çalıştı ve integer1 degeri= "+integer+"\n"
                +"denemeArrList fonk çalıştı ve arraylist degeri= "+arrayList.size());
        i= denemePri2(i);
        System.out.println("denemePri2 Fonk çalıştı ve i deger = "+i);

//        ArrayList arrayList1= new ArrayList();
//        deneme d =new deneme(arrayList1);
//        System.out.println("cons sonrası arraylist size: " +d.arrayList.size());
//        d.denemeInsert();
//        System.out.println("arraylist insert edildikten sonra ki size: "+ d.arrayList.size());
//        d.denemeNew();
//        System.out.println("arraylist newlendikten sonra ki size: "+ d.arrayList.size());
//        d.arrTry();

    }

    public static void denemePri(int i)
    {
        i=5;
    }

    public static void denemeObj(Integer integer)
    {
        integer.inc(integer);
    }
    public static void denemeAtomicObj(AtomicInteger integer)
    {
        integer.set(5);
    }
    public static int denemePri2(int i)
    {
        i=6;
        return i;
    }
    public static void denemeArrList(ArrayList arrayList){
        ArrayList arrayList1=new ArrayList();
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList=arrayList1;
    }

}
