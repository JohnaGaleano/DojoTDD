package codebreaker;

public class Codebreaker {
	public String validator(String secretGiven, String guessed) {
		
		if (guessed.length() != secretGiven.length()) {
			return "la longitud debe ser de " + secretGiven.length() + " digitos";
		}
		String cleanedGuessed = removeRepeatedChars(guessed);
		if (guessed.length() != cleanedGuessed.length()) {
			return "No se admiten caracteres repetidos";
		}
		String regex = "[0-9]+";
		if(!guessed.matches(regex) || !secretGiven.matches(regex)) {
			return ("solo se admiten caracteres numéricos");
		}
		String result = "";
		for(int i=0; i<guessed.length(); i++) {
			int index = secretGiven.indexOf(guessed.charAt(i));
			if(index == -1){
				continue;
			}
			if(index == i) {
				result = "X" + result;
				continue;
			}
			result = result + "_";
		}
		return result;
	}
	
	String removeRepeatedChars(String str) {
		StringBuilder sb = new StringBuilder();
		str.chars().distinct().forEach(c -> sb.append((char) c));
		return sb.toString();
	}
}
