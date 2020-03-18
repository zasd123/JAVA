public class PalindromeDetector{
public static void main (String args[]){
String test = "kayak";
if(test.equals( reverse(test))){
System.out.println("true");
}else{
System.out.println("false");                              

}
}
public static String reverse(String str) {
    if ((null == str) || (str.length() <= 1)) {
        return str;
    }
    return reverse(str.substring(1)) + str.charAt(0);
}

}