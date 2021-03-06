public class Triangle {
    private boolean isEquilateral = false;
    private boolean isScalene = false;
    private boolean isIsosceles = false;
    private boolean NotATriangle = false;

    private double s1;
    private double s2;
    private double s3;

    public Triangle(double sideA, double sideB, double sideC) {
        this.s1 = sideA;
        this.s2 = sideB;
        this.s3 = sideC;
    }

    public boolean NotATriangle(){
        if(this.s1 + this.s2 < this.s3){
            this.NotATriangle = true;
            System.out.println("This is NOT A TRIANGLE!");
        }
        return this.NotATriangle;
    }

    public boolean isEquilateral() {
        if ((s1==s2) && (s1==s3) && (s2==s3) && (s1>0)) {
            this.isEquilateral = true;
            System.out.println("The triangle is EQUILATERAL!");
        }

        return this.isEquilateral;
    }

    public boolean isScalene() {
        if ( (s1 != s2) && (s1 != s3) && (s2 != s3) && (s1 + s2 > s3)) {
            this.isScalene = true;
            System.out.println("The triangle is SCALENE!");
        }

        return this.isScalene;
    }

    public boolean isIsosceles() {
        if (
                        ( (s1 == s2) && (s1 != s3) ) ||
                        ( (s1 == s3) && (s1 != s2) ) ||
                        ( (s2 == s3) && (s2 != s1) ) ) {
            this.isIsosceles = true;
            System.out.println("The triangle is ISOSCELES!");
        }

        return this.isIsosceles;
    }
}