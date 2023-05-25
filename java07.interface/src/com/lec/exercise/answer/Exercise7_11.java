package com.lec.exercise.answer;

class MyTv3 { 
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int PrevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME);
		this.volume = volume;
	} 
	/*  (1)문제 7-10의 MyTv2클래스에 gotoPrevChannel 메서드를 추가하여 완성하시오. */
	public void setChannel(int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL) return;
		PrevChannel = this.channel;
		this.channel = channel;
	}
	
	public void gotoPrevChannel() {
		setChannel(PrevChannel);
	}
}

class Exercise7_11 {

	public static void main(String args[]) {

		MyTv3 t = new MyTv3();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
	}
}
