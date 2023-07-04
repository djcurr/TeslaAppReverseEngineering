package androidx.room;

import androidx.room.t0;
import java.util.concurrent.Executor;
import v4.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l0 implements h.c {

    /* renamed from: a  reason: collision with root package name */
    private final h.c f5789a;

    /* renamed from: b  reason: collision with root package name */
    private final t0.f f5790b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f5791c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(h.c cVar, t0.f fVar, Executor executor) {
        this.f5789a = cVar;
        this.f5790b = fVar;
        this.f5791c = executor;
    }

    @Override // v4.h.c
    public v4.h a(h.b bVar) {
        return new k0(this.f5789a.a(bVar), this.f5790b, this.f5791c);
    }
}