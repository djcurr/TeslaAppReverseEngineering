package com.mkuczera;

import android.os.Vibrator;

/* loaded from: classes2.dex */
public class f implements b {

    /* renamed from: a  reason: collision with root package name */
    int f17919a;

    public f(int i11) {
        this.f17919a = 0;
        this.f17919a = i11;
    }

    @Override // com.mkuczera.b
    public void a(Vibrator vibrator) {
        vibrator.vibrate(this.f17919a);
    }
}