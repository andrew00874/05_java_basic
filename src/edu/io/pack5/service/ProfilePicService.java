package edu.io.pack5.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class ProfilePicService {
// 1으로 끝나는 명칭들만 이용해서 member03 폴더 member04 폴더에 각각 프로필사진2.txt 저장
    public void createProfileFolder(String folder, String file) {

        // 1. 회원 프로필 이미지를 저장할 폴더 경로 생성
        String folderName = file.substring(0, file.indexOf('.'));
        Path memberFolder = Path.of(folder,folderName);
        // 2. 폴더 생성
        try {
            Files.createDirectories(memberFolder);
            // 3. 폴더 내에 프로필 사진 저장하기
            Path pic = Path.of(folder, folderName, file);

            Files.writeString(pic, "프로필 사진 이미지입니다.");

            System.out.println("프로필 사진이 개별 폴더로 저장 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("프로필 사진 저장 중 문제 발생 했을 때 문제 해결");
            // 1. main server 끊기면 2번째 후보 서버로 저장 시작
            // 2. 이미지가 5MB 이상 초과되면 저장 못하게 하고, 5MB 를 초과할 수 없음을 사용자에게 알리기
        }
    }

    // 이미지 주소로 이미지 저장하기
    public void saveIMG(String imgURL) {
        //String imgURL = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSyCNGez_5Bca6YGoYO5zU4dmDRB_OZvsnadXi9WDfNthyU_49BzwoPQ2hBd4ptgCdnYccjt_82Iqdt28mnxbKiCwASsulsrgZLRMCud60";
        Path memberFolder = Path.of("profiles","member06");
        // 2. 폴더 생성
        try {
            Files.createDirectories(memberFolder);
            // 3. 폴더 내에 프로필 사진 저장하기
            Path pic = Path.of("profiles","member06", "사진1.png");

            // 4 .이미지 주소에서 이미지 다운로드 처리 후 파일로 저장하기
            System.out.println("이미지 다운로드중 ...");
            // URL = 클라이언트가 작성한 이미지 주소를 java 에서 (읽거나 쓰거나) 사용할 수 있도록 설정하는 문서
            URL url = new URL(imgURL);

            // InputStream = 인터넷에서 데이터가 흘러들어오는 통로를 만듬
                                // 이미지 주소에서 데이터가 들어올 수 있도록 통로를 열어두는 기능
            InputStream inputStream = url.openStream();

            // 5. 파일로 저장하기
            //    선택사항  -> 기존에 같은 이름의 이미지가 존재하면 덮어쓰기 형태로 저장하라
            Files.copy(inputStream, pic, StandardCopyOption.REPLACE_EXISTING);
            inputStream.close();

            System.out.println("프로필 사진이 개별 폴더로 저장 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("프로필 사진 저장 중 문제 발생 했을 때 문제 해결");
            e.printStackTrace();
        }
    }

    public void saveIMG2(String imgURL) {
        Path memberFolder = Path.of("profiles","member07");
        // 2. 폴더 생성
        try {
            Files.createDirectories(memberFolder);
            // 3. 폴더 내에 프로필 사진 저장하기
            Path pic = Path.of("profiles","member07", "사진1.png");

            // 4 .이미지 주소에서 이미지 다운로드 처리 후 파일로 저장하기
            System.out.println("이미지 다운로드중 ...");
            // URL = 클라이언트가 작성한 이미지 주소를 java 에서 (읽거나 쓰거나) 사용할 수 있도록 설정하는 문서
            URL url = new URL(imgURL);

            // InputStream = 인터넷에서 데이터가 흘러들어오는 통로를 만듬
            // 이미지 주소에서 데이터가 들어올 수 있도록 통로를 열어두는 기능
            InputStream inputStream = url.openStream();

            // 5. 파일로 저장하기
            //    선택사항  -> 기존에 같은 이름의 이미지가 존재하면 덮어쓰기 형태로 저장하라
            Files.copy(inputStream, pic, StandardCopyOption.REPLACE_EXISTING);
            // 저장 완료되었으면 닫아주기
            inputStream.close();

            System.out.println("프로필 사진이 개별 폴더로 저장 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("프로필 사진 저장 중 문제 발생");
        }
    }

    public void saveIMG3(String imgName) {
        Path memberFolder = Path.of("profiles","member07");

        try {
            String imgURL = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSyCNGez_5Bca6YGoYO5zU4dmDRB_OZvsnadXi9WDfNthyU_49BzwoPQ2hBd4ptgCdnYccjt_82Iqdt28mnxbKiCwASsulsrgZLRMCud60";

            Files.createDirectories(memberFolder);
            Path pic = Path.of("profiles","member07", imgName);

            URL url = new URL(imgURL);
            InputStream inputStream = url.openStream();

            Files.copy(inputStream, pic); // 중복시 덮어쓰기 옵션 없음
            inputStream.close();

            System.out.println("프로필 사진이 개별 폴더로 저장 완료되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveIMG4(String folder, String file, String imgURL) {
        // 스캐너를 이용하여 폴더이름, 이미지이름 사용자에게 전달받고
        // 폴더안의 이미지를 웹에서 복제하여 저장
        // 확장자는 .png 사용
        Scanner sc = new Scanner(System.in);
        Path memberFolder = Path.of(folder);

        try {
//            String imgURL = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSyCNGez_5Bca6YGoYO5zU4dmDRB_OZvsnadXi9WDfNthyU_49BzwoPQ2hBd4ptgCdnYccjt_82Iqdt28mnxbKiCwASsulsrgZLRMCud60";

            Files.createDirectories(memberFolder);
            Path pic = Path.of(folder, file);

            if(Files.exists(pic)) {
                System.out.print("파일이 이미 존재합니다. 덮어씌우시겠습니까? (y/n) ");
                String answer = sc.next();
                if (answer.equals("n")) {
                    System.out.println("작업을 종료합니다.");
                    return;
                } else if (answer.equals("y")) {
                    System.out.println("파일을 덮어씌웁니다.");
                } else {
                    throw new IllegalArgumentException();
                }
            }
            URL url = new URL(imgURL);
            InputStream inputStream = url.openStream();

            Files.copy(inputStream, pic, StandardCopyOption.REPLACE_EXISTING);
            inputStream.close();

            System.out.println(folder + "폴더에 " + file + " 파일이 저장되었습니다.");
        } catch (IllegalArgumentException e){
            System.out.println("y/n 중 하나를 입력해주세요. 프로그램을 종료합니다.");
        } catch (IOException e) {
            System.out.println("이미지 다운로드 실패.");
            if (e.getMessage().contains("403")) {
                System.out.println("403 오류 : Access Denied");
            } else if (e.getMessage().contains("404")) {
                System.out.println("404 오류 : Not Found");
            }
        }
    }

    public static class 중복된_파일_폴더명칭_Service {

        public void saveImage1(){

            String originName = "사진.png";

            Path path = Path.of("profiles","member01",originName);
            int dot = originName.lastIndexOf('.'); // . 이 몇번재에 존재하는지 확인
            String baseName = originName.substring(0, dot); // 파일이름 처음부터 .이 존재하기 전까지의 파일 명칭을 가져오는 방법
            String extName = originName.substring(dot); // .확장자 이름을 가지고 있는 상태

            System.out.println("dot . 의 위치 : " + dot);
            System.out.println("baseName : " + baseName);
            System.out.println("extName : " + extName);
            int count = 1;

            do{
                //               사진        _   숫자     .png
                String NewName = baseName + "_" + count +  extName;
                System.out.println("newName : " + NewName);


                path = Path.of("profiles","member01",NewName); // 기존이름 -> 숫자가 붙은 이름 변경
                count++; // 사진_1 이 존재하면 숫자를 계속 올려서 존재하지 않는 이름이 나올 때 까지 숫자값 상승
            } while (Files.exists(path)); // 파일이름이 존재하면 존재하는 파일이름이 없을 때 까지 반복


            try {
                Files.createDirectories(path.getParent());// profile/member01 까지만 포함
                String imgURL = "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTZWlPjghR3F6rno2RtA56T9mRyUL_BWILiAmpxP0-npm6nmw-Gsm9AFDYLAl8paow4CEKMeRHaQn39tB4VniZan8svg2JIpXXOO6L84F4";
                URL url = new URL(imgURL);
                InputStream in = url.openStream();
                Files.copy(in,path);
                in.close(); // 메모리 누수 방지를 위해서 실시간으로 데이터를 받아오는 stream을 종료
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
