package DependencyInversion;

public class BackendDeveloper implements Developer{
    @Override
    public void develop() {
        writeJava();
    }

    private void writeJava() {
    }
}
