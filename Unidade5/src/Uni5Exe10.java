public class Uni5Exe10 {
    public static void main(String[] args) {
        
        double i;
        int num = 0;

        for (i = 1 ; i <= 999999 ; i++) {   
            num++;
            if (num == (((num/1)+(num%1))*((num/1)+(num%1)))) {
                System.out.println((num/1)+"+"+(num%1)+"="+((num/1)+(num%1))+"²"+"="+num);
            } else if (num == (((num/10)+(num%10))*((num/10)+(num%10)))) {
                System.out.println((num/10)+"+"+(num%10)+"="+((num/10)+(num%10))+"²"+"="+num);
            } else if (num == (((num/100)+(num%100))*((num/100)+(num%100)))) {
                System.out.println((num/100)+"+"+(num%100)+"="+((num/100)+(num%100))+"²"+"="+num);
            } else if (num == (((num/1000)+(num%1000))*((num/1000)+(num%1000)))) {
                System.out.println((num/1000)+"+"+(num%1000)+"="+((num/1000)+(num%1000))+"²"+"="+num);
            }
        }
    }
}