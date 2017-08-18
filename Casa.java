
class Casa
{
    //Variables de instancia
    Circle ventana;
    Triangle techo;
    Square pared;
    Square puerta;
    
    // constructor
    Casa()
    {
        ventana=new Circle();
        techo=new Triangle();
        pared=new Square();
        puerta=new Square();
    }
    
    
    void dibujate()
    {
        ventana.makeVisible();
        techo.makeVisible();
        pared.makeVisible();
        puerta.makeVisible();
        
        ventana.changeColor("red");
        techo.changeColor("black");
        pared.changeColor("green");
        puerta.changeColor("blue");
    }
    
    void acomodate()
    {
        //coloca los objetos en la posicion que corresponde
        
        techo.changeSize(50,90);
        techo.moveHorizontal(45);
        techo.moveVertical(1);
        ventana.changeSize(20);
        ventana.moveUp();
        ventana.moveRight();
        ventana.moveRight();
        ventana.moveHorizontal(25);
        pared.changeSize(60);
        pared.moveDown();
        pared.moveVertical(-5);
        pared.moveHorizontal(5);
        puerta.changeSize(15);
        puerta.moveDown();
        puerta.moveDown();
        puerta.moveDown();
        puerta.moveRight();
        puerta.moveHorizontal(5);
        techo.makeVisible();
        ventana.makeVisible();
    }
    
    void muevete2()
    {
        techo.moveHorizontal(80);
        ventana.moveRight();
        ventana.moveRight();
        ventana.moveRight();
        ventana.moveHorizontal(20);
        pared.moveHorizontal(80);
        puerta.moveRight();
        puerta.moveRight();
        puerta.moveHorizontal(40);
        techo.makeVisible();
        ventana.makeVisible();
    }
}