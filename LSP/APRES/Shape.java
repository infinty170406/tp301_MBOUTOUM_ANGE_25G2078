package LSP.APRES;

interface Shape {
    int getArea();
}

class Rectangle implements Shape {
    private int width, height;
    public int getArea() { return width * height; }
}

class Square implements Shape {
    private int side;
    public int getArea() { return side * side; }
}

