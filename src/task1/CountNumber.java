package task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountNumber {
    public static void main(String[] args)throws IOException {
        File file = new File("numbers.txt");
        BufferedReader bfr = new BufferedReader(new FileReader(file));

        String line = "";
        List<Integer>numbery = new ArrayList<>();
        while((line=bfr.readLine())!=null){
            String []values = line.split("\n");
            for (String value : values) {
                numbery.add(Integer.parseInt(value));
            }
        }
        Collections.sort(numbery);
        System.out.println(numbery+" ");
        int freq = 0;
        for (int i = 0; i < numbery.size(); i++) {
            if(i<10) {
                freq = Collections.frequency(numbery, i);
                System.out.println("Liczba: "+i+" występuje "+ freq+" razy.");
            }
        }
    }
}
