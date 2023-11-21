class hierarchy{
    public static void main(String[] args) {
       car car = new car();
        logo logo = new logo();
        honda honda = new honda();
        car.draw(); 
        logo.draw();  
        honda.draw();
        car.drawcar();
        logo.drawlogo();
        honda.drawhonda();
    }
}
class vehicle {
    void draw() {
        System.out.println("Drawing a vehicle");
    }
}
class car extends vehicle {
    void drawcar() {
        System.out.println("Drawing a car");
    }
}
class logo extends vehicle{
    void drawlogo() {
        System.out.println("Drawing a logo");
    }
}
class honda extends vehicle {
    void drawhonda() {
        System.out.println("Drawing honda");
    }
}

