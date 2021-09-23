package com.java11.basics;

public class AccessModifiers {

	public void pu() {
		System.out.println("PUBLIC: + \taccesible eveywhere");
	}

	private void pr() {
		System.out.println("PRIVATE: - \taccessible only inside its own class");
	}

	protected void proc() {
		System.out.println("PROTECTED: # \taccessible in same package, and to sub classes of different packages");
	}

	void def() {
		System.out.println("DEFAULT:\taccessible inside same package");
	}

	public static void main(String[] args) {
		AccessModifiers p = new AccessModifiers();
		p.pu();
		p.pr();
		p.proc();
		p.def();

	}

}
