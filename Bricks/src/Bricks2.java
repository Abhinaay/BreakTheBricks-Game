import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Bricks2 extends Thread implements KeyListener,MouseMotionListener 
{
	JFrame jf;
	JPanel jp1,jp2,jp3,jp4,jpleft,jpright,jptop;
	JButton jb1;
	JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14,jl15,jl16,jl17,jl18,jl19,jl20;
	JLabel jl21,jl22,jl23,jl24,jl25,jl26,jl27,jl28,jl29,jl30,jl31,jl32,jl33,jl34,jl35,jl36,jl37,jl38,jl39,jl40;
	JLabel jl41,jl42,jl43,jl44,jl45,jl46,jl47,jl48,jl49,jl50,jl51,jl52,jl53,jl54,jl55,jl56,jl57,jl58,jl59,jl60;
	JLabel jl61,jl62,jl63,jl64,jl65,jl66,jl67,jl68,jl69,jl70,jl71,jl72,jl73,jl74,jl75,jl76,jl77,jl78,jl79,jl80;
	JLabel jl81,jl82,jl83,jl84,jl85,jl86,jl87,jl88,jl89,jl90,jl91,jl92,jl93,jl94,jl95,jl96,jl97,jl98,jl99,jl100;
	JLabel bat,ball,exit,life1,life2,life3,message1,message2,message3,message4;
	int jfx,jfy,batx=600,ballx=5,bally=500,z=0;
	int movingleft=1,movingright=0,movingup=1,movingdown=0;
	Thread th1;
	
	Bricks2()
	{	
		jf=new JFrame();
		
		BorderLayout bl=new BorderLayout();
		GridLayout gl=new GridLayout(10,10);
		
		jf.setLayout(bl);
		jf.setContentPane(new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\bg21.jpg")));
		jf.add(exit=new JLabel("To Exit Window, Press: Alt+f4"));
		exit.setOpaque(false);
		exit.setForeground(Color.white);
		
		
		jf.add(BorderLayout.WEST,jpleft=new JPanel());
		jf.add(BorderLayout.EAST,jpright=new JPanel());
		jf.add(BorderLayout.NORTH,jptop=new JPanel());
		jpleft.setSize(5, jf.getHeight());
		jpright.setSize(5, jf.getHeight());
		jptop.setSize(jf.getWidth(),5);
		jpleft.setOpaque(false);
		jpright.setOpaque(false);
		jptop.setOpaque(false);
		
		jf.add(BorderLayout.CENTER,jp1=new JPanel());
			//jp1.setBackground(Color.pink);
			jp1.setOpaque(false);
			jp1.setLayout(null);
			jp1.add(bat=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\bat1.png")));
			jp1.add(ball=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\ball1.png")));
			jp1.add(jp3=new JPanel());
			jp3.setOpaque(false);
			jp3.add(life1=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\heart2.png","1")));
			jp3.add(life2=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\heart2.png","2")));
			jp3.add(life3=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\heart2.png","3")));
		
			jp1.add( jp2=new JPanel());	
			jp2.setOpaque(false);
				//jp2.setBackground(Color.cyan);
				jp2.setLayout(gl);
				jp2.add(jl1=new JLabel());																								jp2.add(jl11=new JLabel());		
				jp2.add(jl2=new JLabel());																								jp2.add(jl12=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick4.png","12")));
				jp2.add(jl3=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick4.png","3")));		jp2.add(jl13=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick4.png","13")));
				jp2.add(jl4=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick4.png","4")));		jp2.add(jl14=new JLabel());
				jp2.add(jl5=new JLabel());																								jp2.add(jl15=new JLabel());
				jp2.add(jl6=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick4.png","6")));		jp2.add(jl16=new JLabel());
				jp2.add(jl7=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick4.png","7")));		jp2.add(jl17=new JLabel());
				jp2.add(jl8=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick5.png","8")));		jp2.add(jl18=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick5.png","18")));
				jp2.add(jl9=new JLabel());																								jp2.add(jl19=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick4.png","19")));
				jp2.add(jl10=new JLabel());																								jp2.add(jl20=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick4.png","20")));
				
				jp2.add(jl21=new JLabel());																								jp2.add(jl31=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick4.png","31")));		
				jp2.add(jl22=new JLabel());																								jp2.add(jl32=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick5.png","32")));
				jp2.add(jl23=new JLabel());																								jp2.add(jl33=new JLabel());
				jp2.add(jl24=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick5.png","24")));		jp2.add(jl34=new JLabel());
				jp2.add(jl25=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick4.png","25")));		jp2.add(jl35=new JLabel());
				jp2.add(jl26=new JLabel());																								jp2.add(jl36=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick4.png","36")));
				jp2.add(jl27=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick5.png","27")));		jp2.add(jl37=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick5.png","37")));
				jp2.add(jl28=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick5.png","28")));		jp2.add(jl38=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick5.png","38")));
				jp2.add(jl29=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick5.png","29")));		jp2.add(jl39=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick5.png","39")));
				jp2.add(jl30=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick4.png","30")));		jp2.add(jl40=new JLabel());
				
				jp2.add(jl41=new JLabel());																								jp2.add(jl51=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick4.png","51")));		
				jp2.add(jl42=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick5.png","42")));		jp2.add(jl52=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick5.png","52")));
				jp2.add(jl43=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick5.png","43")));		jp2.add(jl53=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick5.png","53")));
				jp2.add(jl44=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick5.png","44")));		jp2.add(jl54=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick5.png","54")));
				jp2.add(jl45=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick4.png","45")));		jp2.add(jl55=new JLabel());
				jp2.add(jl46=new JLabel());																								jp2.add(jl56=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick4.png","56")));
				jp2.add(jl47=new JLabel());																								jp2.add(jl57=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick5.png","57")));
				jp2.add(jl48=new JLabel());																								jp2.add(jl58=new JLabel());
				jp2.add(jl49=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick5.png","49")));		jp2.add(jl59=new JLabel());
				jp2.add(jl50=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick4.png","50")));		jp2.add(jl60=new JLabel());
				
				jp2.add(jl61=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick4.png","61")));		jp2.add(jl71=new JLabel());		
				jp2.add(jl62=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick4.png","62")));		jp2.add(jl72=new JLabel());
				jp2.add(jl63=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick5.png","63")));		jp2.add(jl73=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick5.png","73")));
				jp2.add(jl64=new JLabel());																								jp2.add(jl74=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick4.png","74")));
				jp2.add(jl65=new JLabel());																								jp2.add(jl75=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick4.png","75")));
				jp2.add(jl66=new JLabel());																								jp2.add(jl76=new JLabel());
				jp2.add(jl67=new JLabel());																								jp2.add(jl77=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick4.png","77")));
				jp2.add(jl68=new JLabel());																								jp2.add(jl78=new JLabel());
				jp2.add(jl69=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick4.png","69")));		jp2.add(jl79=new JLabel());
				jp2.add(jl70=new JLabel());																								jp2.add(jl80=new JLabel());
				
				jp2.add(jl81=new JLabel());																								jp2.add(jl91=new JLabel());		
				jp2.add(jl82=new JLabel());																								jp2.add(jl92=new JLabel());
				jp2.add(jl83=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick4.png","83")));		jp2.add(jl93=new JLabel(new ImageIcon("C:\\Users\\Abhinay\\Desktop\\javaprograms\\Swing\\pic\\brick4.png","93")));
				jp2.add(jl84=new JLabel());																								jp2.add(jl94=new JLabel());
				jp2.add(jl85=new JLabel());																								jp2.add(jl95=new JLabel());
				jp2.add(jl86=new JLabel());																								jp2.add(jl96=new JLabel());
				jp2.add(jl87=new JLabel());																								jp2.add(jl97=new JLabel());
				jp2.add(jl88=new JLabel());																								jp2.add(jl98=new JLabel());
				jp2.add(jl89=new JLabel());																								jp2.add(jl99=new JLabel());
				jp2.add(jl90=new JLabel());																								jp2.add(jl100=new JLabel());
				
				
						
		
			//jf.setSize(800,600);
			jf.setUndecorated(true);
			jf.setExtendedState(jf.MAXIMIZED_BOTH);	
		jf.setVisible(true);
		jf.setTitle("Bricks");
		jf.setDefaultCloseOperation(3);
		jf.setResizable(false);
		
		
		
		jfx=jf.getWidth();
		jfy=jf.getHeight();
		//System.out.println(jfx);
		//System.out.println(jfy);
		jp1.setSize(jfx,jfy);
		jp2.setSize(jp1.getWidth(),jp1.getHeight()/2-50);
		jp3.setBounds(5,jp1.getHeight()-40, 140,30);
		bat.setBounds(batx, jp1.getHeight()-70, 150, 20);
		ball.setBounds(ballx, bally,50,50);
		exit.setBounds(jp1.getWidth()-200, jf.getHeight()-30, 200, 30);
		messageDialogue1();
		jf.addKeyListener(this);
		jf.addMouseMotionListener(this);
		
		th1=new Thread()
		{
			public void run()
			{	
				while(true)
				{
					if((movingup==1 && movingright==1) || (movingup==1 && movingleft==1))
					{	
						break1();
					}
					if((movingdown==1 && movingright==1) || (movingdown==1 && movingleft==1))
					{
						break2();
					}
				
				
					if(movingleft==1)
					{
						try {Thread.sleep(1);} catch(Exception e){}
						if(ballx==jpleft.getX())
						{
							movingleft=0;
							movingright=1;
							
						}
						ballx--;
						
					}
					if(movingup==1)
					{
						try {Thread.sleep(1);} catch(Exception e){}
						if(bally==jptop.getX())
						{
							movingup=0;
							movingdown=1;
							
						}
						bally--;
						
					}
					if(movingright==1)
					{
						try {Thread.sleep(1);} catch(Exception e){}
						if(ballx==jp1.getWidth()-40)
						{
							movingleft=1;
							movingright=0;
							
						}
						ballx++;
						
					}
					if(movingdown==1)
					{
						try {Thread.sleep(1);} catch(Exception e){}
						if(bally==bat.getY()-50&&ballx<batx+150==ballx>batx-50)
						{
							movingup=1;
							movingdown=0;
							
						}
						else if(bally>=bat.getY())
						{
							
							if(life3.getText()!="")
							{	life3.setIcon(new ImageIcon(""));
								life3.setText("");
								
							}
							else
							{
								if(life2.getText()!="")
								{
									life2.setIcon(new ImageIcon(""));
									life2.setText("");
									
								}
								else
								{
									if(life1.getText()!="")
									{
										life1.setIcon(new ImageIcon(""));
										life1.setText("");
										
									}
								}
							}
							movingup=1;
							movingdown=0;
						}
						bally++;
						
					}
					ball.setBounds(ballx, bally,50,50);
					
					
					
					if(life1.getText()=="")
					{
						messageDialogue2();
						th1.stop();
						
					}
					
					if(z==44)
					{
						messageDialogue3();
						th1.stop();
					}
				}
			}
		};
		
		
		
	}
	
	public static void main(String[] args) 
	{
		new Bricks2();
	}

	
	public void keyPressed(KeyEvent ke) 
	{
		if(ke.getKeyCode()==KeyEvent.VK_LEFT)
		{
			batx=batx-30;
			bat.setBounds(batx, jp1.getHeight()-70, 150, 20);
		}
		
		if(ke.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			batx=batx+30;
			bat.setBounds(batx, jp1.getHeight()-70, 150, 20);
		}
		
		
		if(ke.getKeyCode()==KeyEvent.VK_SPACE)
		{
			message1.setVisible(false);
			th1.start();
			
		}
		if(ke.getKeyCode()==KeyEvent.VK_ENTER)
		{	
				new Bricks1();
			
		}
		if(ke.getKeyChar()=='p')
		{
			  th1.suspend();
			 
		}
		if(ke.getKeyChar()=='r')
		{
			  th1.resume();
		}
		
	}

	
	public void keyReleased(KeyEvent arg0) {
		
		
	}

	
	public void keyTyped(KeyEvent arg0) {
		
		
	}
	public void messageDialogue1()
	{		
		jp1.add(message1=new JLabel("<html><font size=8 color=white>Press 'SPACE' To Start Game</font></html>"));
		message1.setBounds(430, 350, 800, 100);
		message1.setOpaque(false);
		
	}
	public void messageDialogue2()
	{		
		jp1.add(message2=new JLabel("GAME OVER"));
		message2.setFont(new Font("Cooper",Font.BOLD,128));
		message2.setForeground(Color.white);
		message2.setBounds(295, 300, 800, 300);
		message2.setOpaque(false);
		
	}
	public void messageDialogue3()
	{
		jp1.add(message3=new JLabel("LEVEL-1 COMPLETED"));
		message3.setFont(new Font("Cooper",Font.BOLD,64));
		message3.setForeground(Color.white);
		message3.setBounds(358, 100, 800, 300);
		message3.setOpaque(false);
		
		jp1.add(message4=new JLabel("Press 'Enter' To Start Next Level"));
		message4.setFont(new Font("Cooper",Font.BOLD,64));
		message4.setForeground(Color.white);
		message4.setBounds(200, 400, 1000, 100);
		message4.setOpaque(false);
	}
	
	public void break1()
	{
		if(bally==jl12.getY()+30 && ballx<jl12.getX()+130==ballx>jl12.getX()-65)
		{	if(jl12.isVisible()==true)
			{jl12.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl3.getY()+30 && ballx<jl3.getX()+130==ballx>jl3.getX()-65)
		{	if(jl3.isVisible()==true)
			{jl3.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl13.getY()+30 && ballx<jl13.getX()+130==ballx>jl13.getX()-65)
		{	if(jl13.isVisible()==true)
			{jl13.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl4.getY()+30 && ballx<jl4.getX()+130==ballx>jl4.getX()-65)
		{	if(jl4.isVisible()==true)
			{jl4.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl6.getY()+30 && ballx<jl6.getX()+130==ballx>jl6.getX()-65)
		{	if(jl6.isVisible()==true)
			{jl6.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl7.getY()+30 && ballx<jl7.getX()+130==ballx>jl7.getX()-65)
		{	if(jl7.isVisible()==true)
			{jl7.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl8.getY()+30 && ballx<jl8.getX()+130==ballx>jl8.getX()-65)
		{	if(jl8.isVisible()==true)
			{jl8.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl18.getY()+30 && ballx<jl18.getX()+130==ballx>jl18.getX()-65)
		{	if(jl18.isVisible()==true)
			{jl18.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl19.getY()+30 && ballx<jl19.getX()+130==ballx>jl19.getX()-65)
		{	if(jl19.isVisible()==true)
			{jl19.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl20.getY()+30 && ballx<jl20.getX()+130==ballx>jl20.getX()-65)
		{	if(jl20.isVisible()==true)
			{jl20.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl24.getY()+30 && ballx<jl24.getX()+130==ballx>jl24.getX()-65)
		{	if(jl24.isVisible()==true)
			{jl24.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl25.getY()+30 && ballx<jl25.getX()+130==ballx>jl25.getX()-65)
		{	if(jl25.isVisible()==true)
			{jl25.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl27.getY()+30 && ballx<jl27.getX()+130==ballx>jl27.getX()-65)
		{	if(jl27.isVisible()==true)
			{jl27.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl28.getY()+30 && ballx<jl28.getX()+130==ballx>jl28.getX()-65)
		{	if(jl28.isVisible()==true)
			{jl28.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl29.getY()+30 && ballx<jl29.getX()+130==ballx>jl29.getX()-65)
		{	if(jl29.isVisible()==true)
			{jl29.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		
		if(bally==jl30.getY()+30 && ballx<jl30.getX()+130==ballx>jl30.getX()-65)
		{	if(jl30.isVisible()==true)
			{jl30.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			//Toolkit.getDefaultToolkit().beep();
			}
		}
		if(bally==jl31.getY()+30 && ballx<jl31.getX()+130==ballx>jl31.getX()-65)
		{	if(jl31.isVisible()==true)
			{jl31.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			//Toolkit.getDefaultToolkit().beep();
			}
		}
		if(bally==jl32.getY()+30 && ballx<jl32.getX()+130==ballx>jl32.getX()-65)
		{	if(jl32.isVisible()==true)
			{jl32.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			//Toolkit.getDefaultToolkit().beep();
			}
		}
		if(bally==jl36.getY()+30 && ballx<jl36.getX()+130==ballx>jl36.getX()-65)
		{	if(jl36.isVisible()==true)
			{jl36.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			//Toolkit.getDefaultToolkit().beep();
			}
		}
		if(bally==jl37.getY()+30 && ballx<jl37.getX()+130==ballx>jl37.getX()-65)
		{	if(jl37.isVisible()==true)
			{jl37.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl38.getY()+30 && ballx<jl38.getX()+130==ballx>jl38.getX()-65)
		{	if(jl38.isVisible()==true)
			{jl38.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl39.getY()+30 && ballx<jl39.getX()+130==ballx>jl39.getX()-65)
		{	if(jl39.isVisible()==true)
			{jl39.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl42.getY()+30 && ballx<jl42.getX()+130==ballx>jl42.getX()-65)
		{	if(jl42.isVisible()==true)
			{jl42.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl43.getY()+30 && ballx<jl43.getX()+130==ballx>jl43.getX()-65)
		{	if(jl43.isVisible()==true)
			{jl43.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl44.getY()+30 && ballx<jl44.getX()+130==ballx>jl44.getX()-65)
		{	if(jl44.isVisible()==true)
			{jl44.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl45.getY()+30 && ballx<jl45.getX()+130==ballx>jl45.getX()-65)
		{	if(jl45.isVisible()==true)
			{jl45.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl49.getY()+30 && ballx<jl49.getX()+130==ballx>jl49.getX()-65)
		{	if(jl49.isVisible()==true)
			{jl49.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl50.getY()+30 && ballx<jl50.getX()+130==ballx>jl50.getX()-65)
		{	if(jl50.isVisible()==true)
			{jl50.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl51.getY()+30 && ballx<jl51.getX()+130==ballx>jl51.getX()-65)
		{	if(jl51.isVisible()==true)
			{jl51.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl52.getY()+30 && ballx<jl52.getX()+130==ballx>jl52.getX()-65)
		{	if(jl52.isVisible()==true)
			{jl52.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl53.getY()+30 && ballx<jl53.getX()+130==ballx>jl53.getX()-65)
		{	if(jl53.isVisible()==true)
			{jl53.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl54.getY()+30 && ballx<jl54.getX()+130==ballx>jl54.getX()-65)
		{	if(jl54.isVisible()==true)
			{jl54.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl56.getY()+30 && ballx<jl56.getX()+130==ballx>jl56.getX()-65)
		{	if(jl56.isVisible()==true)
			{jl56.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl57.getY()+30 && ballx<jl57.getX()+130==ballx>jl57.getX()-65)
		{	if(jl57.isVisible()==true)
			{jl57.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl61.getY()+30 && ballx<jl61.getX()+130==ballx>jl61.getX()-65)
		{	if(jl61.isVisible()==true)
			{jl61.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl62.getY()+30 && ballx<jl62.getX()+130==ballx>jl62.getX()-65)
		{	if(jl62.isVisible()==true)
			{jl62.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl63.getY()+30 && ballx<jl63.getX()+130==ballx>jl63.getX()-65)
		{	if(jl63.isVisible()==true)
			{jl63.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl69.getY()+30 && ballx<jl69.getX()+130==ballx>jl69.getX()-65)
		{	if(jl69.isVisible()==true)
			{jl69.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl73.getY()+30 && ballx<jl73.getX()+130==ballx>jl73.getX()-65)
		{	if(jl73.isVisible()==true)
			{jl73.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl74.getY()+30 && ballx<jl74.getX()+130==ballx>jl74.getX()-65)
		{	if(jl74.isVisible()==true)
			{jl74.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl75.getY()+30 && ballx<jl75.getX()+130==ballx>jl75.getX()-65)
		{	if(jl75.isVisible()==true)
			{jl75.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}
		}
		if(bally==jl77.getY()+30 && ballx<jl77.getX()+130==ballx>jl77.getX()-65)
		{	if(jl77.isVisible()==true)
			{jl77.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			}			
		}
		if(bally==jl83.getY()+30 && ballx<jl83.getX()+130==ballx>jl83.getX()-65)
		{	if(jl83.isVisible()==true)		
			{
			//Toolkit.getDefaultToolkit().beep();
			jl83.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			
			}			
		}
		if(bally==jl93.getY()+30 && ballx<jl93.getX()+130==ballx>jl93.getX()-65)
		{	if(jl93.isVisible()==true)
			{
			//Toolkit.getDefaultToolkit().beep();
			jl93.setVisible(false);
			movingup=0;
			movingdown=1;
			z++;
			
			}			
		}
		
	}

	public void break2()
	{
		if(bally==jl12.getY()-10 && ballx<jl12.getX()+130==ballx>jl12.getX()-65)
		{	if(jl12.isVisible()==true)
			{
			//Toolkit.getDefaultToolkit().beep();
			jl12.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			
			}
		}
		if(bally==jl3.getY()-10 && ballx<jl3.getX()+130==ballx>jl3.getX()-65)
		{	if(jl3.isVisible()==true)
			{jl3.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl13.getY()-10 && ballx<jl13.getX()+130==ballx>jl13.getX()-65)
		{	if(jl13.isVisible()==true)
			{jl13.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl4.getY()-10 && ballx<jl4.getX()+130==ballx>jl4.getX()-65)
		{	if(jl4.isVisible()==true)
			{jl4.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl6.getY()-10 && ballx<jl6.getX()+130==ballx>jl6.getX()-65)
		{	if(jl6.isVisible()==true)
			{jl6.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl7.getY()-10 && ballx<jl7.getX()+130==ballx>jl7.getX()-65)
		{	if(jl7.isVisible()==true)
			{jl7.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl8.getY()-10 && ballx<jl8.getX()+130==ballx>jl8.getX()-65)
		{	if(jl8.isVisible()==true)
			{jl8.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl18.getY()-10 && ballx<jl18.getX()+130==ballx>jl18.getX()-65)
		{	if(jl18.isVisible()==true)
			{jl18.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl19.getY()-10 && ballx<jl19.getX()+130==ballx>jl19.getX()-65)
		{	if(jl19.isVisible()==true)
			{jl19.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl20.getY()-10 && ballx<jl20.getX()+130==ballx>jl20.getX()-65)
		{	if(jl20.isVisible()==true)
			{jl20.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl24.getY()-10 && ballx<jl24.getX()+130==ballx>jl24.getX()-65)
		{	if(jl24.isVisible()==true)
			{jl24.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl25.getY()-10 && ballx<jl25.getX()+130==ballx>jl25.getX()-65)
		{	if(jl25.isVisible()==true)
			{jl25.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl27.getY()-10 && ballx<jl27.getX()+130==ballx>jl27.getX()-65)
		{	if(jl27.isVisible()==true)
			{jl27.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl28.getY()-10 && ballx<jl28.getX()+130==ballx>jl28.getX()-65)
		{	if(jl28.isVisible()==true)
			{jl28.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl29.getY()-10 && ballx<jl29.getX()+130==ballx>jl29.getX()-65)
		{	if(jl29.isVisible()==true)
			{jl29.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		
		if(bally==jl30.getY()-10 && ballx<jl30.getX()+130==ballx>jl30.getX()-65)
		{	if(jl30.isVisible()==true)
			{jl30.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl31.getY()-10 && ballx<jl31.getX()+130==ballx>jl31.getX()-65)
		{	if(jl31.isVisible()==true)
			{jl31.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl32.getY()-10 && ballx<jl32.getX()+130==ballx>jl32.getX()-65)
		{	if(jl32.isVisible()==true)
			{jl32.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl36.getY()-10 && ballx<jl36.getX()+130==ballx>jl36.getX()-65)
		{	if(jl36.isVisible()==true)
			{jl36.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl37.getY()-10 && ballx<jl37.getX()+130==ballx>jl37.getX()-65)
		{	if(jl37.isVisible()==true)
			{jl37.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl38.getY()-10 && ballx<jl38.getX()+130==ballx>jl38.getX()-65)
		{	if(jl38.isVisible()==true)
			{jl38.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl39.getY()-10 && ballx<jl39.getX()+130==ballx>jl39.getX()-65)
		{	if(jl39.isVisible()==true)
			{jl39.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl42.getY()-10 && ballx<jl42.getX()+130==ballx>jl42.getX()-65)
		{	if(jl42.isVisible()==true)
			{jl42.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl43.getY()-10 && ballx<jl43.getX()+130==ballx>jl43.getX()-65)
		{	if(jl43.isVisible()==true)
			{jl43.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl44.getY()-10 && ballx<jl44.getX()+130==ballx>jl44.getX()-65)
		{	if(jl44.isVisible()==true)
			{jl44.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl45.getY()-10 && ballx<jl45.getX()+130==ballx>jl45.getX()-65)
		{	if(jl45.isVisible()==true)
			{jl45.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl49.getY()-10 && ballx<jl49.getX()+130==ballx>jl49.getX()-65)
		{	if(jl49.isVisible()==true)
			{jl49.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl50.getY()-10 && ballx<jl50.getX()+130==ballx>jl50.getX()-65)
		{	if(jl50.isVisible()==true)
			{jl50.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl51.getY()-10 && ballx<jl51.getX()+130==ballx>jl51.getX()-65)
		{	if(jl51.isVisible()==true)
			{jl51.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl52.getY()-10 && ballx<jl52.getX()+130==ballx>jl52.getX()-65)
		{	if(jl52.isVisible()==true)
			{jl52.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl53.getY()-10 && ballx<jl53.getX()+130==ballx>jl53.getX()-65)
		{	if(jl53.isVisible()==true)
			{jl53.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl54.getY()-10 && ballx<jl54.getX()+130==ballx>jl54.getX()-65)
		{	if(jl54.isVisible()==true)
			{jl54.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl56.getY()-10 && ballx<jl56.getX()+130==ballx>jl56.getX()-65)
		{	if(jl56.isVisible()==true)
			{jl56.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl57.getY()-10 && ballx<jl57.getX()+130==ballx>jl57.getX()-65)
		{	if(jl57.isVisible()==true)
			{jl57.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl61.getY()-10 && ballx<jl61.getX()+130==ballx>jl61.getX()-65)
		{	if(jl61.isVisible()==true)
			{jl61.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl62.getY()-10 && ballx<jl62.getX()+130==ballx>jl62.getX()-65)
		{	if(jl62.isVisible()==true)
			{jl62.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl63.getY()-10 && ballx<jl63.getX()+130==ballx>jl63.getX()-65)
		{	if(jl63.isVisible()==true)
			{jl63.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl69.getY()-10 && ballx<jl69.getX()+130==ballx>jl69.getX()-65)
		{	if(jl69.isVisible()==true)
			{jl69.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl73.getY()-10 && ballx<jl73.getX()+130==ballx>jl73.getX()-65)
		{	if(jl73.isVisible()==true)
			{jl73.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl74.getY()-10 && ballx<jl74.getX()+130==ballx>jl74.getX()-65)
		{	if(jl74.isVisible()==true)
			{jl74.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl75.getY()-10 && ballx<jl75.getX()+130==ballx>jl75.getX()-65)
		{	if(jl75.isVisible()==true)
			{jl75.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}
		}
		if(bally==jl77.getY()-10 && ballx<jl77.getX()+130==ballx>jl77.getX()-65)
		{	if(jl77.isVisible()==true)
			{jl77.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}			
		}
		if(bally==jl83.getY()-10 && ballx<jl83.getX()+130==ballx>jl83.getX()-65)
		{	if(jl83.isVisible()==true)		
			{jl83.setVisible(false);
			movingup=1;
			movingdown=0;
			z++;
			}			
		}
		if(bally==jl93.getY()-10 && ballx<jl93.getX()+130==ballx>jl93.getX()-65)
		{	if(jl93.isVisible()==true)
			{jl93.setVisible(false);
			movingup=1;
 			movingdown=0;
			z++;
			}			
		}
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) 
	{
		bat.setAlignmentX(arg0.getX());
	
		
	}



}

