package jd.dd.waiter.ddinterface;

import android.content.Context;
import android.content.Intent;

/**
 * Created by pugq on 2017/5/2/002.
 */

public class BaseNotifier implements INotifier {
    protected Context context;

    public BaseNotifier(Context context) {
        this.context = context;
    }

    @Override
    public void notify(String uid, int id, String title, String message, long unreadMsgCount, Intent optionalIntent) {

    }

    @Override
    public Context getContext() {
        return context;
    }

    @Override
    public long minDurationSinceLastNotify() {
        return 3000;
    }

    @Override
    public void playSoundAndVibrator() {
    }
}
