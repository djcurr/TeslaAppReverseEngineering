package mx;

import com.google.common.base.u;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class b implements nx.c {

    /* renamed from: d  reason: collision with root package name */
    private static final Logger f39502d = Logger.getLogger(h.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final a f39503a;

    /* renamed from: b  reason: collision with root package name */
    private final nx.c f39504b;

    /* renamed from: c  reason: collision with root package name */
    private final i f39505c = new i(Level.FINE, h.class);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface a {
        void a(Throwable th2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar, nx.c cVar) {
        this.f39503a = (a) u.p(aVar, "transportExceptionHandler");
        this.f39504b = (nx.c) u.p(cVar, "frameWriter");
    }

    static Level a(Throwable th2) {
        if (th2.getClass().equals(IOException.class)) {
            return Level.FINE;
        }
        return Level.INFO;
    }

    @Override // nx.c
    public void B0(nx.i iVar) {
        this.f39505c.i(i.a.OUTBOUND, iVar);
        try {
            this.f39504b.B0(iVar);
        } catch (IOException e11) {
            this.f39503a.a(e11);
        }
    }

    @Override // nx.c
    public void E1(boolean z11, boolean z12, int i11, int i12, List<nx.d> list) {
        try {
            this.f39504b.E1(z11, z12, i11, i12, list);
        } catch (IOException e11) {
            this.f39503a.a(e11);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f39504b.close();
        } catch (IOException e11) {
            f39502d.log(a(e11), "Failed closing connection", (Throwable) e11);
        }
    }

    @Override // nx.c
    public void connectionPreface() {
        try {
            this.f39504b.connectionPreface();
        } catch (IOException e11) {
            this.f39503a.a(e11);
        }
    }

    @Override // nx.c
    public void data(boolean z11, int i11, okio.f fVar, int i12) {
        this.f39505c.b(i.a.OUTBOUND, i11, fVar.t(), i12, z11);
        try {
            this.f39504b.data(z11, i11, fVar, i12);
        } catch (IOException e11) {
            this.f39503a.a(e11);
        }
    }

    @Override // nx.c
    public void flush() {
        try {
            this.f39504b.flush();
        } catch (IOException e11) {
            this.f39503a.a(e11);
        }
    }

    @Override // nx.c
    public void k(int i11, nx.a aVar) {
        this.f39505c.h(i.a.OUTBOUND, i11, aVar);
        try {
            this.f39504b.k(i11, aVar);
        } catch (IOException e11) {
            this.f39503a.a(e11);
        }
    }

    @Override // nx.c
    public int maxDataLength() {
        return this.f39504b.maxDataLength();
    }

    @Override // nx.c
    public void n1(int i11, nx.a aVar, byte[] bArr) {
        this.f39505c.c(i.a.OUTBOUND, i11, aVar, okio.i.s(bArr));
        try {
            this.f39504b.n1(i11, aVar, bArr);
            this.f39504b.flush();
        } catch (IOException e11) {
            this.f39503a.a(e11);
        }
    }

    @Override // nx.c
    public void ping(boolean z11, int i11, int i12) {
        if (z11) {
            this.f39505c.f(i.a.OUTBOUND, (4294967295L & i12) | (i11 << 32));
        } else {
            this.f39505c.e(i.a.OUTBOUND, (4294967295L & i12) | (i11 << 32));
        }
        try {
            this.f39504b.ping(z11, i11, i12);
        } catch (IOException e11) {
            this.f39503a.a(e11);
        }
    }

    @Override // nx.c
    public void v0(nx.i iVar) {
        this.f39505c.j(i.a.OUTBOUND);
        try {
            this.f39504b.v0(iVar);
        } catch (IOException e11) {
            this.f39503a.a(e11);
        }
    }

    @Override // nx.c
    public void windowUpdate(int i11, long j11) {
        this.f39505c.k(i.a.OUTBOUND, i11, j11);
        try {
            this.f39504b.windowUpdate(i11, j11);
        } catch (IOException e11) {
            this.f39503a.a(e11);
        }
    }
}