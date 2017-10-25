// Java String program..
//declar an empty string
//loop the length of the string, find the char at ith elemnt and add it twice to the newlt declared String



public String doubleChar(String str) {
 String result = "";
    for (int i = 0; i < str.length(); i++) {
        char add = str.charAt(i);
        result += "" + add + add;
    }
    return result;
}
