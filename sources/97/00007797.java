package io.grpc;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.common.io.BaseEncoding;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class r0 {

    /* renamed from: c */
    private static final Logger f31578c = Logger.getLogger(r0.class.getName());

    /* renamed from: d */
    public static final d<String> f31579d;

    /* renamed from: e */
    static final BaseEncoding f31580e;

    /* renamed from: a */
    private Object[] f31581a;

    /* renamed from: b */
    private int f31582b;

    /* loaded from: classes5.dex */
    public class a {
        a() {
        }
    }

    /* loaded from: classes5.dex */
    class b implements d<String> {
        b() {
        }

        @Override // io.grpc.r0.d
        /* renamed from: c */
        public String b(String str) {
            return str;
        }

        @Override // io.grpc.r0.d
        /* renamed from: d */
        public String a(String str) {
            return str;
        }
    }

    /* loaded from: classes5.dex */
    public static class c<T> extends f<T> {

        /* renamed from: f */
        private final d<T> f31583f;

        /* synthetic */ c(String str, boolean z11, d dVar, a aVar) {
            this(str, z11, dVar);
        }

        @Override // io.grpc.r0.f
        T h(byte[] bArr) {
            return this.f31583f.b(new String(bArr, com.google.common.base.f.f15918a));
        }

        @Override // io.grpc.r0.f
        byte[] j(T t11) {
            return this.f31583f.a(t11).getBytes(com.google.common.base.f.f15918a);
        }

        private c(String str, boolean z11, d<T> dVar) {
            super(str, z11, dVar, null);
            com.google.common.base.u.l(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f31583f = (d) com.google.common.base.u.p(dVar, "marshaller");
        }
    }

    /* loaded from: classes5.dex */
    public interface d<T> {
        String a(T t11);

        T b(String str);
    }

    /* loaded from: classes5.dex */
    public interface e<T> {
        InputStream a(T t11);

        T b(InputStream inputStream);
    }

    /* loaded from: classes5.dex */
    public static abstract class f<T> {

        /* renamed from: e */
        private static final BitSet f31584e = b();

        /* renamed from: a */
        private final String f31585a;

        /* renamed from: b */
        private final String f31586b;

        /* renamed from: c */
        private final byte[] f31587c;

        /* renamed from: d */
        private final Object f31588d;

        /* synthetic */ f(String str, boolean z11, Object obj, a aVar) {
            this(str, z11, obj);
        }

        private static BitSet b() {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c11 = '0'; c11 <= '9'; c11 = (char) (c11 + 1)) {
                bitSet.set(c11);
            }
            for (char c12 = 'a'; c12 <= 'z'; c12 = (char) (c12 + 1)) {
                bitSet.set(c12);
            }
            return bitSet;
        }

        public static <T> f<T> e(String str, d<T> dVar) {
            return f(str, false, dVar);
        }

        static <T> f<T> f(String str, boolean z11, d<T> dVar) {
            return new c(str, z11, dVar, null);
        }

        public static <T> f<T> g(String str, boolean z11, i<T> iVar) {
            return new h(str, z11, iVar, null);
        }

        private static String k(String str, boolean z11) {
            com.google.common.base.u.p(str, "name");
            com.google.common.base.u.e(!str.isEmpty(), "token must have at least 1 tchar");
            if (str.equals("connection")) {
                r0.f31578c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
            }
            for (int i11 = 0; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (!z11 || charAt != ':' || i11 != 0) {
                    com.google.common.base.u.g(f31584e.get(charAt), "Invalid character '%s' in key name '%s'", charAt, str);
                }
            }
            return str;
        }

        byte[] a() {
            return this.f31587c;
        }

        final <M> M c(Class<M> cls) {
            if (cls.isInstance(this.f31588d)) {
                return cls.cast(this.f31588d);
            }
            return null;
        }

        public final String d() {
            return this.f31586b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f31586b.equals(((f) obj).f31586b);
        }

        abstract T h(byte[] bArr);

        public final int hashCode() {
            return this.f31586b.hashCode();
        }

        boolean i() {
            return false;
        }

        abstract byte[] j(T t11);

        public String toString() {
            return "Key{name='" + this.f31586b + "'}";
        }

        private f(String str, boolean z11, Object obj) {
            String str2 = (String) com.google.common.base.u.p(str, "name");
            this.f31585a = str2;
            String k11 = k(str2.toLowerCase(Locale.ROOT), z11);
            this.f31586b = k11;
            this.f31587c = k11.getBytes(com.google.common.base.f.f15918a);
            this.f31588d = obj;
        }
    }

    /* loaded from: classes5.dex */
    public static final class g<T> {

        /* renamed from: a */
        private final e<T> f31589a;

        /* renamed from: b */
        private final T f31590b;

        /* renamed from: c */
        private volatile byte[] f31591c;

        g(e<T> eVar, T t11) {
            this.f31589a = eVar;
            this.f31590b = t11;
        }

        static <T> g<T> a(f<T> fVar, T t11) {
            return new g<>((e) com.google.common.base.u.o(b(fVar)), t11);
        }

        private static <T> e<T> b(f<T> fVar) {
            return (e) fVar.c(e.class);
        }

        byte[] c() {
            if (this.f31591c == null) {
                synchronized (this) {
                    if (this.f31591c == null) {
                        this.f31591c = r0.q(e());
                    }
                }
            }
            return this.f31591c;
        }

        <T2> T2 d(f<T2> fVar) {
            e b11;
            if (fVar.i() && (b11 = b(fVar)) != null) {
                return (T2) b11.b(e());
            }
            return fVar.h(c());
        }

        InputStream e() {
            return this.f31589a.a(this.f31590b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class h<T> extends f<T> {

        /* renamed from: f */
        private final i<T> f31592f;

        /* synthetic */ h(String str, boolean z11, i iVar, a aVar) {
            this(str, z11, iVar);
        }

        @Override // io.grpc.r0.f
        T h(byte[] bArr) {
            return this.f31592f.b(bArr);
        }

        @Override // io.grpc.r0.f
        byte[] j(T t11) {
            return this.f31592f.a(t11);
        }

        private h(String str, boolean z11, i<T> iVar) {
            super(str, z11, iVar, null);
            com.google.common.base.u.l(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f31592f = (i) com.google.common.base.u.p(iVar, "marshaller");
        }
    }

    /* loaded from: classes5.dex */
    public interface i<T> {
        byte[] a(T t11);

        T b(byte[] bArr);
    }

    static {
        new a();
        f31579d = new b();
        f31580e = BaseEncoding.a().l();
    }

    public r0(byte[]... bArr) {
        this(bArr.length / 2, bArr);
    }

    private boolean c(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    private int d() {
        Object[] objArr = this.f31581a;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private void f(int i11) {
        Object[] objArr = new Object[i11];
        if (!i()) {
            System.arraycopy(this.f31581a, 0, objArr, 0, j());
        }
        this.f31581a = objArr;
    }

    private boolean i() {
        return this.f31582b == 0;
    }

    private int j() {
        return this.f31582b * 2;
    }

    private void k() {
        if (j() == 0 || j() == d()) {
            f(Math.max(j() * 2, 8));
        }
    }

    private void m(int i11, byte[] bArr) {
        this.f31581a[i11 * 2] = bArr;
    }

    private byte[] n(int i11) {
        return (byte[]) this.f31581a[i11 * 2];
    }

    public static byte[] q(InputStream inputStream) {
        try {
            return dl.a.d(inputStream);
        } catch (IOException e11) {
            throw new RuntimeException("failure reading serialized stream", e11);
        }
    }

    private Object r(int i11) {
        return this.f31581a[(i11 * 2) + 1];
    }

    private void s(int i11, Object obj) {
        if (this.f31581a instanceof byte[][]) {
            f(d());
        }
        this.f31581a[(i11 * 2) + 1] = obj;
    }

    private void t(int i11, byte[] bArr) {
        this.f31581a[(i11 * 2) + 1] = bArr;
    }

    private byte[] u(int i11) {
        Object r11 = r(i11);
        if (r11 instanceof byte[]) {
            return (byte[]) r11;
        }
        return ((g) r11).c();
    }

    private <T> T v(int i11, f<T> fVar) {
        Object r11 = r(i11);
        if (r11 instanceof byte[]) {
            return fVar.h((byte[]) r11);
        }
        return (T) ((g) r11).d(fVar);
    }

    public <T> void e(f<T> fVar) {
        if (i()) {
            return;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f31582b; i12++) {
            if (!c(fVar.a(), n(i12))) {
                m(i11, n(i12));
                s(i11, r(i12));
                i11++;
            }
        }
        Arrays.fill(this.f31581a, i11 * 2, j(), (Object) null);
        this.f31582b = i11;
    }

    public <T> T g(f<T> fVar) {
        for (int i11 = this.f31582b - 1; i11 >= 0; i11--) {
            if (c(fVar.a(), n(i11))) {
                return (T) v(i11, fVar);
            }
        }
        return null;
    }

    public int h() {
        return this.f31582b;
    }

    public void l(r0 r0Var) {
        if (r0Var.i()) {
            return;
        }
        int d11 = d() - j();
        if (i() || d11 < r0Var.j()) {
            f(j() + r0Var.j());
        }
        System.arraycopy(r0Var.f31581a, 0, this.f31581a, j(), r0Var.j());
        this.f31582b += r0Var.f31582b;
    }

    public <T> void o(f<T> fVar, T t11) {
        com.google.common.base.u.p(fVar, Action.KEY_ATTRIBUTE);
        com.google.common.base.u.p(t11, "value");
        k();
        m(this.f31582b, fVar.a());
        if (fVar.i()) {
            s(this.f31582b, g.a(fVar, t11));
        } else {
            t(this.f31582b, fVar.j(t11));
        }
        this.f31582b++;
    }

    public byte[][] p() {
        byte[][] bArr = new byte[j()];
        Object[] objArr = this.f31581a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, j());
        } else {
            for (int i11 = 0; i11 < this.f31582b; i11++) {
                int i12 = i11 * 2;
                bArr[i12] = n(i11);
                bArr[i12 + 1] = u(i11);
            }
        }
        return bArr;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Metadata(");
        for (int i11 = 0; i11 < this.f31582b; i11++) {
            if (i11 != 0) {
                sb2.append(CoreConstants.COMMA_CHAR);
            }
            byte[] n11 = n(i11);
            Charset charset = com.google.common.base.f.f15918a;
            String str = new String(n11, charset);
            sb2.append(str);
            sb2.append('=');
            if (str.endsWith("-bin")) {
                sb2.append(f31580e.f(u(i11)));
            } else {
                sb2.append(new String(u(i11), charset));
            }
        }
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    r0(int i11, byte[]... bArr) {
        this(i11, (Object[]) bArr);
    }

    r0(int i11, Object[] objArr) {
        this.f31582b = i11;
        this.f31581a = objArr;
    }

    public r0() {
    }
}