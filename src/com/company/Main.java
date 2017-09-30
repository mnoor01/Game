package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();


        String[] Zombies = {"skeleton", "zombie", "warrior ", "assasin"};
        int maxEnemyHealth = 100;
        int enemyAttackDamage = 25;

        int health = 100;
        int attackDamage = 50;

        boolean running = true;
        System.out.println("welcome to the Dungeon");

        //Game:
        while (running) {
            System.out.println("----------------");
            int enemyHealth = rand.nextInt(maxEnemyHealth);
            String enemy = Zombies[rand.nextInt(Zombies.length)];
            System.out.println(" t= " + enemy + " has Appeared");

            while (enemyHealth > 0) {//options given
                System.out.println("\t your hp: " + health);
                System.out.println("your " + enemy + "\'s hp: " + enemyHealth);
                System.out.println("what would you like to do");
                System.out.println("\t1.attatack");
                System.out.println("\t2. run to a safe spot");
                System.out.println("\t3. give up and loose");

                String input = in.nextLine();

                switch (input) {
                    case "1":
                        int damageGiven = rand.nextInt(attackDamage);
                        int damageTaken = rand.nextInt(enemyAttackDamage);
                        enemyHealth -= damageGiven;
                        health -= damageTaken;
                        System.out.println("You strike the " + enemy + " with " + damageGiven);
                        System.out.println("The zombie strikes " + enemy + " With this much power " + damageTaken);
                        System.out.println("your health is now " + health);
                        System.out.println("The zombies health is " + enemyHealth + " now ");

                        if (health < 1) {
                            System.out.println("you are done");
                            break;
                        }
                        if (enemyHealth < 1) {
                            System.out.println("you won hooooooooray");
                            break;
                        }

                        break;
                    case "2":
                        System.out.println("Don't make any noise or the Zomies will come for you");
                        continue;
                    case "3":
                        System.out.println("Thanks for playing Muhaimen's Great game");
                        continue;
                    default:
                        System.out.println("You have an invalid response");
                        continue;
                }

                break;
            }
            break;
        }


        // write your code here
    }
}
