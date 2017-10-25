//as the code suggest, if key "a", has a value, set that value to key "b". 
//so, create a temporary string and get the value of "a".Put the value of a as empty and for the value of b as the temp declared.




public Map<String, String> mapBully(Map<String, String> map) {
  if(map.containsKey("a")){

    String temp = map.get("a");
    map.put("a","");
    map.put("b",temp);
  }
  return map;
  
}
