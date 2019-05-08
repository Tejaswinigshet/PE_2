package com.stackroute;
import java.util.*;
public class StudentGrades {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents=s.nextInt();
        int i;
        int[] gradesArray= new int[numberOfStudents];
        System.out.println("Enter the grades : ");
        for(i=0;i<numberOfStudents;i++)
        {
            gradesArray[i]=s.nextInt();
        }



        StudentGrades student=new StudentGrades();
        student.findAverage(numberOfStudents,i,gradesArray);
        student.findMaximum(numberOfStudents,i,gradesArray);
        student.findMinimum(numberOfStudents,i,gradesArray);

    }


    public void findAverage(int numberOfStudents,int i,int gradesArray[])    {
        int sum=0;
        float average;
        for(i=0;i<numberOfStudents;i++)
        {
            sum=sum+gradesArray[i];
        }
        average=sum/numberOfStudents;
        System.out.println("The average is "+average);
    }

    public void findMaximum(int numberOfStudents,int i,int gradesArray[])    {
        int max=gradesArray[0];
        for(i=1;i<numberOfStudents;i++)
        {
            if(max<gradesArray[i])
            {
                max=gradesArray[i];
            }
        }

        System.out.println("The maximum grade is "+max);
    }

    public void findMinimum(int numberOfStudents,int i,int gradesArray[])    {
        int min=gradesArray[0];
        for(i=1;i<numberOfStudents;i++)
        {
            if(min>gradesArray[i])
            {
                min=gradesArray[i];
            }
        }

        System.out.println("The minimum grade is "+min);
    }


}