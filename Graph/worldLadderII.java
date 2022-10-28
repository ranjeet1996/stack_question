package Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class worldLadderII {

    public static void main(String[] args) {
        
    }

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        List<List<String>> result = new ArrayList<>();

        if(wordSet.contains(endWord)) {
            Queue<List<String>> queue = new LinkedList<>();
            List<String> list = new ArrayList<>();

            wordSet.remove(beginWord);

            list.add(beginWord);
            queue.add(list);

            while(!queue.isEmpty()) {
                List<String> lastLevelWords = new ArrayList<>();

                int size = queue.size();
                for(int i = 0; i < size; i++) {
                    List<String> temp = queue.poll();

                    String lastWord = temp.get(temp.size() - 1);

                    if(lastWord.equals(endWord)) {
                        if(result.size() == 0) {
                            result.add(temp);
                        }
                        else if(result.get(0).size() == temp.size()) {
                            result.add(temp);
                        }
                    }

                    for(int j = 0; j < lastWord.length(); j++) {
                        for(char ch = 'a'; ch <= 'z'; ch++) {
                            char lastWordCharArray[] = lastWord.toCharArray();
                            lastWordCharArray[j] = ch;

                            String replacedString = new String(lastWordCharArray);

                            if(wordSet.contains(replacedString)) {
                                temp.add(replacedString);
                                List<String> newList = new ArrayList<>(temp);
                                queue.add(newList);
                                temp.remove(temp.size() - 1);
                                lastLevelWords.add(replacedString);
                            }
                        }
                    }
                }

                wordSet.removeAll(lastLevelWords);
            }
        }

        return result;
    }
    
}
