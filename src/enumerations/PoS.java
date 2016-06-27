package enumerations;

public enum PoS {
	NOUN,
	VERB,
	ADJECTIVE,
	ADVERB,
	PREPOSITION,
	PRONOUN,
	/*
	 * Interrogative Pronoun (who, what, where, when, why, how, how much, how many, whither, wherefore, whence)
	 * Indefinite (whoso, whosoever) So many, look them all up
	 */
	CONJUNCTION,
	/*
	 * Coordinating (only ones: for, and, nor, but, or, yet, so, wherefore) combines two equal elements
	 * Subordinating (although, when, before, because, though, since, inasmuch as, that) independent + (Subordinating) dependent clause, in any order
	 * Relative Pronoun (only ones: who, that, which, whom, whose, when, where)
	 * 
	 */
	INTERJECTION,
	DETERMINER
	/*
	 * Article
	 * 	Definite
	 * 	Indefinite
	 * 		Number
	 * Numeral
	 * Possessive Adjectives (my, thy, our)
	 * 		Person
	 * 		Number
	 * Demonstrative Adjectives (this, these, that)
	 * 		Proximal Distance
	 * 		Number
	 */
}
