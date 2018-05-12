package com.hanhanxiaochong.zhongxiangchuanmei.view.home.act;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Author : 贾桐
 * E-mail : 653773284@qq.com
 * Time   : 2018/5/2.
 * Desc   :
 */

public class ServiceDialog extends Dialog {
    public ServiceDialog(@NonNull Context context) {
        super(context);
    }

    public ServiceDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    protected ServiceDialog(@NonNull Context context, boolean cancelable, @Nullable
            OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }
}
