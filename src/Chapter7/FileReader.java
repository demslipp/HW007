package Chapter7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FileReader{
    public static void main(String[] args) throws FileNotFoundException{
        String path="D:\untitled\src\com\company\database.txt";
        File file=new File(path);

        Scanner scanner=new Scanner(file);
        Map<String, Integer> map=new TreeMap<>();
        while(scanner.hasNext()) {
            String word=scanner.next();
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            } else {
                map.put(word, 1);
            }
        }
        scanner.close();
        System.out.println(map);
    }
}
