package structures;

import static org.junit.Assert.*;

import org.junit.*;

import structures.ConsList;

public class MyListTests {
	@Test
	public void head_cons() {
		Integer i = 0;
		ConsList <Integer> lst = new ConsList<Integer>(); 
		assertEquals("head of cons(i,_)",i,lst.cons(i).getHead());
	}
	@Test
	public void tail_cons() {
		Integer i = 0;
		ConsList <Integer> lst = new ConsList<Integer>(); 
		assertEquals("tail of cons(_,lst)",lst,lst.cons(i).getTail());
	}
	@Test
	public void isEmpty_test(){
		ConsList<Integer> lst = new ConsList<Integer>();
		assertTrue("isEmpty(empty)", lst.isEmpty());
	}
	@Test
	public void zero_length_test(){
		ConsList<Integer> lst = new ConsList<Integer>();
	    assertEquals("len(empty)",0,lst.length());
	}
	@Test
	public void one_length_test(){
		ConsList<Integer> lst = new ConsList<Integer>();
		assertEquals("len(cons)",1,(lst.cons(1)).length());
	}
	public void print_test(){
		ConsList<Integer> lst = new ConsList<Integer>();
		assertEquals("consconscons=[,,]","[1,2,3]",lst.cons(3).cons(2).cons(1).toString());
	}
}
