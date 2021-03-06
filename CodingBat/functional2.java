//Given a list of integers, return a list of the integers, omitting any that are less than 0.
/* In Place */

public List<Integer> noNeg(List<Integer> nums) {
    nums.removeIf(num -> num<0);
    return nums;
  }
  
    // public List<Integer> noNeg(List<Integer> nums) {
    //     List<Integer> list = new ArrayList<>();
    //     for(int num : nums)
    //       if(num>=0) list.add(num);
    //     return list;
    //   }

//Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)

public List<Integer> no9(List<Integer> nums) {
    nums.removeIf((num -> num%10 == 9));
    return nums;
    }

//Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.

public List<Integer> noTeen(List<Integer> nums) {
    nums.removeIf(num -> num>=13 && num<=19);
    return nums;
  }
  
//Given a list of strings, return a list of the strings, omitting any string that contains a "z".

public List<String> noZ(List<String> strings) {
    strings.removeIf(s -> s.indexOf("z") != -1);
    return strings;
  }

//Given a list of strings, return a list of the strings, omitting any string length 4 or more.

public List<String> noLong(List<String> strings) {
    strings.removeIf(s -> s.length() >= 4);
    return strings;
  }

//Given a list of strings, return a list of the strings, omitting any string length 3 or 4.

public List<String> no34(List<String> strings) {
    strings.removeIf(s -> s.length() == 3 || s.length() == 4);
    return strings;
  }

//Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.

public List<String> noYY(List<String> strings) {
    strings.replaceAll(s -> s+"y");
    strings.removeIf(s -> s.contains("yy"));
    return strings;
  }

//Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.

