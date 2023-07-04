package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import sl.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class c implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f16449a;

    public c(d dVar) {
        this.f16449a = dVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzgu
    public final void onEvent(String str, String str2, Bundle bundle, long j11) {
        a.b bVar;
        if (this.f16449a.f16450a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", b.c(str2));
            bVar = this.f16449a.f16451b;
            bVar.a(2, bundle2);
        }
    }
}