package reading;

import java.util.Scanner;

public class PigLatin{
	
public static void main(String[] args) {
	System.out.println("PIGLATINIZER 2000");
	System.out.println("Please give me a phrase to latinize the pig out of it!");
	System.out.print("> ");
	Scanner s = new Scanner(System.in);
	try{
		String[] ln = s.nextLine().split(" ");
		String result = pigLatinize(ln);
		System.out.println("PIG says: "+result);
	}
	finally{
		s.close();
	}
}
public static String pigLatinize (String[] ln) {
		String result = "";
		for (String str : ln) {
			// str.equals(..) ensures no empty string is passed to pigLatinize
			result+=str.equals("")?"":pigLatinize(str)+" ";
		}
		return result.trim();
}

public static String pigLatinize (String str){
	// step 1 capitalisation
	String[] components = stripSymbols(str);
	str = components[1];
	boolean wasCapital = Character.isUpperCase(str.charAt(0)); 
	str = str.toLowerCase();
	if (startsWithVowel(str)){
		 str = str+"way";
		}
	else {
		str = str.replaceAll("^([^aeiou]*)(.+)", "$2$1ay");
		}
	str = wasCapital ? toTitleCase(str): str;
	return components[0]+str+components[2];
}

public static boolean startsWithVowel(String str) {
	return isVowel(str.charAt(0));
}
public static String toTitleCase(String str) {
	char c = str.charAt(0);
	char r = Character.toTitleCase(c);
	return str.replaceFirst(""+c, ""+r);
}
public static boolean isVowel(char c) {
	return "aeiou".contains(""+Character.toLowerCase(c));
}
public static String[] stripSymbols(String str) {
	String[] result = {"", "", ""};
	int i=0;
	for (char c : str.toCharArray()) {
		if (i==0 &&  Character.isAlphabetic(c)) i++;
		if (i==1 && !Character.isAlphabetic(c)) i++;
		if (i==2 &&  Character.isAlphabetic(c)){ // for cases like "can't"
			i--;
			result[i]+=result[i+1];
			result[i+1]="";
		}
		result[i]+=c;
	}
	System.out.println("stripSymbols: "+result[0]+", "+result[1]+", "+result[2]);
	return result;
}

}
