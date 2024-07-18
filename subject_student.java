class Subject_S {
    private String subid;
    private String name;
    private int maxmarks;
    private int marksobtain;
//
//    public Subject_S(String subid){
//        this.subid=subid;
//    }
//    public Subject_S(String subid , String name){
//        this.subid=subid;
//        this.name=name;
//
//    }
    public Subject_S(String subid , String name, int maxmarks,int marksobtain){
        this.subid=subid;
        this.name=name;
        this.maxmarks=maxmarks;
        this.marksobtain=marksobtain;
    }
    public String getSubid(){
        return  subid;
    }
    public String getName(){
        return  name;
    }
    public int getMarksobtain(){
        return  marksobtain;
    }
    public int getMaxmarks(){
        return  maxmarks;
    }

    public void setMarksObtain(int mm){
        maxmarks=mm;

    }
    public void setMaxMarks(int mo){
        marksobtain=mo;
    }

    boolean isQualified()
    {
        return marksobtain>=maxmarks/10*4;
    }

    public String toString()
    {
        return"\n SubjectID: "+subid+"\n Name "+name+"\n MarksObtained "+marksobtain +"\n Qualifed: "+isQualified();
    }
}
class Student_S {
    String rollno;
    String name;
    String  dept;
    String subject;

    public Student_S(String rollno){
        this.rollno=rollno;

    }
    public Student_S(String rollno, String name){
        this.rollno=rollno;
        this.name=name;

    }
    public Student_S(String rollno, String name, String dept, String subject){
        this.rollno=rollno;
        this.name=name;
        setDept(dept);
        setSubject(subject);
    }
    public String getRollno(){
        return rollno;

    }
    public String getName(){
        return name;
    }
    public String getDept(){
        return dept;
    }
    public String getSubject(){
        return subject;
    }
    public void setDept(String dept){
        this.dept=dept;
    }
    public void setSubject(String subject){
        this.subject=subject;

    }
}

public class subject_student {
    public static void main(String[] args){
        Subject_S subs[]=new Subject_S[3];
        subs[0]=new Subject_S("s101","DS",100,90);
        subs[1]=new Subject_S("s102","Algorithms",100,89);
        subs[2]=new Subject_S("s103","Operating Systems",100,39);

        for(Subject_S s:subs)
            System.out.println(s);

    }
}
