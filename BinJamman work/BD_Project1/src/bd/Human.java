
package BD;


public abstract class Human extends User
{
    private static Human[] HumanArray = new Human[50];
    private static int count=0;
    private String BT;
    public Human( String password, String Fname, String Mname, String Lname, int id, int phone, String area ,int age, int year, int month, int days, String BT) {
        super( password, Fname, Mname, Lname, id, phone, area, age, year, month, days);
        this.BT=BT;
    }

    public String getBT() {
        return BT;
    }

    public void setBT(String BT) {
        this.BT = BT;
    }
    
    public void getShowInvite()
    {
        boolean p = false;
        if(Appointment.getRTD().length==0)
        {
            System.out.println("");
        }
        else
        {
            for(int i=0;i<Appointment.getRTD().length;i++)
            {
                if(Appointment.getRTD()[i].getDoner().getId()==this.getId())
                if(!(Appointment.getRTD()[i].isFromDoner()) && Appointment.getDonons()[i].isFromReceiver())
                {
                    p=true;
                    System.out.println(Appointment.getRTD()[i].toString());
                }
            }
             if(!p)System.out.println("No Invite to you");
        }
    }
    
    public void getShowMyRequest()
    {
       boolean p = false;
        if(Appointment.getRTD().length==0)
        {
            System.out.println("");
        }
        else
        {
            for(int i=0;i<Appointment.getRTD().length;i++)
            {
                if(Appointment.getRTD()[i].getDoner().getId()==this.getId())
                if(!(Appointment.getRTD()[i].isFromDoner()) && Appointment.getDonons()[i].isFromReceiver())
                {
                    p=true;
                    System.out.println(Appointment.getRTD()[i].toString());
                }
            }
             if(!p)System.out.println("No Requset ");
        } 
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n BT= " + BT ;
    }
    
}
