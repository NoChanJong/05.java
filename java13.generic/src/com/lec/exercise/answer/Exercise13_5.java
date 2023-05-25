package com.lec.exercise.answer;

class Exercise13_5 {

	public static void main(String[] args) throws Exception {
		Thread3 th1 = new Thread3();
		th1.start();

		try {
			Thread.sleep(5 * 1000);
		} catch (Exception e) {
		}
		throw new Exception("꽝 ~!!!");
	}
}

class Thread3 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

// 예측 : 1초 간격으로 0부터 9까지 출력 
// 실행결과 : 0~4까지 출력후 5출력 전 Exception("꽝") 발생후 6부터 9까지 출력

// main에서 예외가 발생하여 종료되고 호출스택이 사라져도 쓰레드 th1이 실행되는
// 호출스택에는 아무런 영향을 미치지 못한다.