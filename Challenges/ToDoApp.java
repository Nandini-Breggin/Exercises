import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class ToDoApp {
    public static void main(String[] args) throws IOException{
        System.out.println("To Do List");

        File file;
        Scanner scan;
        Scanner userScan;
        PrintWriter output;
        

        try {

            output = new PrintWriter(new FileWriter("Tasks.txt", true));
            file = new File("Tasks.txt");
            scan = new Scanner(file);
            userScan = new Scanner(System.in);

            Task newTask;

            if (scan.hasNextLine()) {
                while (scan.hasNextLine()){
                    System.out.println(scan.nextLine());
                }

                System.out.println("Menu: Add new task (a), Update existing task (u), Clear all tasks (c), Quit (x)");
                char option = userScan.nextLine().charAt(0);

                while (option != 'x'){
                    ArrayList<String> taskInfo = new ArrayList<String>();

                    if (option == 'a' || option == 'u') {
                        System.out.println("Enter the task description:");
                        taskInfo.add(userScan.nextLine());
                        System.out.println("Enter due date");
                        taskInfo.add(userScan.nextLine());
                        System.out.println("Enter done status (t/f)");
                        taskInfo.add(userScan.nextLine());
                        System.out.println("Enter priority (1-5, with 1 = critical)");
                        taskInfo.add(userScan.nextLine());
                    }

                    if (option == 'c') {
                        PrintWriter writer = new PrintWriter("Tasks.txt");
                        writer.print("");
                        writer.close();
                    }


                    if (option == 'x'){
                        scan.close();
                        userScan.close();
                        output.close();
                        System.exit(0);
                    }



                    newTask = new Task(taskInfo.get(0), taskInfo.get(1), (taskInfo.get(2)).toLowerCase().equals("t"), Integer.parseInt(taskInfo.get(3)));

                    output.println(newTask);

                    System.out.println("Menu: Add new task (a), Update existing task (u), Clear all tasks (c), Quit (x)");
                    option = userScan.nextLine().charAt(0);

                }

            } else {
                System.out.println("Menu: Add new task (a), Quit (x)");
                char option = userScan.nextLine().charAt(0);

                while (option != 'x') {
                    ArrayList<String> taskInfo = new ArrayList<String>();

                    if (option == 'a' || option == 'u') {
                        System.out.println("Enter the task description: ");
                        taskInfo.add(userScan.nextLine());
                        System.out.println("Enter the due date: ");
                        taskInfo.add(userScan.nextLine());
                        System.out.println("Enter the status: Done? (t/f): ");
                        taskInfo.add(userScan.nextLine());
                        System.out.println("Enter priority (1-5, with 1 = critical, 3 = default, 5 = whenever): ");
                        taskInfo.add(userScan.nextLine());
                    }

                    if (option == 'x') {
                        scan.close();
                        userScan.close();
                        output.close();
                        System.exit(0);
                    }

                    newTask = new Task(taskInfo.get(0), taskInfo.get(1), (taskInfo.get(2)).toLowerCase().equals("t"), Integer.parseInt(taskInfo.get(3)));

                    output.println(newTask);

                    System.out.println("Menu: Add new task (a), Update existing task (u), Clear all tasks (c), Quit (x)");
                    option = userScan.nextLine().charAt(0);

                }
            }

            scan.close();
            userScan.close();
            output.close();

        } catch (IndexOutOfBoundsException e) {
            System.out.println("File is cleared.");
            System.exit(0);
        }
    }
}

