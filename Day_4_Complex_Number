package vaibhav;

public class PracticeOOPs {
	
	public static	 class ComplexNumber{
		    double real;
		    double imaginary;
		    
		    ComplexNumber(){}
		    ComplexNumber(double real,double imaginary){
		        this.real = real;
		        this.imaginary = imaginary;
		    }
		    
		}

	 public static	ComplexNumber sum(ComplexNumber a, ComplexNumber b){
		        ComplexNumber ans = new ComplexNumber();
		        ans.real = a.real + b.real;
		        ans.imaginary = a.imaginary + b.imaginary;
		        return ans;
		    }
	 
	 
	 public static	ComplexNumber diff(ComplexNumber a, ComplexNumber b){
	        ComplexNumber ans = new ComplexNumber();
	        ans.real = a.real - b.real;
	        ans.imaginary = a.imaginary - b.imaginary;
	        return ans;
	    }
	 
	 public static	ComplexNumber product(ComplexNumber a, ComplexNumber b){
	        ComplexNumber ans = new ComplexNumber();
	        ans.real = (a.real * b.real) - (a.imaginary * b.imaginary) ;
	        ans.imaginary = (a.real * b.imaginary) - (a.imaginary * b.real) ;
	        return ans;
	    }
	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComplexNumber c1 = new ComplexNumber(3,5);
        ComplexNumber c2 = new ComplexNumber(4,6);
        
        ComplexNumber ans = sum(c1,c2);
        ComplexNumber and = diff(c2,c1);
        ComplexNumber ank = product(c2,c1);
        System.out.println("The addition of two complex numbers is : "+ans.real+" + "+ans.imaginary+"i");
        System.out.println("The difference of two complex numbers is : "+and.real+" + "+and.imaginary+"i");
        System.out.println("The Product of two complex numbers is : "+ank.real+" + "+ank.imaginary+"i");
        
		
		

	}

}







