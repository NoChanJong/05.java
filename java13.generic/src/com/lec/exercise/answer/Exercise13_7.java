package com.lec.exercise.answer;

class Exercise13_7 {
	static boolean stopped = true;

	public static void main(String[] args) { 
		Thread5 th1=new Thread5();
		th1.start(); 
		
		try{  
			Thread.sleep(6*1000); 
		}catch(Exception e){} 

		stopped=true; // 쓰레드를 정지시킨다. 
			th1.interrupt(); //일시정지 상태에 있는 쓰레드를 깨운다.
		System.out.println("stopped"); 
		}
}

class Thread5 extends Thread {
	public void run() {
		// Exercise13_7.stopped의 값이 false인 동안 반복한다.
		for (int i = 0; !Exercise13_7.stopped; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3 * 1000);
			} catch (Exception e) {}
		}
	}
}

// Exercise13_7.stopper의 값을 true바꾼다.
// Exercise13_7.stopper의 값이 바뀌어도 for문내의 Thread.sleep(3*1000); 문장에 의해
// 일시정지 상태에 있는 경우, 시간이 지나서 일시정지 상태를 벗어날 때까지 for문을 벗어날 수 없기 때문에
// interrupt()를 호출해서 sleep()에 의해 일시정지 상태에 있는 쓰레드를 깨워야 즉시 정지하게 된다.
