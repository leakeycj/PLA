package lan;

import java.util.ArrayList;
import java.util.List;
/*
 * ��0�����w1 w2 ʵ��PLA ֻ�����Կɷ���Ч
 */
public class Pla {
	//public static  List< Point> points = new ArrayList<Point>();
	
	public Pla(List< Point> points){
		int w1,w2,b;
		w1=w2=0;
		b=0;//�ؾ�
		boolean flag = false;
		while (!flag){
			int count =0;
			for(int i=0;i<points.size();i++){
				//System.out.println("===="+i+"===="+(points.get(i).lab*(w1*points.get(i).x+w2*points.get(i).y)));
				if((points.get(i).lab*(w1*points.get(i).x+w2*points.get(i).y+b))<=0){
					
					w1 = w1 + points.get(i).x*points.get(i).lab;
					w2 = w2 + points.get(i).y*points.get(i).lab;
					b = b + points.get(i).lab;//���½ؾ�
					System.out.println(w1+" "+w2+" "+ b);
					count--;
				}
				count++;

			}
			if(count==points.size())flag =true;
		}
		System.out.println(w1+" "+w2);
		
	}
	public static void main(String[] args) {
		List< Point> points = new ArrayList<Point>();
		Point p1= new Point(0, 1, 1);
		Point p2= new Point(1,0,1);
		Point p3= new Point(1,2,-1);
		Point p4= new Point(2,1,-1);
		Point p5= new Point(2,2,-1);
		points.add(p1);
		points.add(p2);
		points.add(p3);
		points.add(p4);
		points.add(p5);
		//System.out.println(points.get(0).x);
		Pla p = new Pla(points);
	}

}
class Point {
	int x,y,lab;
	public  Point(int x,int y,int lab){
		this.x =x;
		this.y =y;
		this.lab =lab;		
	}
}