public String frontTimes(String str, int n) {
    int len = 3;
    if(str.length()<3){
      len = str.length();
    } 
    String front = str.substring(0,len);
    String ans = "";
    for ( int i = 0; i<n;i++){
      ans += front;
    }
    return ans;
}
  