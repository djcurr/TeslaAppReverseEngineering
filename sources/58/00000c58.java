package bc;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final a<T> f7592a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    private int f7593b;

    /* loaded from: classes.dex */
    static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<Byte, a<T>> f7594a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private T f7595b = null;

        a() {
        }

        public void c(T t11) {
            if (this.f7595b == null) {
                this.f7595b = t11;
                return;
            }
            throw new RuntimeException("Value already set for this trie node");
        }
    }

    public void a(T t11, byte[]... bArr) {
        a<T> aVar = this.f7592a;
        int i11 = 0;
        for (byte[] bArr2 : bArr) {
            for (byte b11 : bArr2) {
                a<T> aVar2 = (a) ((a) aVar).f7594a.get(Byte.valueOf(b11));
                if (aVar2 == null) {
                    aVar2 = new a<>();
                    ((a) aVar).f7594a.put(Byte.valueOf(b11), aVar2);
                }
                aVar = aVar2;
                i11++;
            }
        }
        if (i11 != 0) {
            aVar.c(t11);
            this.f7593b = Math.max(this.f7593b, i11);
            return;
        }
        throw new IllegalArgumentException("Parts must contain at least one byte.");
    }

    public T b(byte[] bArr) {
        a<T> aVar = this.f7592a;
        T t11 = (T) ((a) aVar).f7595b;
        for (byte b11 : bArr) {
            aVar = (a) ((a) aVar).f7594a.get(Byte.valueOf(b11));
            if (aVar == null) {
                break;
            }
            if (((a) aVar).f7595b != null) {
                t11 = (T) ((a) aVar).f7595b;
            }
        }
        return t11;
    }

    public int c() {
        return this.f7593b;
    }

    public void d(T t11) {
        this.f7592a.c(t11);
    }
}