
package Ogrenci_not_sistemi;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    
    
    public Course(String name, String code,String prefix)
    {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }
    
    
    public void addTeacher(Teacher t)
    {
        if(this.prefix.equals(t.branch))
        {
            this.courseTeacher = t;
            System.out.println("Islem Basarili");
        }
        else {
            System.out.println("Islem basarisiz");
        }    
    }
    
    
    public void printTeacher() {
        if(courseTeacher != null)
        {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        }
        else {
            System.out.println(this.name + " dersine Akademisyen Atanmamıştır.");
        }
    }
}
