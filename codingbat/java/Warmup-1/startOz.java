public String startOz(String str) {


  String fin = "";

  if(str.length()>0 && str.charAt(0) == 'o'){
    fin = "o";
  }

  if(str.length() >1 && str.charAt(1) == 'z'){
    fin = fin+"z";
  }

  return fin;
}
