package com.gnetop.ltgamecommon.impl;


public interface OnGooglePlayResultListener {
    /**
     * 成功
     *
     * @param result 成功信息
     */
    void onPlaySuccess(String result);

    /**
     * 失败
     *
     * @param ex 失败信息
     */
    void onPlayFailed(Throwable ex);

    /**
     * 完成
     */
    void onPlayComplete();

    /**
     * 错误
     *
     * @param result 错误信息
     */
    void onPlayError(String result);
}
