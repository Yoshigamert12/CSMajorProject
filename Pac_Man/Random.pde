class Random{
int x, y;// postistion
  int size;
  int speed;
  int dx,dy;
  
  //Constructor
  Random(int tempx, int tempy ){
  x=tempx;
  y=tempy;
  size = 20;
  speed = 10;
    dx= int (random(-10,10));
    dy= int (random(-10,10));
  }

void display(){
  fill(255,165,0);
rect(x,y,size,size);
}

void mover(int ranbom){
        x= x+dx;
        y= y+dy;
    if (x<=0 + size/2 || x>= width - size/2 ){
        //reverses directrion
        dx= dx*-1;
    }
    if (y<= 0 + size/2 || y>= height - size/2 ){
        dy= dy*-1;

    }


    }
}