// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.io. *;
import java.nio.file.*;
import java.util.ArrayList;
import Java.util.List;
import java.util.Scanner;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

public class TempMath {
    private ArrayList<Temps> temps;
    private string total;
    private string average;
    private LocalDateTime todayDate;

    public TemperatureMath{
        todayDate = LocalDateTime.now()
        this.temp = temp;
        temps = new ArrayList<Temps>();
    }
    public string Math(int average, tempCount) {
        average = average / tempCount;
        System.out.println ("The average temperatuer is: " + average);
    }
}





public class Main {
    public static void main(String[] args) {
    String name x;
    int tempCount;
    int total;
    char choice;
    File tempLog = new File ("templog.txt");
    Scanner input = new Scanner(System.in);
    List<String>  lines = new ArrayList<>();


        System.out.println "This is a program that takes in daily temperatures, stores them in a txt file and allows you to find the average temperature between chosen days");

        // Check if name has already been entered
        if (!name) {
            System.out.println("Enter your name: ")
            name = input.nextLine();
        }
        System.out.println ("Hello " + name + ", todays date is: " + TempMath(todayDate))
        System.out.print("Enter in todays temperature in Celcius: ")
        String userTemp = input.nextLine();
        try {
            Files.write(tempLog.toPath(), Lines, StandardOpenOption.CREATE, StandardOpenOption.APPEND); )
        }
        catch(IOException ex) {
            System.out.println("Error: unable to write to file: " + ex.getMessage())
        }
        tempCount++;

        TempMath tempMath = TempMath(userTemp);
        if (tempCount > 1) {
            System.out.println("Do you wish to find the average of a range of temperatures? Enter 'Y' for yes, anything else for no")
            if (choice == 'Y' || choice == 'y') {
                while(//file not complete read))
                    try {
                        lines = Files.readAllLines(tempLog.toPath())
                            for (string line : lines) {
                                String[] tempData = line.split("-");
                                int num = Integer.parseInt(tempData[0]);
                                average+=num
                                math(average, tempCount);
                            }
                        }
                    catch(IOException ex)){
                        System.out.println("I/O error" + ex.getMessage())
                    }
            }
        }
            else{break;}







    }
}