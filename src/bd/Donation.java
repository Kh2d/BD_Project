package BD;

import java.util.Date;



public class Donation 
{
    private Human doner;
    private Human receiver;
    private int Donation_ID;
    private Date DonationDateTime;
    private int DonerWeight;
    private boolean DonationState=false;
    
    private static Donation[] DonationArray = new Donation[100];
    private static int count=0;
    
     public Donation(Human n1 , Human receiver , int DonerWeight , boolean state )
    {
        
        this.doner=n1;
        this.receiver=receiver;
        this.DonerWeight=DonerWeight;
        this.DonationState=state;
        Donation_ID++;
    }
     
    public Human getReceiver() {
        return receiver;
    }

    public Human getDoner() {
        return doner;
    }

    public void setDoner(Human doner) {
        this.doner = doner;
    }

    public void setReceiver(Human receiver) {
        this.receiver = receiver;
    }

    public int getDonation_ID() {
        return Donation_ID;
    }

    public void setDonation_ID(int Donation_ID) {
        this.Donation_ID = Donation_ID;
    }

    public Date getDonationDateTime() {
        return DonationDateTime;
    }

    public void setDonationDateTime(Date DonationDateTime) {
        this.DonationDateTime = DonationDateTime;
    }

    public int getDonerWeight() {
        return DonerWeight;
    }

    public void setDonerWeight(int DonerWeight) {
        this.DonerWeight = DonerWeight;
    }

    public boolean isDonationState() {
        return DonationState;
    }

    public void setDonationState(boolean DonationState) {
        this.DonationState = DonationState;
    }

    public static Donation[] getDonationArray() {
        return DonationArray;
    }

    public static void setDonationArray(Donation[] DonationArray) {
        Donation.DonationArray = DonationArray;
    }
    
    public void AddDonation(Donation NewDonation) 
    {
        if(count>DonationArray.length)
        {
            System.out.println("ArrayFull");
        }
        else
        {
            DonationArray[count]=NewDonation;
            count++;
        }
    }

    public void del(int DID)
    {
        if(count ==0)
        {
            System.out.println("There is no Doners");
        }
        else
        {
            for(int i=0;i<count;i++)
            {
                 if(DonationArray[i].getDonation_ID()==DID)
                {
                    DonationArray[i]=null;
                    while(i<(count-1))
                    {
                        DonationArray[i]=DonationArray[i+1];
                        i++;
                    }
                    DonationArray[i]=null;
                    count--;
                }
            }
            
        }
    }
    
    public String isApproved()
    {
        String j=null;
        if(this.isDonationState())
        {
            j="approved";
        }
        else
        {
            j="unapproved";
        }
        return j;
    }

    @Override
    public String toString() {
        return  "\n Doner=" + doner + "\n Receiver=" + receiver + "\n Donation_ID=" + Donation_ID + "\n DonationDateTime=" + DonationDateTime + "\n DonerWeight=" + DonerWeight + "\n DonationState=" + isApproved() ;
    }
    
    
    
}
