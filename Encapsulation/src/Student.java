public class Student {
    private String name;
    private int rollNumber;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {

            this.rollNumber = rollNumber;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100){
        this.marks = marks;}
        else{
            System.out.println("Invalid Marks");
        }
    }
    public String getName(){
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getMarks()
    {
        return marks;
    }
    public void display(){
        System.out.println("Name :" + name);
        System.out.println("Marks :" + marks);
        System.out.println("Roll Number :" + rollNumber);


    }

}
