public class ScienceBook extends Book{
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @Override
    public void issueBook(){
        System.out.println("Science Book issued Successfully");
    }
    public void displayScienceBook() {
        System.out.println("===== Science Book Details =====");
        displayBook();
        System.out.println("Subject : " + subject);
    }
}
