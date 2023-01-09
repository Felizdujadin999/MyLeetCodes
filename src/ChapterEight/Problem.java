package ChapterEight;

public class Problem {
    private String name;
    private ProblemType type;
    private boolean isSolved;

    public Problem(String name, ProblemType type, boolean isSolved) {
        this.name = name;
        this.type = type;
        this.isSolved = isSolved;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProblemType getType() {
        return type;
    }

    public void setType(ProblemType type) {
        this.type = type;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public void setSolved(boolean solved) {
        isSolved = solved;
    }
}
