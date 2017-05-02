package jd.dd.waiter.ddinterface;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;

/**
 * Created by pugq on 2017/5/2/002.
 */

public class BaseNofifier implements INotifier {
    private Context             context;
    private NotificationManager notificationManager;

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
    public Context getContext() {
        return context;
    }
}
