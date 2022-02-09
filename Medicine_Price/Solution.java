import java.util.Scanner;
import java.util.Arrays;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Medicine[] medicine=new Medicine[4];
        for(int i=0;i<medicine.length;i++)
        {
            String medicineName=sc.nextLine();
            String batchNo=sc.nextLine();
            String disease=sc.nextLine();
            int price=sc.nextInt();
            medicine[i]=new Medicine(medicineName,batchNo,disease,price);
        }
        String search=sc.nextLine();
       Integer[]result=medicinePriceForGivenDisease(medicine,search);
       for(int i=0;i<result.length;i++)
       {
           System.out.println(result[i]);
       }
    }
    public static Integer[] medicinePriceForGivenDisease(Medicine[] medicine,String disease)
    {
        Integer [] result=new Integer[0];
        for(int i=0;i<medicine.length;i++)
        {
            if(medicine[i].getDisease().equalsIgnoreCase(disease))
            {
                result=Arrays.copyOf(result,result.length+1);
                result[result.length-1]=medicine[i].getPrice();
            }
        }
        return result;
    }
}
class Medicine
{
    private String medicineName;
    private String batchNo;
    private String disease;
    private int price;
    Medicine(String medicineName,String batchNo,String disease,int price)
    {
        this.medicineName=medicineName;
        this.batchNo=batchNo;
        this.disease=disease;
        this.price=price;
    }
    String getMedicineName(){
        return medicineName;
    }
    String getBatchNo(){
        return batchNo;
    }
    String getDisease()
    {
        return disease;
    }
    int getPrice()
    {
        return price;
    }
}