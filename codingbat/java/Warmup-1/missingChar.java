public String missingChar(String str, int n) {
  String newString = "";
  newString = str.substring(0, n)+ str.substring(n+1, str.length());


  return newString;
}
