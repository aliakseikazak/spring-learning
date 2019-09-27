package by.kazak.tutorialProject;

public class Gasoline {
    private String kind;

    public Gasoline () {
    }

    public Gasoline (String kind) {
        this.kind = kind;
    }

    public String getKind () {
        return kind;
    }

    public void setKind (String kind) {
        this.kind = kind;
    }

    @Override
    public String toString () {
        return "Gasoline{" + "kind='" + kind + '\'' + '}';
    }
}
