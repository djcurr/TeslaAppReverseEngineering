package ph;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final nh.b f46513a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f46514b;

    public h(nh.b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f46513a = bVar;
        this.f46514b = bArr;
    }

    public byte[] a() {
        return this.f46514b;
    }

    public nh.b b() {
        return this.f46513a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f46513a.equals(hVar.f46513a)) {
                return Arrays.equals(this.f46514b, hVar.f46514b);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f46513a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f46514b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f46513a + ", bytes=[...]}";
    }
}