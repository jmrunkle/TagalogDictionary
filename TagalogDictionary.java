public class TagalogDictionary {
  public static String[] sortWords(String[] words) {
    return words;
  }

  public static void main(String args[]) {
    String[] words = new String[]{"abakada","alpabet","tagalog","ako"};
    String[] sorted = sortWords(words);
    System.out.println(Arrays.toString(sorted));
    System.out.println("Should return: {abakada, ako, alpabet, tagalog }");
    
    words = new String[]{"ang","ano","anim","alak","alam","alab"};
    sorted = sortWords(words);
    System.out.println(Arrays.toString(sorted));
    System.out.println("Should return: {alab, alak, alam, anim, ano, ang}");
    
    words = new String[]{"siya","niya","kaniya","ikaw","ito","iyon"};
    sorted = sortWords(words);
    System.out.println(Arrays.toString(sorted));
    System.out.println("Should return: {kaniya, ikaw, ito, iyon, niya, siya}");
    
    words = new String[]{"kaba","baka","naba","ngipin","nipin"};
    sorted = sortWords(words);
    System.out.println(Arrays.toString(sorted));
    System.out.println("Should return: {baka, kaba, naba, nipin, ngipin}");
    
    words = new String[]{"knilngiggnngginggn","ingkigningg","kingkong","dingdong","dindong","dingdont","ingkblot"};
    sorted = sortWords(words);
    System.out.println(Arrays.toString(sorted));
    System.out.println("Should return: {knilngiggnngginggn,ingkigningg,kingkong,dingdong,dindong,dingdont,ingkblot}");
    
    words = new String[]{"silangang", "baka", "bada", "silang"};
    sorted = sortWords(words);
    System.out.println(Arrays.toString(sorted));
    System.out.println("Should return: {baka, bada, silang, silangang}");
  }
}