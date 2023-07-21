package Proxy_Pattern;

public class Client {
    public static void main(String[] args) {
        Image realImage = new RealImage();
        Image proxyImage = new ProxyImage();

        realImage.getImage();
        proxyImage.getImage();
    }
}
