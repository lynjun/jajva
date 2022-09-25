package ex6;

class Car {
    String color;
    String gearType;
    int door;

    Car(){
       this("white","auto",4);
    }
    Car(String c,String g,int d){
        color = c;
        gearType = g;
        door = d;
    }
}
