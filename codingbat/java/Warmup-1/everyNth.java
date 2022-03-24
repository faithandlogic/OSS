public String everyNth(String str, int n) {

  String fin = "";

  for(int i = 0; i< str.length(); i=i+n){
    fin = fin + str.charAt(i);
  }

  return fin;
}
