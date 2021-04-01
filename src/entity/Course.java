package entity;


import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course
{

//    Fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;



//    Constructors
    public Course()
    {

    }

    public Course(String title)
    {
        this.title = title;
    }

//    Methods

    public int getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public Instructor getInstructor()
    {
        return instructor;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setInstructor(Instructor instructor)
    {
        this.instructor = instructor;
    }


//    Overrides
    @Override
    public String toString()
    {
        return "Course{" + "id=" + id + ", title='" + title + '\'' + '}';
    }
}
