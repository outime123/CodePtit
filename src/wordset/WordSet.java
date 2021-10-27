package wordset;

import java.util.Locale;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> set = new TreeSet<>();

    public WordSet() {
    }

    public WordSet(String s) {
        StringTokenizer stringTokenizer = new StringTokenizer(s.toLowerCase());
        while (stringTokenizer.hasMoreTokens()) set.add(stringTokenizer.nextToken());
    }

    @Override
    public String toString() {
        String kq = "";
        for(String s : set){
            kq = kq+s+" ";
        }
        kq.trim();
        return kq;
    }

    public WordSet union(WordSet s2) {
        WordSet u = new WordSet();
        u.set.addAll(set);
        u.set.addAll(s2.set);
        return u;
    }

    public WordSet intersection(WordSet s2) {
        WordSet inter = new WordSet();
        inter.set.addAll(set);
        inter.set.retainAll(s2.set);
        return inter;
    }
}
