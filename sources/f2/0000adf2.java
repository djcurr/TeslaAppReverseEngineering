package qh;

import java.util.Arrays;
import java.util.Objects;
import qh.e;

/* loaded from: classes3.dex */
final class a extends e {

    /* renamed from: a  reason: collision with root package name */
    private final Iterable<ph.i> f48146a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f48147b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends e.a {

        /* renamed from: a  reason: collision with root package name */
        private Iterable<ph.i> f48148a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f48149b;

        @Override // qh.e.a
        public e a() {
            String str = "";
            if (this.f48148a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f48148a, this.f48149b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // qh.e.a
        public e.a b(Iterable<ph.i> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.f48148a = iterable;
            return this;
        }

        @Override // qh.e.a
        public e.a c(byte[] bArr) {
            this.f48149b = bArr;
            return this;
        }
    }

    @Override // qh.e
    public Iterable<ph.i> b() {
        return this.f48146a;
    }

    @Override // qh.e
    public byte[] c() {
        return this.f48147b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f48146a.equals(eVar.b())) {
                if (Arrays.equals(this.f48147b, eVar instanceof a ? ((a) eVar).f48147b : eVar.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f48146a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f48147b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f48146a + ", extras=" + Arrays.toString(this.f48147b) + "}";
    }

    private a(Iterable<ph.i> iterable, byte[] bArr) {
        this.f48146a = iterable;
        this.f48147b = bArr;
    }
}