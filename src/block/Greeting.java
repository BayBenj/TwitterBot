package block;

import speech.Blank;
import speech.Word;

public class Greeting extends WordBlock {

	Word a;
	Word b;
	Word c;
	Word d;
	Word e;
	Word f;
	
	public Greeting() {
		assign();
		this.words.add(orW(a,8, b,4, c,2, d,6, e,1, f,1));
		this.words.add(orW(w(pro, "there"),2, new Blank(),3));
	}
	
	public Greeting(int aa, int bb, int cc, int dd, int ee, int ff) {
		assign();
		this.words.add(orW(a,aa, b,bb, c,cc, d,dd, e,ee, f,ff));
		this.words.add(orW(w(pro, "there"),2, new Blank(),3));
	}

	private void assign() {
		a = w(inj, "hail");
		b = w(inj, "greetings");
		c = w(inj, "hello");
		d = w(inj, "ho");
		e = w(inj, "hallo");
		f = w(inj, "hullo");
	}
}
/*
    Greetings
	Hail!
	Hail there!
	Pray tell, how fare thee on this day of providence?
	Hail thou fellow!
	God save ye!
	Greetings, my lad!
	Good morrow!

 */
