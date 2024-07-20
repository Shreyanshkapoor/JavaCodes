//step1:create a class.
//step2:getter&Setter method.
//step3:Constructor.
//step4:methods or Function.
//step5:then main.


import java.util.Scanner;

class Account{
    private String accno;
    private String name;
    private String address;
    private String dOB;
    private String phone_no;
    private long balance;

    public String getAccno(){return accno;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getdOB(){return dOB;}
    public String getPhone_no(){return phone_no;}
    public long   getBalance(){return balance;}

    public void setName(String address){
        this.address=address;
    }
    public void setPhone_no(String phno){
        phone_no=phno;
    }

    public  Account(String accno,String name,String address,String dOB,String phone_no){
        this.accno=accno;
        this.name=name;
        this.address=address;
        this.dOB=dOB;
        this.phone_no =phone_no;
        balance=0;
    }
}
class SavingAccount extends Account{
    public SavingAccount(String accno, String name, String address, String dOB, String phone_no) {
        super(accno, name, address, dOB, phone_no);
    }

    public long deposit(long amount){
         return getBalance()-amount;
    }
    public long withdrawl(long amount){
        if (getBalance()>=amount)
            return getBalance()-amount;
        else{
            System.out.println("Not Enough Balance.");
        }
        return amount;
    }
}

class LoanAccount extends Account{
    public LoanAccount(String accno, String name, String address, String dOB, String phone_no) {
        super(accno, name, address, dOB, phone_no);
    }

    public void EMIDetail(long price){
        Scanner s=new Scanner(System.in);
        System.out.println("How long you want to do EMI(2,6,12,24): ");
        int e=s.nextInt();
        long EMI=(price/e);
        System.out.println("Your monthly EMI is : "+EMI);
    }
}
public class inhritance_
{
    public static void main(String args[]){

    }
}
