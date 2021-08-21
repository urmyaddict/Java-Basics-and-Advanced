package com.java.functionalinterface;

@FunctionalInterface
interface Cat {
	abstract void height(Cat cat);

	default void name() {
		System.out.println("Hi i am cat");
	}
}

public class Tiger implements Cat {
	public static void main(String args[]) {
	        Cat cat = new Tiger();
	        cat.name();
	        cat.height(cat);
	    }

	@Override
	public void name() {
		System.out.println("Hi i am Tiger");
	}

	@Override
	public void height(Cat cat) {
		cat.name();
	}

}
