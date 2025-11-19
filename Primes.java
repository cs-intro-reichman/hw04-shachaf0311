public class Primes {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        boolean [] isPrime = new boolean[max + 1];
        for (int i = 2; i <= max; i++) 
        {
            isPrime[i] = true;
        }
        int p = 2;
        while (p * p < max) 
        {
            if (isPrime[p]) 
            {
                for (int st = p;  st<= max; st++) 
                {
                   if (st % p == 0 && st != p) 
                   {
                       isPrime[st] = false;
                   }
                }
            }
            p++;
        }
        System.out.println("Prime numbers up to " + max + ":");
        int count = 0;
        for (int i = 2; i <= max; i++) 
        {
            if (isPrime[i]) 
            {
                System.out.println(i);
                count++;
            }
        }
        double percentage = (count * 100) / (max);
        System.out.println("There are " + count + " primes between " + "2 and " + max + " (" + (int)percentage + "% are primes)");
    }
}