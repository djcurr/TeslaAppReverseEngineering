package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executor;

@KeepForSdk
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final sm.b f17234a;

    public d(sm.b bVar) {
        this.f17234a = bVar;
    }

    @KeepForSdk
    public Executor a(Executor executor) {
        return executor != null ? executor : (Executor) this.f17234a.get();
    }
}