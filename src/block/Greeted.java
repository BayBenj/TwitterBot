package block;

import enumerations.Tag;
import speech.Word;

public class Greeted extends WordBlock {

	private Word rndAdj;
	private Word a1;
	private Word a2;
	private Word a3;
	private Word a4;
	private Word n1;
	private Word n2;
	private Word n3;
	private Word n4;
	private Word n5;
	private Word n6;
	private Word n7;

	public Greeted() {
		assign();
		this.words.add(orW(a1,2, a2,2, a3,1, a4,1, rndAdj,14));
		this.words.add(orW(n1,1, n2,1, n3,1, n4,1, n5,1, n6,1, n7,1));
	}
	
	private void assign() {
		this.a1 = w(adj, "fine");
		this.a2 = w(adj, "good");
		this.a3 = w(adj, "lovely");
		this.a4 = w(adj, "fond");
		this.rndAdj = w(adj, Tag.COMPLIMENT);
		this.rndAdj.getRegular();
		
		this.n1 = w(nou, "fellow");
		this.n2 = w(nou, "lad");
		this.n3 = w(nou, "man");
		this.n4 = w(nou, "friend");
		this.n5 = w(nou, "ally");
		this.n6 = w(nou, "comrade");
		this.n7 = w(nou, "person");
	}
}


