package androidx.recyclerview.widget;

import androidx.recyclerview.widget.h;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f5477a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f5478b;

    /* renamed from: c  reason: collision with root package name */
    private final h.f<T> f5479c;

    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: d  reason: collision with root package name */
        private static final Object f5480d = new Object();

        /* renamed from: e  reason: collision with root package name */
        private static Executor f5481e;

        /* renamed from: a  reason: collision with root package name */
        private Executor f5482a;

        /* renamed from: b  reason: collision with root package name */
        private Executor f5483b;

        /* renamed from: c  reason: collision with root package name */
        private final h.f<T> f5484c;

        public a(h.f<T> fVar) {
            this.f5484c = fVar;
        }

        public c<T> a() {
            if (this.f5483b == null) {
                synchronized (f5480d) {
                    if (f5481e == null) {
                        f5481e = Executors.newFixedThreadPool(2);
                    }
                }
                this.f5483b = f5481e;
            }
            return new c<>(this.f5482a, this.f5483b, this.f5484c);
        }
    }

    c(Executor executor, Executor executor2, h.f<T> fVar) {
        this.f5477a = executor;
        this.f5478b = executor2;
        this.f5479c = fVar;
    }

    public Executor a() {
        return this.f5478b;
    }

    public h.f<T> b() {
        return this.f5479c;
    }

    public Executor c() {
        return this.f5477a;
    }
}