import java.util.*;
class number{
	int number;
	number(){
		number = 0;
	}
	number(int x){
		number = x;
	} 
	public int random(){
		Random ran = new Random();
		return number = ran.nextInt();
	}
	public int random(int x){
		Random ran = new Random();
		return number = ran.nextInt(x)+1;
	}
	public void read(){
		Scanner x = new Scanner(System.in);
		System.out.print("Enter the number :");
		number = x.nextInt();
	}
	public boolean isEven(){
		if(number%2==0){
			return true;
		}else{return false;}
	}
	public boolean isEven(int x){
		if(x.number%2==0) return true;
			else return false;
	}
	public void add(number b){
		number = number + number.b;
	}
	public void print(){
		System.out.print("Number = "+number);
	}
	
}