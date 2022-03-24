public int stringMatch(String a, String b) {
    int count = 0;
    if(a.length() < 2 || b.length() < 2){
      return count;
    } 
    String len = a;
    if(a.length() > b.length()){
      len = b;
    }
    for(int i = 0;i < len.length()-1;i++){
      if(a.substring(i,i+2).equals(b.substring(i,i+2))){
        count++;
      }
    }
    return count;
}
  