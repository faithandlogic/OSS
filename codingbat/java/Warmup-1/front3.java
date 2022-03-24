public String front3(String str) {
  if(str.length() <= 3){

    String char3 = str.substring(0,str.length());
    return char3 + char3 + char3;
  }

  String char3 = str.substring(0,3);

  return char3 + char3 + char3;
}
