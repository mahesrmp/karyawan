package org.example;

import org.example.controller.KaryawanController;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KaryawanController karyawanController = new KaryawanController();
        Data.init();
        karyawanController.mainMenu();
    }
}