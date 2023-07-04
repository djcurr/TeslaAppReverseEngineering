package v20;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class d3<U, T extends U> extends kotlinx.coroutines.internal.d0<T> implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    public final long f53908d;

    public d3(long j11, zz.d<? super U> dVar) {
        super(dVar.getContext(), dVar);
        this.f53908d = j11;
    }

    @Override // java.lang.Runnable
    public void run() {
        E(e3.a(this.f53908d, this));
    }

    @Override // v20.a, v20.h2
    public String v0() {
        return super.v0() + "(timeMillis=" + this.f53908d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}