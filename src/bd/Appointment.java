
package BD;

import java.util.Date;


public class Appointment 
{
    private int AID = 100;
    private Human doner;
    private Human receiver;
    private Hospital hospital;
    private Date DateC;
    private String type;
    private boolean FromDoner =false;
    private boolean FromReceiver=false;
    
    private static Appointment[] Donors = new Appointment[100];
    private static int countRTD=0;
    private static Appointment[] RTD = new Appointment[100];
    private static int countRTR=0;
    private static Appointment[] App = new Appointment[100];
    private static int count=0;
    
    public Appointment(Human doner ,Human receiver , Hospital hospital ,int year , int month , int day , int houer , int min, boolean FromDoner , boolean FromReceiver )
    {
        this.AID=AID;
        this.doner=doner;
        this.receiver=receiver;
        this.hospital=hospital;
        this.FromDoner=FromDoner;
        this.FromReceiver=FromReceiver;
        this.DateC=new Date(year  , month , day , houer , min);
        this.type=Type();
        AID++;
    }

    public void setType()
    {
        if(this.FromDoner && !(this.FromReceiver))
        {
            type="RTD";
        }
        else if(!(this.FromDoner) && this.FromReceiver)
        {
            type="RTR";
        }
        else if(this.FromDoner && this.FromReceiver)
        {
            type="App";
        }
        
    }
     public String Type()
    {
        if(this.FromDoner && !(this.FromReceiver))
        {
            type="RTD";
        }
        else if(!(this.FromDoner) && this.FromReceiver)
        {
            type="RTR";
        }
        else if(this.FromDoner && this.FromReceiver)
        {
            type="App";
        }
        
        return type;
    }
    public Human getDoner() {
        return doner;
    }

    public void setDoner(Human doner) {
        this.doner = doner;
    }

    public Human getReceiver() {
        return receiver;
    }

    public void setReceiver(Human receiver) {
        this.receiver = receiver;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public int getAID() {
        return AID;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Date getDateC() {
        return DateC;
    }

    public void setDateC(Date DateC) {
        this.DateC = DateC;
    }

    public boolean isFromDoner() {
        return FromDoner;
    }

    public void setFromDoner(boolean FromDoner) {
        this.FromDoner = FromDoner;
    }

    public boolean isFromReceiver() {
        return FromReceiver;
    }

    public void setFromReceiver(boolean FromReceiver) {
        this.FromReceiver = FromReceiver;
    }

    public static Appointment[] getRTD() {
        return RTD;
    }

    public static Appointment[] getDonons() {
        return Donors;
    }

    public static Appointment[] getAppointment() {
        return App;
    }
    
        public void AddRTD(Appointment RTD1) 
    {
        if(countRTD>RTD.length)
        {
            System.out.println("ArrayFull");
        }
        else
        {
            
            RTD[countRTD]=RTD1;
            countRTD++;
        }
    }

    public void delRTD(int id)
    {
        if(countRTD ==0)
        {
            System.out.println("There is no Doners");
        }
        else
        {
            for(int i=0;i<countRTD;i++)
            {
                 if(RTD[i].getAID()==id)
                {
                    RTD[i]=null;
                    while(i<(countRTD-1))
                    {
                        RTD[i]=RTD[i+1];
                        i++;
                    }
                    RTD[i]=null;
                    countRTD--;
                }
            }
            
        }
    }
    
      public void AddDonors(Appointment RTR1) 
    { 
        if(countRTR>Donors.length)
        {
            System.out.println("ArrayFull");
        }
        else
        {
            
            Donors[countRTR]=RTR1;
            countRTR++;
        }
    }

    public void delRTR(int id)
    {
        if(countRTR ==0)
        {
            System.out.println("There is no Doners");
        }
        else
        {
            for(int i=0;i<countRTR;i++)
            {
                 if(Donors[i].getAID()==id)
                {
                    Donors[i]=null;
                    while(i<(countRTR-1))
                    {
                        Donors[i]=Donors[i+1];
                        i++;
                    }
                    Donors[i]=null;
                    countRTR--;
                }
            }
            
        }
    }
     public void AddApp(Appointment App1) 
    {
        if(count>App.length)
        {
            System.out.println("ArrayFull");
        }
        else
        {
            
            App[count]=App1;
            count++;
        }
    }

    public void delApp(int id)
    {
        if(count ==0)
        {
            System.out.println("There is no Doners");
        }
        else
        {
            for(int i=0;i<count;i++)
            {
                 if(App[i].getAID()==id)
                {
                    App[i]=null;
                    while(i<(count-1))
                    {
                        App[i]=App[i+1];
                        i++;
                    }
                    App[i]=null;
                    count--;
                }
            }
            
        }
    }
    
    public void RTD_To_App(int id)
    {
        for(int i=0;i<countRTD;i++)
            {
                 if(RTD[i].getAID()==id)
                {
                    if(RTD[i].FromDoner && RTD[i].FromReceiver)
                    {
                        
                        AddApp(RTD[i]);
                        RTD[i].setType();
                        delRTD(id);
                    }
                    
                }
            }
    }
    
    public void RTR_To_App(int id)
    {
        for(int i=0;i<countRTR;i++)
            {
                 if(Donors[i].getAID()==id)
                {
                    if(Donors[i].FromDoner && Donors[i].FromReceiver)
                    {
                        
                        AddApp(Donors[i]);
                        Donors[i].setType();
                        delRTR(id);
                    }
                    
                }
            }
    }

    @Override
    public String toString() {
        return "Appointment ID = " + AID + "\n doner=" + doner + "\n receiver=" + receiver + "\n hospital=" + hospital + "\n DateC=" + DateC + "\n type=" + type ;
    }
    
    
    
    
    
}
