WELCOME TO RBG TECHNOLOGIES- GIT SESSION

package javaDemo;

public class PolyDemo3 
{

	public static void main(String[] args) 
	{
		System.out.println("commit");
		PolyDemo3 p1=new PolyDemo3();
		A a1=new A();
		//p1.funA(A a1);
		//p1.funA(B b1);
		//p1.funA(C c1);
		A k=new A();
		p1.funA(k);
		p1.funA(new A());
		
		B l=new B();
		p1.funA(l);
		p1.funA(new B());
		
		C n=new C();
		p1.funA(n);
		p1.funA(new C());

}
		void funA(A a1)
		{
			System.out.println("class A args of PolyDemo3");
		}
		void funA(B b1)
		{
			System.out.println("class B args of PolyDemo3");
		}
		void funA(C c1)
		{
			System.out.println("class C args of PolyDemo3");
		}
	}


