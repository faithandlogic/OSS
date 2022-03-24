public boolean stringE(String str) {
  int c = 0;

  for(int i = 0; i< str.length(); i++){
    if(str.charAt(i) == 'e'){
      c++;
    }
  }

  if(c>=1 && c<=3){
    return true;
  }

  return false;
}
