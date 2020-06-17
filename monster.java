package src;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Random;
import java.lang.*;
public class monster extends main implements Runnable{
	static ImageIcon monster1;
	static JLabel monsterIcon;
	
	int RightOrLeft;
	int howMuchTime;
	static int health=2;
	public monster(String ptr){
		monster1=new ImageIcon(ptr);
		monsterIcon=new JLabel(monster1);
		int whereBorn=(int)(Math.random()*1351);
		monsterIcon.setBounds(whereBorn,600,37,26);
		frm.add(monsterIcon);
	}
	
	boolean lastAttackEnd=true;
	boolean decreas=false;
	public void run(){
		hitMusic apw33=new hitMusic("music\\monsterHit.wav");
		while(true){
			RightOrLeft=(int)(Math.random()*2);
			howMuchTime=(int)(Math.random()*60);
			decreas=false;
			for(int i=0,count=0;i<howMuchTime;i++){
				if(skill)
					break;
				if(attack){
					if(turnRightOrLeft&&( (jCharacter.getX()+250<=monsterIcon.getX()+80) && (jCharacter.getX()+250>=monsterIcon.getX())) &&  jCharacter.getY()==440)
						break;
					
					else if(!turnRightOrLeft&&( (jCharacter.getX()+100<=monsterIcon.getX()+80) && (jCharacter.getX()+100>=monsterIcon.getX())) &&  jCharacter.getY()==440)
						break;
				}
				if(RightOrLeft==1&&monsterIcon.getX()+2<1340){
					monster1=new ImageIcon("image\\monster\\moveRight."+count+".png");
					monsterIcon.setIcon(monster1);
					monsterIcon.setLocation(monsterIcon.getX()+2,monsterIcon.getY());
				}
				else if(RightOrLeft==0&&monsterIcon.getX()-2>0){
					monster1=new ImageIcon("image\\monster\\move."+count+".png");
					monsterIcon.setIcon(monster1);
					monsterIcon.setLocation(monsterIcon.getX()-2,monsterIcon.getY());
				}
				try {
					Thread.sleep(100);
				} catch(InterruptedException e){
				}
				if(!decreas){
					count++;
					if(count>=4)
						decreas=true;
				}
				else{
					count--;
					if(count<=0)
						decreas=false;
				}
			}
			if((attack&&lastAttackEnd)||skill){
				if(skill)
					health=1;
				if(( turnRightOrLeft&&( (jCharacter.getX()+250<=monsterIcon.getX()+80) && (jCharacter.getX()+250>=monsterIcon.getX())) &&  jCharacter.getY()==440)||skill)
				{
					if(attack&&!skill){
						damageIcon=new ImageIcon("image\\damage.gif");
						monster1_damege.setIcon(damageIcon);
						monster1_damege.setLocation(monsterIcon.getX()-130,monsterIcon.getY()-230);
						monster1_damege.setVisible(true);
					}
					if(skill){
						damageIcon=new ImageIcon("image\\critizen.gif");
						monster1_damege.setIcon(damageIcon);
						monster1_damege.setLocation(monsterIcon.getX()-130,monsterIcon.getY()-250);
						monster1_damege.setVisible(true);
						
					}
					lastAttackEnd=false;
					if(health==1){ //death 		
						if(skill1){
							apw33.stop();
							apw33=new hitMusic("music\\skillHit.wav");
							apw33.start();
						}
						if(skill2){
							apw33.stop();
							apw33=new hitMusic("music\\skill2\\hit1.wav");
							apw33.start();
						}
						if(skill3){
							apw33.stop();
							apw33=new hitMusic("music\\skill3\\400011057.Hit.wav");
							apw33.start();
						}
						if(skill4){
							apw33.stop();
							apw33=new hitMusic("music\\skill4\\Hit.wav");
							apw33.start();
						}
						for(int i=1;i<9;i++){
							if(i==4){
								apw33=new hitMusic("music\\monsterDied.wav");
								apw33.start();
							}
							monster1=new ImageIcon("image\\monster\\die1."+ i +".png");
							monsterIcon.setIcon(monster1);
							try {
								Thread.sleep(80);
							} catch(InterruptedException e){
							}
						}
						try {
									Thread.sleep(450);
							} catch(InterruptedException e){
							}
						monster1_damege.setVisible(false);
						monsterIcon.setVisible(false);
						try {
									Thread.sleep(2550);
							} catch(InterruptedException e){
							}
						int whereBorn=(int)(Math.random()*1351);
						monsterIcon.setLocation(whereBorn,600);
						monster1=new ImageIcon("image\\monster\\stand.right.png");
						monsterIcon.setIcon(monster1);
						health=3;
						monsterIcon.setVisible(true);
					}
					else{ //KB
						monster1=new ImageIcon("image\\monster\\hit1.0.png");
						monsterIcon.setIcon(monster1);
						apw33=new hitMusic("music\\monsterHit.wav");
						apw33.start();
						for(int i=0;i<20;i++){
							if(monsterIcon.getX()+2<1340)
								monsterIcon.setLocation(monsterIcon.getX()+2,monsterIcon.getY());
							if(i==11)
								monster1_damege.setVisible(false);
							try {
								Thread.sleep(100);
							} catch(InterruptedException e){
							}
						}
						monster1=new ImageIcon("image\\monster\\stand.left.png");
						monsterIcon.setIcon(monster1);
					}
					health--;
					lastAttackEnd=true;
				}
				else if(( !turnRightOrLeft&&( (jCharacter.getX()+100<=monsterIcon.getX()+80) && (jCharacter.getX()+100>=monsterIcon.getX())) &&  jCharacter.getY()==440)||skill)
				{
					if(attack&&!skill){
						damageIcon=new ImageIcon("image\\damage.gif");
						monster1_damege.setIcon(damageIcon);
						monster1_damege.setLocation(monsterIcon.getX()-130,monsterIcon.getY()-230);
						monster1_damege.setVisible(true);
					}
					if(skill){
						damageIcon=new ImageIcon("image\\critizen.gif");
						monster1_damege.setIcon(damageIcon);
						monster1_damege.setLocation(monsterIcon.getX()-130,monsterIcon.getY()-250);
						monster1_damege.setVisible(true);
						if(skill1){
							apw33.stop();
							apw33=new hitMusic("music\\skillHit.wav");
							apw33.start();
						}
						if(skill2){
							apw33.stop();
							apw33=new hitMusic("music\\skill2\\hit1.wav");
							apw33.start();
						}
						if(skill3){
							apw33.stop();
							apw33=new hitMusic("music\\skill3\\400011057.Hit.wav");
							apw33.start();
						}
						if(skill4){
							apw33.stop();
							apw33=new hitMusic("music\\skill4\\Hit.wav");
							apw33.start();
						}
					}
					lastAttackEnd=false;
					if(health==1){ //death 			
						
						
						for(int i=1;i<9;i++){
							if(i==4){
								apw33=new hitMusic("music\\monsterDied.wav");
								apw33.start();
							}
							monster1=new ImageIcon("image\\monster\\die2."+ i +".png");
							monsterIcon.setIcon(monster1);
							try {
								Thread.sleep(80);
							} catch(InterruptedException e){
							}
						}
						try {
									Thread.sleep(450);
							} catch(InterruptedException e){
							}
						
						monster1_damege.setVisible(false);
						monsterIcon.setVisible(false);
						try {
									Thread.sleep(2550);
							} catch(InterruptedException e){
							}
					
						int whereBorn=(int)(Math.random()*1351);
						monsterIcon.setLocation(whereBorn,600);
						monster1=new ImageIcon("image\\monster\\stand.right.png");
						monsterIcon.setIcon(monster1);
						health=3;
						monsterIcon.setVisible(true);
					}
					else{ //KB
						monster1=new ImageIcon("image\\monster\\hit2.0.png");
						monsterIcon.setIcon(monster1);
						apw33=new hitMusic("music\\monsterHit.wav");
						apw33.start();
						for(int i=0;i<20;i++){
							if(monsterIcon.getX()-2>0)
								monsterIcon.setLocation(monsterIcon.getX()-2,monsterIcon.getY());
							if(i==11)
								monster1_damege.setVisible(false);
							try {
								Thread.sleep(100);
							} catch(InterruptedException e){
							}
						}
						monster1=new ImageIcon("image\\monster\\stand.right.png");
						monsterIcon.setIcon(monster1);
					}
					health--;
					lastAttackEnd=true;
				}
			}
			else{
				if(RightOrLeft==1)
				{
					monster1=new ImageIcon("image\\monster\\stand.right.png");
					monsterIcon.setIcon(monster1);
				}
				else{
					monster1=new ImageIcon("image\\monster\\stand.left.png");
					monsterIcon.setIcon(monster1);
				}
			}
			int sleepTime=(int)(Math.random()*4);
			for(int i=0;i<sleepTime;i++){
				try {
					if(attack||skill)
						break;
					Thread.sleep(1000);
				} catch(InterruptedException e){
				}
			}
			
		}
	}
}