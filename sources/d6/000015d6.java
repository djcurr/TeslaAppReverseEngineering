package com.dylanvann.fastimage;

/* loaded from: classes.dex */
public interface FastImageProgressListener {
    float getGranularityPercentage();

    void onProgress(String str, long j11, long j12);
}