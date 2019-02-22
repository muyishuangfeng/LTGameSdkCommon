package com.gnetop.ltgamecommon.impl;

public interface OnCreateOrderFailedListener {


    void onCreateOrderFailed(String failed);

    void onCreateOrderError(String errorMsg);
}
