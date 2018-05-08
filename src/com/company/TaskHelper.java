package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TaskHelper
{
    private Queue<String> tasks=new LinkedList<>();

    public static void main(String[] args)
    {
     TaskHelper taskHelper=new TaskHelper();
     taskHelper.run();
    }
    private void run()
    {
        commandPrompt();
        Scanner input=new Scanner(System.in);
        String choice;
        String[]commandSelection;
        String command;
        do
        {
            choice=input.nextLine();
            commandSelection=choice.split(" ");
            command=commandSelection[0].toUpperCase();
            if (command.equals("ADD")&&commandSelection.length!=1)
            {
                add(commandSelection[1]);
            }
            else if (command.equals("PEEK"))
            {
                peek();
            }
            else if (command.equals("REMOVE"))
            {
                remove();
            }
            else if (command.equals("HOWMANY"))
            {
                howMany();
            }
            else if (command.equals("FLEE"))
            {
                flee();
            }
            else
            {
                System.out.println("Please choose from the available commands!");
            }
        }
        while(!command.equals("FLEE"));
        System.out.println("You can never escape responsibility!");

    }
    private void commandPrompt()
    {
        System.out.println("Welcome to the task helper");
        System.out.println("Please choose from the following:");
        System.out.println("Add <Task Name>");
        System.out.println("Peek");
        System.out.println("Remove");
        System.out.println("HowMany");
        System.out.println("Flee");
    }

    private void add(String choice)
    {
        tasks.add(choice);
        System.out.println(choice+" was added to your task list!");
    }
    private void peek()
    {
        String nextTask= tasks.peek();
        System.out.println("Your next task is "+nextTask);
    }
    private void remove()
    {
        if (tasks.size()>0)
        {
            String removedItem = tasks.poll();
            System.out.println(removedItem + " was removed from your tasks!");
        }
        else
        {
            System.out.println("Your task list is empty!");
        }
    }
    private void howMany()
    {
        int tasksLeft= tasks.size();
        System.out.println("You have "+tasksLeft+" tasks remaining!");
    }
    private void flee()
    {
      tasks.clear();
    }
}
