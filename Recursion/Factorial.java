class Factorial {
  public static void main(String[] args) {
    System.out.println(countFactorialRecursive(5));
  }

  public static int countFactorialIterative(int number) {
    if (number == 0 || number == 1) {
      return number;
    }

    int result = 1;

    for (int i = 1; i <= number; i++) {
      result = result * i;
    }

    return result;
  }

  public static int countFactorialRecursive(int number) {
    if (number == 0) {
      return 1;
    }
    int res = countFactorialRecursive(number - 1);
    return res * number;
  }

}