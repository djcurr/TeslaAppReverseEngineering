package com.squareup.moshi;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.request.Address;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class k extends m {

    /* renamed from: m */
    private static final String[] f20531m = new String[128];

    /* renamed from: j */
    private final okio.g f20532j;

    /* renamed from: k */
    private String f20533k = ":";

    /* renamed from: l */
    private String f20534l;

    static {
        for (int i11 = 0; i11 <= 31; i11++) {
            f20531m[i11] = String.format("\\u%04x", Integer.valueOf(i11));
        }
        String[] strArr = f20531m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public k(okio.g gVar) {
        Objects.requireNonNull(gVar, "sink == null");
        this.f20532j = gVar;
        p0(6);
    }

    private void P0() {
        int e02 = e0();
        if (e02 == 5) {
            this.f20532j.O0(44);
        } else if (e02 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        S0();
        t0(4);
    }

    private void Q0() {
        int e02 = e0();
        int i11 = 7;
        if (e02 != 1) {
            if (e02 == 2) {
                this.f20532j.O0(44);
            } else {
                if (e02 == 4) {
                    i11 = 5;
                    this.f20532j.T(this.f20533k);
                } else if (e02 == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                } else {
                    if (e02 != 6) {
                        if (e02 == 7) {
                            if (!this.f20542f) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                }
                t0(i11);
            }
        }
        S0();
        i11 = 2;
        t0(i11);
    }

    private m R0(int i11, int i12, char c11) {
        int e02 = e0();
        if (e02 != i12 && e02 != i11) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f20534l == null) {
            int i13 = this.f20537a;
            int i14 = this.f20545i;
            if (i13 == (~i14)) {
                this.f20545i = ~i14;
                return this;
            }
            int i15 = i13 - 1;
            this.f20537a = i15;
            this.f20539c[i15] = null;
            int[] iArr = this.f20540d;
            int i16 = i15 - 1;
            iArr[i16] = iArr[i16] + 1;
            if (e02 == i12) {
                S0();
            }
            this.f20532j.O0(c11);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f20534l);
    }

    private void S0() {
        if (this.f20541e == null) {
            return;
        }
        this.f20532j.O0(10);
        int i11 = this.f20537a;
        for (int i12 = 1; i12 < i11; i12++) {
            this.f20532j.T(this.f20541e);
        }
    }

    private m X0(int i11, int i12, char c11) {
        int i13 = this.f20537a;
        int i14 = this.f20545i;
        if (i13 == i14) {
            int[] iArr = this.f20538b;
            if (iArr[i13 - 1] == i11 || iArr[i13 - 1] == i12) {
                this.f20545i = ~i14;
                return this;
            }
        }
        Q0();
        l();
        p0(i11);
        this.f20540d[this.f20537a - 1] = 0;
        this.f20532j.O0(c11);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void Z0(okio.g r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = com.squareup.moshi.k.f20531m
            r1 = 34
            r7.O0(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.Z(r8, r4, r3)
        L2e:
            r7.T(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.Z(r8, r4, r2)
        L3b:
            r7.O0(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.k.Z0(okio.g, java.lang.String):void");
    }

    private void b1() {
        if (this.f20534l != null) {
            P0();
            Z0(this.f20532j, this.f20534l);
            this.f20534l = null;
        }
    }

    @Override // com.squareup.moshi.m
    public m C() {
        this.f20544h = false;
        return R0(3, 5, CoreConstants.CURLY_RIGHT);
    }

    @Override // com.squareup.moshi.m
    public m D0(double d11) {
        if (!this.f20542f && (Double.isNaN(d11) || Double.isInfinite(d11))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d11);
        } else if (this.f20544h) {
            this.f20544h = false;
            return L(Double.toString(d11));
        } else {
            b1();
            Q0();
            this.f20532j.T(Double.toString(d11));
            int[] iArr = this.f20540d;
            int i11 = this.f20537a - 1;
            iArr[i11] = iArr[i11] + 1;
            return this;
        }
    }

    @Override // com.squareup.moshi.m
    public m F0(long j11) {
        if (this.f20544h) {
            this.f20544h = false;
            return L(Long.toString(j11));
        }
        b1();
        Q0();
        this.f20532j.T(Long.toString(j11));
        int[] iArr = this.f20540d;
        int i11 = this.f20537a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.m
    public m G0(Number number) {
        if (number == null) {
            return R();
        }
        String obj = number.toString();
        if (!this.f20542f && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        } else if (this.f20544h) {
            this.f20544h = false;
            return L(obj);
        } else {
            b1();
            Q0();
            this.f20532j.T(obj);
            int[] iArr = this.f20540d;
            int i11 = this.f20537a - 1;
            iArr[i11] = iArr[i11] + 1;
            return this;
        }
    }

    @Override // com.squareup.moshi.m
    public m I0(String str) {
        if (str == null) {
            return R();
        }
        if (this.f20544h) {
            this.f20544h = false;
            return L(str);
        }
        b1();
        Q0();
        Z0(this.f20532j, str);
        int[] iArr = this.f20540d;
        int i11 = this.f20537a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.m
    public m J0(boolean z11) {
        if (!this.f20544h) {
            b1();
            Q0();
            this.f20532j.T(z11 ? "true" : "false");
            int[] iArr = this.f20540d;
            int i11 = this.f20537a - 1;
            iArr[i11] = iArr[i11] + 1;
            return this;
        }
        throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // com.squareup.moshi.m
    public m L(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f20537a != 0) {
            int e02 = e0();
            if ((e02 == 3 || e02 == 5) && this.f20534l == null && !this.f20544h) {
                this.f20534l = str;
                this.f20539c[this.f20537a - 1] = str;
                return this;
            }
            throw new IllegalStateException("Nesting problem.");
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @Override // com.squareup.moshi.m
    public m R() {
        if (!this.f20544h) {
            if (this.f20534l != null) {
                if (this.f20543g) {
                    b1();
                } else {
                    this.f20534l = null;
                    return this;
                }
            }
            Q0();
            this.f20532j.T(Address.ADDRESS_NULL_PLACEHOLDER);
            int[] iArr = this.f20540d;
            int i11 = this.f20537a - 1;
            iArr[i11] = iArr[i11] + 1;
            return this;
        }
        throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // com.squareup.moshi.m
    public m a() {
        if (!this.f20544h) {
            b1();
            return X0(1, 2, '[');
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20532j.close();
        int i11 = this.f20537a;
        if (i11 <= 1 && (i11 != 1 || this.f20538b[i11 - 1] == 7)) {
            this.f20537a = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f20537a != 0) {
            this.f20532j.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @Override // com.squareup.moshi.m
    public m j() {
        if (!this.f20544h) {
            b1();
            return X0(3, 5, CoreConstants.CURLY_LEFT);
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // com.squareup.moshi.m
    public m m() {
        return R0(1, 2, ']');
    }
}