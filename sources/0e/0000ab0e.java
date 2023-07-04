package pn;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.request.Address;
import com.google.gson.o;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class f extends tn.a {

    /* renamed from: x */
    private static final Object f46705x;

    /* renamed from: p */
    private Object[] f46706p;

    /* renamed from: q */
    private int f46707q;

    /* renamed from: t */
    private String[] f46708t;

    /* renamed from: w */
    private int[] f46709w;

    /* loaded from: classes2.dex */
    class a extends Reader {
        a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i11, int i12) {
            throw new AssertionError();
        }
    }

    static {
        new a();
        f46705x = new Object();
    }

    private void D1(com.google.gson.stream.a aVar) {
        if (Q0() == aVar) {
            return;
        }
        throw new IllegalStateException("Expected " + aVar + " but was " + Q0() + n0());
    }

    private String J(boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CoreConstants.DOLLAR);
        int i11 = 0;
        while (true) {
            int i12 = this.f46707q;
            if (i11 < i12) {
                Object[] objArr = this.f46706p;
                if (objArr[i11] instanceof com.google.gson.h) {
                    i11++;
                    if (i11 < i12 && (objArr[i11] instanceof Iterator)) {
                        int i13 = this.f46709w[i11];
                        if (z11 && i13 > 0 && (i11 == i12 - 1 || i11 == i12 - 2)) {
                            i13--;
                        }
                        sb2.append('[');
                        sb2.append(i13);
                        sb2.append(']');
                    }
                } else if ((objArr[i11] instanceof com.google.gson.m) && (i11 = i11 + 1) < i12 && (objArr[i11] instanceof Iterator)) {
                    sb2.append(CoreConstants.DOT);
                    String[] strArr = this.f46708t;
                    if (strArr[i11] != null) {
                        sb2.append(strArr[i11]);
                    }
                }
                i11++;
            } else {
                return sb2.toString();
            }
        }
    }

    private Object K1() {
        return this.f46706p[this.f46707q - 1];
    }

    private Object L1() {
        Object[] objArr = this.f46706p;
        int i11 = this.f46707q - 1;
        this.f46707q = i11;
        Object obj = objArr[i11];
        objArr[i11] = null;
        return obj;
    }

    private void N1(Object obj) {
        int i11 = this.f46707q;
        Object[] objArr = this.f46706p;
        if (i11 == objArr.length) {
            int i12 = i11 * 2;
            this.f46706p = Arrays.copyOf(objArr, i12);
            this.f46709w = Arrays.copyOf(this.f46709w, i12);
            this.f46708t = (String[]) Arrays.copyOf(this.f46708t, i12);
        }
        Object[] objArr2 = this.f46706p;
        int i13 = this.f46707q;
        this.f46707q = i13 + 1;
        objArr2[i13] = obj;
    }

    private String n0() {
        return " at path " + getPath();
    }

    @Override // tn.a
    public void C() {
        D1(com.google.gson.stream.a.END_OBJECT);
        L1();
        L1();
        int i11 = this.f46707q;
        if (i11 > 0) {
            int[] iArr = this.f46709w;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // tn.a
    public long C0() {
        com.google.gson.stream.a Q0 = Q0();
        com.google.gson.stream.a aVar = com.google.gson.stream.a.NUMBER;
        if (Q0 != aVar && Q0 != com.google.gson.stream.a.STRING) {
            throw new IllegalStateException("Expected " + aVar + " but was " + Q0 + n0());
        }
        long e11 = ((o) K1()).e();
        L1();
        int i11 = this.f46707q;
        if (i11 > 0) {
            int[] iArr = this.f46709w;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
        return e11;
    }

    @Override // tn.a
    public String D0() {
        D1(com.google.gson.stream.a.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) K1()).next();
        String str = (String) entry.getKey();
        this.f46708t[this.f46707q - 1] = str;
        N1(entry.getValue());
        return str;
    }

    public com.google.gson.k F1() {
        com.google.gson.stream.a Q0 = Q0();
        if (Q0 != com.google.gson.stream.a.NAME && Q0 != com.google.gson.stream.a.END_ARRAY && Q0 != com.google.gson.stream.a.END_OBJECT && Q0 != com.google.gson.stream.a.END_DOCUMENT) {
            com.google.gson.k kVar = (com.google.gson.k) K1();
            y1();
            return kVar;
        }
        throw new IllegalStateException("Unexpected " + Q0 + " when reading a JsonElement.");
    }

    @Override // tn.a
    public void G0() {
        D1(com.google.gson.stream.a.NULL);
        L1();
        int i11 = this.f46707q;
        if (i11 > 0) {
            int[] iArr = this.f46709w;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // tn.a
    public String J0() {
        com.google.gson.stream.a Q0 = Q0();
        com.google.gson.stream.a aVar = com.google.gson.stream.a.STRING;
        if (Q0 != aVar && Q0 != com.google.gson.stream.a.NUMBER) {
            throw new IllegalStateException("Expected " + aVar + " but was " + Q0 + n0());
        }
        String f11 = ((o) L1()).f();
        int i11 = this.f46707q;
        if (i11 > 0) {
            int[] iArr = this.f46709w;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
        return f11;
    }

    @Override // tn.a
    public String L() {
        return J(true);
    }

    public void M1() {
        D1(com.google.gson.stream.a.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) K1()).next();
        N1(entry.getValue());
        N1(new o((String) entry.getKey()));
    }

    @Override // tn.a
    public com.google.gson.stream.a Q0() {
        if (this.f46707q == 0) {
            return com.google.gson.stream.a.END_DOCUMENT;
        }
        Object K1 = K1();
        if (K1 instanceof Iterator) {
            boolean z11 = this.f46706p[this.f46707q - 2] instanceof com.google.gson.m;
            Iterator it2 = (Iterator) K1;
            if (!it2.hasNext()) {
                return z11 ? com.google.gson.stream.a.END_OBJECT : com.google.gson.stream.a.END_ARRAY;
            } else if (z11) {
                return com.google.gson.stream.a.NAME;
            } else {
                N1(it2.next());
                return Q0();
            }
        } else if (K1 instanceof com.google.gson.m) {
            return com.google.gson.stream.a.BEGIN_OBJECT;
        } else {
            if (K1 instanceof com.google.gson.h) {
                return com.google.gson.stream.a.BEGIN_ARRAY;
            }
            if (K1 instanceof o) {
                o oVar = (o) K1;
                if (oVar.t()) {
                    return com.google.gson.stream.a.STRING;
                }
                if (oVar.q()) {
                    return com.google.gson.stream.a.BOOLEAN;
                }
                if (oVar.s()) {
                    return com.google.gson.stream.a.NUMBER;
                }
                throw new AssertionError();
            } else if (K1 instanceof com.google.gson.l) {
                return com.google.gson.stream.a.NULL;
            } else {
                if (K1 == f46705x) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    @Override // tn.a
    public boolean R() {
        com.google.gson.stream.a Q0 = Q0();
        return (Q0 == com.google.gson.stream.a.END_OBJECT || Q0 == com.google.gson.stream.a.END_ARRAY || Q0 == com.google.gson.stream.a.END_DOCUMENT) ? false : true;
    }

    @Override // tn.a
    public void a() {
        D1(com.google.gson.stream.a.BEGIN_ARRAY);
        N1(((com.google.gson.h) K1()).iterator());
        this.f46709w[this.f46707q - 1] = 0;
    }

    @Override // tn.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f46706p = new Object[]{f46705x};
        this.f46707q = 1;
    }

    @Override // tn.a
    public void g() {
        D1(com.google.gson.stream.a.BEGIN_OBJECT);
        N1(((com.google.gson.m) K1()).o().iterator());
    }

    @Override // tn.a
    public String getPath() {
        return J(false);
    }

    @Override // tn.a
    public void p() {
        D1(com.google.gson.stream.a.END_ARRAY);
        L1();
        L1();
        int i11 = this.f46707q;
        if (i11 > 0) {
            int[] iArr = this.f46709w;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // tn.a
    public boolean p0() {
        D1(com.google.gson.stream.a.BOOLEAN);
        boolean m11 = ((o) L1()).m();
        int i11 = this.f46707q;
        if (i11 > 0) {
            int[] iArr = this.f46709w;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
        return m11;
    }

    @Override // tn.a
    public double t0() {
        com.google.gson.stream.a Q0 = Q0();
        com.google.gson.stream.a aVar = com.google.gson.stream.a.NUMBER;
        if (Q0 != aVar && Q0 != com.google.gson.stream.a.STRING) {
            throw new IllegalStateException("Expected " + aVar + " but was " + Q0 + n0());
        }
        double n11 = ((o) K1()).n();
        if (!a0() && (Double.isNaN(n11) || Double.isInfinite(n11))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + n11);
        }
        L1();
        int i11 = this.f46707q;
        if (i11 > 0) {
            int[] iArr = this.f46709w;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
        return n11;
    }

    @Override // tn.a
    public String toString() {
        return f.class.getSimpleName() + n0();
    }

    @Override // tn.a
    public int u0() {
        com.google.gson.stream.a Q0 = Q0();
        com.google.gson.stream.a aVar = com.google.gson.stream.a.NUMBER;
        if (Q0 != aVar && Q0 != com.google.gson.stream.a.STRING) {
            throw new IllegalStateException("Expected " + aVar + " but was " + Q0 + n0());
        }
        int o11 = ((o) K1()).o();
        L1();
        int i11 = this.f46707q;
        if (i11 > 0) {
            int[] iArr = this.f46709w;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
        return o11;
    }

    @Override // tn.a
    public void y1() {
        if (Q0() == com.google.gson.stream.a.NAME) {
            D0();
            this.f46708t[this.f46707q - 2] = Address.ADDRESS_NULL_PLACEHOLDER;
        } else {
            L1();
            int i11 = this.f46707q;
            if (i11 > 0) {
                this.f46708t[i11 - 1] = Address.ADDRESS_NULL_PLACEHOLDER;
            }
        }
        int i12 = this.f46707q;
        if (i12 > 0) {
            int[] iArr = this.f46709w;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
        }
    }
}