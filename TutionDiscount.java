public class TutionDiscount {
    public static void main(String[] args) {
        int student_grade = 10;
        int basic_tution_fees = 4000;
        double discount_percentage = 0.0;
        boolean Academic_topper = true;
        if(student_grade>=9 && student_grade<=12){
            if(Academic_topper==true){
                discount_percentage = 20.0;
            }else
            discount_percentage = 10.0;
        }else if(student_grade>=6 && student_grade<=8){
            discount_percentage = 5.0;
        }else
        discount_percentage = 0.0;
        if(student_grade==10){
            discount_percentage+=3.0;
        }else if(student_grade==12){
            discount_percentage+=5.0;
        }else
        discount_percentage=0.0;
        double discountAmount = basic_tution_fees*(discount_percentage/100);
        double tutionfees = basic_tution_fees-discountAmount;
        System.out.println("Student grade is:" +student_grade);
        System.out.println("Basic tution fees:" +basic_tution_fees);
        System.out.println("Total Discount Amount is:" +discountAmount);
        System.out.println("Final tution fees is :" +tutionfees);
    }
}
