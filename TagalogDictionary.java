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
    return; // TODO
  }
  
  // turn a string into an of Tagalog letters (represented as strings)
  private static String[] getLetters(String word) {
    return new String[word.length()]; // TODO
  }
  
  // return a value that increases as you go through the Tagalog alphabet
  private static int rankLetter(String letter) {
    return 0; // TODO
  }
  
  // compareLetters returns a positive value if the letter is later in the alph
  private static int compareLetters(String a, String b) {
    return 0; //TODO
  }
  
  private static int compareWords(String wordA, String wordB) {
    return 0; //TODO
  }
  public static void main(String args[]) {
    String[] words = new String[]{"abakada","alpabet","tagalog","ako"};
    String[] sorted = sortWords(words);
    System.out.println("Actual result: "+Arrays.toString(sorted));
    String[] solution = new String[]{"abakada", "ako", "alpabet", "tagalog"};
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