public class Complex {

    double real;
    double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static void main(String[] args) {
        Complex n1 = new Complex(2, 4.5),
                n2 = new Complex(3, 5.0),
                temp;

        temp = add(n1, n2);

        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
    }

    public static Complex add(Complex n1, Complex n2)
    {
        Complex temp = new Complex(0.0, 0.0);

        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return(temp);
    }
}


/****************************************OUTPUT********************************************/
Microsoft Windows [Version 10.0.19041.928]
(c) Microsoft Corporation. All rights reserved.

C:\Users\hp>cd/

C:\>cd javaprg

C:\Javaprg>javac Complex.java

C:\Javaprg>java Complex
Sum = 5.0 + 9.5i
C:\Javaprg>
