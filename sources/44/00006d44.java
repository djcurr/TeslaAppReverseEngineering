package f4;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.g;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {

    /* renamed from: g  reason: collision with root package name */
    public static final ThreadLocal<a> f25763g = new ThreadLocal<>();

    /* renamed from: d  reason: collision with root package name */
    private c f25767d;

    /* renamed from: a  reason: collision with root package name */
    private final g<b, Long> f25764a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<b> f25765b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final C0505a f25766c = new C0505a();

    /* renamed from: e  reason: collision with root package name */
    long f25768e = 0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f25769f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0505a {
        C0505a() {
        }

        void a() {
            a.this.f25768e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f25768e);
            if (a.this.f25765b.size() > 0) {
                a.this.e().a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        boolean a(long j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final C0505a f25771a;

        c(C0505a c0505a) {
            this.f25771a = c0505a;
        }

        abstract void a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends c {

        /* renamed from: b  reason: collision with root package name */
        private final Runnable f25772b;

        /* renamed from: c  reason: collision with root package name */
        private final Handler f25773c;

        /* renamed from: d  reason: collision with root package name */
        long f25774d;

        /* renamed from: f4.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0506a implements Runnable {
            RunnableC0506a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f25774d = SystemClock.uptimeMillis();
                d.this.f25771a.a();
            }
        }

        d(C0505a c0505a) {
            super(c0505a);
            this.f25774d = -1L;
            this.f25772b = new RunnableC0506a();
            this.f25773c = new Handler(Looper.myLooper());
        }

        @Override // f4.a.c
        void a() {
            this.f25773c.postDelayed(this.f25772b, Math.max(10 - (SystemClock.uptimeMillis() - this.f25774d), 0L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e extends c {

        /* renamed from: b  reason: collision with root package name */
        private final Choreographer f25776b;

        /* renamed from: c  reason: collision with root package name */
        private final Choreographer.FrameCallback f25777c;

        /* renamed from: f4.a$e$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class Choreographer$FrameCallbackC0507a implements Choreographer.FrameCallback {
            Choreographer$FrameCallbackC0507a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j11) {
                e.this.f25771a.a();
            }
        }

        e(C0505a c0505a) {
            super(c0505a);
            this.f25776b = Choreographer.getInstance();
            this.f25777c = new Choreographer$FrameCallbackC0507a();
        }

        @Override // f4.a.c
        void a() {
            this.f25776b.postFrameCallback(this.f25777c);
        }
    }

    a() {
    }

    private void b() {
        if (this.f25769f) {
            for (int size = this.f25765b.size() - 1; size >= 0; size--) {
                if (this.f25765b.get(size) == null) {
                    this.f25765b.remove(size);
                }
            }
            this.f25769f = false;
        }
    }

    public static a d() {
        ThreadLocal<a> threadLocal = f25763g;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }

    private boolean f(b bVar, long j11) {
        Long l11 = this.f25764a.get(bVar);
        if (l11 == null) {
            return true;
        }
        if (l11.longValue() < j11) {
            this.f25764a.remove(bVar);
            return true;
        }
        return false;
    }

    public void a(b bVar, long j11) {
        if (this.f25765b.size() == 0) {
            e().a();
        }
        if (!this.f25765b.contains(bVar)) {
            this.f25765b.add(bVar);
        }
        if (j11 > 0) {
            this.f25764a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j11));
        }
    }

    void c(long j11) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i11 = 0; i11 < this.f25765b.size(); i11++) {
            b bVar = this.f25765b.get(i11);
            if (bVar != null && f(bVar, uptimeMillis)) {
                bVar.a(j11);
            }
        }
        b();
    }

    c e() {
        if (this.f25767d == null) {
            if (Build.VERSION.SDK_INT >= 16) {
                this.f25767d = new e(this.f25766c);
            } else {
                this.f25767d = new d(this.f25766c);
            }
        }
        return this.f25767d;
    }

    public void g(b bVar) {
        this.f25764a.remove(bVar);
        int indexOf = this.f25765b.indexOf(bVar);
        if (indexOf >= 0) {
            this.f25765b.set(indexOf, null);
            this.f25769f = true;
        }
    }
}