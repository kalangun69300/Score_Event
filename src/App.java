import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        MySource s = new MySource();
        MyReceiver r1 = new MyReceiver();
        MyReceiver r2 = new MyReceiver();
        s.addMyListener(r1);
        s.addMyListener(r2);

        String score = "";
        do{
            System.out.print("Enter score: ");
            score = sc.nextLine();
            if(score.isEmpty()) break;
            s.setScore(score);
        } while(true);
        sc.close();
    }
}
