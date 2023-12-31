package com.google.android.gms.flags;

import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
public interface zzc extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z11, int i11);

    int getIntFlagValue(String str, int i11, int i12);

    long getLongFlagValue(String str, long j11, int i11);

    String getStringFlagValue(String str, String str2, int i11);

    void init(IObjectWrapper iObjectWrapper);
}