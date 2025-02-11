package Other;

import java.util.Scanner;

public class wordProcessing {
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Sentence: ");
        String userinput = scan.nextLine();

        int words = 0;
        int spaces = 0;
        int vowels = 0;
        int consonants = 0;
        int numbers = 0;
        int punctuation = 0;

        for (int i = 0; i < userinput.length(); i++){
            String ch = userinput.substring(i,i+1);
             switch (ch){
                case "a":
                case "A":
                case "e":
                case "E":
                case "i":
                case "I":
                case "o":
                case "O":
                case "u":
                case "U":
                    vowels++;
                    break;
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case "0":
                    numbers++;
                    break;
                case " ":
                    spaces++;
                    break;
                case ".":
                case "!":
                case ",":
                case "?":
                    punctuation++;
            }
        }
        consonants = userinput.length() - (vowels + spaces + numbers + punctuation);
        words = spaces + 1;

        System.out.println("words: " + words);
        System.out.println("vowels: " + vowels);
        System.out.println("consonants: " + consonants);
        System.out.println("spaces: " + spaces);
        System.out.println("numbers: " + numbers);
        System.out.println("punctuation: " + punctuation);
        }
    }
