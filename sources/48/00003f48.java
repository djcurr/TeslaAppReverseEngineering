package com.oney.WebRTCModule;

import android.os.Build;
import android.util.Log;
import org.webrtc.EglBase;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static EglBase f17999a;

    public static synchronized EglBase a() {
        EglBase eglBase;
        synchronized (f.class) {
            if (f17999a == null) {
                int[] iArr = EglBase.CONFIG_PLAIN;
                EglBase eglBase2 = null;
                try {
                    e = null;
                    eglBase2 = Build.VERSION.SDK_INT >= 18 ? EglBase.createEgl14(iArr) : null;
                } catch (RuntimeException e11) {
                    e = e11;
                }
                if (eglBase2 == null) {
                    try {
                        eglBase2 = EglBase.createEgl10(iArr);
                    } catch (RuntimeException e12) {
                        e = e12;
                    }
                }
                if (e != null) {
                    Log.e(f.class.getName(), "Failed to create EglBase", e);
                } else {
                    f17999a = eglBase2;
                }
            }
            eglBase = f17999a;
        }
        return eglBase;
    }

    public static EglBase.Context b() {
        EglBase a11 = a();
        if (a11 == null) {
            return null;
        }
        return a11.getEglBaseContext();
    }
}