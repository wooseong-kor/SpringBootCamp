package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SampleVO {

	private String val1;
	private String val2;
	private String val3;
	public String getVal1() {
		return val1;
	}
	public void setVal1(String val1) {
		this.val1 = val1;
	}
	public String getVal2() {
		return val2;
	}
	public void setVal2(String val2) {
		this.val2 = val2;
	}
	public String getVal3() {
		return val3;
	}
	public void setVal3(String val3) {
		this.val3 = val3;
	}
	@Override
	public String toString() {
		return "SampleVO [val1=" + val1 + ", val2=" + val2 + ", val3=" + val3 + "]";
	}
	
	
}
