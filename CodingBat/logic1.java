//When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. 
//Unless it is the weekend, in which case there is no upper bound on the number of cigars. 
//Return true if the party with the given values is successful, or false otherwise.

public boolean cigarParty(int cigars, boolean isWeekend) {
    if(isWeekend && cigars>40)
        return true;
    return cigars>=40 && cigars<=60;
  }

//You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. 
//The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes). 
//With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).

public int dateFashion(int you, int date) {
  if((you>=8  || date>=8) && (you>2 && date>2))
    return 2;
  if(you<=2 || date<=2)
    return 0;
  return 1;
}
//The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive). Unless it is summer, 
//then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.

public boolean squirrelPlay(int temp, boolean isSummer) {
  int low = 60 ,high = 90;
  if(isSummer)
    high = 100;
  return (low<=temp && temp<=high);
}

//You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. 
//If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.

public int caughtSpeeding(int speed, boolean isBirthday) {
  if(isBirthday)
    speed = speed-5;
  if(speed<= 60)
    return 0;
  if(speed>=61 && speed <= 80)
    return 1;
  if(speed>= 81)
    return 2;
  return -1;    
}

//Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.

public int sortaSum(int a, int b) {
  int sum = a+b;
  if(sum>= 10 && sum<=19)
    return 20;
  return sum;
}

//Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. 
//Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".

public String alarmClock(int day, boolean vacation) {
  String alarm = "7:00";
  if(day<1 || day>5)
    alarm = "10:00";
  if(vacation)
    if(day<1 || day>5){
      alarm = "off";
    }else{
      alarm = "10:00";
    }
  return alarm;
}

//The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. 
//Note: the function Math.abs(num) computes the absolute value of a number.

public boolean love6(int a, int b) {
  return (a==6 || b==6) || (a+b == 6 || Math.abs(a-b) == 6);
}

//Given a number n, return true if n is in the range 1..10, inclusive. 
//Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.

public boolean in1To10(int n, boolean outsideMode) {
  if(n>=1 && n<=10)
    return true;
  return(outsideMode && (n<=1 || n>=10));
}

//We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. 
//Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod

public boolean specialEleven(int n) {
  return n%11 == 0 || n%11 == 1;
}

//Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also

public boolean more20(int n) {
  return n%20 == 1 || n%20 == 2;
}

//Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator

public boolean old35(int n) {
  if(n%3 ==0 && n%5 == 0)
    return false;
  return n%3 ==0 || n%5 == 0;
}

//Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false.

public boolean less20(int n) {
  return (n+1)%20 == 0 || (n+2)%20 == 0;
}

//Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.

public boolean nearTen(int num) {
  return num%10 <=2 || num%10 >= 8;
}

//Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.

public int teenSum(int a, int b) {
  if( (a >=13 && a<=19) || (b >=13 && b<=19))
    return 19;
  return a+b;
}

//Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.

public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if((isMorning && !isMom) || isAsleep)
    return false;
  return true;
}

//We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. 
//However, if either tea or candy is at least double the amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always bad (0).

public int teaParty(int tea, int candy) {
  if(tea < 5 || candy < 5)
    return 0;
  if(tea>=2*candy || candy>=2*tea)
    return 2;
  if(tea>= 5 && candy >=5)
    return 1;
  return -1;
}

//Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.

public String fizzString(String str) {
  if(str.startsWith("f") && str.endsWith("b"))
    return "FizzBuzz";
  else if(str.startsWith("f"))
    return "Fizz";
  else if(str.endsWith("b"))
    return "Buzz";
  return str;
}

//Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz". 
//Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3. What will the remainder be when one number divides evenly into another?

public String fizzString2(int n) {
  String result; 
  if(n%3 == 0 && n%5 == 0)
    result = "FizzBuzz";
  else if(n%3 == 0)
    result = "Fizz";
  else if(n%5 == 0)
    result = "Buzz";
  else
    result = Integer.toString(n);
  return result  + "!";
}

//Given three ints, a b c, return true if it is possible to add two of the ints to get the third.

public boolean twoAsOne(int a, int b, int c) {
  if( a + b==c || a+c == b || c+b == a)
    return true;
  return false;
}

//Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be greater than a.

public boolean inOrder(int a, int b, int c, boolean bOk) {
  if(bOk && c>b) return true;
  if(b>a && c>b) return true;
  return false;
}

//Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.

public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  if(equalOk)
		return (a <= b && b <= c);
	return (a < b && b < c);
}
