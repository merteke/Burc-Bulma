import java.util.*;




public class burcBulma {

    public static void main(String [] args){

        Scanner input=new Scanner(System.in);

        int month;
        int day;

        System.out.println("Dogdugunuz ayi giriniz(1-12)");
        month=input.nextInt();
        System.out.println("Kacinci gun dogdugunuzu giriniz(1-31)");
        day=input.nextInt();

        if(month<=12 && month>0){
            if(day<=31 && day>0){

            if(month==1 && day<22)
            {
                System.out.println("Oglak burcu");
            }else if(month==1 && day>=22)
            {
                System.out.println("Kova burcu");
            }
    
            if(month==2 && day<20)
            {
                System.out.println("Kova burcu");
            }else if(month==2 && day>=20)
            {
                System.out.println("Balik burcu");
            }
    
            if(month==3 && day<21)
            {
                System.out.println("Balik burcu");
            }else if(month==3 && day>=21)
            {
                System.out.println("Koc Burcu");
            }
    
            if(month==4 && day<21)
            {
                System.out.println("Koc burcu");
            }else if(month==4 && day>=21)
            {
                System.out.println("Boga Burcu");
            }
    
            if(month==5 && day<22)
            {
                System.out.println("Boga burcu");
            }else if(month==5 && day>=22)
            {
                System.out.println("Ikizler burcu");
            }
    
            if(month==6 && day<23)
            {
                System.out.println("Ikizler burcu");
            }else if(month==6 && day>=23)
            {
                System.out.println("Yengec burcu");
            }
            
            if(month==7 && day<23)
            {
                System.out.println("Yengec burcu");
            }else if(month==7 && day>=23)
            {
                System.out.println("Aslan burcu");
            }
    
            if(month==8 && day<23)
            {
                System.out.println("Aslan burcu");
            }else if(month==8 && day>=23)
            {
                System.out.println("Basak burcu");
            }
    
            if(month==9 && day<23)
            {
                System.out.println("Basak burcu");
            }else if(month==9 && day>=23)
            {
                System.out.println("Terazi burcu");
            }
            
            if(month==10 && day<23)
            {
                System.out.println("Terazi burcu");
            }else if(month==10 && day>=23)
            {
                System.out.println("Akrep burcu");
            }
    
            if(month==11 && day<22)
            {
                System.out.println("Akrep burcu");
            }else if(month==11 && day>=22)
            {
                System.out.println("Yay burcu");
            }
    
            if(month==12 && day<22)
            {
                System.out.println("Yay burcu");
            }else if(month==12 && day>=22)
            {
                System.out.println("Oglak burcu");
            }
        }
    }else{
        System.out.println("Hatali giris yaptiniz!");
    }


    }




}
