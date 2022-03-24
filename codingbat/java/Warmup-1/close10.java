public int close10(int a, int b) {

  int absA =  Math.abs(a-10);
  int absB = Math.abs(b-10);



  if(absA < absB){
    return a;
  }

  if(absB < absA ){
    return b;
  }

  return 0;
}
