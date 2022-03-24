public String stringSplosion(String str) {
    String s = "";
    for(int i = 0; i <= str.length();i++){
      s += str.substring(0,i);
    }
    return s;
}
  