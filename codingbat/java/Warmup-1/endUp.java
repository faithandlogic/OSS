public String endUp(String str) {

  if(str.length() < 3){
    return str.toUpperCase();
  }

  String start = str.substring(0,str.length()-3);
  String end = str.substring(str.length()-3).toUpperCase();

  return start + end;
}
