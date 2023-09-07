package reflection_problem;

import java.util.ArrayList;
import java.util.List;

public class Person extends Problem {
    private List<Problems> problems = new ArrayList<>();
    public Person(String name, Problems type){
        super(name, type);
    }

    public void addProblem(Problems problem){
        problems.add(problem);
    }

    public void solveProblems(Problems type){

    }
}
