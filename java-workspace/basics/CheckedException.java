import java.io.BufferedReader;
import java.io.FileReader;

public class CheckedException {
  public static void main(String[] args) {
    System.out.println("Read a file from my computer");
    FileReader fr = new FileReader("C:\\Users\\azareza\\Documents\\dummy.txt");
    BufferedReader br = new BufferedReader(fr);
    System.out.println(br.readLine());
  }
}