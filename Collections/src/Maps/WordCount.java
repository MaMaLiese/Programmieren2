package Maps;

import java.util.HashMap;

public class WordCount {
    private String text;
    private HashMap<String, Integer> wordCount = new HashMap<>();




    public WordCount(String text) {
        this.text = text;
    }

    public HashMap<String, Integer> getWordCount() {
        return wordCount;
    }

    public void convertTextToMap() {

            removePunctuation();

        //text.split

        String[]splitText=text.split(" ");
        for (int i = 0; i < splitText.length; i++) {
            if (wordCount.get(splitText[i]) == null) {
                wordCount.put(splitText[i], 1);
            } else {

                wordCount.put(splitText[i], wordCount.get(splitText[i]) + 1);
            }

        }

    }
    private void removePunctuation() {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' || Character.isLetter(text.charAt(i))) {
                newText += text.charAt(i);
            }

        }
        this.text = newText;
    }
}
