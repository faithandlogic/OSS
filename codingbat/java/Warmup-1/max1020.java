public int max1020(int a, int b) {
  //recycled code from mixString function
  if((a>20 || a<10) && (b > 20 || b< 10)){
    return 0;
  }

  if(a>20 || a<10){
    return b;
  }

  if(b>20 || b< 10){
    return a;
  }



  if(a > b  && a>=10 && a<= 20){
    return a;
  }

  if(b > a && b>=10 && b<= 20){
    return b;
  }

  return a;
}
