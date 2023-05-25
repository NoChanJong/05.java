package com.lec.exercise.answer;

public class Exercise8_9 {
	public static void main(String[] args) throws Exception{
		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);
	}
}

class UnsupportedFuctionException extends RuntimeException {
	private final int ERR_CODE = 100;

	UnsupportedFuctionException(String message, int errorCode) {
		super(message);
		errorCode = ERR_CODE;
	}
	
	UnsupportedFuctionException(String message) {
		this(message, 100);
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}

	public String getMessage() {
		return "[" + getErrorCode()	+ "] " + super.getMessage();
	}
}

