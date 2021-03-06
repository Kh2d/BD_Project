
package BD;


public class Doctor extends HospitalEmp
{

    private static Doctor[] DoctorArray = new Doctor[10];
    private static int count=0;
    
    public Doctor ( String password , String Fname , String Mname , String Lname , int id , int phone , String area  ,int age , int year , int month , int days , Hospital h)
    {
        super( password ,   Fname ,   Mname ,   Lname ,   id ,   phone , area , age ,year , month ,days ,h);
    }

    public void add(Doctor h)
    {
        if(count>(DoctorArray.length-1))
        DoctorArray[count]=h;
        count++;
    }
    
    public void del(int id1)
    {
        if(count ==0)
        {
            System.out.println("There is no Doctors");
        }
        else
        {
            for(int i=0;i<count;i++)
            {
                 if(DoctorArray[i].getId()==id1)
                {
                    DoctorArray[i]=null;
                    while(i<(count-1))
                    {
                        DoctorArray[i]=DoctorArray[i+1];
                        i++;
                    }
                    DoctorArray[i]=null;
                    count--;
                }
            }
            
        }
    }
    
    @Override
    public String toString() 
    {
        return super.toString();
    }
    
    
}
