package jf;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class n implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final int f33620a;

    /* renamed from: b  reason: collision with root package name */
    private final String f33621b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f33622c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicInteger f33623d = new AtomicInteger(1);

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f33624a;

        a(Runnable runnable) {
            this.f33624a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(n.this.f33620a);
            } catch (Throwable unused) {
            }
            this.f33624a.run();
        }
    }

    public n(int i11, String str, boolean z11) {
        this.f33620a = i11;
        this.f33621b = str;
        this.f33622c = z11;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str;
        a aVar = new a(runnable);
        if (this.f33622c) {
            str = this.f33621b + "-" + this.f33623d.getAndIncrement();
        } else {
            str = this.f33621b;
        }
        return new Thread(aVar, str);
    }
}