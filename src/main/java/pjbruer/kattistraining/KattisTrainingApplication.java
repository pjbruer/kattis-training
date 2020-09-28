package pjbruer.kattistraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class KattisTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(KattisTrainingApplication.class, args);

		final String text = "THE RAIN IN SPAIN";
		final String text2 = "IN THE RAIN AND THE SNOW";
		final String text3 = "THE RAIN IN SPAIN IN THE PLAIN";

		Scanner sc = new Scanner(System.in);
		//final String sentence = sc.nextLine();

		containDuplicateWords(text.toLowerCase());
		containDuplicateWords(text2.toLowerCase());
		containDuplicateWords(text3.toLowerCase());
	}
	public static void containDuplicateWords(final String sentence){
		System.out.println(sentence);
		List<String> initialWords = Arrays.asList(sentence.split(" "));
		Set<String> reducedWords = new HashSet<>(initialWords);
		System.out.println("LIST SIZE " + initialWords.size());
		System.out.println("SET SIZE " + reducedWords.size());
		System.out.println("- Result -");
		System.out.println(initialWords.size() > reducedWords.size());
	}
}
