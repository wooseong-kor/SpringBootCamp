package com.jun.practice.dto;

import java.io.Serializable;

public class Board_Dto implements Serializable {

	private static final long serialVersionUID = -8749756315535437021L;

	private String board_seq;
	private String writer;
	private String board_title;
	private String board_content;
	private String readcount;
	private String regdate;
	private String refer;
	private String step;
	private String dep;

	public Board_Dto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Board_Dto(String board_seq, String writer, String board_title, String board_content, String readcount,
			String regdate, String refer, String step, String dep) {
		super();
		this.board_seq = board_seq;
		this.writer = writer;
		this.board_title = board_title;
		this.board_content = board_content;
		this.readcount = readcount;
		this.regdate = regdate;
		this.refer = refer;
		this.step = step;
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Board_Dto [board_seq=" + board_seq + ", writer=" + writer + ", board_title=" + board_title
				+ ", board_content=" + board_content + ", readcount=" + readcount + ", regdate=" + regdate + ", refer="
				+ refer + ", step=" + step + ", dep=" + dep + "]";
	}

	public String getBoard_seq() {
		return board_seq;
	}

	public void setBoard_seq(String board_seq) {
		this.board_seq = board_seq;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getBoard_title() {
		return board_title;
	}

	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}

	public String getBoard_content() {
		return board_content;
	}

	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}

	public String getReadcount() {
		return readcount;
	}

	public void setReadcount(String readcount) {
		this.readcount = readcount;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getRefer() {
		return refer;
	}

	public void setRefer(String refer) {
		this.refer = refer;
	}

	public String getStep() {
		return step;
	}

	public void setStep(String step) {
		this.step = step;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

}
