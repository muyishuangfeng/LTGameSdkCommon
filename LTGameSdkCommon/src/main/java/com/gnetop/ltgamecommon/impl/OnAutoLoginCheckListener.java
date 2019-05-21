package com.gnetop.ltgamecommon.impl;


import com.gnetop.ltgamecommon.model.BaseEntry;

public interface OnAutoLoginCheckListener {

    void onCheckSuccess(BaseEntry result);

    void onCheckFailed(Throwable ex);

}
