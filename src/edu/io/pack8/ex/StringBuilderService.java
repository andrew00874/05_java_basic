package edu.io.pack8.ex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StringBuilderService {

    public void saveBooks() {
        Path book = Path.of("books", "book_list.txt");
        StringBuilder books = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String title = "";
        try {
                Files.createDirectories(book.getParent());
            while(true) {
                System.out.println("도서 정보를 입력하세요(완료를 입력하면 저장됩니다)");
                System.out.print("제목 :");
                title = sc.nextLine();
                if (title.equals("완료")) {
                    break;
                }
                books.append("제목 : ").append(title);
                System.out.print("저자 :");
                books.append(", 저자 : ").append(sc.nextLine());
                System.out.print("출판년도 :");
                books.append(", 출판년도 : ").append(sc.nextLine());
                books.append("\n");
            }
            sc.close();
            Files.writeString(book, books.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void manageGrades() {
        String today = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_"));
        Path grade = Path.of("grades", today + "성적표.txt");
        StringBuilder gradeData = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        while(true) {
            String name = "";
            double score = 0;
            double sum = 0;
            System.out.println("학생 성적을 입력하세요(종료를 입력하면 저장됩니다)");
            System.out.print("이름 : ");
            name = sc.nextLine();
            if (name.equals("종료")){
                break;
            }
            gradeData.append("이름 : ").append(name).append("\n");
            System.out.print("국어 : ");
            score = sc.nextDouble();
            sum += score;
            gradeData.append("국어 : ").append(score).append("\n");
            System.out.print("영어 : ");
            score = sc.nextDouble();
            sum += score;
            gradeData.append("영어 : ").append(score).append("\n");
            System.out.print("수학 : ");
            score = sc.nextDouble();
            sum += score;
            gradeData.append("수학 : ").append(score).append("\n");
            gradeData.append("평균 : " + (int)(sum / 3) + "점\n");
            gradeData.append("\n");
            sc.nextLine();
        }
        sc.close();
        try {
            Files.createDirectories(grade.getParent());
            Files.writeString(grade, gradeData.toString());
            System.out.println("오늘 성적표가 작성되었습니다." + grade.getFileName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void recordCount() {
        StringBuilder sb = new StringBuilder();
        Path accountFile = Path.of("household", "account_book.txt");
        String timestamp = getCurrentTime();
        Scanner sc = new Scanner(System.in);
        System.out.println("가계부 내역을 입력하세요 (끝을 입력하면 저장됩니다.");
        if (!Files.exists(accountFile)) {
            sb.append("=== 전체 가계부 기록 ===\n");
        }
        while(true){
            String name = "";
            System.out.print("항목 : ");
            name = sc.nextLine();
            if (name.equals("끝")){
                break;
            }
            sb.append(timestamp + name + ": ");
            System.out.print("금액 : ");
            String howMuch = sc.nextLine();
            System.out.print("수입/지출");
            String InOut = sc.nextLine();
            if (InOut.equals("수입")){
                sb.append("+" +howMuch + "원 (수입)");
            } else if (InOut.equals("지출")) {
                sb.append("-" + howMuch + "원 (지출)");
            } else {
                System.out.println("수입/지출 중 하나를 입력해주세요!");
            }
            sb.append("\n");
        }
        System.out.println();
        sc.close();
        try {
            Files.createDirectories(accountFile.getParent());
            Files.writeString(accountFile, sb.toString());
            System.out.println("가계부 기록이 추가되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println(Files.readString(accountFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getCurrentTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss - "));
    }
}
