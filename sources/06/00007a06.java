package io.sentry.vendor.gson.stream;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.request.Address;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public class c implements Closeable, Flushable {

    /* renamed from: j  reason: collision with root package name */
    private static final String[] f32675j = new String[128];

    /* renamed from: k  reason: collision with root package name */
    private static final String[] f32676k;

    /* renamed from: a  reason: collision with root package name */
    private final Writer f32677a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f32678b = new int[32];

    /* renamed from: c  reason: collision with root package name */
    private int f32679c = 0;

    /* renamed from: d  reason: collision with root package name */
    private String f32680d;

    /* renamed from: e  reason: collision with root package name */
    private String f32681e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f32682f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f32683g;

    /* renamed from: h  reason: collision with root package name */
    private String f32684h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f32685i;

    static {
        for (int i11 = 0; i11 <= 31; i11++) {
            f32675j[i11] = String.format("\\u%04x", Integer.valueOf(i11));
        }
        String[] strArr = f32675j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f32676k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        e0(6);
        this.f32681e = ":";
        this.f32685i = true;
        Objects.requireNonNull(writer, "out == null");
        this.f32677a = writer;
    }

    private void J() {
        if (this.f32680d == null) {
            return;
        }
        this.f32677a.write(10);
        int i11 = this.f32679c;
        for (int i12 = 1; i12 < i11; i12++) {
            this.f32677a.write(this.f32680d);
        }
    }

    private void J0() {
        if (this.f32684h != null) {
            a();
            t0(this.f32684h);
            this.f32684h = null;
        }
    }

    private c R(int i11, char c11) {
        g();
        e0(i11);
        this.f32677a.write(c11);
        return this;
    }

    private void a() {
        int a02 = a0();
        if (a02 == 5) {
            this.f32677a.write(44);
        } else if (a02 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        J();
        n0(4);
    }

    private int a0() {
        int i11 = this.f32679c;
        if (i11 != 0) {
            return this.f32678b[i11 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void e0(int i11) {
        int i12 = this.f32679c;
        int[] iArr = this.f32678b;
        if (i12 == iArr.length) {
            this.f32678b = Arrays.copyOf(iArr, i12 * 2);
        }
        int[] iArr2 = this.f32678b;
        int i13 = this.f32679c;
        this.f32679c = i13 + 1;
        iArr2[i13] = i11;
    }

    private void g() {
        int a02 = a0();
        if (a02 == 1) {
            n0(2);
            J();
        } else if (a02 == 2) {
            this.f32677a.append(CoreConstants.COMMA_CHAR);
            J();
        } else if (a02 != 4) {
            if (a02 != 6) {
                if (a02 == 7) {
                    if (!this.f32682f) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                } else {
                    throw new IllegalStateException("Nesting problem.");
                }
            }
            n0(7);
        } else {
            this.f32677a.append((CharSequence) this.f32681e);
            n0(5);
        }
    }

    private c m(int i11, int i12, char c11) {
        int a02 = a0();
        if (a02 != i12 && a02 != i11) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f32684h == null) {
            this.f32679c--;
            if (a02 == i12) {
                J();
            }
            this.f32677a.write(c11);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f32684h);
    }

    private void n0(int i11) {
        this.f32678b[this.f32679c - 1] = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void t0(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f32683g
            if (r0 == 0) goto L7
            java.lang.String[] r0 = io.sentry.vendor.gson.stream.c.f32676k
            goto L9
        L7:
            java.lang.String[] r0 = io.sentry.vendor.gson.stream.c.f32675j
        L9:
            java.io.Writer r1 = r8.f32677a
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
            java.io.Writer r6 = r8.f32677a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f32677a
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f32677a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f32677a
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.c.t0(java.lang.String):void");
    }

    public c C() {
        return m(3, 5, CoreConstants.CURLY_RIGHT);
    }

    public c C0(long j11) {
        J0();
        g();
        this.f32677a.write(Long.toString(j11));
        return this;
    }

    public c D(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f32684h == null) {
            if (this.f32679c != 0) {
                this.f32684h = str;
                return this;
            }
            throw new IllegalStateException("JsonWriter is closed.");
        }
        throw new IllegalStateException();
    }

    public c D0(Boolean bool) {
        if (bool == null) {
            return L();
        }
        J0();
        g();
        this.f32677a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c F0(Number number) {
        if (number == null) {
            return L();
        }
        J0();
        String obj = number.toString();
        if (!this.f32682f && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        g();
        this.f32677a.append((CharSequence) obj);
        return this;
    }

    public c G0(String str) {
        if (str == null) {
            return L();
        }
        J0();
        g();
        t0(str);
        return this;
    }

    public c I0(boolean z11) {
        J0();
        g();
        this.f32677a.write(z11 ? "true" : "false");
        return this;
    }

    public c L() {
        if (this.f32684h != null) {
            if (this.f32685i) {
                J0();
            } else {
                this.f32684h = null;
                return this;
            }
        }
        g();
        this.f32677a.write(Address.ADDRESS_NULL_PLACEHOLDER);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f32677a.close();
        int i11 = this.f32679c;
        if (i11 <= 1 && (i11 != 1 || this.f32678b[i11 - 1] == 7)) {
            this.f32679c = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f32679c != 0) {
            this.f32677a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c j() {
        J0();
        return R(1, '[');
    }

    public c l() {
        J0();
        return R(3, CoreConstants.CURLY_LEFT);
    }

    public c p() {
        return m(1, 2, ']');
    }

    public final void p0(String str) {
        if (str.length() == 0) {
            this.f32680d = null;
            this.f32681e = ":";
            return;
        }
        this.f32680d = str;
        this.f32681e = ": ";
    }

    public c u0(double d11) {
        J0();
        if (!this.f32682f && (Double.isNaN(d11) || Double.isInfinite(d11))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d11);
        }
        g();
        this.f32677a.append((CharSequence) Double.toString(d11));
        return this;
    }
}