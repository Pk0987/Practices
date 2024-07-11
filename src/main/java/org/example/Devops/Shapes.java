package org.example.Devops;

class circle{
   int l,b,h;
   public circle(int l,int b,int h){
       this.l=l;
       this.b=b;
       this.h=h;
   }
   void display(){
       System.out.println(l*b*h);
   }
}

class rectangle{
    int l,b;
    public rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    void display(){
        System.out.println(2*(l*b));
    }
}

class Shapes {
    public static void main() {
        rectangle s = new rectangle(2,5);
        s.display();
        circle c= new circle(2,4,5);
        c.display();
    }
}
