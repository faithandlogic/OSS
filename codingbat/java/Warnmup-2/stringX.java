public String stringX(String str) {
    String result = "";
    int len = str.length();
    if(len < 2){
      return str;
    }
    if(str.charAt(0) == 'x'){
        result += str.charAt(0);
      }
    for(int i = 0; i < len; i++){
      if(str.charAt(i) != 'x'){
        result += str.charAt(i);
      }
    }
    if(str.charAt(len-1) == 'x'){
        result += str.charAt(len-1);
      }
    return result;
}
  