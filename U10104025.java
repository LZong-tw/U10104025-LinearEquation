/**
 * Name: Yun-Chung Lin
 * ID: U1010425
 * Ex: 8.11-Linear Equations
 * Information: 
 *		
 */

//import Method
import java.util.Scanner;

public class U10104025{
	public static void main(String[] args){
		//Create a scanner object.
		Scanner ipt=new Scanner(System.in);

		//Tips for user.
		System.out.printf("Solve:\nax+by=e\ncx+dy=f\n");
		System.out.printf("Please enter six coefficients a,b,c,d,e and f:\n");

		//Create a LinearEquation object, and get the six coefficients.
		LinearEquation solv1=new LinearEquation(ipt.nextInt(),ipt.nextInt(),ipt.nextInt(),ipt.nextInt(),ipt.nextInt(),ipt.nextInt());
		
		//Answer the question base on the value of function "isSolvable()". 
		//If it's solvable, then....
		if(solv1.isSolvable())
			System.out.printf("X= %f, Y= %f\n",solv1.getX(),solv1.getY());

		//If it's unsolvable, then....
		else
			System.out.printf("The equation has no solution.\n");
	}
}

class LinearEquation{
	private int a,b,c,d,e,f;

	//Constructor, setting the value for each argument.
	LinearEquation(int newa,int newb,int newc,int newd,int newe,int newf){
    	a=newa;
    	b=newb;
    	c=newc;
    	d=newd;
    	e=newe;
    	f=newf;
  	}

  	//Six get methods for six coefficients.
	int geta(){
		return a;
	}
	int getb(){
		return b;
	}
	int getc(){
		return c;
	}
	int getd(){
		return d;
	}
	int gete(){
		return e;
	}
	int getf(){
		return f;
	}

	//A method judges that if a equation is solvable or not.
	boolean isSolvable(){

		//If "ad-bc" is not equal to 0, then returns true.
		if(geta()*getd()-getb()*getc()!=0)
			return true;
		
		//If "ad-bc" is equal to 0, then returns false.
		else
			return false;
	}

	//Two solvers for X and Y.
	double getX(){
		return (gete()*getd()-getb()*getf())/(geta()*getd()-getb()*getc());
	}
	double getY(){
		return (geta()*getf()-gete()*getc())/(geta()*getd()-getb()*getc());
	}

}
