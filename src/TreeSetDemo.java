import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

        public static void main(String[] args) {

            //HashSet<String> set = new HashSet();
            TreeSet<String> set = new TreeSet(); // Data is unordered but alphabetically sorted
            // Here data is not added as indexing approach.
            // Here we got hashCodes for elements which being added
            set.add("said");
            set.add("said");
            set.add("hicham");
            set.add("mohamed");
            set.add("Jim");

            // 1. Data is unique, no redundancy
            // 2. Data is unordered in output due to hashing
            System.out.println("set id "+set);

            Iterator<String> itr = set.iterator();

            while (itr.hasNext()){
                String str = itr.next();
                System.out.println(str);

            }

            if (set.contains("said")){
                System.out.println("Said is in the set"+set);
            }

            // Remove element Jim

            set.remove("Jim");
            System.out.println("set after removing Jim "+set);

            // Set size
            System.out.println("Set size is "+ set.size());
        }
    }

