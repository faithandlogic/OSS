public String altPairs(String str) {
    String result = "";
    for (int i=0; i<str.length(); i += 4) {
      // Append the chars between i and i+2
      int end = i + 2;
      if (end > str.length()) {
        end = str.length();
      }
      result = result + str.substring(i, end);
    }
    
    return result;
  }
  