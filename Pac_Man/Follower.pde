class Follower{
int x, y;// postistion
  int size;
  int speed;
  
  //Constructor
  Follower(int tempx, int tempy ){
  x=tempx;
  y=tempy;
  size = 20;
  speed = 10;
  }

void display(){
  fill(255,0,0);
rect(x,y,size,size);
}








}