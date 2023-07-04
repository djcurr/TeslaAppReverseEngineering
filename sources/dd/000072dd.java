package ha;

import bb.j;
import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class d<T> {

    /* renamed from: e  reason: collision with root package name */
    private static final b<Object> f29011e = new a();

    /* renamed from: a  reason: collision with root package name */
    private final T f29012a;

    /* renamed from: b  reason: collision with root package name */
    private final b<T> f29013b;

    /* renamed from: c  reason: collision with root package name */
    private final String f29014c;

    /* renamed from: d  reason: collision with root package name */
    private volatile byte[] f29015d;

    /* loaded from: classes.dex */
    class a implements b<Object> {
        a() {
        }

        @Override // ha.d.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void a(byte[] bArr, T t11, MessageDigest messageDigest);
    }

    private d(String str, T t11, b<T> bVar) {
        this.f29014c = j.b(str);
        this.f29012a = t11;
        this.f29013b = (b) j.d(bVar);
    }

    public static <T> d<T> a(String str, T t11, b<T> bVar) {
        return new d<>(str, t11, bVar);
    }

    private static <T> b<T> b() {
        return (b<T>) f29011e;
    }

    private byte[] d() {
        if (this.f29015d == null) {
            this.f29015d = this.f29014c.getBytes(ha.b.f29009a);
        }
        return this.f29015d;
    }

    public static <T> d<T> e(String str) {
        return new d<>(str, null, b());
    }

    public static <T> d<T> f(String str, T t11) {
        return new d<>(str, t11, b());
    }

    public T c() {
        return this.f29012a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f29014c.equals(((d) obj).f29014c);
        }
        return false;
    }

    public void g(T t11, MessageDigest messageDigest) {
        this.f29013b.a(d(), t11, messageDigest);
    }

    public int hashCode() {
        return this.f29014c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f29014c + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }
}