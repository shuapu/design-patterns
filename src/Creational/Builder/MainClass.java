package Creational.Builder;

public class MainClass {
    public static void main(String[] args) {
        Url.UrlBuilder builder = new Url.UrlBuilder();
        Url url = builder.setHost("localhost")
                .setPort(8080)
                .setPathParameters("id")
                .setProtocol("http")
                .setQueryParameters("city")
                .build();
        System.out.println(url.toString());


    }
}
