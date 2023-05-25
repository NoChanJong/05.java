package com.lec.exercise.answer;

public class Account {
	private int balance = 50000;
	int MIN_BALANCE = 0;
	int MAX_BALANCE = 1000000;
	
	public void setBalance(int balance) {
		
		if(balance < MIN_BALANCE) {
			System.out.println("현재 잔고는 " + balance + "입니다.");
			System.out.println("잔고가 마이너스 입니다.");
			this.balance = balance;
		} else if(balance > MAX_BALANCE){
				System.out.println("현재 잔고는 " + balance + "입니다.");
				System.out.println("최대금액을 넘어섰습니다.");
				this.balance = balance;
			} else {
				System.out.println("현재 잔고는 " + balance + "입니다.");
				this.balance = balance;
			}
		}
}
