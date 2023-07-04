package ph;

import java.util.Arrays;
import java.util.Objects;
import ph.o;

/* loaded from: classes3.dex */
final class d extends o {

    /* renamed from: a  reason: collision with root package name */
    private final String f46493a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f46494b;

    /* renamed from: c  reason: collision with root package name */
    private final nh.d f46495c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private String f46496a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f46497b;

        /* renamed from: c  reason: collision with root package name */
        private nh.d f46498c;

        @Override // ph.o.a
        public o a() {
            String str = "";
            if (this.f46496a == null) {
                str = " backendName";
            }
            if (this.f46498c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f46496a, this.f46497b, this.f46498c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ph.o.a
        public o.a b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f46496a = str;
            return this;
        }

        @Override // ph.o.a
        public o.a c(byte[] bArr) {
            this.f46497b = bArr;
            return this;
        }

        @Override // ph.o.a
        public o.a d(nh.d dVar) {
            Objects.requireNonNull(dVar, "Null priority");
            this.f46498c = dVar;
            return this;
        }
    }

    @Override // ph.o
    public String b() {
        return this.f46493a;
    }

    @Override // ph.o
    public byte[] c() {
        return this.f46494b;
    }

    @Override // ph.o
    public nh.d d() {
        return this.f46495c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f46493a.equals(oVar.b())) {
                if (Arrays.equals(this.f46494b, oVar instanceof d ? ((d) oVar).f46494b : oVar.c()) && this.f46495c.equals(oVar.d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f46493a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f46494b)) * 1000003) ^ this.f46495c.hashCode();
    }

    private d(String str, byte[] bArr, nh.d dVar) {
        this.f46493a = str;
        this.f46494b = bArr;
        this.f46495c = dVar;
    }
}