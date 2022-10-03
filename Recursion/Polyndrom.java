public class Polyndrom {

  public static void main(String[] args) {
    String str = "kk";
    System.out.println(isPolyndrom(str));
  }

  public static boolean isPolyndrom(String str) {
    if (str.length() == 1 || str.length() == 0) {
      return true;
    } else {
      if (str.charAt(0) == str.charAt(str.length() - 1)) {
        return isPolyndrom(str.substring(1, str.length() - 1));
      } else {
        return false;
      }
    }
  }
  }
