package pjbruer.kattistraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class KattisTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(KattisTrainingApplication.class, args);

		Scanner sc = new Scanner(System.in);
		final String sentence = sc.nextLine().toLowerCase();

		String result = containsDuplicateWords(sentence);
		System.out.println(result);
	}
	public static String containsDuplicateWords(final String sentence){
		//Splitting string into list of words
		List<String> initialWords = Arrays.asList(sentence.split(" "));

		//Converting list into set which removes duplicates
		Set<String> reducedWords = new HashSet<>(initialWords);
		
		//Returns no if the list of words is bigger than the set of words
		return initialWords.size() > reducedWords.size() ? "no" : "yes";
	}
}
