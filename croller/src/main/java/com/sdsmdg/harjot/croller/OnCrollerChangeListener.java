package com.sdsmdg.harjot.croller;

public interface OnCrollerChangeListener {
    void onProgressChanged(Croller croller, int progress, float deg);

    void onStartTrackingTouch(Croller croller);

    void onStopTrackingTouch(Croller croller);
}
