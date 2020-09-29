package com.tdwy.petshop.bean;

public class Result<T> implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//返回的结果，0失败，1成功
	private int code;
	//返回的消息  注册成功！
	private String msg;
	//返回给浏览器的数据 list map实体对象	
	private T data;
	
	/**
	 * 	JavaBean 规范 ：一定要定义无参数的构造函数
	 */
	public Result() {
		
	}
	
	public Result(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	public Result(int code, String msg, T data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
}
