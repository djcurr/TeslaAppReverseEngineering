package com.facebook.react.bridge;

import xf.a;

@a
/* loaded from: classes3.dex */
interface ReactCallback {
    @a
    void decrementPendingJSCalls();

    @a
    void incrementPendingJSCalls();

    @a
    void onBatchComplete();
}