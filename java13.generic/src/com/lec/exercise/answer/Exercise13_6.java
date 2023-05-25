package com.lec.exercise.answer;

class Exercise13_6 {

	public static void main(String[] args) throws Exception {
		Thread4 th1 = new Thread4();
		th1.setDaemon(true); //쓰레드 th1을 데몬쓰레드로 설정한다.

		th1.start();
		
		try {
			th1.sleep(5 * 1000);
		} catch (Exception e) {
		}
		throw new Exception("꽝~!!!");
	}
}

class Thread4 extends Thread {
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

// 예상 : 0에서부터 9까지 출력하는중 1이 출력된 후 Exception발생하여 "꽝" 출력
// 실행결과 : 0~4까지 출력후 Exception발생하여 "꽝" 출력
// 데몬쓰레드는 일반 쓰레드가 종료되면 자동 종료되기 때문에 main쓰레드가 종료됨과 동시에 자동종료된다.





