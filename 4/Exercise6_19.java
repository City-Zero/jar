public class Exercise6_19 {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);

    System.out.print("Enter the number of students: ");
    int numberOfStudents = input.nextInt();

    String[] names = new String[numberOfStudents];
    double[] scores = new double[numberOfStudents];

    for (int i = 0; i < scores.length; i++) {
      System.out.print("Enter a student name: ");
      names[i] = input.next();
      System.out.print("Enter a student score: ");
      scores[i] = input.nextDouble();
    }

    for (int i = scores.length - 1; i >= 1; i--) {
      double currentMax = scores[0];
      int currentMaxIndex = 0;

      for (int j = 1; j <= i; j++) {
        if (currentMax < scores[j]) {
          currentMax = scores[j];
          currentMaxIndex = j;
        }
      }

      if (currentMaxIndex != i) {
        scores[currentMaxIndex] = scores[i];
        scores[i] = currentMax;
        String temp = names[currentMaxIndex];
        names[currentMaxIndex] = names[i];
        names[i] = temp;
      }
    }

    for (int i = scores.length - 1; i >= 0; i--) {
      System.out.println(names[i] + "\t" + scores[i]);
    }
  }
}

