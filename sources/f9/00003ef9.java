package com.mkuczera;

import android.os.Vibrator;

/* loaded from: classes2.dex */
public class e implements b {

    /* renamed from: a  reason: collision with root package name */
    long[] f17918a;

    public e(long[] jArr) {
        this.f17918a = new long[0];
        this.f17918a = jArr;
    }

    @Override // com.mkuczera.b
    public void a(Vibrator vibrator) {
        vibrator.vibrate(this.f17918a, -1);
    }
}