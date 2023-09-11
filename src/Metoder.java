public class Metoder {
    public static int maks(int[] a) {
        int maks_verdi= a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]>maks_verdi) {
                maks_verdi=a[i];
            }
        }
        return maks_verdi;
    }
    public static void func(int left, int right) {
        for (int i=left; i < right; i++) {
            System.out.println(i);
        }
    }
}
