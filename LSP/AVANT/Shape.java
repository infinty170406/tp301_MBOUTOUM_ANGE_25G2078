package LSP.AVANT;

interface Shape {
    int getArea();
}

class Rectangle implements Shape {
    private int width;
    private int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public int getArea() { return width * height; }
}

class Square implements Shape {
    private int side;
    public Square(int side) {
        this.side = side;
    }
    @Override
    public int getArea() { return side * side; }
}
