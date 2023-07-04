package d40;

import java.lang.ref.SoftReference;
import java.util.StringTokenizer;

/* loaded from: classes5.dex */
abstract class f implements a40.b {

    /* renamed from: h  reason: collision with root package name */
    private static boolean f23589h = true;

    /* renamed from: a  reason: collision with root package name */
    int f23590a;

    /* renamed from: b  reason: collision with root package name */
    String f23591b;

    /* renamed from: c  reason: collision with root package name */
    String f23592c;

    /* renamed from: d  reason: collision with root package name */
    Class f23593d;

    /* renamed from: e  reason: collision with root package name */
    a f23594e;

    /* renamed from: f  reason: collision with root package name */
    private String f23595f;

    /* renamed from: g  reason: collision with root package name */
    ClassLoader f23596g = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public interface a {
        void a(int i11, String str);

        String get(int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private SoftReference f23597a;

        public b() {
            c();
        }

        private String[] b() {
            return (String[]) this.f23597a.get();
        }

        private String[] c() {
            String[] strArr = new String[3];
            this.f23597a = new SoftReference(strArr);
            return strArr;
        }

        @Override // d40.f.a
        public void a(int i11, String str) {
            String[] b11 = b();
            if (b11 == null) {
                b11 = c();
            }
            b11[i11] = str;
        }

        @Override // d40.f.a
        public String get(int i11) {
            String[] b11 = b();
            if (b11 == null) {
                return null;
            }
            return b11[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(int i11, String str, Class cls) {
        this.f23590a = -1;
        this.f23590a = i11;
        this.f23591b = str;
        this.f23593d = cls;
    }

    private ClassLoader h() {
        if (this.f23596g == null) {
            this.f23596g = getClass().getClassLoader();
        }
        return this.f23596g;
    }

    protected abstract String a(h hVar);

    int b(int i11) {
        return Integer.parseInt(c(i11), 16);
    }

    String c(int i11) {
        int indexOf = this.f23595f.indexOf(45);
        int i12 = 0;
        while (true) {
            int i13 = i11 - 1;
            if (i11 <= 0) {
                break;
            }
            i12 = indexOf + 1;
            indexOf = this.f23595f.indexOf(45, i12);
            i11 = i13;
        }
        if (indexOf == -1) {
            indexOf = this.f23595f.length();
        }
        return this.f23595f.substring(i12, indexOf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Class d(int i11) {
        return d40.b.a(c(i11), h());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Class[] e(int i11) {
        StringTokenizer stringTokenizer = new StringTokenizer(c(i11), ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i12 = 0; i12 < countTokens; i12++) {
            clsArr[i12] = d40.b.a(stringTokenizer.nextToken(), h());
        }
        return clsArr;
    }

    public Class f() {
        if (this.f23593d == null) {
            this.f23593d = d(2);
        }
        return this.f23593d;
    }

    public String g() {
        if (this.f23592c == null) {
            this.f23592c = f().getName();
        }
        return this.f23592c;
    }

    public int i() {
        if (this.f23590a == -1) {
            this.f23590a = b(0);
        }
        return this.f23590a;
    }

    public String j() {
        if (this.f23591b == null) {
            this.f23591b = c(1);
        }
        return this.f23591b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String k(d40.h r3) {
        /*
            r2 = this;
            boolean r0 = d40.f.f23589h
            if (r0 == 0) goto L1b
            d40.f$a r0 = r2.f23594e
            if (r0 != 0) goto L14
            d40.f$b r0 = new d40.f$b     // Catch: java.lang.Throwable -> L10
            r0.<init>()     // Catch: java.lang.Throwable -> L10
            r2.f23594e = r0     // Catch: java.lang.Throwable -> L10
            goto L1b
        L10:
            r0 = 0
            d40.f.f23589h = r0
            goto L1b
        L14:
            int r1 = r3.f23608f
            java.lang.String r0 = r0.get(r1)
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 != 0) goto L22
            java.lang.String r0 = r2.a(r3)
        L22:
            boolean r1 = d40.f.f23589h
            if (r1 == 0) goto L2d
            d40.f$a r1 = r2.f23594e
            int r3 = r3.f23608f
            r1.a(r3, r0)
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d40.f.k(d40.h):java.lang.String");
    }

    public final String toString() {
        return k(h.f23601h);
    }
}