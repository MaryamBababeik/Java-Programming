package com.usc.java;

import java.util.Scanner;

public class Lesson {
    //1.ham niaz   //2.pish niaz

    public int unit;

    public void physycs1(){

        System.out.println();
        unit = 3;
        System.out.println(unit);
        System.out.println("HamNiaz:\n math1 ");
        System.out.println("PishNiaz:\n nadarad ");
    }

    public void physycs2(){
        unit = 3;
        System.out.println(unit);
        System.out.println("HamNiaz:\n math2 _ programming ");
        System.out.println("PishNiaz:\n physycs1 _ math1 ");
    }

    public void math1(){
        unit = 3;
        System.out.println(unit);
        System.out.println("HamNiaz:\n physycs1 ");
        System.out.println("PishNiaz:\n nadarad ");
    }

    public void math2(){
        unit = 3;
        System.out.println(unit);
        System.out.println("HamNiaz:\n physycs2 _ programming ");
        System.out.println("PishNiaz:\n math1 _ physycs1 ");
    }

    public void programming(){
        unit = 3;
        System.out.println(unit);
        System.out.println("HamNiaz:\n math2 _ physycs2 ");
        System.out.println("PishNiaz:\n math1 _ physycs1 ");
    }
    public void workProgramming(){
        unit = 1;
        System.out.println(unit);
        System.out.println("HamNiaz:\n programming _ physycs2 _ math2 ");
        System.out.println("PishNiaz:\n physycs1 _ math1 ");
    }

}


