package first_OOP;

//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;

class my {
	/**
	 * @pre 'x' is non-negative
	 * | x >= 0
	 * @post square of result is not correct
	 * | result*result <= x
	 * @param x
	 * @return
	 */
	
int sr(int x) {
	int i = 0;
	for(;i*i<=x;i++);
	return i-1;	
}

//	@Test
	void test() {
//		fail("Not yet implemented");
	}

}
