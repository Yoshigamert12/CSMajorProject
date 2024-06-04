walker pac;
Follower bik;
Random cly;
void setup() {
  size(1500,700);
  pac = new walker(750,350);
  bik = new Follower(740,300);
  cly = new Random (720,300);
}

void draw() {
  background(0, 0, 0);
  pac.display();
  bik.display();
  cly.display();
}

void mousePressed(){

}

void keyPressed(){
  if (keyCode== UP|| key == 'w'){
    pac.move(0);
  }
    else if (keyCode== RIGHT || key == 'd'){
    pac.move(1);
  }
  else if (keyCode== DOWN || key == 's'){
    pac.move(2);
  }
  else if (keyCode== LEFT || key == 'a'){
    pac.move(3);
  }
}
