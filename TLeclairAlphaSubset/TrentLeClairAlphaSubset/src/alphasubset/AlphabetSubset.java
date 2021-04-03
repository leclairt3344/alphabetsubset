/**
 * 
 */
package alphasubset;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * AlphabetSubset - Class uses subset of alphabet for a language test
 * @author Trent
 *
 */
public class AlphabetSubset {

  ArrayList<Character> mSubset = new ArrayList<Character>();
  String mPhrase;
  /**
   * AlphabetSubset constructor for class that finds chars used in a phrase
   * what it does - stores string in a arraylist of characters
   * returns nothing
   */
  public AlphabetSubset(String phrase) {
    mPhrase = phrase;
    if(!validate()) {
      mPhrase = null;
    }

  }

  
  public boolean compare(AlphabetSubset other) {
    ArrayList<Character> subset = mSubset;
    ArrayList<Character> test = other.findSubset();

    return false;
    
  }
  /**
   * find subset method that returns the subset of characters found in the phrase
   *@return subset
   */
  public ArrayList<Character> findSubset() {
  ArrayList<Character> subset = new ArrayList<Character>();
  boolean matching = false;
  boolean pass = true;
  for(int i = 0; i < mPhrase.length(); i++) {
    for(int c = 0; c < mSubset.size(); c++) {
      for(int a = 0; a < c; a++) {//loops thorugh the phrase and adds to subset whenever it finds a character not in subset.
          if(mPhrase.charAt(i) == mPhrase.charAt(a)) {
            matching = true;
          }
        }
      if(!matching) {
        subset.add(mSubset.get(i));
      }
      }
    }
  if(pass) {
    subset.add(mSubset.get(0));
    pass = false;
  }
  subset = this.sort(subset);
  return subset;
  }
  
  private ArrayList<Character> sort(ArrayList<Character> input){
    ArrayList<Character> output = new ArrayList<Character>();
    output = input;
    for(int i = 0; i < output.size(); i++)
      for(int j = 0; j < output.size(); j++) {
        if(output.get(i) < output.get(j)) {
          Character temp = output.get(i);
          output.set(i, output.get(j));
          output.set(j, temp);
        }
      }
    return output;
  }
  
  //converts all letters to upper case
  private ArrayList<Character> toUpper(ArrayList<Character> input) {
    ArrayList<Character> output = input;
    
    for(int i = 0; i < input.size(); i++)
      output.set(i, Character.toUpperCase(input.get(i)));
    
    return output ;
  }


  
  public String getPhrase() {
    return mPhrase;
  }
  
  private boolean validate() {
    
    if(mPhrase == null)
      return false;
    else {
      for(int i = 0; i < mPhrase.length(); i++) {
        if(Character.isLetter(mPhrase.charAt(i)) == false) {//checks if phrase is a letter if it's not checks for characters in script
          if(mPhrase.charAt(i) == ' ' || mPhrase.charAt(i) == '!' || mPhrase.charAt(i) == '"' || mPhrase.charAt(i) == '#' || mPhrase.charAt(i) == '$' || mPhrase.charAt(i) == '%' || mPhrase.charAt(i) == '&' || mPhrase.charAt(i) == '(' || mPhrase.charAt(i) == ')' || mPhrase.charAt(i) == '*' || mPhrase.charAt(i) == ',' || mPhrase.charAt(i) == '-' || mPhrase.charAt(i) == '.' || mPhrase.charAt(i) == ':' || mPhrase.charAt(i) == ';' || mPhrase.charAt(i) == '?' || mPhrase.charAt(i) == '@'|| mPhrase.charAt(i) == '\'') {
            return true;
          }
          else {//if not in alphabetr and not special character allowed returns false
            return false;
          }
        
        }
      }
    }
    
    return true;//if in alphabet returns true
  }
  
}
