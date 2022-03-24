public boolean icyHot(int t1, int t2) {

  boolean under = false;

  if(t1<0 || t2<0){
    under = true;
  }

  boolean over = false;

  if(t1>100 || t2>100){
    over = true;
  }

  if(under && over){
    return true;
  }

  return false;
}
