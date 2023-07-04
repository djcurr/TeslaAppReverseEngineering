package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import sl.a;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final a.b f16455a;

    /* renamed from: b  reason: collision with root package name */
    private final AppMeasurementSdk f16456b;

    /* renamed from: c  reason: collision with root package name */
    private final e f16457c;

    public f(AppMeasurementSdk appMeasurementSdk, a.b bVar) {
        this.f16455a = bVar;
        this.f16456b = appMeasurementSdk;
        e eVar = new e(this);
        this.f16457c = eVar;
        appMeasurementSdk.registerOnMeasurementEventListener(eVar);
    }
}