package androidx.work;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    final Executor f6489a;

    /* renamed from: b  reason: collision with root package name */
    final Executor f6490b;

    /* renamed from: c  reason: collision with root package name */
    final d0 f6491c;

    /* renamed from: d  reason: collision with root package name */
    final m f6492d;

    /* renamed from: e  reason: collision with root package name */
    final y f6493e;

    /* renamed from: f  reason: collision with root package name */
    final k f6494f;

    /* renamed from: g  reason: collision with root package name */
    final String f6495g;

    /* renamed from: h  reason: collision with root package name */
    final int f6496h;

    /* renamed from: i  reason: collision with root package name */
    final int f6497i;

    /* renamed from: j  reason: collision with root package name */
    final int f6498j;

    /* renamed from: k  reason: collision with root package name */
    final int f6499k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f6500a = new AtomicInteger(0);

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f6501b;

        a(b bVar, boolean z11) {
            this.f6501b = z11;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            String str = this.f6501b ? "WM.task-" : "androidx.work-";
            return new Thread(runnable, str + this.f6500a.incrementAndGet());
        }
    }

    /* renamed from: androidx.work.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0115b {

        /* renamed from: a  reason: collision with root package name */
        Executor f6502a;

        /* renamed from: b  reason: collision with root package name */
        d0 f6503b;

        /* renamed from: c  reason: collision with root package name */
        m f6504c;

        /* renamed from: d  reason: collision with root package name */
        Executor f6505d;

        /* renamed from: e  reason: collision with root package name */
        y f6506e;

        /* renamed from: f  reason: collision with root package name */
        k f6507f;

        /* renamed from: g  reason: collision with root package name */
        String f6508g;

        /* renamed from: h  reason: collision with root package name */
        int f6509h = 4;

        /* renamed from: i  reason: collision with root package name */
        int f6510i = 0;

        /* renamed from: j  reason: collision with root package name */
        int f6511j = Integer.MAX_VALUE;

        /* renamed from: k  reason: collision with root package name */
        int f6512k = 20;

        public b a() {
            return new b(this);
        }

        public C0115b b(int i11) {
            this.f6509h = i11;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        b g();
    }

    b(C0115b c0115b) {
        Executor executor = c0115b.f6502a;
        if (executor == null) {
            this.f6489a = a(false);
        } else {
            this.f6489a = executor;
        }
        Executor executor2 = c0115b.f6505d;
        if (executor2 == null) {
            this.f6490b = a(true);
        } else {
            this.f6490b = executor2;
        }
        d0 d0Var = c0115b.f6503b;
        if (d0Var == null) {
            this.f6491c = d0.c();
        } else {
            this.f6491c = d0Var;
        }
        m mVar = c0115b.f6504c;
        if (mVar == null) {
            this.f6492d = m.c();
        } else {
            this.f6492d = mVar;
        }
        y yVar = c0115b.f6506e;
        if (yVar == null) {
            this.f6493e = new d5.a();
        } else {
            this.f6493e = yVar;
        }
        this.f6496h = c0115b.f6509h;
        this.f6497i = c0115b.f6510i;
        this.f6498j = c0115b.f6511j;
        this.f6499k = c0115b.f6512k;
        this.f6494f = c0115b.f6507f;
        this.f6495g = c0115b.f6508g;
    }

    private Executor a(boolean z11) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z11));
    }

    private ThreadFactory b(boolean z11) {
        return new a(this, z11);
    }

    public String c() {
        return this.f6495g;
    }

    public k d() {
        return this.f6494f;
    }

    public Executor e() {
        return this.f6489a;
    }

    public m f() {
        return this.f6492d;
    }

    public int g() {
        return this.f6498j;
    }

    public int h() {
        if (Build.VERSION.SDK_INT == 23) {
            return this.f6499k / 2;
        }
        return this.f6499k;
    }

    public int i() {
        return this.f6497i;
    }

    public int j() {
        return this.f6496h;
    }

    public y k() {
        return this.f6493e;
    }

    public Executor l() {
        return this.f6490b;
    }

    public d0 m() {
        return this.f6491c;
    }
}