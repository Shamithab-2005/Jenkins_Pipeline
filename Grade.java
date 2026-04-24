public class Grade {
  public static void main(String[] args) {

    // Sample marks (you can change these)
    double[] marks = { 85, 90, 78, 88, 92 };

    double sum = 0;

    for (int i = 0; i < marks.length; i++) {
      sum += marks[i];
    }

    double avg = sum / marks.length;

    char grade = (avg >= 90) ? 'A' : (avg >= 80) ? 'B' : (avg >= 70) ? 'C' : (avg >= 60) ? 'D' : 'F';

    System.out.println("Average: " + avg);
    System.out.println("Grade: " + grade);
  }
}
