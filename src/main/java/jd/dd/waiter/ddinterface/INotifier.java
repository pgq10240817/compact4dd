package jd.dd.waiter.ddinterface;

import android.content.Context;
import android.content.Intent;


public interface INotifier {

    int ID_NOTIFICATION = 580;
    int ID_UNREAD_MSG   = 1000;
    int ID_NOTIFY_MSG   = 2000;

    Context getContext();

    /**
     * 最小不重复震动/声音时间, 毫秒级
     *
     * @return
     */
    long minDurationSinceLastNotify();

    /**
     * 声音&震动
     */
    void playSoundAndVibrator();

    /**
     * 弹出通知栏消息
     *
     * @param uid
     * @param id
     * @param title
     * @param message
     * @param unreadMsgCount
     * @param optionalIntent
     */

    void notify(final String uid, final int id, final String title, final String message, final long unreadMsgCount, Intent optionalIntent);
}
