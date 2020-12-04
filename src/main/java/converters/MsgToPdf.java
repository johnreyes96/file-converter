package main.java.converters;

import com.zeonpad.pdfcovertor.OutlookToPdf;
import main.java.extensions.Extension;

public class MsgToPdf {

    private String routeFile;
    private String nameFile;

    public void converter() {
        System.out.println("iniciando conversión");
        OutlookToPdf outlookToPdf = new OutlookToPdf();
        String sourceCompleteRoute = getSourceCompleteRoute();
        String destinationCompleteRoute = getDestinationCompleteRoute();

        outlookToPdf.convert(sourceCompleteRoute, destinationCompleteRoute);
        System.out.println("terminó conversión");
    }

    private String getSourceCompleteRoute() {
        StringBuilder fileToConverter = new StringBuilder();
        fileToConverter.append(getRouteFile()).append("\\")
                .append(getNameFile()).append(".")
                .append(Extension.msg);
        return fileToConverter.toString();
    }

    private String getDestinationCompleteRoute() {
        StringBuilder fileToConverter = new StringBuilder();
        fileToConverter.append(getRouteFile()).append("\\")
                .append(getNameFile()).append(".")
                .append(Extension.pdf);
        return fileToConverter.toString();
    }

    public String getRouteFile() {
        return routeFile;
    }

    public void setRouteFile(String routeFile) {
        this.routeFile = routeFile;
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }
}
