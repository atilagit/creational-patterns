package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {

	public static void main(String[] args) {

		System.out.println("### Ordering an iPhone X");
		IPhone iphone1 = IPhoneFactory.getIphone("X", "standard");
		System.out.println(iphone1);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone2 = IPhoneFactory.getIphone("11", "highEnd");
		System.out.println(iPhone2);
	}
}
