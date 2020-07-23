public class MainActivity {
    public static void main(String args[]){
        BankEmployee ob[] = new BankEmployee[4];
        BankEmployee ob1 = new BankEmployee("John", "151-2", 3000);
        BankEmployee ob2 = new BankEmployee("abr", "157", 3500);
        BankEmployee ob3 = new BankEmployee("abrk", "15", 3200);

        ob[0] = ob1;
        ob[1] = ob2;
        ob[3] = ob3;
        ob[3].showInfo();
        for(int i=0; i<ob.length;i++){
            ob[i].showInfo();
        }
    }
}
