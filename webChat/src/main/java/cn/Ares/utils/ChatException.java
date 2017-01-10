package cn.Ares.utils;

public class ChatException extends RuntimeException {

	public ChatException(String msg, Throwable t){
		super(msg,t);
	}
}
