package jd.dd.waiter.ddinterface;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;


public interface INotifier {

    int ID_NOTIFICATION = 580;
    int ID_UNREAD_MSG   = 1000;
    int ID_NOTIFY_MSG   = 2000;


    /**
     * 新消息驾到
     *
     * @param uid            - 可以理解为pin
     * @param id
     * @param title
     * @param message
     * @param unreadMsgCount - pin对应的未读消息数
     * @param optionalIntent - 占坑
     */

    void notify(final String uid, final int id, final String title, final String message, final long unreadMsgCount, Intent optionalIntent);

    void cancel(final int id);

    void cancelAll();

    NotificationManager getNotificationManager();

    Context getContext();

}
