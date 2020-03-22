package main;

import java.util.ArrayList;

public class TestGit {
    public static void main(String[] args) {
        System.out.println("Hello Git ! Denumirea proiectului de licență este 'Platforma web destinata angajatilor din companii" +
                "pentru inchirierea de jocuri video'");
        ArrayList<String> penalties = new ArrayList<>();

        UserModel userModel = new UserModel(1L, "Amalia", "Stefanescu", "amalia@google.com", false, true, penalties);
        userModel.addPenalty("A depasit termenul de imprumut");

        System.out.println(userModel);
    }

}
