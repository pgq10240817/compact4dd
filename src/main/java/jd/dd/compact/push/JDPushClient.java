package jd.dd.compact.push;

/**
 * Created by pugq on 2017/4/19/019.
 */

public class JDPushClient {
    private static JDPushClient ourInstance;

    private JDPushClient() {
    }

    public static JDPushClient instance() {
        if (ourInstance == null) {
            synchronized (JDPushClient.class) {
                if (ourInstance == null) {
                    ourInstance = new JDPushClient();
                }
            }
        }
        return ourInstance;
    }

    public void liveCheck() {
        //no-op
    }
}
