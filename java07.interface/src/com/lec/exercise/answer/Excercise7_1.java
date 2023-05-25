package com.lec.exercise.answer;

class SutdaDeck{
   final int CARD_NUM = 20;
   SutdaCard[] cards = new SutdaCard[CARD_NUM];
   
   SutdaDeck() {
      for(int i=0; i < CARD_NUM; i++) {
    	  if(i == 0 || i == 2 || i == 7) { // K가 붙는 조건 i가 0, 2, 7이면
    		  cards[i] = new SutdaCard(i + 1, true); // i에 +1을 한 후, true(K)를 붙임
    	  } else {
    		  cards[i] = new SutdaCard(i%10 + 1, false); // 아닐경우 i%10에 + 1을 한 후, false("")를 붙임
    	  }
      }
      
   }
   
}

class SutdaCard {
   int num;
   boolean isKwang;
   
   SutdaCard() {
      this(1, true);
   }
   
   SutdaCard(int num, boolean isKwang) {
      this.num = num;
      this.isKwang = isKwang;
   }
   
   // info()대신 Object클래스의 toString()을 오버라이딩했다
   public String toString() {
      return num + (isKwang? "K":"");
   }
}

public class Excercise7_1 {

   public static void main(String[] args) {
      SutdaDeck deck = new SutdaDeck();
      
      for(int i=0; i< deck.cards.length; i++) {
         System.out.print(deck.cards[i] + ", "); // 1~10까지 나열
      }
   }

}
