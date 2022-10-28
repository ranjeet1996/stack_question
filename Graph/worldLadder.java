package Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class worldLadder {
    class Pair {
        String word;
        int wordCount;

        Pair(String word, int wordCount) {
            this.word = word;
            this.wordCount = wordCount;
        }
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);

        if(!wordSet.contains(endWord)) {
            return 0;
        }

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(beginWord, 1));
        wordSet.remove(beginWord);

        while(!queue.isEmpty()) {
            Pair pair = queue.poll();
            String word = pair.word;
            int wordCount = pair.wordCount;

            if(word.equals(endWord)) {
                return wordCount;
            }

            for(int i = 0; i < word.length(); i++) {
                for(char ch = 'a'; ch <= 'z'; ch++) {
                    char wordCharArray[] = word.toCharArray();
                    wordCharArray[i] = ch;

                    String replacedString = new String(wordCharArray);

                    if(wordSet.contains(replacedString)) {
                        queue.add(new Pair(replacedString, wordCount + 1));
                        wordSet.remove(replacedString);
                    }
                }
            }
        }

        return 0;
    }


    public static void main(String[] args) {
        
    }


    
}
