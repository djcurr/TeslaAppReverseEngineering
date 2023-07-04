package vy;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class j extends AtomicLong implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    final String f54720a;

    /* renamed from: b  reason: collision with root package name */
    final int f54721b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f54722c;

    /* loaded from: classes5.dex */
    static final class a extends Thread implements i {
        a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public j(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f54720a + CoreConstants.DASH_CHAR + incrementAndGet();
        Thread aVar = this.f54722c ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f54721b);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f54720a + "]";
    }

    public j(String str, int i11) {
        this(str, i11, false);
    }

    public j(String str, int i11, boolean z11) {
        this.f54720a = str;
        this.f54721b = i11;
        this.f54722c = z11;
    }
}