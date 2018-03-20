void setup(){
  size (800,600);
  PImage   face   =   loadImage("guy.jpg");
   face.resize(800,600);
  background(face); 
  
}

void draw(){
  fill(255,255,255);
  if (mouseX<50{
  mouseX=50;
  }
  if(mouseX>100){
 mouseX=100;
  }
  ellipse(358,214,100,50);
  ellipse(500,210,100,50);
fill (0,0,0);
  ellipse(mouseX,mouseY,50,25);
  ellipse(mouseX+142,mouseY+4,50,25);
 
}