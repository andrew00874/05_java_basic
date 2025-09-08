package edu.io.pack1.service;

import java.io.File;
import java.io.IOException;

public class FilePracticeService {
    public void method1(){
        File f1 = new File("../my_logs");
        File f2 = new File("../my_logs/access_log.log");
        if (!f1.exists()){
            f1.mkdir();
            System.out.println("my_logs created");
        }
        if (!f2.exists()){
            try {
                f2.createNewFile();
                System.out.println("access_logs.log created");
            } catch (IOException e) {
                System.out.println("IO Exception");
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Exception");
                e.printStackTrace();
            }
        }
    }

    /*
    *  폴더 내 전체 경로 및 파일 확인 명령어 :
    * cmd 창에서 tree / f 폴더별 파일들 모두 확인 가능
    * */

    public void method2(){
        File f1 = new File("src/edu/oop/method/ex");
        File[] files = f1.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file.getName() + " [파일]");
            } else {
                System.out.println(file.getName() +  " [폴더]");
            }
        }
    }

    public void method3(){
        File f1 = new File("C:/io_test/temp/delete_target.txt");
        File f2 = f1.getParentFile();
        if (!f2.exists()){
            f2.mkdirs();
            System.out.println("디렉터리 생성 완료");
        } else {
            System.out.println("디렉터리 이미 존재함");
        }
        if (!f1.exists()){
            try {
                f1.createNewFile();
                System.out.println("파일 생성 완료");
            } catch(IOException e) {
                e.printStackTrace();
                System.out.println("IO Exception");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Exception");
            }
        } else {
            f1.delete();
            if (f1.exists()){
                System.out.println("파일 삭제 실패");
            } else {
                System.out.println("파일 삭제 성공");
            }
        }
    }
}
