/**
 * 
 */
package alphaSubsetTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import alphasubset.AlphabetSubset;

/**
 * @author Trent
 *
 */
class AlphabetSubsetTest {

  /**
   * @throws java.lang.Exception
   */
  @BeforeAll
  static void setUpBeforeClass() throws Exception {
  }

  /**
   * @throws java.lang.Exception
   */
  @AfterAll
  static void tearDownAfterClass() throws Exception {
  }

  /**
   * @throws java.lang.Exception
   */
  @BeforeEach
  void setUp() throws Exception {
  }

  /**
   * @throws java.lang.Exception
   */
  @AfterEach
  void tearDown() throws Exception {
  }

  
  @Test
  void constructorTest() {
    AlphabetSubset test1 = new  AlphabetSubset("this is a test phrase");
    Assertions.assertNotNull(test1);
  }
  
  @Test
  void findComplexSubset() {
    AlphabetSubset test1 = new  AlphabetSubset("abcdddfgh");
    ArrayList<Character> subset = test1.findSubset();
    
    ArrayList<Character> expected = new ArrayList<Character>();
    expected.add('a');
    expected.add('b');
    expected.add('c');
    expected.add('d');
    expected.add('f');
    expected.add('g');
    expected.add('h');



    
    Assertions.assertArrayEquals(expected.toArray(), subset.toArray());
  }
  
  @Test
  void sizeTest() {
    AlphabetSubset test1 = new  AlphabetSubset("this is a test phrase");
    Assertions.assertNotNull(test1);
    Assertions.assertEquals(test1.getPhrase().length(), 21);
  }
  

  
  

  
}
