package sageniuz.jbc.a.superfluous;

public class Supply implements Comparable<Supply> {

    private String name;

    public Supply(String name) {
        this.name = name;
    }

    public boolean isContaminated() {
        return false;
    }

    @Override
    public int compareTo(Supply o) {
        return name.compareTo(String.valueOf(o));
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
