package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import java.util.Set;
import sl.a;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    final Set f16450a;

    /* renamed from: b  reason: collision with root package name */
    private final a.b f16451b;

    /* renamed from: c  reason: collision with root package name */
    private final AppMeasurementSdk f16452c;

    /* renamed from: d  reason: collision with root package name */
    private final c f16453d;

    public d(AppMeasurementSdk appMeasurementSdk, a.b bVar) {
        this.f16451b = bVar;
        this.f16452c = appMeasurementSdk;
        c cVar = new c(this);
        this.f16453d = cVar;
        appMeasurementSdk.registerOnMeasurementEventListener(cVar);
        this.f16450a = new HashSet();
    }
}