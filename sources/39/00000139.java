package am;

import am.a0;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
final class f extends a0.d.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f735a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f736b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends a0.d.b.a {

        /* renamed from: a  reason: collision with root package name */
        private String f737a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f738b;

        @Override // am.a0.d.b.a
        public a0.d.b a() {
            String str = "";
            if (this.f737a == null) {
                str = " filename";
            }
            if (this.f738b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new f(this.f737a, this.f738b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // am.a0.d.b.a
        public a0.d.b.a b(byte[] bArr) {
            Objects.requireNonNull(bArr, "Null contents");
            this.f738b = bArr;
            return this;
        }

        @Override // am.a0.d.b.a
        public a0.d.b.a c(String str) {
            Objects.requireNonNull(str, "Null filename");
            this.f737a = str;
            return this;
        }
    }

    @Override // am.a0.d.b
    public byte[] b() {
        return this.f736b;
    }

    @Override // am.a0.d.b
    public String c() {
        return this.f735a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.d.b) {
            a0.d.b bVar = (a0.d.b) obj;
            if (this.f735a.equals(bVar.c())) {
                if (Arrays.equals(this.f736b, bVar instanceof f ? ((f) bVar).f736b : bVar.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f735a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f736b);
    }

    public String toString() {
        return "File{filename=" + this.f735a + ", contents=" + Arrays.toString(this.f736b) + "}";
    }

    private f(String str, byte[] bArr) {
        this.f735a = str;
        this.f736b = bArr;
    }
}