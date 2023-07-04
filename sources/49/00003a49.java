package com.google.mlkit.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public class MlKitException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final int f17223a;

    @KeepForSdk
    public MlKitException(String str, int i11) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."));
        this.f17223a = i11;
    }

    public int a() {
        return this.f17223a;
    }

    @KeepForSdk
    public MlKitException(String str, int i11, Throwable th2) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."), th2);
        this.f17223a = i11;
    }
}