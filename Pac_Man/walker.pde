class walker {
int x, y;// postistion
  int size;
  int speed;
  
  //Constructor
  walker(int tempx, int tempy ){
  x=tempx;
  y=tempy;
  size = 20;
  speed = 10;
  }

void display(){
  fill(255,255,0);
circle(x,y,size);
}

void move(int direc){
  if (direc==0){
  y= y- speed;
  }
   else if (direc==1){
  x= x + speed;
  }
  else if (direc==2){
  y= y + speed;
  }
  else if (direc==3){
  x= x - speed;
  }
}
  
}
