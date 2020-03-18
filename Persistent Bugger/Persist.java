class Persist {
  public static int persistence(long n) {
        int numberOfTimes = 0;
        while (n / 10 != 0) {
            long t = n;
            long s = 1;
            while (t > 0) {
                s =  s * (t % 10);
                t /= 10;
            }
            n = s;
            numberOfTimes++;
        }
        return numberOfTimes;
  }
}
