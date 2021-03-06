//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

public String helloName(String name) {
    return "Hello " + name + "!";
    // StringBuilder sb = new StringBuilder();
    // sb.append("Hello ");
    // sb.append(name);
    // sb.append("!");
    // return sb.toString();
  }

//Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

public String makeAbba(String a, String b) {
    return a + b + b + a;
  }

//The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". 
//Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

public String makeTags(String tag, String word) {
    StringBuilder sb = new StringBuilder();
    sb.append("<");
    sb.append(tag);
    sb.append(">");
    sb.append(word);
    sb.append("</");
    sb.append(tag);
    sb.append(">");
    return sb.toString();
  }
  
//Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". 
//Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

public String makeOutWord(String out, String word) {
    int n = out.length();
    return out.substring(0,n/2) + word + out.substring(n/2);
  }


//Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.

public String extraEnd(String str) {
    if(str.length()<2) return str;
    String s = str.substring(str.length()-2);
    return s+s+s;
  }

  //Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, 
  //return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.

  public String firstTwo(String str) {
    if(str.length()<=2) return str;
    return str.substring(0,2);
  }

  //Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

  public String firstHalf(String str) {
    return str.substring(0,str.length()/2);
  }
  
//Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.

  public String withoutEnd(String str) {
    if(str.length()==2) return "";
    return str.substring(1,str.length()-1);
  }

  //Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string 
  //on the inside. The strings will not be the same length, but they may be empty (length 0).

  public String comboString(String a, String b) {
  
  }

  //Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

  public String nonStart(String a, String b) {
    return a.substring(1) + b.substring(1);
  }

  //Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.

  public String left2(String str) {
    if(str.length()<=2) return str;
    return str.substring(2) + str.substring(0,2);
  }

  //Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.

  public String right2(String str) {
    if(str.length()<=2) return str;
    return str.substring(str.length()-2) + str.substring(0,str.length()-2);
  }

  //Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.

  public String theEnd(String str, boolean front) {
    if(str.length()<=1) return str;
    if(front)
      return str.substring(0,1);
    return str.substring(str.length()-1);
  }

  //Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.

  public String withouEnd2(String str) {
    if(str.length()<=2) return "";
    return str.substring(1,str.length()-1);
  }

  //Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.

  public String middleTwo(String str) {
    int n = str.length();
    if(n%2 == 0)
      return str.substring(n/2-1,n/2+1);
    return str.substring(n/2-1,n/2);
  }

  //Given a string, return true if it ends in "ly".

  public boolean endsLy(String str) {
    if(str.length()>=2 && str.substring(str.length()-2).equals("ly"))
      return true;
    return false;
  }

  //Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.

  public String nTwice(String str, int n) {
    if(str.length()<n) return str;
    return str.substring(0,n) + str.substring(str.length()-n);
  }
  
//Given a string and an index, return a string length 2 starting at the given index. 
//If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.

public String twoChar(String str, int index) {
  if(index<0 || index+2> str.length()) return str.substring(0,2);
  return str.substring(index,index+2);
}

//Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.

public String middleThree(String str) {
  int n = (str.length()-3)/2;
  return str.substring(n,str.length()-n);
}

//Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". 
//The string may be any length, including 0. Note: use .equals() to compare 2 strings.

public boolean hasBad(String str) {
  if(str.indexOf("bad") == 0 || str.indexOf("bad") == 1)
    return true;
  return false;
}

//Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.

public String atFirst(String str) {
  if(str.length() == 0) return "@@";
  if(str.length() == 1) return str+"@";
  return str.substring(0,2);
}

//Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". 
//If either string is length 0, use '@' for its missing char.

public String lastChars(String a, String b) {
  StringBuilder sb = new StringBuilder();
  if(a.length()>0) sb.append(a.charAt(0));
  else sb.append("@");
  if(b.length()>0) sb.append(b.charAt(b.length()-1));
  else sb.append("@");
  return sb.toString();
}
