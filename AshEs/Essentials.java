/*
AshEs | Ashiix's Essentials
A library of complex Java code, simplified
© 2019 Ashiix
 */

package AshEs;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Essentials {

    // GET USER STRING INPUT
    public String getStrInput() {
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();
        in.close();
        return userInput;
    }

    // GET USER INT INPUT
    public int getIntInput() {
        int userInput = 0;
        boolean isInt = false;
        while (!isInt) {
            isInt = true;
            try {
                Scanner in = new Scanner(System.in);
                userInput = in.nextInt();
                in.close();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer.");
                isInt = false;
            }
        }
        return userInput;
    }

    // SLEEP
    public static void sleep(int sleepTime) {
        try {
            TimeUnit.MILLISECONDS.sleep(sleepTime);
        } catch (InterruptedException e) {
            System.exit(0);
        }
    }

    // RNG
    public int rng(int randMin, int randMax) {
        Random randomGenerator = new Random();
        int randNum = randomGenerator.nextInt(randMax - randMin + 1) + randMin;
        return randNum;
    }

    // DOT SLEEP
    public static void dotSleep(int repeatNum, int delayTime) {
        for (int i = 0; i < repeatNum; i++) {
            Essentials.sleep(delayTime);
            System.out.println(".");
        }
    }

}