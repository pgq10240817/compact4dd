package jd.dd.waiter.ddinterface;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;


public interface INotifier {

    int ID_NOTIFICATION = 580;
    int ID_UNREAD_MSG   = 1000;
    int ID_NOTIFY_MSG   = 2000;

    NotificationManager getNotificationManager();

    Context getContext();

    void notify(final String uid, final int id, final String title, final String message, final long unreadMsgCount, Intent optionalIntent);

    void cancel(final int id);

    void cancelAll();


}
