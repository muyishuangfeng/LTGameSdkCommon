package com.gnetop.ltgamecommon.impl;


import com.gnetop.ltgamecommon.model.AliPlayBean;
import com.gnetop.ltgamecommon.model.WeChatBean;

public interface OnPlayResultedListener {


    void onPlayError(Throwable ex);

    void onPlayComplete();

    void onAliPlayResult(AliPlayBean result);

    void onWeChatPlayResult(WeChatBean result);
}
