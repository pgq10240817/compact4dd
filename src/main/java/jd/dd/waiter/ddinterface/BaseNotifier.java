package jd.dd.waiter.ddinterface;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;

/**
 * Created by pugq on 2017/5/2/002.
 */

public class BaseNotifier implements INotifier {
    protected Context             context;
    protected NotificationManager notificationManager;

    public BaseNotifier(Context context) {
        this.context = context;
        this.notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
    }

    @Override
    public void notify(String uid, int id, String title, String message, long unreadMsgCount, Intent optionalIntent) {

    }

    @Override
    public void cancel(int id) {
        if (notificationManager != null) {
            notificationManager.cancel(id);
        }
    }

    @Override
    public void cancelAll() {
        if (notificationManager != null) {
            notificationManager.cancelAll();
        }
    }

    @Override
    public NotificationManager getNotificationManager() {
        return notificationManager;
    }

    @Override
    public Context getContext() {
        return context;
    }

}
