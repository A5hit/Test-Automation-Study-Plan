/*
Build a program that uses Java Streams to:

- Filter students who passed (marks > 40)

- Calculate average score of class

- List top 3 scorers

- Group students by grade (A, B, C…)

 */

import java.util.*;
import java.util.stream.Collectors;

class Candidate {
    String name;
    int marks;

    public Candidate(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + "(" + marks + ")";
    }
}


public class StudentReportGenerator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Candidate> candidates = new ArrayList<>();

        System.out.println("Enter candidate data and type done when finished");

        while (true) {
            System.out.print("Enter candidate name: ");
            String name = input.nextLine();
            if (name.equalsIgnoreCase("done")) break;
            System.out.print("Enter marks for candidate "+name+" "+":");
            int marks;
            try{
                marks = Integer.parseInt(input.nextLine());
            }
            catch (NumberFormatException e){
                System.out.println("Invalid number please try again");
                continue;
            }
            candidates.add(new Candidate(name,marks));
        }

        if (candidates.isEmpty()) {
            System.out.println("No candidates found");
        }

        System.out.print("\n✅ Passed candidates :"+getStudentPassed(candidates));

        System.out.print("\n📊 Average Score: "+ getAverageScore(candidates));

        System.out.print("\n🏅 Top 3 Scorers:"+getTopScorers(candidates,3));

        System.out.print("\n📘 Grouped by Grades: "+groupByGrades(candidates));


    }

    public static List<Candidate> getStudentPassed(List<Candidate> candidates) {
        return candidates
                .stream()
                .filter(c->c.marks>=40)
                .collect(
                        Collectors.toList()
                );
    }

    public static double getAverageScore(List<Candidate> candidates) {
        return candidates.stream().mapToInt(c->c.marks).average().orElse(0.0);
    }

    public static List<Candidate> getTopScorers(List<Candidate> candidates,int topN) {
        return candidates.stream().sorted((s1,s2)-> Integer.compare(s1.marks,s2.marks)).limit(topN).collect(Collectors.toList());
    }

    public static Map<String, List<Candidate>> groupByGrades(List<Candidate> candidates) {
        return candidates.stream().collect(Collectors.groupingBy(s->{
            if(s.marks>=80) return "A";
            else if(s.marks>=60) return "B";
            else if(s.marks>=40) return "C";
            else return "D";
        }));

    }


}
