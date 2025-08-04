package com.back;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lastNo = 0;
        WiseSaying wiseSaying = null; // 비어 있는 WiseSaying 변수 선언

        System.out.println("== 명언 앱 ==");

        while(true) {
            System.out.print("명령) ");
            String command = sc.nextLine();

            if(command.equals("등록")) {
                System.out.print("명언 : ");
                String saying = sc.nextLine();
                System.out.print("작가 : ");
                String author = sc.nextLine();

                lastNo++;

                wiseSaying = new WiseSaying();
                wiseSaying.id = lastNo;
                wiseSaying.saying = saying;
                wiseSaying.author = author;

                System.out.println("%d번 명언이 등록되었습니다.".formatted(lastNo));
            } else if(command.equals("목록")) {

                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                System.out.println("%d / %s / %s".formatted(wiseSaying.id, wiseSaying.saying, wiseSaying.author));


            } else if(command.equals("종료")) {
                break;
            }
        }
    }
}

