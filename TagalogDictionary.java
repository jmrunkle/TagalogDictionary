import java.util.Arrays;

public class TagalogDictionary {

  public static String[] sortWords(String[] words) {
    return words; // TODO
  }

	private static void qsort(String[] words, int low, int high) {
    return; // TODO
  }
  
  private static int partition(String[] words, int low, int high) {
    return 0; // TODO
  }
  
  private static void swap(String[] words, int a, int b) {
    String tmp = words[a];
    words[a] = words[b];
    words[b] = tmp;
  }
  
  // turn a string into an of Tagalog letters (represented as strings)
  private static String[] getLetters(String word) {
    return new String[word.length()]; // TODO
  }
  
  // return a value that increases as you go through the Tagalog alphabet
  private static int rankLetter(String letter) {
    if (letter.length() > 1)        return (int) 'o';
    if (letter.equals("k"))         return (int) 'c';
    if (letter.compareTo("o") >= 0) return (int) letter.charAt(0) + 1;
    else                            return (int) letter.charAt(0);
  }
  
  // compareLetters returns a positive value if the letter is later in the alph
  private static int compareLetters(String a, String b) {
    return rankLetter(a) - rankLetter(b);
  }
  
  // compareWords returns a positive value if the word is later lexigraphically
  private static int compareWords(String wordA, String wordB) {
    return 0; // TODO
  }

  // the main function - tests the previous examples and cases
  public static void main(String args[]) {
  	// function testing
  	String[] testSwap = new String[]{"second", "first"};
  	swap(testSwap, 0, 1);
  	System.out.println("Actual result: "+Arrays.toString(testSwap));
  	String[] solution = new String[]{"first", "second"};
  	System.out.println("Should return: "+Arrays.toString(solution));
		if (Arrays.equals(testSwap, solution)) System.out.println("PASS\n");
  	else System.out.println("FAIL\n");

    String[] words = new String[]{"abakada","alpabet","tagalog","ako"};
    String[] sorted = sortWords(words);
    System.out.println("Actual result: "+Arrays.toString(sorted));
    solution = new String[]{"abakada", "ako", "alpabet", "tagalog"};
    System.out.println("Should return: "+Arrays.toString(solution));
    if (Arrays.equals(sorted, solution)) System.out.println("PASS\n");
    else System.out.println("FAIL\n");
    
    words = new String[]{"ang","ano","anim","alak","alam","alab"};
    sorted = sortWords(words);
    System.out.println("Actual result: "+Arrays.toString(sorted));
    solution = new String[]{"alab", "alak", "alam", "anim", "ano", "ang"};
    System.out.println("Should return: "+Arrays.toString(solution));
    if (Arrays.equals(sorted, solution)) System.out.println("PASS\n");
    else System.out.println("FAIL\n");

    words = new String[]{"siya","niya","kaniya","ikaw","ito","iyon"};
    sorted = sortWords(words);
    System.out.println("Actual result: "+Arrays.toString(sorted));
    solution = new String[]{"kaniya", "ikaw", "ito", "iyon", "niya", "siya"};
    System.out.println("Should return: "+Arrays.toString(solution));
    if (Arrays.equals(sorted, solution)) System.out.println("PASS\n");
    else System.out.println("FAIL\n");

    words = new String[]{"kaba","baka","naba","ngipin","nipin"};
    sorted = sortWords(words);
    System.out.println("Actual result: "+Arrays.toString(sorted));
    solution = new String[]{"baka", "kaba", "naba", "nipin", "ngipin"};
    System.out.println("Should return: "+Arrays.toString(solution));
    if (Arrays.equals(sorted, solution)) System.out.println("PASS\n");
    else System.out.println("FAIL\n");

    words = new String[]{"knilngiggnngginggn","ingkigningg","kingkong","dingdong","dindong","dingdont","ingkblot"};
    sorted = sortWords(words);
    System.out.println("Actual result: "+Arrays.toString(sorted));
    solution = new String[]{"kingkong", "knilngiggnngginggn", "dindong", "dingdont", "dingdong", "ingkblot", "ingkigningg"};
    System.out.println("Should return: "+Arrays.toString(solution));
    if (Arrays.equals(sorted, solution)) System.out.println("PASS\n");
    else System.out.println("FAIL\n");

    words = new String[]{"silangang", "baka", "bada", "silang"};
    sorted = sortWords(words);
    System.out.println("Actual result: "+Arrays.toString(sorted));
    solution = new String[]{"baka", "bada", "silang", "silangang"};
    System.out.println("Should return: "+Arrays.toString(solution));
    if (Arrays.equals(sorted, solution)) System.out.println("PASS\n");
    else System.out.println("FAIL\n");
  }
}