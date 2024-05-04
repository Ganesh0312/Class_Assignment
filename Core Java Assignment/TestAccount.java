class Account{
    int id;
    String name;
    int balnce;
    int acountno;
     
    void Insert(int i, String n, int bal, int a)
    {
        id=i;
        name=n;
        balnce=bal;
        acountno=a;
        
    }

     void Diposite(int amount)
     {
        
            amount +=balnce;
            System.out.println("Amout Deposit");
       
     }

    void Widrow(int amount )
    {
        if(balnce<amount){
            System.out.println("Amount widrow");
        }          
        else{
             amount -= balnce;
         System.out.println("Insifficient balnce");
        }
       
    }
    
    void CheckBalence()
    {
        System.out.println(balnce);
    }

    void Display(){
        System.out.println("Name= "+name);
        System.out.println("Id= "+id);
        System.out.println("Account No= "+acountno);
    }
}
public class TestAccount
{
        public static void main(String args[])
        {
        Account a1=new Account();
         a1.Insert(1,"Gaesh",3000,123);
         a1.Widrow(1000);
         a1.Diposite(2000);
         a1.CheckBalence();
         a1.Display();
        }
}