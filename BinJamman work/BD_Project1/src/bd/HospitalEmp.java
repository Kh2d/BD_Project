
package BD;


public abstract class  HospitalEmp extends User
{
    
    private Hospital h;
    
    public HospitalEmp( String password , String Fname , String Mname , String Lname , int id , int phone , String area  ,int age, int year , int month , int days , Hospital h)
    {
        super(  password ,   Fname ,   Mname ,   Lname ,   id ,   phone , area , age ,year , month ,days  );
        this.h=h;
    }

    public Hospital getH() {
        return h;
    }

    public void setH(Hospital h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Hospital name =" + h;
    }
    
    
}
