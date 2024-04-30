package files.ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class WordCounter {
    public static void main(String[] args) {
        File file = new File("input.txt");
        try {

            BufferedReader reader= new BufferedReader(new FileReader(file));
            String[]words=new String[1000];
            int []counts=new int[1000];
            int totalWords=0;
            String line;
            while ((line=reader.readLine())!=null){
                String[] lineWords=line.split("\\s+");

                for(String word:lineWords){
                    word=word.toLowerCase();
                    int index=indexOfWord(words,word,totalWords);
                    if(index== -1){
                        words[totalWords]=word;
                        counts[totalWords]=1;
                        totalWords++;
                    }else{
                        counts[index]++;
                    }
                }

            }
            reader.close();
            sortDescending(words,counts,totalWords);
            System.out.println("Word Count");
            for (int i=0;i<totalWords;i++){
                System.out.println(words[i]+":" +counts[i]);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    private static int indexOfWord(String[] words, String word, int totalWords) {
        for (int i = 0; i < totalWords; i++) {
            if (words[i] != null && words[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }

    private static void sortDescending(String[] words, int[] counts, int totalWords) {
        for (int i = 0; i < totalWords; i++) {
            for (int j = i + 1; j < totalWords; j++) {
                if (counts[i] < counts[j]) {
                    //gjej max te arrayt count
                    int tempCount = counts[i];
                    counts[i] = counts[j];
                    counts[j] = tempCount;

                    //gjej max te array word
                    String tempWord = words[i];
                    words[i] = words[j];
                    words[j] = tempWord;
                }
            }
        }
    }
}
