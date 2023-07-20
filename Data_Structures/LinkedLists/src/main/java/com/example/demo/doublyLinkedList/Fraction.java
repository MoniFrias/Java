package com.example.demo.doublyLinkedList;

public class Fraction {
	private int num;
	private int den;
	
	public Fraction() {
		this.num = 0;
		this.den = 1;
	}
	
	public Fraction(int num, int den) {
		this.num = num;
		if(den != 0) {
			this.den = den;
		}else {
			this.den = 1;
		}
		simplify();
	}
	
	public Fraction(Fraction obj) {
		this.num = obj.num;
		this.den = obj.den;
	}
	
	public boolean equals(Fraction obj) {
		return (this.num == obj.num && this.den == obj.den)? true : false;
	}
	
	@Override
	protected Object clone() {
		Fraction r = new Fraction(this);
		return r;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int value) {
		num = value;
		simplify();
	}
	
	public int getDen() {
		return den;
	}
	
	public void setDen(int den) {
		if(den != 0) {
			this.den = den;
			simplify();
		}		
	}
	
	public Fraction multiplication(Fraction b) {
		int n = this.num * b.num;
		int d = this.den * b.den;
		Fraction r = new Fraction(n, d);
		r.simplify();
		return r;
	}
	
	public Fraction division(Fraction b) {
		int n = this.num * b.den;
		int d = this.den * b.num;
		Fraction r = new Fraction(n, d);
		r.simplify();
		return r;
	}
	
	public Fraction addition(Fraction b) {
		int n = this.num * b.num + this.den * b.num;
		int d = this.den * b.den;
		Fraction r = new Fraction(n, d);
		r.simplify();
		return r;
	}
	
	public Fraction subtraction(Fraction b) {
		int n = this.num * b.num - this.den * b.num;
		int d = this.den * b.den;
		Fraction r = new Fraction(n, d);
		r.simplify();
		return r;
	}
	
	@Override
	public String toString() {
		return "{" + this.num + "/" +this.den + "}";
	}
	
	private int mod(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return mod(b,a%b);
		}
	}
	
	private void simplify() {
		int m = mod(this.num, this.den);
		this.num = this.num/m;
		this.den = this.den/m;
	}
}
