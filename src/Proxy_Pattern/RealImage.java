package Proxy_Pattern;

public class RealImage extends Image {
    private Image image;
    private double size;
    public void setImage(Image image, double size) {
        this.image = image;
        this.size = size;
    }
    public Image getImage() {
        return image;
    }
}
