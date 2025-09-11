package edu.io.pack5.ex;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class imgUrlService {
    public void dirSaveImgParam () {
        Scanner sc = new Scanner(System.in);
        System.out.print("이미지 주소를 작성하세요 : ");
        String imgUrl = sc.nextLine();
        System.out.print("이미지를 저장할 폴더이름을 작성하세요 : ");
        String imgDir = sc.nextLine();
        System.out.print("이미지의 명칭을 작성하세요 : ");
        String imgName = sc.nextLine();
        dirSaveImg(imgUrl, imgDir, imgName);
    }
    public void dirSaveImg(String imgUrl, String imgDir,  String imgName) {
        Path path = Paths.get(imgDir, imgName);
        try {
            if (!Files.exists(path.getParent())) {
                Files.createDirectories(path.getParent());
                System.out.println("폴더 생성 완료");
            }
            URL url = new URL(imgUrl);
            InputStream inputStream = url.openStream();

            Files.copy(inputStream, path, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("파일 생성 완료");
            inputStream.close();
        } catch (IOException e) {
            System.out.println("이미지 다운로드 실패");
            if (e.getMessage().contains("403")) {
                System.out.println("403 오류 : Access Denied");
            } else if (e.getMessage().contains("404")) {
                System.out.println("404 오류 : Not Found");
            }
        }

    }
}
