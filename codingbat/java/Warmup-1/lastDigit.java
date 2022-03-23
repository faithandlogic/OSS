public boolean lastDigit(int a, int b) {
  int modA = a%10;
  int modB = b%10;

  if(modA == modB){
    return true;
  }
  return false;
}
