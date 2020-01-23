package application;

import javafx.scene.shape.Circle;

public class Player {
	boolean won;
	int Player_Start_Pos;
	int P_E_X;
	int P_E_Y;
	boolean[] Dogs_Entering=new boolean[4];
	int[] Dogs_Pos=new int[4];
	int[][] Dogs_Pos_Ininial_Cord=new int[2][4];
	boolean[] Dogs_Alive=new boolean[4];
	boolean[] Dogs_Entered=new boolean[4];
	Circle[] Dogs = new Circle[4];
	
	
	double CurrentProg;
	String Name;
	String color;
	
	Player(String Name,String color){
		this.Name=Name;
		this.color=color;
		
		won=false;
		
		CurrentProg=0;
		
		for (int i=0;i<4;i++) {
			Dogs_Pos[i]=0;
		}
	}
}
