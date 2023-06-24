class student
{
    String name;
    int roll;
    int marks;
}


public class arrayofobject {
    public static void main(String[] args)
    {
        student s1=new student();
        s1.name="Aliah";
        s1.marks=80;
        s1.roll=12;
        
        student s2=new student();
        s2.name="Sunny";
        s2.roll=13;
        s2.marks=89;

        student s3=new student();
        s3.name="neha";
        s3.roll=23;
        s3.marks=95;

        student stu[]=new student[3];
        stu[0]=s1;
        stu[1]=s2;
        stu[2]=s3;


        for(int i=0;i<3;i++)
        {
            System.out.println(stu[i].name+ " : " + stu[i].marks);
        }






    }
    
}
