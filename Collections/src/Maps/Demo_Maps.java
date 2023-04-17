package Maps;

public class Demo_Maps {
    public static void main(String[] args) {
//        String str = "Hallo Welt";
//
//        System.out.println(map);
//        map.put("Hansi"); map.get("Hansi")+ 1));
//        System.out.println(map);
//
//        String str = "Hallo Welt";
//        String[] arr = str.split(" ");
//        System.out.println(Arrays.toString(arr));

        String str2 = "Hallo Welt der die das Hallo, Hallo und vieles mehr";
        WordCount wordCount = new WordCount(str2);
        wordCount.convertTextToMap();
        System.out.println(wordCount.getWordCount());


    }
}
