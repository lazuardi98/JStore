import java.util.Random;

public class LetsGo
{
    public static int random(int limit){
        Random rng = new Random();
        int value = rng.nextInt(limit);
        return value;
    }

    public static void main(String[] args)
    {
        for (int i = 0; i < 20; i++){
            // Jika program berjalan terlalu lama, maka ubah angka 100500 menjadi lebih kecil seperti 1005
            RunForYourLife.setTime("Lionel", i, random(100500));
            RunForYourLife.setTime("Andres", i, random(RunForYourLife.getTime("Lionel", i)));
            RunForYourLife.setTime("Messi", i, random(RunForYourLife.getTime("Andres", i)));
        }

        RunForYourLife Lionel = new RunForYourLife("Lionel");
        Lionel.start();

        RunForYourLife Andres = new RunForYourLife("Andres");
        Andres.start();

        RunForYourLife Messi = new RunForYourLife("Messi");
        Messi.start();
    }
}
