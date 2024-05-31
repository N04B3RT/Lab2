public class javabasiclab4 {
    // basic attributes
    private String name;
    private String course;
    private String studentid;

    // constructor help!!!!! 
    public javabasiclab4(String name, String course, String studentid){
        this.name = name;
        this.course = course;
        this.studentid = studentid;
    }
    // stressful ahh methods
    public void classroom() {
        System.out.println("Hello, my name is "+ name + ".");
        System.out.println("i study" + course + ".");
        System.out.println("my student id is" + studentid + ".");
        
    }
    //getter or whatever
    public String getName(){
        return name;
    }
    public String getcourse(){
        return course;
    }
    public String getstudentid(){
        return studentid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }
    public class NumberChecker {

        public static void main(String[] args) {
            checkNumber(10);   
            checkNumber(-900);   
            checkNumber(0);   
        }
    
        public static void checkNumber(int number) {
            if (number > 0) {
                System.out.println("The number is positive."+number);
            } else if (number < 0) {
                System.out.println("The number is negative."+number);
            } else {
                System.out.println("The number is zero."+number);
            }
        }
    }
    
    public static void main(String[] args) {
        
    }
    public class Main {

        public static double calculateAverage(int[] numbers) {
            if (numbers.length == 0) {
                return 0;
            }
    
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return (double) sum / numbers.length;
        }
    
        public static void main(String[] args) {
            int[] array1 = {1, 2, 3, 4, 5};
            System.out.println("Average of array1: " + calculateAverage(array1));
    
            int[] array2 = {10, 20, 30, 40, 50};
            System.out.println("Average of array2: " + calculateAverage(array2));
    
            int[] array3 = {7, 14, 21, 28, 35};
            System.out.println("Average of array3: " + calculateAverage(array3));
    
            int[] array4 = {5};
            System.out.println("Average of array4: " + calculateAverage(array4));
    
            int[] array5 = {}; // Empty array
            System.out.println("Average of array5: " + calculateAverage(array5));
        }
    }
    
}
