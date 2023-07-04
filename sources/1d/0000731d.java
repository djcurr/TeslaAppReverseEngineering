package hd;

import gd.c;
import java.io.IOException;

/* loaded from: classes.dex */
public class j implements gd.b {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f29108c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static j f29109d;

    /* renamed from: e  reason: collision with root package name */
    private static int f29110e;

    /* renamed from: a  reason: collision with root package name */
    private gd.d f29111a;

    /* renamed from: b  reason: collision with root package name */
    private j f29112b;

    private j() {
    }

    public static j a() {
        synchronized (f29108c) {
            j jVar = f29109d;
            if (jVar != null) {
                f29109d = jVar.f29112b;
                jVar.f29112b = null;
                f29110e--;
                return jVar;
            }
            return new j();
        }
    }

    private void c() {
    }

    public void b() {
        synchronized (f29108c) {
            if (f29110e < 5) {
                c();
                f29110e++;
                j jVar = f29109d;
                if (jVar != null) {
                    this.f29112b = jVar;
                }
                f29109d = this;
            }
        }
    }

    public j d(gd.d dVar) {
        this.f29111a = dVar;
        return this;
    }

    public j e(long j11) {
        return this;
    }

    public j f(long j11) {
        return this;
    }

    public j g(c.a aVar) {
        return this;
    }

    public j h(IOException iOException) {
        return this;
    }

    public j i(long j11) {
        return this;
    }

    public j j(String str) {
        return this;
    }
}