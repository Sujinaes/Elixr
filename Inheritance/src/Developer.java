public class Developer extends Employee {
    private String programming_language;
    private  int experience;

    public void setProgramming_language(String programming_language) {
        this.programming_language = programming_language;
    }

    public String getProgramming_language() {
        return programming_language;
    }
    public void setExperience(int experience) {
        if(experience >0){
            this.experience=experience;
        }
        else{
            System.out.println("Invalid Experience");
        }

    }
    public int getExperience() {
        return experience;
    }
    public void displayDeveloper(){
        display();
        System.out.println("Programming_language : " + programming_language);
        System.out.println("Experince : " + experience);
    }
}
