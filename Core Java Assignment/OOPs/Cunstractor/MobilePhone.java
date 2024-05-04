public class MobilePhone{
                            String model;
                            String brand;
                            String StorageC;

                            void insert(String m,String b, String s){
                                model=m;
                                brand=b;
                                StorageC=s;
                            }

                            public void makeCall(){
                                System.out.println("Makking Call using "+model+" Mobile");
                            }

                            public void sendText(){
                                System.out.println("Sending Messages using "+brand+" mobile");
                            }

                            public void installApp(){
                                System.out.println("Installed Application in "+model+" Mobile");
                            }

                            void display(){
                                System.out.println(model+" "+brand+" "+StorageC);
                            }

            public static void main(String args[]){
                MobilePhone iphone=new MobilePhone();
                iphone.insert("Iphone 15 pro", "Iphone", "280Gb");
                iphone.makeCall();
                iphone.sendText();
                iphone.installApp();
                iphone.display();

                MobilePhone androidPhone=new MobilePhone();
                androidPhone.insert("Realme 8", "Realme", "108Gb");
                androidPhone.makeCall();
                androidPhone.sendText();
                androidPhone.installApp();
                androidPhone.display();

            }
}