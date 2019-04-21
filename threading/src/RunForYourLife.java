public class RunForYourLife implements Runnable
{
    private Thread kontestan;
    private String kontestanName;
    private static int[] lionel = new int[20];
    private static int[] andres = new int[20];
    private static int[] messi = new int[20];

    public RunForYourLife(String name)
    {
        kontestanName = name;
        System.out.println(kontestanName + ", ready.");
    }

    public void run(){
        System.out.println(kontestanName + ", go!");
        int checkpoint;
        try {
            for (int i = 0; i < 20; i++){
                checkpoint = i + 1;
                System.out.println(kontestanName + " has passed checkpoint (" + checkpoint + ")");
                Thread.sleep(getTime(kontestanName, i));
            }
        } catch(InterruptedException e){
            System.out.println(kontestanName + " was interrupted.");
        }
        System.out.println(kontestanName + " has finished!");
    }

    public void start(){
        System.out.println(kontestanName + ", set…");
        if (kontestan == null){
            kontestan = new Thread(this, kontestanName);
            kontestan.start();
        }
    }

    public static int getTime(String name, int checkpoint){
        if (name.equals("Lionel")){
            return lionel[checkpoint];
        }
        if (name.equals("Andres")){
            return andres[checkpoint];
        }
        if (name.equals("Messi")){
            return messi[checkpoint];
        }
        return 0;
    }

    public static void setTime(String name, int checkpoint, int time){
        if (name.equals("Lionel")){
            lionel[checkpoint] = time;
        }
        if (name.equals("Andres")){
            andres[checkpoint] = time;
        }
        if (name.equals("Messi")){
            messi[checkpoint] = time;
        }
    }
}
