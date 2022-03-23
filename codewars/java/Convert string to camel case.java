import java.lang.StringBuilder;
class Solution{

  static String toCamelCase(String s){
    String ans = "";
    for (int i = 0; i < s.length();i++) {
      String curr = "";
      if (s.charAt(i) == '_' || s.charAt(i) == '-') {
        i++;
        curr = "" + s.charAt(i);
        ans += curr.toUpperCase();
      } else {
        ans += "" + s.charAt(i);
      }
    }
    return ans;
    
  }
}