public String backAround(String str) {
  String c = str.substring(str.length()-1, str.length());

  return c + str + c;
}
