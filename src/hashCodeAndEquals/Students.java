package hashCodeAndEquals;

import java.util.HashSet;
import java.util.Objects;

class Students {
    int id;
    String name;

    Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Students s = (Students) obj;
        return this.id == s.id && this.name.equals(s.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);         // generates same hash for equal objects
    }



    public static void main(String[] args) {
        Students s1 = new Students(1, "Rahul");
        Students s2 = new Students(1, "Rahul");

        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true ✅

        HashSet<Students> set = new HashSet<>();
        set.add(s1);
        set.add(s2);

        System.out.println("HashSet size: " + set.size()); // 1 ✅ (correct)
    }
}

