package com.gnetop.ltgamecommon.impl;

public interface OnAliPlayResultListener {

    void onAliPlaySuccess(String result);

    void onAliPlayFailed();

    void onAliPlayError(Throwable ex);

    void onAliPlayComplete();
}
