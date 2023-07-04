package atd.a;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final String f6752a;

    /* renamed from: b  reason: collision with root package name */
    private final f f6753b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, List<String>> f6754c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f6755d;

    i(a aVar) {
        this.f6752a = aVar.f6756a;
        this.f6753b = aVar.f6757b;
        this.f6754c = aVar.f6758c;
        this.f6755d = aVar.f6759d;
    }

    public byte[] a() {
        byte[] bArr = this.f6755d;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public Map<String, List<String>> b() {
        return this.f6754c;
    }

    public f c() {
        return this.f6753b;
    }

    public String d() {
        return this.f6752a;
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        String f6756a;

        /* renamed from: b  reason: collision with root package name */
        f f6757b = f.GET;

        /* renamed from: c  reason: collision with root package name */
        Map<String, List<String>> f6758c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        byte[] f6759d;

        public a a(String str) {
            if (str != null) {
                if (!str.isEmpty()) {
                    this.f6756a = str;
                    return this;
                }
                throw new NullPointerException(atd.s0.a.a(-101922532813376L));
            }
            throw new NullPointerException(atd.s0.a.a(-101875288173120L));
        }

        public a b() {
            return a(f.GET, null);
        }

        public a a(Map<String, List<String>> map) {
            this.f6758c = map;
            return this;
        }

        public a a(byte[] bArr) {
            return a(f.POST, bArr);
        }

        public a a(f fVar, byte[] bArr) {
            if (fVar != null) {
                if (bArr != null && !f.a(fVar)) {
                    throw new IllegalArgumentException(atd.s0.a.a(-101828043532864L) + fVar + atd.s0.a.a(-102137281178176L));
                } else if (bArr == null && f.b(fVar)) {
                    throw new IllegalArgumentException(atd.s0.a.a(-102004137192000L) + fVar + atd.s0.a.a(-102038496930368L));
                } else {
                    this.f6757b = fVar;
                    this.f6759d = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                    return this;
                }
            }
            throw new NullPointerException(atd.s0.a.a(-101759324056128L));
        }

        public i a() {
            if (this.f6756a != null) {
                return new i(this);
            }
            throw new IllegalStateException(atd.s0.a.a(-101338417261120L));
        }
    }
}