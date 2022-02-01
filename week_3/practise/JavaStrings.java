import java.util.regex.*;


public class JavaStrings {
private static  Pattern SECRET_CODE_REGEX;

public int addTogather(String item1, String item2){
String i = removeWhiteSpace(item1);
String j =removeWhiteSpace(item2);
String k = i.concat(j);
int lenght = k.length();



return lenght;
}


public static String removeWhiteSpace(String item){
String items =item.replaceAll("\\s+$","");
 String item2 = items.replaceAll("^\\s+","");
return item2;

}
public static String idProcessing(String firstName , String lastName, String petName, Integer year){
String r = (firstName.substring(0,1) + lastName.substring(lastName.length()-1,lastName.length()) + petName.substring(0,1)+ year.toString()). toUpperCase();


return  r ;
}

public static  String secretCode(String secret){

SECRET_CODE_REGEX = Pattern.compile( "[aeiou]" , Pattern.CASE_INSENSITIVE);
Matcher m = SECRET_CODE_REGEX.matcher(secret);
String g =m.replaceAll("z").substring(0,3);
return g;
}

public static Pattern getSecretCodeRegex(){
return SECRET_CODE_REGEX;
}





















}
