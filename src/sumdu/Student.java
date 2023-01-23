package sumdu;

import sumdu.edu.Subject;

public class Student {
    int id;
    static int nextId = 1;
    String name;
    String surname;
    String group;
    Subject[] subject; //5

    public Student(){
        this.id = nextId++;
    }

    public Student(String name, String surname, String group){
        this.id = nextId++;
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.subject = new Subject[5];
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setGroup(String group){
        this.group = group;
    }
    public void setSubject(Subject[] subject){
        this.subject = subject;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getGroup(){
        return group;
    }
    public Subject[] getSubject() {
        return subject;
    }
}
