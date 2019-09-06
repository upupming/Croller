package com.sdsmdg.harjot.crollerTest;

public interface OnCrollerChangeListener {
    void onProgressChanged(Croller croller, int progress, float deg);

    void onStartTrackingTouch(Croller croller);

    void onStopTrackingTouch(Croller croller);
}
