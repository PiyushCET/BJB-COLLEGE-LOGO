package bjblogo;
import java.lang.Math;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.*;
import java.text.AttributedCharacterIterator;

import javax.swing.JFrame;
public class Bjblogo extends Canvas{
    double p(double m){
return m*m;
}
    double abs(double n){
    if(n<0)
        return -n;
    else 
        return n;
    }
    
    public void paint(Graphics g){
Color B=new Color(0,0,255);
Color C=new Color(0,0,0);
Color D=new Color(0,0,0); 
int k=5;
for(int i=0;i<1760;i++){
for(int j=0;j<1000;j++){
 int x=i-880+k;
 int y=(int) (abs(1000-j)-480+k);
 int n=320;
 if((y<476&&y>-294&&abs(x)<7)||(abs(x)<308&&y>84&&y<105)||(abs(abs(x)-321)<14&&y<28*14&&y>-6*14)||(p(abs(x)-335)+p(y-1100)<p(710)&&p(abs(x)-335)+p(y-1100)>p(682)&&abs(x)<335)||(p(x)/p(335)+p((y+84))/p(210)<1&&p(x)/p(308)+p((y+84))/p(182)>1&&y<=-84)||(y<-84&&abs(x)<266&&(((p(x)/p(370)+p((y+84))/p(245)>1&&(p(x)/p(391)+p((y+84))/p(266)<1)||((p(x)/p(459)+p((y+84))/p(364)>1&&(p(x)/p(480)+p((y+84))/p(385)<1)))))))||(abs(x)>285&&abs(x)<302&&y<-18*14&&y>-27*14)||((abs(x)>265)&&p(abs(x)-301)+p(y+283)<p(45)&&abs(x)<302&&p(x)/p(391)+p((y+84))/p(266)<1)
 ||((abs(x)>265)&& p(x)/p(480)+p((y+84))/p(385)<1&&abs(x)<302&&p(x)/p(459)+p((y+84))/p(364)>1&&y<0&&y>-433)
 ||(p(abs(x)+y)+4*p(abs(x)-y-700)<2*p(120)&&(p(abs(x)+y)+4*p(abs(x)-y-700)>2*p(100)||(abs(x)-y<=686))&&(abs(x)<=302&&p(x)/p(480)+p((y+84))/p(385)>=1))
 ||(p(abs(x)+y+92)+2*p(abs(x)-y-632)<2*p(120)&&abs(x)<372&&p(abs(x)+y+92)+2*p(abs(x)-y-632)>2*p(100)&&(abs(x)>=302))
 ||(abs(x)>325&&abs(x)<372&&(y-335)<=-0.6*(abs(x)+582)&&(y-335)>=-0.6*(abs(x)+782))
 ||(((p(x+157)/p(112)+p(y-119)/p(160)<=1&&p(x+157)/p(108)+p(y-119)/p(139)>=1)||(p(x+157)/p(84)+p(y-119)/p(160)<=1&&p(x+157)/p(80)+p(y-119)/p(139)>=1))&&y>119)
 ||(p(x+157)/p(112)+p(y-119)/p(160)<=1&&y>119&&abs(x+157)<5)
 ||(p(x+157)/p(112)+p(y-119)/p(160)>=1&&p(x+157)/p(46)+p(y-269)/p(22)>=1&&p(x+157)/p(56)+p(y-269)/p(30)<=1)
 ||(p(x+157)/p(56)+p(y-269)/p(30)>=1&&p(x+157)/p(36)+p(y-290)/p(16)>=1&&p(x+157)/p(42)+p(y-290)/p(22)<=1)
 ||(p(x+157)/p(42)+p(y-290)/p(22)>=1&&p(x+157)/p(24)+p(y-306)/p(12)>=1&&p(x+157)/p(28)+p(y-306)/p(15)<=1)
 ||(p(abs(x+157)+24)+p(y-306)<=p(45)&&p(abs(x+157)+24)+p(y-306)>=p(41)&&y>306&&p(x+157)/p(28)+p(y-306)/p(15)>=1)
 ||(y>=340&&y<=400&&abs(x+157)<3)||(p(x+157)+p(y-346)<=p(10))||(p(x+90)+p(y-438)>=p(76)&&p(x+90)+p(y-590)<=p(230)&&x>-157&&x<-90&&y<400)
 ||(p(x-157)+p(y-260)<=p(10)||(p(x-157)/p(112)+p(y-260)/p(56)<=1.3&&p(x-157)/p(120)+p(y-260)/p(56)>=0.9))
 ||(((0.75*p((x-157)*-0.57-(y-260)))/p(112)+(0.25*p((x-157)*1.73-(y-260)))/p(56)<=1.3)&&((0.75*p((x-157)*-0.57-(y-260)))/p(120)+(0.25*p((x-157)*1.73-(y-260)))/p(56)>=0.9))
 ||(((0.75*p((x-157)*0.57-(y-260)))/p(112)+(0.25*p((x-157)*-1.73-(y-260)))/p(56)<=1.3)&&((0.75*p((x-157)*0.57-(y-260)))/p(120)+(0.25*p((x-157)*-1.73-(y-260)))/p(56)>=0.9))
 ||(p(x-y+60)/p(35)+p(x+y+60)/p(72)<=2&&x-y+70<0)||(x+y+320>=0&&x+y+60<0&&x-y+70<0&&x-y+110>0)||(x-y+70<0&&x-y+90>0&&x+y>-420&&x+y<=-320)
 ||(p(x+230)+p(y+140)<=p(38)&&p(x+230)+p(y+140)>=p(25)&&x-y+110<=0)||(((x+y>-340&&x+y<-320)||(x+y<-400&&x+y>-420))&&(x-y+60<0&&x-y+110>0))
 ||(p(x+y+250)/p(35)+p(x-y+250)/p(72)<=2&&x+y+240>0)||(x-y-10<=0&&x-y+250>0&&x+y+240>0&&x+y+200<0)||(x+y+240>0&&x+y+220<0&&x-y-110<0&&x-y-10>=0)
 ||(p(x+80)+p(y+140)<=p(38)&&p(x+80)+p(y+140)>=p(25)&&x+y+200>=0)||(((x-y-30<0&&x-y-10>0)||(x-y-90>0&&x-y-110<0))&&(x+y+250>0&&x+y+200<0))
 ||(p(abs(x-157)-100)+p(y+180)<=p(164)&&p(abs(x-157)-100)+p(y+310)>=p(164)&&abs(x-157)<100)||(y>=-50&&y<10&&abs(x-157)<5)
 ||(p(x-157)+p(y-40)<=p(40)&&p(x-157)/p(40)+p(y-40)/p(8)>=1&&y<40)||(p(x-195)+p(y-49)<=p(10))||(y-80<=-2.9*(abs(x-195))&&y>52)
 ||(p(x-157)/p(40)+p(y-40)/p(8)<=1&&p(x-157)/p(40)+p(y-40)/p(8)>=0.6)){  
 if((i+j)%(2*n)<n){
  Color E=new Color((int) (184+(((i+j)%n)*0.19)), (int) (134+(((i+j)%n)*0.33)), (int) (11+(((i+j)%n)*0.57)));
   g.setColor(E);      
g.drawLine(i, j, i, j);}
  if((i+j)%(2*n)>=n){
  Color E=new Color((int) (245-(((i+j)%n)*0.19)), (int) (241-(((i+j)%n)*0.33)), (int) (195-(((i+j)%n)*0.57)));
   g.setColor(E);      
g.drawLine(i, j, i, j);}
         }
 
 else{
int c=(int)(0.4*Math.sqrt(p(700)-p(i-880)-p(j-500)));
   if(c>255){c=255;}
    Color A=new Color(255,255-c,0);
   g.setColor(A);      
g.drawLine(i, j, i, j);
 }

}}

    }
public static void main(String[] args) {
Bjblogo m=new Bjblogo();
JFrame f=new JFrame();
f.add(m);
f.setSize(10000,10000);
f.setVisible(true);
}}
