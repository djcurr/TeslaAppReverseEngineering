package x60;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public class c extends g {

    /* renamed from: b  reason: collision with root package name */
    private final int f57138b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f57139c;

    /* renamed from: d  reason: collision with root package name */
    private List<h> f57140d;

    /* renamed from: e  reason: collision with root package name */
    private List<j> f57141e;

    /* renamed from: f  reason: collision with root package name */
    private final long f57142f;

    /* renamed from: g  reason: collision with root package name */
    private long f57143g;

    /* renamed from: h  reason: collision with root package name */
    private d f57144h;

    private c(int i11, List<h> list, List<j> list2, long j11, long j12, boolean z11) {
        super(true);
        this.f57143g = 0L;
        this.f57138b = i11;
        this.f57140d = Collections.unmodifiableList(list);
        this.f57141e = Collections.unmodifiableList(list2);
        this.f57143g = j11;
        this.f57142f = j12;
        this.f57139c = z11;
    }

    public static c b(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            if (dataInputStream2.readInt() == 0) {
                int readInt = dataInputStream2.readInt();
                long readLong = dataInputStream2.readLong();
                long readLong2 = dataInputStream2.readLong();
                boolean readBoolean = dataInputStream2.readBoolean();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < readInt; i11++) {
                    arrayList.add(h.f(obj));
                }
                for (int i12 = 0; i12 < readInt - 1; i12++) {
                    arrayList2.add(j.a(obj));
                }
                return new c(readInt, arrayList, arrayList2, readLong, readLong2, readBoolean);
            }
            throw new IllegalStateException("unknown version for hss private key");
        } else if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return b(t70.a.c((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        } else {
            DataInputStream dataInputStream3 = null;
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                c b11 = b(dataInputStream);
                dataInputStream.close();
                return b11;
            } catch (Throwable th3) {
                th = th3;
                dataInputStream3 = dataInputStream;
                if (dataInputStream3 != null) {
                    dataInputStream3.close();
                }
                throw th;
            }
        }
    }

    public static c c(byte[] bArr, byte[] bArr2) {
        c b11 = b(bArr);
        b11.f57144h = d.b(bArr2);
        return b11;
    }

    private static c g(c cVar) {
        try {
            return b(cVar.getEncoded());
        } catch (Exception e11) {
            throw new RuntimeException(e11.getMessage(), e11);
        }
    }

    protected Object clone() {
        return g(this);
    }

    public int d() {
        return this.f57138b;
    }

    public synchronized d e() {
        return new d(this.f57138b, f().j());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f57138b == cVar.f57138b && this.f57139c == cVar.f57139c && this.f57142f == cVar.f57142f && this.f57143g == cVar.f57143g && this.f57140d.equals(cVar.f57140d)) {
            return this.f57141e.equals(cVar.f57141e);
        }
        return false;
    }

    h f() {
        return this.f57140d.get(0);
    }

    @Override // x60.g, r70.c
    public synchronized byte[] getEncoded() {
        a a11;
        a11 = a.f().i(0).i(this.f57138b).j(this.f57143g).j(this.f57142f).a(this.f57139c);
        for (h hVar : this.f57140d) {
            a11.c(hVar);
        }
        for (j jVar : this.f57141e) {
            a11.c(jVar);
        }
        return a11.b();
    }

    public int hashCode() {
        long j11 = this.f57142f;
        long j12 = this.f57143g;
        return (((((((((this.f57138b * 31) + (this.f57139c ? 1 : 0)) * 31) + this.f57140d.hashCode()) * 31) + this.f57141e.hashCode()) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)));
    }
}