package Proxy_Pattern;

public class ProxyImage extends Image {
    private RealImage realImage;
    private ProxyImage proxyImage;
    private double proxyImageSize = 20;
    public Image getImage() {
        return proxyImage;
    }
}
