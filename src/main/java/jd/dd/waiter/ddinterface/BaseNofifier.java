package jd.dd.waiter.ddinterface;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Vibrator;

/**
 * Created by pugq on 2017/5/2/002.
 */

public class BaseNofifier implements INotifier {
    protected Context             context;
    protected NotificationManager notificationManager;

    public BaseNofifier(Context context) {
        this.context = context;
        this.notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
    }

    @Override
    public void notify(String uid, int id, String title, String message, long unreadMsgCount, Intent optionalIntent) {

    }

    @Override
    public void cancel(int id) {
        //no-op
    }

    @Override
    public void cancelAll() {
        //no-op

    }


    @Override
    public NotificationManager getNotificationManager() {
        return notificationManager;
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
    public boolean handleVoiceAndVibrator(MediaPlayer player, Vibrator vibrator) {
        return false;
    }
}
