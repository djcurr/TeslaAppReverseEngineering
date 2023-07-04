package atd.a;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, List<String>> f6760a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f6761b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f6762a;

        /* renamed from: b  reason: collision with root package name */
        String f6763b;

        /* renamed from: c  reason: collision with root package name */
        Map<String, List<String>> f6764c;

        /* renamed from: d  reason: collision with root package name */
        byte[] f6765d;

        public a a(int i11) {
            this.f6762a = i11;
            return this;
        }

        public a a(String str) {
            this.f6763b = str;
            return this;
        }

        public a a(Map<String, List<String>> map) {
            this.f6764c = map;
            return this;
        }

        public a a(byte[] bArr) {
            this.f6765d = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
            return this;
        }

        public j a() {
            return new j(this);
        }
    }

    j(a aVar) {
        int i11 = aVar.f6762a;
        this.f6760a = aVar.f6764c;
        this.f6761b = aVar.f6765d;
    }

    public byte[] a() {
        byte[] bArr = this.f6761b;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public Map<String, List<String>> b() {
        return this.f6760a;
    }
}