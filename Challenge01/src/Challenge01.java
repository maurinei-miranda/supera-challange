import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Challenge01 {
  public static void main(String[] args) {
    int rows;
    List<Integer> numbersToBeSorted = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Type number of rows: ");
    rows = scanner.nextInt();

    for (int i = 0; i < rows; i++) {
      System.out.println("Type next value to be ordered: ");
      numbersToBeSorted.add(scanner.nextInt());
    }

    List<Integer> sortedList = sortEvenAndOddNumbers(numbersToBeSorted);
    for (Integer number : sortedList) {
      System.out.println(number);
    }
  }


  public static List<Integer> sortEvenAndOddNumbers(List<Integer> integerList) {
    List<Integer> evenNumbers = new ArrayList<>(integerList.stream().filter(integer -> integer % 2 == 0).toList());
    List<Integer> oddNumbers = new ArrayList<>(integerList.stream().filter(integer -> integer % 2 != 0).toList());
    List<Integer> result = new ArrayList<>();
    Collections.sort(evenNumbers);
    Collections.sort(oddNumbers, Collections.reverseOrder());
    result.addAll(evenNumbers);
    result.addAll(oddNumbers);

    return result;
  }
}
