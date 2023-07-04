package mp;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class d implements ib.d, Iterator<ib.b>, Closeable {

    /* renamed from: g */
    private static final ib.b f38676g = new a("eof ");

    /* renamed from: a */
    protected hb.a f38677a;

    /* renamed from: b */
    protected e f38678b;

    /* renamed from: c */
    ib.b f38679c = null;

    /* renamed from: d */
    long f38680d = 0;

    /* renamed from: e */
    long f38681e = 0;

    /* renamed from: f */
    private List<ib.b> f38682f = new ArrayList();

    /* loaded from: classes2.dex */
    class a extends mp.a {
        a(String str) {
            super(str);
        }

        @Override // mp.a
        protected void b(ByteBuffer byteBuffer) {
        }

        @Override // mp.a
        protected void c(ByteBuffer byteBuffer) {
        }

        @Override // mp.a
        protected long d() {
            return 0L;
        }
    }

    static {
        pp.f.a(d.class);
    }

    @Override // java.util.Iterator
    /* renamed from: C */
    public ib.b next() {
        ib.b a11;
        ib.b bVar = this.f38679c;
        if (bVar != null && bVar != f38676g) {
            this.f38679c = null;
            return bVar;
        }
        e eVar = this.f38678b;
        if (eVar != null && this.f38680d < this.f38681e) {
            try {
                synchronized (eVar) {
                    this.f38678b.r0(this.f38680d);
                    a11 = this.f38677a.a(this.f38678b, this);
                    this.f38680d = this.f38678b.O();
                }
                return a11;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        }
        this.f38679c = f38676g;
        throw new NoSuchElementException();
    }

    public final void D(WritableByteChannel writableByteChannel) {
        for (ib.b bVar : m()) {
            bVar.g(writableByteChannel);
        }
    }

    public void close() {
        this.f38678b.close();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ib.b bVar = this.f38679c;
        if (bVar == f38676g) {
            return false;
        }
        if (bVar != null) {
            return true;
        }
        try {
            this.f38679c = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f38679c = f38676g;
            return false;
        }
    }

    public void l(ib.b bVar) {
        if (bVar != null) {
            this.f38682f = new ArrayList(m());
            bVar.j(this);
            this.f38682f.add(bVar);
        }
    }

    public List<ib.b> m() {
        if (this.f38678b != null && this.f38679c != f38676g) {
            return new pp.e(this.f38682f, this);
        }
        return this.f38682f;
    }

    public long p() {
        long j11 = 0;
        for (int i11 = 0; i11 < m().size(); i11++) {
            j11 += this.f38682f.get(i11).a();
        }
        return j11;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        for (int i11 = 0; i11 < this.f38682f.size(); i11++) {
            if (i11 > 0) {
                sb2.append(";");
            }
            sb2.append(this.f38682f.get(i11).toString());
        }
        sb2.append("]");
        return sb2.toString();
    }
}