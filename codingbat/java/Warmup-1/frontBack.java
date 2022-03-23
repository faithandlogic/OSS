public String frontBack(String str) {

  if(str.length() <= 1){
    return str;
  }

  String r;
  int length = str.length();

  r = str.substring(length-1, length) + str.substring(1, length-1) + str.substring(0,1);

  return r;

}
