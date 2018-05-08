package com.company;

import java.util.Scanner;
import java.util.Stack;

public class EmergencyTracker
{
    private Stack<String> emergencies= new Stack<>();
    
    public static void main(String[] args)
    {
        EmergencyTracker emergencyTracker=new EmergencyTracker();
        emergencyTracker.run();
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
            else if (command.equals("PANIC"))
            {
                panic();
            }
            else
            {
                System.out.println("Please choose from the available commands!");
            }
        }
        while(!command.equals("PANIC"));
        System.out.println("Everyone is dead.");
    }
    private void commandPrompt()
    {
        System.out.println("Welcome to Emergency Tracker");
        System.out.println("Please choose from the following commands:");
        System.out.println("Add <Emergency Name>");
        System.out.println("Peek");
        System.out.println("Remove");
        System.out.println("HowMany");
        System.out.println("Panic");
    }
    private void add(String choice)
    {
        emergencies.push(choice);
        System.out.println(choice+" was added to your emergency list!");
    }
    private void peek()
    {
        String nextTask= emergencies.peek();
        System.out.println("Your next emergency to address is "+nextTask);
    }
    private void remove()
    {
        if (emergencies.size()>0)
        {
            String removedItem = emergencies.pop();
            System.out.println(removedItem + " was removed from your emergency list!");
        }
        else
        {
            System.out.println("Your emergency list is empty!");
        }
    }
    private void howMany()
    {
        int tasksLeft= emergencies.size();
        System.out.println("You have "+tasksLeft+" emergencies remaining!");
    }
    private void panic()
    {
        emergencies.clear();
    }
}
