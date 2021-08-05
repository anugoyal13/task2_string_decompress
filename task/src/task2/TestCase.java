package task2;

import static org.junit.Assert.*;

import org.junit.Test;

//Test cases 
public class TestCase {

	@Test
	public void test() {
		
		DecompressString decompresString = new DecompressString();
		//Testing actual output with expected output.
		
		assertEquals(decompresString.decompress("3[abc]4[ab]c"), "abcabcabcababababc");//Test Case1
		
		assertEquals(decompresString.decompress("2[3[a]b"), "aaabaaab");//Test Case2
		
		assertEquals(decompresString.decompress("10[a]"), "aaaaaaaaaa");//Test Case3
		
		assertEquals(decompresString.decompress("2[aa]3[b]"), "aaaabbb");//Test Case4
		
		assertEquals(decompresString.decompress("3[a2[b2[c]d]e]"), "abccdbccdeabccdbccdeabccdbccde");//Test Case4
	}

}
