package main.java;

import main.java.converters.MsgToPdf;

public class Main {

    public static void main(String[] args) {
        MsgToPdf msgToPdf = new MsgToPdf();
        msgToPdf.setRouteFile("C:\\Users\\Admin\\Downloads");
        msgToPdf.setNameFile("leidy lorena");
        msgToPdf.converter();
    }
}
