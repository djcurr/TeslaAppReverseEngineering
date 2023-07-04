package com.mkuczera;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* loaded from: classes2.dex */
public class d implements b {

    /* renamed from: a  reason: collision with root package name */
    int f17917a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(int i11) {
        this.f17917a = 0;
        this.f17917a = i11;
    }

    @Override // com.mkuczera.b
    public void a(Vibrator vibrator) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        vibrator.vibrate(VibrationEffect.createPredefined(this.f17917a));
    }
}