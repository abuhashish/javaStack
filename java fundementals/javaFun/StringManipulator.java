class StringManipulator{
    public String trimAndConcat(String string1 ,String string2){
        String newstr;
        string1=string1.trim();
        string2=string2.trim();
        newstr = string1.concat(string2);
        return newstr;
    }
    public int getIndexOrNull(String mystr, char mychar){
        int x=mystr.indexOf(mychar);
        return x;
    }
    public int getIndexOrNull(String word, String substring){
        int x = word.indexOf(substring);
        return x;
    }   
    public String concatSubstring(String str1, int int1, int int2, String str2) {
        String str3 = str1.substring(int1, int2);
        String x = str3 + str2;
        return x;
}
}