package jd.dd.compact.push;

/**
 * Created by pugq on 2017/3/10/010.
 */

public interface ILogoutListener {

    void onLogout(int mode, int code);

    void onFulllyLogout();

    void onTimeout();
}
