package io.sentry;

import java.util.ArrayList;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class i2 {

    /* renamed from: a  reason: collision with root package name */
    private final j2 f32288a;

    /* renamed from: b  reason: collision with root package name */
    private final Iterable<z2> f32289b;

    public i2(j2 j2Var, Iterable<z2> iterable) {
        this.f32288a = (j2) rz.j.a(j2Var, "SentryEnvelopeHeader is required.");
        this.f32289b = (Iterable) rz.j.a(iterable, "SentryEnvelope items are required.");
    }

    public static i2 a(h0 h0Var, q3 q3Var, io.sentry.protocol.m mVar) {
        rz.j.a(h0Var, "Serializer is required.");
        rz.j.a(q3Var, "session is required.");
        return new i2(null, mVar, z2.t(h0Var, q3Var));
    }

    public j2 b() {
        return this.f32288a;
    }

    public Iterable<z2> c() {
        return this.f32289b;
    }

    public i2(io.sentry.protocol.o oVar, io.sentry.protocol.m mVar, z2 z2Var) {
        rz.j.a(z2Var, "SentryEnvelopeItem is required.");
        this.f32288a = new j2(oVar, mVar);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(z2Var);
        this.f32289b = arrayList;
    }
}