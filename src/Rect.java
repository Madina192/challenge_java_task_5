public class Rect {
    private int width;
    private int height;

    public void setParameters(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double calculatePerimeter(){
        return 2 * (width + height);
    }

    public double calculateSquare(){
        return width * height;
    }


}
