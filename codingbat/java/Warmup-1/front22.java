public String front22(String str) {

  String end = str;

  if(str.length() >= 2){
    end = str.substring(0,2);
  }

  return end + str + end;
}
