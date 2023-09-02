import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class RunPlayer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> playerNumber = new ArrayList();
        ArrayList<Double> playerRecords = new ArrayList();

        while(true) {
            Double dbe = 1000000.0;
            String runNum = "";
            System.out.println("선수의 번호를 입력하세요");
            String runMainNum = sc.next();
            playerNumber.add(runMainNum);
            if (runMainNum.equals("print")) {
                playerNumber.remove("print");

                for(int i = 0; i < playerRecords.size(); ++i) {
                    System.out.println(playerRecords.get(i) + "\n");
                    if ((Double)playerRecords.get(i) < dbe) {
                        dbe = (Double)playerRecords.get(i);
                        runNum = (String)playerNumber.get(i);
                    }
                }

                System.out.println(playerNumber.get(playerRecords.indexOf(Collections.min(playerRecords))) + "번 /" + String.format("%.2f", Collections.min(playerRecords)));
                return;
            }

            System.out.println("이 선수의 100m 달리기 기록이 몇 초인지 입력하세요.");
            double runRecords = sc.nextDouble();
            playerRecords.add(runRecords);
        }
    }
}
