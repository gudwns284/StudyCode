package newBook;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library(Arrays.asList(new Book("클린코드(Clean Code)"), new Book("객체지향의 사실과 오해"), new Book("테스트 주도 개발(TDD)")));
        int cho = 0;
        String rentalYn = " - 대여 가능";

        while(true) {
            System.out.println("대여할 책의 번호를 입력하세요.");

            for(int i = 0; i < library.getBooks().size(); ++i) {
                if (library.getBooks().get(i).isBorrowed()) {
                    rentalYn = "- 대여 중";
                } else if (!library.getBooks().get(i).isBorrowed()) {
                    rentalYn = "- 대여 가능";
                }

                System.out.println(library.getBooks().get(i).getName() + rentalYn);
            }

             cho = sc.nextInt();
            if (library.getBooks().get(cho - 1).isBorrowed()) {
                System.out.println("대여 중인 책은 대여할 수 없습니다.");
            }

            switch (cho) {
                case 1:
                    if (!library.getBooks().get(0).isBorrowed()) {
                        (library.getBooks().get(0)).setBorrowed(true);
                        System.out.println("정상적으로 대여가 완료되었습니다.");
                    }
                    break;
                case 2:
                    if (!library.getBooks().get(1).isBorrowed()) {
                        (library.getBooks().get(1)).setBorrowed(true);
                        System.out.println("정상적으로 대여가 완료되었습니다.");
                    }
                    break;
                case 3:
                    if (!library.getBooks().get(2).isBorrowed()) {
                        (library.getBooks().get(2)).setBorrowed(true);
                        System.out.println("정상적으로 대여가 완료되었습니다.");
                    }
            }
        }
    }
}