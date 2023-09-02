import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StudentList {

    public static void main(String[] args) {
        String chk = "^[ㄱ-ㅎ|ㅏ-ㅣ|가-힣\\s]*$";
        Scanner sc = new Scanner(System.in);
        ArrayList<String> suName = new ArrayList();
        System.out.println("학생의 이름을 입력하고 엔터를 누르세요. \n(한글로만 입력해야 합니다.)");

        String name;
        do {
            name = sc.nextLine();
            if (!name.matches(chk) && !name.equals("print")) {
                System.out.println("학생의 이름은 한글로만 입력해야 합니다.");
            } else {
                suName.add(name);
            }
        } while(!name.equals("print"));

        suName.remove("print");
        suName.sort(Comparator.naturalOrder());
        System.out.println("[학생 명단(가나다순)]\n" + suName + "\n");
    }
}
