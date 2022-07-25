package pl.dolega;

import pl.dolega.kata._7kyu.SuzukiNeedsHelp;

import java.util.Arrays;

import static java.lang.System.out;

public class App {

    public static void main(String[] args) {

        String students = "Naoki Yasuhiro Satoru Tadashi Yasuo Yoshihiro Nori Mikio Ryota Nobuyuki Yasuo Shuji Nobuyuki Ronin Ryoichi Taro Shig Shunichi Shunichi Sadao Yuichi Takumi Mitsuru Satoru Takashi Tsuneo Noboru Shichiro Takashi Tama Nori Yasuhiro Shoji Raiden Mikio Minoru Yoshito Yoshinori Shoichi Miki Takao Tomi Shuichi Ryozo Yuichi Shoji Tadao Shin Takumi Seiichi Takumi Toshihiro Saburo Naoko Yoichi Shoichi Nobuo Shuichi Yoshito Shinji Shiro Minori Toru Yasushi Mitsuru Ryo Sadao Satoru Naoki Ryoichi Yuji Toshiyuki Naoko Shunichi Mitsuru Shunichi";
        String[] studentArray = SuzukiNeedsHelp.lineupStudents(students);
        for (int i = 0; i < studentArray.length; i++) {
            out.println(studentArray[i]);
        }
    }
}