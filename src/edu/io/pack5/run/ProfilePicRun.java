package edu.io.pack5.run;

import edu.io.pack5.service.ProfilePicService;

import java.util.Scanner;

public class ProfilePicRun {
    public static void main(String[] args) {
        ProfilePicService pps = new ProfilePicService();
//        pps.createProfileFolder("member03", "profilepic3.txt");
//        pps.createProfileFolder("member04", "profilepic4.txt");
        String imgURL = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSyCNGez_5Bca6YGoYO5zU4dmDRB_OZvsnadXi9WDfNthyU_49BzwoPQ2hBd4ptgCdnYccjt_82Iqdt28mnxbKiCwASsulsrgZLRMCud60";

//        pps.saveIMG(imgURL);
        Scanner sc = new Scanner(System.in);

//        System.out.print("저장할 이미지 이름을 확장자를 제외하고 입력하세요 ");
//        pps.saveIMG3(sc.nextLine() + ".png");

        System.out.print("이미지를 저장할 폴더 이름과 이미지 이름을 입력해주세요. ");
        pps.saveIMG4(sc.next(), sc.next() + ".png",  imgURL);
        sc.close();

    }
}
