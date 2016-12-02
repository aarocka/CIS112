package com.hw6;

import java.util.Scanner;

/**
 * Created by Aaron on 11/13/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Create a deck of cards
        RankCardDeck deckOfCards = new RankCardDeck();
        //Create our queues
        GlassQueue<Integer> queueA = new GlassQueue<>();
        GlassQueue<Integer> queueB = new GlassQueue<>();
        GlassQueue<Integer> queueC = new GlassQueue<>();
        //Shuffle deck and deal cards
        deckOfCards.shuffle();
        for (int i=0; i<10;i++) {
            queueA.enqueue(deckOfCards.nextCard());
        }
        for (int i=0; i<10;i++) {
            queueB.enqueue(deckOfCards.nextCard());
        }
        for (int i=0; i<10;i++) {
            queueC.enqueue(deckOfCards.nextCard());
        }
        //Declare player money
        double playerMoney = 30.00;

        //game loop
        for (int i=0;i<10;i++){
            if (playerMoney <= 0){
                System.out.println("Out of money. GAME OVER!");
                break;
            }
            else {
                //create temp vars for our cards
                int cardA, cardB, cardC;
                cardA = queueA.dequeue();
                cardB = queueB.dequeue();
                cardC = queueC.dequeue();
                if (cardA > cardC){
                    int temp = cardA;
                    cardA = cardC;
                    cardC = temp;
                }
                //Display queueA ? queueC
                //Display current money
                System.out.println(cardA + " ? " + cardC);
                System.out.println("Money:$"+playerMoney);
                //Prompt user for bet
                System.out.println("Place your bet?");
                double bet = reader.nextDouble();
                while (bet<10 || bet>playerMoney){
                    System.out.println("Please bet $10 or more, $" + playerMoney + "max");
                    System.out.println("Place your bet?");
                    bet = reader.nextDouble();
                }
                //Calculate outcome
                if (cardB <= cardA || cardB >= cardC ){
                    //you loose
                    playerMoney = playerMoney-bet;
                    //Display results
                    System.out.println(cardA + ":"+ cardB + ":" + cardC);
                    System.out.println("You loose!");

                } else {
                    //you win
                    playerMoney = playerMoney + bet;
                    //Display results
                    System.out.println(cardA + ":"+ cardB + ":" + cardC);
                    System.out.println("You win!");
                }

            }
        }

    }
}
