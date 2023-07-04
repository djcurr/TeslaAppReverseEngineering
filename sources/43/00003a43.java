package com.google.gson.stream;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.request.Address;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class b implements Closeable, Flushable {

    /* renamed from: j  reason: collision with root package name */
    private static final Pattern f17209j = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: k  reason: collision with root package name */
    private static final String[] f17210k = new String[128];

    /* renamed from: l  reason: collision with root package name */
    private static final String[] f17211l;

    /* renamed from: a  reason: collision with root package name */
    private final Writer f17212a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f17213b = new int[32];

    /* renamed from: c  reason: collision with root package name */
    private int f17214c = 0;

    /* renamed from: d  reason: collision with root package name */
    private String f17215d;

    /* renamed from: e  reason: collision with root package name */
    private String f17216e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f17217f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f17218g;

    /* renamed from: h  reason: collision with root package name */
    private String f17219h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f17220i;

    static {
        for (int i11 = 0; i11 <= 31; i11++) {
            f17210k[i11] = String.format("\\u%04x", Integer.valueOf(i11));
        }
        String[] strArr = f17210k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f17211l = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        u0(6);
        this.f17216e = ":";
        this.f17220i = true;
        Objects.requireNonNull(writer, "out == null");
        this.f17212a = writer;
    }

    private void C0(int i11) {
        this.f17213b[this.f17214c - 1] = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void J0(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f17218g
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.google.gson.stream.b.f17211l
            goto L9
        L7:
            java.lang.String[] r0 = com.google.gson.stream.b.f17210k
        L9:
            java.io.Writer r1 = r8.f17212a
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f17212a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f17212a
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f17212a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f17212a
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.b.J0(java.lang.String):void");
    }

    private static boolean R(Class<? extends Number> cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    private void Z0() {
        if (this.f17219h != null) {
            a();
            J0(this.f17219h);
            this.f17219h = null;
        }
    }

    private void a() {
        int t02 = t0();
        if (t02 == 5) {
            this.f17212a.write(44);
        } else if (t02 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        e0();
        C0(4);
    }

    private void e0() {
        if (this.f17215d == null) {
            return;
        }
        this.f17212a.write(10);
        int i11 = this.f17214c;
        for (int i12 = 1; i12 < i11; i12++) {
            this.f17212a.write(this.f17215d);
        }
    }

    private void g() {
        int t02 = t0();
        if (t02 == 1) {
            C0(2);
            e0();
        } else if (t02 == 2) {
            this.f17212a.append(CoreConstants.COMMA_CHAR);
            e0();
        } else if (t02 != 4) {
            if (t02 != 6) {
                if (t02 == 7) {
                    if (!this.f17217f) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                } else {
                    throw new IllegalStateException("Nesting problem.");
                }
            }
            C0(7);
        } else {
            this.f17212a.append((CharSequence) this.f17216e);
            C0(5);
        }
    }

    private b m(int i11, int i12, char c11) {
        int t02 = t0();
        if (t02 != i12 && t02 != i11) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f17219h == null) {
            this.f17214c--;
            if (t02 == i12) {
                e0();
            }
            this.f17212a.write(c11);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f17219h);
    }

    private b p0(int i11, char c11) {
        g();
        u0(i11);
        this.f17212a.write(c11);
        return this;
    }

    private int t0() {
        int i11 = this.f17214c;
        if (i11 != 0) {
            return this.f17213b[i11 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void u0(int i11) {
        int i12 = this.f17214c;
        int[] iArr = this.f17213b;
        if (i12 == iArr.length) {
            this.f17213b = Arrays.copyOf(iArr, i12 * 2);
        }
        int[] iArr2 = this.f17213b;
        int i13 = this.f17214c;
        this.f17214c = i13 + 1;
        iArr2[i13] = i11;
    }

    public b C() {
        return m(3, 5, CoreConstants.CURLY_RIGHT);
    }

    public final boolean D() {
        return this.f17220i;
    }

    public final void D0(boolean z11) {
        this.f17218g = z11;
    }

    public final void F0(String str) {
        if (str.length() == 0) {
            this.f17215d = null;
            this.f17216e = ":";
            return;
        }
        this.f17215d = str;
        this.f17216e = ": ";
    }

    public final void G0(boolean z11) {
        this.f17217f = z11;
    }

    public final void I0(boolean z11) {
        this.f17220i = z11;
    }

    public final boolean J() {
        return this.f17218g;
    }

    public boolean L() {
        return this.f17217f;
    }

    public b P0(long j11) {
        Z0();
        g();
        this.f17212a.write(Long.toString(j11));
        return this;
    }

    public b Q0(Boolean bool) {
        if (bool == null) {
            return n0();
        }
        Z0();
        g();
        this.f17212a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public b R0(Number number) {
        if (number == null) {
            return n0();
        }
        Z0();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!R(cls) && !f17209j.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f17217f) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + obj);
        }
        g();
        this.f17212a.append((CharSequence) obj);
        return this;
    }

    public b S0(String str) {
        if (str == null) {
            return n0();
        }
        Z0();
        g();
        J0(str);
        return this;
    }

    public b X0(boolean z11) {
        Z0();
        g();
        this.f17212a.write(z11 ? "true" : "false");
        return this;
    }

    public b a0(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f17219h == null) {
            if (this.f17214c != 0) {
                this.f17219h = str;
                return this;
            }
            throw new IllegalStateException("JsonWriter is closed.");
        }
        throw new IllegalStateException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17212a.close();
        int i11 = this.f17214c;
        if (i11 <= 1 && (i11 != 1 || this.f17213b[i11 - 1] == 7)) {
            this.f17214c = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f17214c != 0) {
            this.f17212a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public b j() {
        Z0();
        return p0(1, '[');
    }

    public b l() {
        Z0();
        return p0(3, CoreConstants.CURLY_LEFT);
    }

    public b n0() {
        if (this.f17219h != null) {
            if (this.f17220i) {
                Z0();
            } else {
                this.f17219h = null;
                return this;
            }
        }
        g();
        this.f17212a.write(Address.ADDRESS_NULL_PLACEHOLDER);
        return this;
    }

    public b p() {
        return m(1, 2, ']');
    }
}