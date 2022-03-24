public boolean loneTeen(int a, int b) {
  int count = 0;

  if(a >= 13 && a <= 19){
    count++;
  }

  if(b >= 13 && b <= 19){
    count++;
  }

  if(count == 1){
    return true;
  }

  return false;
}
