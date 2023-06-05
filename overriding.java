/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {

Child c = new Child();

c.display(2,3);
	}
}

class Parent{
    
    void display(int a, int b){
        
        System.out.println(a+b);
    }
    
    void display(int a, int b, int c){
        
        System.out.println(a+b+c);
    }
}

class Child extends Parent{
    
   
     void display(int a, int b){
         
         super.display(a,b);
        
        System.out.println(10*(a+b));
    }
    
}
