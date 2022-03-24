boolean doubleX(String str) {
    int count = 0;
    if (str.length()<2){
      return false;
    }
    if (str.substring(0, 2).equals("xx")) {
            return true;
    } else if (str.substring(0,1).equals("x") && !str.substring(1,2).equals("x")){
      return false;
    }
    for (int i = 0; i < str.length() - 1; i++) {
         if (str.substring(i, i + 2).equals("xx")) {
            count++;
            if (count == 1) {
                return true;
            }
        }
    
    }
    return false;
}