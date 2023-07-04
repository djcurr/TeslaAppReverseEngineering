package fi;

import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import fi.f;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public abstract class g<I extends DecoderInputBuffer, O extends f, E extends DecoderException> implements c<I, O, E> {

    /* renamed from: a  reason: collision with root package name */
    private final Thread f26275a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f26276b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque<I> f26277c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayDeque<O> f26278d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    private final I[] f26279e;

    /* renamed from: f  reason: collision with root package name */
    private final O[] f26280f;

    /* renamed from: g  reason: collision with root package name */
    private int f26281g;

    /* renamed from: h  reason: collision with root package name */
    private int f26282h;

    /* renamed from: i  reason: collision with root package name */
    private I f26283i;

    /* renamed from: j  reason: collision with root package name */
    private E f26284j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f26285k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f26286l;

    /* renamed from: m  reason: collision with root package name */
    private int f26287m;

    /* loaded from: classes3.dex */
    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            g.this.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g(I[] iArr, O[] oArr) {
        this.f26279e = iArr;
        this.f26281g = iArr.length;
        for (int i11 = 0; i11 < this.f26281g; i11++) {
            this.f26279e[i11] = g();
        }
        this.f26280f = oArr;
        this.f26282h = oArr.length;
        for (int i12 = 0; i12 < this.f26282h; i12++) {
            this.f26280f[i12] = h();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f26275a = aVar;
        aVar.start();
    }

    private boolean f() {
        return !this.f26277c.isEmpty() && this.f26282h > 0;
    }

    private boolean k() {
        E i11;
        synchronized (this.f26276b) {
            while (!this.f26286l && !f()) {
                this.f26276b.wait();
            }
            if (this.f26286l) {
                return false;
            }
            I removeFirst = this.f26277c.removeFirst();
            O[] oArr = this.f26280f;
            int i12 = this.f26282h - 1;
            this.f26282h = i12;
            O o11 = oArr[i12];
            boolean z11 = this.f26285k;
            this.f26285k = false;
            if (removeFirst.l()) {
                o11.e(4);
            } else {
                if (removeFirst.k()) {
                    o11.e(Integer.MIN_VALUE);
                }
                try {
                    i11 = j(removeFirst, o11, z11);
                } catch (OutOfMemoryError e11) {
                    i11 = i(e11);
                } catch (RuntimeException e12) {
                    i11 = i(e12);
                }
                if (i11 != null) {
                    synchronized (this.f26276b) {
                        this.f26284j = i11;
                    }
                    return false;
                }
            }
            synchronized (this.f26276b) {
                if (this.f26285k) {
                    o11.q();
                } else if (o11.k()) {
                    this.f26287m++;
                    o11.q();
                } else {
                    this.f26287m = 0;
                    this.f26278d.addLast(o11);
                }
                q(removeFirst);
            }
            return true;
        }
    }

    private void n() {
        if (f()) {
            this.f26276b.notify();
        }
    }

    private void o() {
        E e11 = this.f26284j;
        if (e11 != null) {
            throw e11;
        }
    }

    private void q(I i11) {
        i11.f();
        I[] iArr = this.f26279e;
        int i12 = this.f26281g;
        this.f26281g = i12 + 1;
        iArr[i12] = i11;
    }

    private void s(O o11) {
        o11.f();
        O[] oArr = this.f26280f;
        int i11 = this.f26282h;
        this.f26282h = i11 + 1;
        oArr[i11] = o11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        do {
            try {
            } catch (InterruptedException e11) {
                throw new IllegalStateException(e11);
            }
        } while (k());
    }

    @Override // fi.c
    public final void flush() {
        synchronized (this.f26276b) {
            this.f26285k = true;
            this.f26287m = 0;
            I i11 = this.f26283i;
            if (i11 != null) {
                q(i11);
                this.f26283i = null;
            }
            while (!this.f26277c.isEmpty()) {
                q(this.f26277c.removeFirst());
            }
            while (!this.f26278d.isEmpty()) {
                this.f26278d.removeFirst().q();
            }
        }
    }

    protected abstract I g();

    protected abstract O h();

    protected abstract E i(Throwable th2);

    protected abstract E j(I i11, O o11, boolean z11);

    @Override // fi.c
    /* renamed from: l */
    public final I d() {
        I i11;
        synchronized (this.f26276b) {
            o();
            ak.a.f(this.f26283i == null);
            int i12 = this.f26281g;
            if (i12 == 0) {
                i11 = null;
            } else {
                I[] iArr = this.f26279e;
                int i13 = i12 - 1;
                this.f26281g = i13;
                i11 = iArr[i13];
            }
            this.f26283i = i11;
        }
        return i11;
    }

    @Override // fi.c
    /* renamed from: m */
    public final O b() {
        synchronized (this.f26276b) {
            o();
            if (this.f26278d.isEmpty()) {
                return null;
            }
            return this.f26278d.removeFirst();
        }
    }

    @Override // fi.c
    /* renamed from: p */
    public final void c(I i11) {
        synchronized (this.f26276b) {
            o();
            ak.a.a(i11 == this.f26283i);
            this.f26277c.addLast(i11);
            n();
            this.f26283i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r(O o11) {
        synchronized (this.f26276b) {
            s(o11);
            n();
        }
    }

    @Override // fi.c
    public void release() {
        synchronized (this.f26276b) {
            this.f26286l = true;
            this.f26276b.notify();
        }
        try {
            this.f26275a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u(int i11) {
        ak.a.f(this.f26281g == this.f26279e.length);
        for (I i12 : this.f26279e) {
            i12.r(i11);
        }
    }
}