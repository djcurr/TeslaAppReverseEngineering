package com.squareup.moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class l extends m {

    /* renamed from: j  reason: collision with root package name */
    Object[] f20535j = new Object[32];

    /* renamed from: k  reason: collision with root package name */
    private String f20536k;

    l() {
        p0(6);
    }

    private l P0(Object obj) {
        String str;
        Object put;
        int e02 = e0();
        int i11 = this.f20537a;
        if (i11 == 1) {
            if (e02 == 6) {
                this.f20538b[i11 - 1] = 7;
                this.f20535j[i11 - 1] = obj;
            } else {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        } else if (e02 != 3 || (str = this.f20536k) == null) {
            if (e02 != 1) {
                if (e02 == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                throw new IllegalStateException("Nesting problem.");
            }
            ((List) this.f20535j[i11 - 1]).add(obj);
        } else if ((obj == null && !this.f20543g) || (put = ((Map) this.f20535j[i11 - 1]).put(str, obj)) == null) {
            this.f20536k = null;
        } else {
            throw new IllegalArgumentException("Map key '" + this.f20536k + "' has multiple values at path " + getPath() + ": " + put + " and " + obj);
        }
        return this;
    }

    @Override // com.squareup.moshi.m
    public m C() {
        if (e0() == 3) {
            if (this.f20536k == null) {
                int i11 = this.f20537a;
                int i12 = this.f20545i;
                if (i11 == (~i12)) {
                    this.f20545i = ~i12;
                    return this;
                }
                this.f20544h = false;
                int i13 = i11 - 1;
                this.f20537a = i13;
                this.f20535j[i13] = null;
                this.f20539c[i13] = null;
                int[] iArr = this.f20540d;
                int i14 = i13 - 1;
                iArr[i14] = iArr[i14] + 1;
                return this;
            }
            throw new IllegalStateException("Dangling name: " + this.f20536k);
        }
        throw new IllegalStateException("Nesting problem.");
    }

    @Override // com.squareup.moshi.m
    public m D0(double d11) {
        if (!this.f20542f && (Double.isNaN(d11) || d11 == Double.NEGATIVE_INFINITY || d11 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d11);
        } else if (this.f20544h) {
            this.f20544h = false;
            return L(Double.toString(d11));
        } else {
            P0(Double.valueOf(d11));
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
        P0(Long.valueOf(j11));
        int[] iArr = this.f20540d;
        int i11 = this.f20537a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.m
    public m G0(Number number) {
        if (!(number instanceof Byte) && !(number instanceof Short) && !(number instanceof Integer) && !(number instanceof Long)) {
            if ((number instanceof Float) || (number instanceof Double)) {
                return D0(number.doubleValue());
            }
            if (number == null) {
                return R();
            }
            BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
            if (this.f20544h) {
                this.f20544h = false;
                return L(bigDecimal.toString());
            }
            P0(bigDecimal);
            int[] iArr = this.f20540d;
            int i11 = this.f20537a - 1;
            iArr[i11] = iArr[i11] + 1;
            return this;
        }
        return F0(number.longValue());
    }

    @Override // com.squareup.moshi.m
    public m I0(String str) {
        if (this.f20544h) {
            this.f20544h = false;
            return L(str);
        }
        P0(str);
        int[] iArr = this.f20540d;
        int i11 = this.f20537a - 1;
        iArr[i11] = iArr[i11] + 1;
        return this;
    }

    @Override // com.squareup.moshi.m
    public m J0(boolean z11) {
        if (!this.f20544h) {
            P0(Boolean.valueOf(z11));
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
            if (e0() == 3 && this.f20536k == null && !this.f20544h) {
                this.f20536k = str;
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
            P0(null);
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
            int i11 = this.f20537a;
            int i12 = this.f20545i;
            if (i11 == i12 && this.f20538b[i11 - 1] == 1) {
                this.f20545i = ~i12;
                return this;
            }
            l();
            ArrayList arrayList = new ArrayList();
            P0(arrayList);
            Object[] objArr = this.f20535j;
            int i13 = this.f20537a;
            objArr[i13] = arrayList;
            this.f20540d[i13] = 0;
            p0(1);
            return this;
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i11 = this.f20537a;
        if (i11 <= 1 && (i11 != 1 || this.f20538b[i11 - 1] == 7)) {
            this.f20537a = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f20537a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // com.squareup.moshi.m
    public m j() {
        if (!this.f20544h) {
            int i11 = this.f20537a;
            int i12 = this.f20545i;
            if (i11 == i12 && this.f20538b[i11 - 1] == 3) {
                this.f20545i = ~i12;
                return this;
            }
            l();
            n nVar = new n();
            P0(nVar);
            this.f20535j[this.f20537a] = nVar;
            p0(3);
            return this;
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // com.squareup.moshi.m
    public m m() {
        if (e0() == 1) {
            int i11 = this.f20537a;
            int i12 = this.f20545i;
            if (i11 == (~i12)) {
                this.f20545i = ~i12;
                return this;
            }
            int i13 = i11 - 1;
            this.f20537a = i13;
            this.f20535j[i13] = null;
            int[] iArr = this.f20540d;
            int i14 = i13 - 1;
            iArr[i14] = iArr[i14] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }
}