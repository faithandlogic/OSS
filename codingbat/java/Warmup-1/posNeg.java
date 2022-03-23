public boolean posNeg(int a, int b, boolean negative) {
    if (negative && a < 0 && b <0 ){
        return true;
    }
    int y = 0;

    if(a< 0 ){
      y++;
    }
    if(b<0 ){
      y++;
    }
    if(y == 1 && negative == false){
      return true;
    }
    if(negative == true && y == 2){
      return true;
    }
    return false;
}