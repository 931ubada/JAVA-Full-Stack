class chatuser12 extends Thread {
    String user;
    String[] msg;

    chatuser12(String user, String[] msg) {
        this.user = user;
        this.msg = msg;
    }

    public void run() {
        for (String msgg : msg) {
            System.out.println(user + " : " + msgg);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
    public class all_concepts
    {
        public static void main(String[] args) throws Exception
        {
            String[] user1msg = {"hi", "How are you", "Where are you"};
            String[] user2msg = {"hello", "I am fine", "In bangalore"};
            Thread t1 = new chatuser12("Abhay", user1msg);
            Thread t2 = new chatuser12("Arun", user2msg);
            t1.start();
            Thread.sleep(2000);
            t2.start();
        }
    }
