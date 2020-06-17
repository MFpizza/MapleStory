package src;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.lang.*;

public class main extends JFrame implements KeyListener,ActionListener
{
	static AePlayWave apw=new AePlayWave("music\\backGround\\maple1.wav"); 
	static skillMusic hit;
	static ImageIcon backgroundd=new ImageIcon("image\\backGround\\000030001.png");
	static JLabel jlabBackGround=new JLabel(backgroundd);
	static main frm = new main();
	static ImageIcon character=new ImageIcon("image\\charater\\stand2.gif");
	static JLabel jCharacter=new JLabel(character);
	static ImageIcon skillIcon=new ImageIcon("image\\charater\\skill.gif");
	static JLabel jSkill=new JLabel(skillIcon);
	static ImageIcon skillIcon2=new ImageIcon("image\\charater\\TgqMhc.gif");
	static JLabel jSkill2=new JLabel(skillIcon2);
	
	static ImageIcon damageIcon=new ImageIcon("image\\damage.gif");
	static JLabel monster1_damege=new JLabel(damageIcon);
	static JLabel monster2_damege=new JLabel(damageIcon);
	static JLabel monster3_damege=new JLabel(damageIcon);
	static JLabel monster4_damege=new JLabel(damageIcon);
	static JLabel monster5_damege=new JLabel(damageIcon);

	static ImageIcon portalIcon=new ImageIcon("image\\portal\\0.png");
	static JLabel jPortal=new JLabel(portalIcon);
	static JLabel jPortal2=new JLabel(portalIcon);
	static JLabel jPortal3=new JLabel(portalIcon);
	static JLabel jPortal4=new JLabel(portalIcon);
	static JLabel jPortal5=new JLabel(portalIcon);
	
	static ImageIcon boss1Icon=new ImageIcon("image\\Boss1\\tcssg-aluet.gif");
	static JLabel 	jBoss1=new JLabel(boss1Icon);
	static ImageIcon boss2Icon=new ImageIcon("image\\Boss1\\7006dcaa000e4155c9f079fb568c8401.gif");
	static JLabel 	jBoss2=new JLabel(boss2Icon);
	static ImageIcon boss3Icon=new ImageIcon("image\\Boss1\\b838d7f393a25bd3db4a306c09d48408.gif");
	static JLabel 	jBoss3=new JLabel(boss3Icon);
	static ImageIcon boss4Icon=new ImageIcon("image\\Boss1\\942d44915383f346fe92076b94fa397c.gif");
	static JLabel 	jBoss4=new JLabel(boss4Icon);
	
	static Timer timer=new Timer(3,frm);
	static boolean skill=false;
	static boolean turnRightOrLeft=true;//1=right 0=left
	boolean AtStirr=false;
	static boolean attack=false;
	boolean atJump=false;
	boolean atDown=false;
	int count=0,portalTo=0,count2=0;
	
	boolean map1=true;
	
	static boolean skill1=false;
	int count1=0;
	
	//adele 新角技能
	static boolean skill2=false;
	int count3=0;
	
	//耶夢加得 惡婦五轉技
	int count4=0;
	static boolean skill3=false;
	boolean skill3Exist=false;
	boolean deathSkill3=false;
	static ImageIcon skill3Icon=new ImageIcon("image\\charater\\8fXp4Jm.gif");
	static JLabel jSkill3=new JLabel(skill3Icon);
	
	//天怒 skill4
	static ImageIcon skillIcon4=new ImageIcon("image\\charater\\skill4.gif");
	static JLabel jSkill4=new JLabel(skillIcon4);
	int count5=0;
	static boolean skill4=false;
	
	public static void main(String args[])
	{
		apw.start(); 
		frm.setTitle("新楓之谷MapleStory");
		frm.setVisible(true);
		frm.setSize(1366,768);
		frm.setLayout(null);
		frm.setResizable(false);
		
		frm.addKeyListener(frm);
		
		monster1_damege.setBounds(0,0,292,254);
		frm.add(monster1_damege);
		monster2_damege.setBounds(0,0,292,254);
		frm.add(monster2_damege);
		monster3_damege.setBounds(0,0,292,254);
		frm.add(monster3_damege);
		monster4_damege.setBounds(0,0,292,254);
		frm.add(monster4_damege);
		monster5_damege.setBounds(0,0,292,254);
		frm.add(monster5_damege);
		
		jSkill2.setBounds(110,-100,1200,900);
		frm.add(jSkill2);
		
		//585
		jCharacter.setBounds(585,218,300,300);
		frm.add(jCharacter);
		
		jSkill3.setBounds(0,0,1200,1276);
		frm.add(jSkill3);
		
		jSkill.setBounds(200,0,972,731);
		frm.add(jSkill);
		
		jBoss1.setBounds(300,80,720,514);
		frm.add(jBoss1);
		
		jBoss2.setBounds(760,424,109,86);
		frm.add(jBoss2);
		
		jBoss3.setBounds(930,528,88,86);
		frm.add(jBoss3);
		
		jBoss4.setBounds(665,270,104,145);
		frm.add(jBoss4);
		
		monster monster1=new monster("image\\monster\\stand.png");
		Thread thread1=new Thread(monster1);
		
		monster2 monster_2=new monster2("image\\monster\\stand.png");
		Thread thread2=new Thread(monster_2);
		
		monster3 monster_3=new monster3("image\\monster\\stand.png");
		Thread thread3=new Thread(monster_3);
		
		monster4 monster_4=new monster4("image\\monster\\stand.png");
		Thread thread4=new Thread(monster_4);
		
		monster5 monster_5=new monster5("image\\monster\\stand.png");
		Thread thread5=new Thread(monster_5);
		
		jSkill4.setBounds(50,100,1360,768);
		frm.add(jSkill4);
		
		/*jPortal2.setBounds(50,460,127,178);
		frm.add(jPortal2);
		
		jPortal5.setBounds(190,460,127,178);
		frm.add(jPortal5);
		
		jPortal.setBounds(320,460,127,178);
		frm.add(jPortal);
		
		jPortal3.setBounds(1050,460,127,178);
		frm.add(jPortal3);
		
		jPortal4.setBounds(1200,460,127,178);
		frm.add(jPortal4);*/
		
		jPortal2.setBounds(50,480,127,178);
		frm.add(jPortal2);
		
		jPortal5.setBounds(190,480,127,178);
		frm.add(jPortal5);
		
		jPortal.setBounds(320,480,127,178);
		frm.add(jPortal);
		
		jPortal3.setBounds(1050,480,127,178);
		frm.add(jPortal3);
		
		jPortal4.setBounds(1200,480,127,178);
		frm.add(jPortal4);
		
		//background
		jlabBackGround.setBounds(0,0,1389,803);
		frm.add(jlabBackGround);
		
		timer.start();
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		jSkill2.setVisible(false);
		jSkill3.setVisible(false);
		jSkill.setVisible(false);
		jSkill4.setVisible(false);
		monster1_damege.setVisible(false);
		monster2_damege.setVisible(false);
		monster3_damege.setVisible(false);
		monster4_damege.setVisible(false);
		monster5_damege.setVisible(false);
		jlabBackGround.setVisible(false);
		jBoss1.setVisible(false);
		jBoss2.setVisible(false);
		jBoss3.setVisible(false);
		jBoss4.setVisible(false);
		jlabBackGround.setVisible(true);
		
		//close window
		frm.addWindowListener(new WindowAdapter(){ 
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        }); 
	}
	
	public void keyTyped(KeyEvent e) {
		//System.out.println("type");
	}
     
	public void keyPressed(KeyEvent e) {
		if(!atDown&&e.getKeyCode()==39&&!attack&&!AtStirr){
			//System.out.println(Integer.toString(jCharacter.getX()));
			turnRightOrLeft=true;
			character=new ImageIcon("image\\charater\\run2.gif");
			if(jCharacter.getX()+5<1200 && jCharacter.getY()==440)
				jCharacter.setLocation(jCharacter.getX()+3,jCharacter.getY());
			else if(jCharacter.getY()==218&&jCharacter.getX()+5<717){
				jCharacter.setLocation(jCharacter.getX()+3,jCharacter.getY());
			}
		}
		else if(!atDown&&e.getKeyCode()==37&&!attack&&!AtStirr){
			//System.out.println(Integer.toString(jCharacter.getX()));
			turnRightOrLeft=false;
			character=new ImageIcon("image\\charater\\run.gif");
			if(jCharacter.getX()-5>-125 && jCharacter.getY()==440){
				jCharacter.setLocation(jCharacter.getX()-3,jCharacter.getY());
			}
			else if(jCharacter.getY()==218&&jCharacter.getX()-5>435){
				jCharacter.setLocation(jCharacter.getX()-3,jCharacter.getY());
			}
		}
		else if(e.getKeyCode()==38&&!attack){
			//System.out.println(Integer.toString(jCharacter.getY()));
			if(jCharacter.getX()<=664&&jCharacter.getX()>=634){
				character=new ImageIcon("image\\charater\\UpStair.gif");
				if(jCharacter.getY()-3<218){
					jCharacter.setLocation(jCharacter.getX(),218);
					AtStirr=false;
				}
				else{
					AtStirr=true;
					jCharacter.setLocation(jCharacter.getX(),jCharacter.getY()-3);
				}
			}
		}
		else if(e.getKeyCode()==40&&!attack){
			if(jCharacter.getX()<=664&&jCharacter.getX()>=634&&map1){
				character=new ImageIcon("image\\charater\\UpStair.gif");
				if(jCharacter.getY()+3>440){
					AtStirr=false;
					jCharacter.setLocation(jCharacter.getX(),440);
				}
				else{
					jCharacter.setLocation(jCharacter.getX(),jCharacter.getY()+3);
					AtStirr=true;
				}
			}
		}
		else if(e.getKeyCode()==67&&!attack&&!AtStirr){
			if(!turnRightOrLeft)
				character=new ImageIcon("image\\charater\\hit1.gif");
			else
				character=new ImageIcon("image\\charater\\hit2.gif");
			attack=true;
		}
		else if(e.getKeyCode()==90&&!attack&&!AtStirr){
			skill=true;
			skillMusic h=new skillMusic("music\\skill.wav");
			h.start();
			if(!turnRightOrLeft){
				skillIcon=new ImageIcon("image\\charater\\skill.gif");
				character=new ImageIcon("image\\charater\\hit1.gif");
			}
			else{
				character=new ImageIcon("image\\charater\\hit2.gif");
				skillIcon=new ImageIcon("image\\charater\\skill2.gif");
			}
			jSkill.setIcon(skillIcon);
			jSkill.setVisible(true);
			attack=true;
			skill1=true;
		}
		else if(!atJump&&!atDown&&e.getKeyCode()==86&&!AtStirr){
			skillMusic h=new skillMusic("music\\Jump.wav");
			h.start();
			atJump=true;
		}
		//space
		else if(e.getKeyCode()==32){
			//System.out.println("space");
			if(jCharacter.getX()>-67&&jCharacter.getX()<-8){
				backgroundd=new ImageIcon("image\\backGround\\000030001.png");
				jlabBackGround.setIcon(backgroundd);
				jlabBackGround.setLocation(0,0);
				apw.stop();
				jBoss1.setVisible(false);
				jBoss2.setVisible(false);
				jBoss3.setVisible(false);
				jBoss4.setVisible(false);
				map1=false;
				apw=new AePlayWave("music\\backGround\\missingYou.wav");
				apw.start();
			}
			if(jCharacter.getX()>75&&jCharacter.getX()<138){
				backgroundd=new ImageIcon("image\\backGround\\211000000.png");
				jlabBackGround.setIcon(backgroundd);
				jBoss1.setVisible(false);
				jlabBackGround.setLocation(-20,0);
				jBoss2.setVisible(false);
				jBoss3.setVisible(true);
				jBoss4.setVisible(false);
				map1=false;
				apw.stop();
				apw=new AePlayWave("music\\backGround\\SnowyVillage.wav");
				apw.start();
			}
			if(jCharacter.getX()>198&&jCharacter.getX()<267){
				backgroundd=new ImageIcon("image\\backGround\\270051100-2.png");//.gif");
				jlabBackGround.setIcon(backgroundd);
				map1=false;
				jBoss4.setVisible(false);
				jBoss3.setVisible(false);
				jBoss1.setVisible(false);
				jlabBackGround.setLocation(-20,-30);
				apw.stop();
				jBoss2.setVisible(true);
				apw=new AePlayWave("music\\backGround\\TimeTemple.wav");
				apw.start();
			}
			if(jCharacter.getX()>939&&jCharacter.getX()<993){
				jBoss1.setVisible(true);
				backgroundd=new ImageIcon("image\\backGround\\280030000.png");
				jlabBackGround.setIcon(backgroundd);
				jlabBackGround.setLocation(-20,-20);
				jBoss2.setVisible(false);
				jBoss3.setVisible(false);
				jBoss4.setVisible(false);
				map1=false;
				apw.stop();
				apw=new AePlayWave("music\\backGround\\TheWorld'sEnd.wav");
				apw.start();
			}
			if(jCharacter.getX()>1080&&jCharacter.getX()<1140){
				backgroundd=new ImageIcon("image\\backGround\\1234.png");
				jlabBackGround.setIcon(backgroundd);
				jlabBackGround.setLocation(-10,-30);
				jBoss1.setVisible(false);
				jBoss2.setVisible(false);
				jBoss3.setVisible(false);
				jBoss4.setVisible(true);
				map1=false;
				apw.stop();
				apw=new AePlayWave("music\\backGround\\TempleOfDarkness.wav");
				apw.start();
			}
		}
		//x
		else if(!skill2&&e.getKeyCode()==88){
			skill=true;
			jSkill2.setVisible(true);
			skill2=true;
			hit=new skillMusic("music\\skill2\\use1.wav");
			hit.start();
			attack=true;
			if(!turnRightOrLeft){
				character=new ImageIcon("image\\charater\\hit1.gif");
			}
			else{
				character=new ImageIcon("image\\charater\\hit2.gif");
			}
		}
		//a
		else if(!skill3&&e.getKeyCode()==65){
			jSkill3.setIcon(skill3Icon);
			jSkill3.setVisible(true);
			jSkill3.setLocation(jCharacter.getX()-500,jCharacter.getY()-800);
			hit=new skillMusic("music\\skill3\\400011057.Use.wav");
			hit.start();
			skill3=true;
			if(!turnRightOrLeft){
				character=new ImageIcon("image\\charater\\hit1.gif");
			}
			else{
				character=new ImageIcon("image\\charater\\hit2.gif");
			}
		}
		else if(!skill4 && e.getKeyCode()==83){
			jSkill4.setVisible(true);
			skill4=true;
			if(!turnRightOrLeft){
				character=new ImageIcon("image\\charater\\hit1.gif");
			}
			else{
				character=new ImageIcon("image\\charater\\hit2.gif");
			}
		}
		jCharacter.setIcon(character);
	}
     
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==67){	
			attack=false;
		}
		if(!attack&&!skill&&!skill4){
			if(jCharacter.getX()<=664&&jCharacter.getX()>=634&& AtStirr &&!attack){
				character=new ImageIcon("image\\charater\\AtStair.png");
			}
			else if(turnRightOrLeft)
				character=new ImageIcon("image\\charater\\stand2.gif");
			else
				character=new ImageIcon("image\\charater\\stand.gif");
			jCharacter.setIcon(character);
		}
	}
	public void actionPerformed(ActionEvent e) 
	{
		//jump fall
		if(atJump){
			if(count<50){
				if(!turnRightOrLeft)
					character=new ImageIcon("image\\charater\\jump.png");
				else
					character=new ImageIcon("image\\charater\\jump2.png");
				jCharacter.setIcon(character);
				jCharacter.setLocation(jCharacter.getX(),jCharacter.getY()-1);
				count++;
			}
			else{
				atJump=false;
				atDown=true;
				count=0;
			}
		}
		if(atDown){
			if(count<50){
				jCharacter.setLocation(jCharacter.getX(),jCharacter.getY()+1);
				count++;
			}
			else{
				atDown=false;
				count=0;
				//timer.stop();
				if(!turnRightOrLeft)
					character=new ImageIcon("image\\charater\\stand.gif");
				else
					character=new ImageIcon("image\\charater\\stand2.gif");
				jCharacter.setIcon(character);
			}
		}
		//portal
		if(true){
			/*if(count2==10){
				portalIcon=new ImageIcon("image\\portal\\portal.game.pv.4."+portalTo+".png");
				jPortal.setIcon(portalIcon);
				jPortal2.setIcon(portalIcon);
				jPortal3.setIcon(portalIcon);
				jPortal4.setIcon(portalIcon);
				jPortal5.setIcon(portalIcon);
				
				portalTo++;
				if(portalTo>12)
					portalTo=0;
				if(count2>10)
				count2=0;
			}*/
			if(count2==20){
				portalIcon=new ImageIcon("image\\portal\\"+portalTo+".png");
				jPortal.setIcon(portalIcon);
				jPortal2.setIcon(portalIcon);
				jPortal3.setIcon(portalIcon);
				jPortal4.setIcon(portalIcon);
				jPortal5.setIcon(portalIcon);
				
				portalTo++;
				if(portalTo>7)
					portalTo=1;
			}
			count2++;
			if(count2>20)
				count2=0;
		}
		
		if(skill1){
			count4++;
			if(count4>280){
				skill1=false;
				attack=false;
				skill=false;
				jSkill.setVisible(false);
				if(!turnRightOrLeft)
					character=new ImageIcon("image\\charater\\stand.gif");
				else
					character=new ImageIcon("image\\charater\\stand2.gif");
				jCharacter.setIcon(character);
				count4=0;
			}
		}
		
		//adele新角技能
		if(skill2){
			count3++;
			if(count3>1650){
				skill2=false;
				count3=0;
				jSkill2.setVisible(false);
				skill=false;
				attack=false;
				
				if(!turnRightOrLeft)
					character=new ImageIcon("image\\charater\\stand.gif");
				else
					character=new ImageIcon("image\\charater\\stand2.gif");
				jCharacter.setIcon(character);
			}
		}
		
		//惡婦五轉技
		if(skill3&&!skill3Exist&&!deathSkill3){
			count4++;
			if(count4>500){
				skill=true;
				skill3Exist=true;
				hit=new skillMusic("music\\skill3\\400011057.Summoned.wav");
				hit.start();
				count4=0;
				if(!turnRightOrLeft)
					character=new ImageIcon("image\\charater\\stand.gif");
				else
					character=new ImageIcon("image\\charater\\stand2.gif");
				jCharacter.setIcon(character);
				skill3Icon=new ImageIcon("image\\charater\\5XEfr6X.gif");
				jSkill3.setIcon(skill3Icon);
				//jSkill.setLocation()
			}
		}
		if(skill3&&skill3Exist&&!deathSkill3){
			if(count4%350==0){
				hit.stop();
				hit=new skillMusic("music\\skill3\\400011057.Attack1.wav");
				hit.start();
			}
			count4++;
			if(count4>2000){
				deathSkill3=true;
				hit=new skillMusic("music\\skill3\\400011057.Die.wav");
				hit.start();
				count4=0;
				skill3Icon=new ImageIcon("image\\charater\\8iiVRT3.gif");
				jSkill3.setIcon(skill3Icon);
				//jSkill.setLocation()
			}
		}
		if(skill3&&skill3Exist&&deathSkill3){
			count4++;
			if(count4>500){
				deathSkill3=false;
				skill3Exist=false;
				skill3=false;
				skill=false;
				count4=0;
				skill3Icon=new ImageIcon("image\\charater\\8fXp4Jm.gif");
				jSkill3.setIcon(skill3Icon);
				jSkill3.setVisible(false);
				//jSkill.setLocation()
			}
		}
		if(skill4){
			if(count5==450){
				skill=true;
				attack=false;
			}
			if(count5==200){
				hit=new skillMusic("music\\skill4\\Use.wav");
				hit.start();
			}
			count5++;
			if(count5>900){
				skill4=false;
				count5=0;
				jSkill4.setVisible(false);
				skill=false;
				attack=false;
				
				if(!turnRightOrLeft)
					character=new ImageIcon("image\\charater\\stand.gif");
				else
					character=new ImageIcon("image\\charater\\stand2.gif");
				jCharacter.setIcon(character);
			}
		}
	}
	
}