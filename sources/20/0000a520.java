package org.webrtc;

/* loaded from: classes4.dex */
interface BitrateAdjuster {
    int getAdjustedBitrateBps();

    double getAdjustedFramerateFps();

    void reportEncodedFrame(int i11);

    void setTargets(int i11, double d11);
}