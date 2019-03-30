package com.semairem;

public class PersonnelerinTamami {

	public static void main(String[] args) {
	Egiticiler egiticiler1=new Egiticiler();
	egiticiler1.isim="sema";
	egiticiler1.yas=18;
	egiticiler1.verdigiKurs="java";
	System.out.println(egiticiler1.isim+" "+egiticiler1.yas+" "+egiticiler1.verdigiKurs);
	
	Egiticiler egiticiler=new Egiticiler();
	egiticiler.isim="irem";
	egiticiler.yas=20;
	egiticiler.verdigiKurs="android";
	System.out.println(egiticiler.isim+" "+egiticiler.yas+" "+egiticiler.verdigiKurs);
	
	TemizlikPersonelleri temizlikPersonelleri=new TemizlikPersonelleri();
	temizlikPersonelleri.isim="selda";
	temizlikPersonelleri.yas=23;
	temizlikPersonelleri.kullandikleriAlet="vileda";
	System.out.println(temizlikPersonelleri.isim+" "+temizlikPersonelleri.yas+" "+temizlikPersonelleri.kullandikleriAlet);
	

	}

}
