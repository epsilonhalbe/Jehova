package reading;

import static org.junit.Assert.*;

import org.junit.Test;
import reading.PigLatin;

public class PigLatinTest {

	@Test
	public void consonants_test() throws Exception {
		assertEquals("igpay",
				     PigLatin.pigLatinize("pig"));
	}
	@Test
	public void vowels_test() throws Exception {
		assertEquals("oiiinkway",
				     PigLatin.pigLatinize("oiiink"));
	}

	@Test
	public void symbols_test() throws Exception {
		assertEquals("an'tcay",
				     PigLatin.pigLatinize("can't"));
	}
	@Test
	public void more_symbols_test() throws Exception {
		assertEquals("\"ouldn'tshay\",",
				     PigLatin.pigLatinize("\"shouldn't\","));
	}
	@Test
	public void phrase_test() throws Exception {
		assertEquals("Ethay igpay ayssay: “Oiiinkway! Untgray, oiinkway!”",
		             PigLatin.pigLatinize("The pig says: “Oiiink! Grunt, oiink!”".split(" ")));
	}
	@Test
	public void phrase2_test() throws Exception {
		assertEquals("Igpay ayssay oiiinkway!",
		             PigLatin.pigLatinize("Pig says oiiink!".split(" ")));
	}



}
