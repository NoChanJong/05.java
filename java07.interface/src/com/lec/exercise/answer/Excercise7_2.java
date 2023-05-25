package com.lec.exercise.answer;

class SutdaDeck1 {
	final int CARD_NUM = 20;
	SutdaCard1[] cards = new SutdaCard1[CARD_NUM];



	SutdaDeck1() { 

		/* 문제 7-1의 답이므로 내용생략  */

	} 

	/* (1) 위에 정의된 세 개의 메서드를 작성하시오 . */
	void shuffle() {
		 
	}
	
//	void pick(int index) {
//		return cards[index];
//	}
	
	void pick() {
		
	}

} // SutdaDeck

class SutdaCard1 {
	int num;
	boolean isKwang;

	SutdaCard1() {
		this(1, true);
	}

	SutdaCard1(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

class Exercise7_2 {

	public static void main(String args[]) {

		SutdaDeck1 deck = new SutdaDeck1();

		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		

		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		
		System.out.println();
		System.out.println(deck.pick(0));
	}
}