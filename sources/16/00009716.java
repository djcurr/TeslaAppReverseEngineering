package org.json.alipay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public int f43242a;

    /* renamed from: b  reason: collision with root package name */
    public Reader f43243b;

    /* renamed from: c  reason: collision with root package name */
    public char f43244c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f43245d;

    public c(Reader reader) {
        this.f43243b = reader.markSupported() ? reader : new BufferedReader(reader);
        this.f43245d = false;
        this.f43242a = 0;
    }

    public c(String str) {
        this(new StringReader(str));
    }

    private String a(int i11) {
        if (i11 == 0) {
            return "";
        }
        char[] cArr = new char[i11];
        int i12 = 0;
        if (this.f43245d) {
            this.f43245d = false;
            cArr[0] = this.f43244c;
            i12 = 1;
        }
        while (i12 < i11) {
            try {
                int read = this.f43243b.read(cArr, i12, i11 - i12);
                if (read == -1) {
                    break;
                }
                i12 += read;
            } catch (IOException e11) {
                throw new JSONException(e11);
            }
        }
        this.f43242a += i12;
        if (i12 >= i11) {
            this.f43244c = cArr[i11 - 1];
            return new String(cArr);
        }
        throw a("Substring bounds error");
    }

    public final JSONException a(String str) {
        return new JSONException(str + toString());
    }

    public final void a() {
        int i11;
        if (this.f43245d || (i11 = this.f43242a) <= 0) {
            throw new JSONException("Stepping back two steps is not supported");
        }
        this.f43242a = i11 - 1;
        this.f43245d = true;
    }

    public final char b() {
        if (this.f43245d) {
            this.f43245d = false;
            char c11 = this.f43244c;
            if (c11 != 0) {
                this.f43242a++;
            }
            return c11;
        }
        try {
            int read = this.f43243b.read();
            if (read <= 0) {
                this.f43244c = (char) 0;
                return (char) 0;
            }
            this.f43242a++;
            char c12 = (char) read;
            this.f43244c = c12;
            return c12;
        } catch (IOException e11) {
            throw new JSONException(e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final char c() {
        /*
            r5 = this;
        L0:
            char r0 = r5.b()
            r1 = 13
            r2 = 10
            r3 = 47
            if (r0 != r3) goto L3e
            char r0 = r5.b()
            r4 = 42
            if (r0 == r4) goto L25
            if (r0 == r3) goto L1a
            r5.a()
            return r3
        L1a:
            char r0 = r5.b()
            if (r0 == r2) goto L0
            if (r0 == r1) goto L0
            if (r0 != 0) goto L1a
            goto L0
        L25:
            char r0 = r5.b()
            if (r0 == 0) goto L37
            if (r0 != r4) goto L25
            char r0 = r5.b()
            if (r0 == r3) goto L0
            r5.a()
            goto L25
        L37:
            java.lang.String r0 = "Unclosed comment"
            org.json.alipay.JSONException r0 = r5.a(r0)
            throw r0
        L3e:
            r3 = 35
            if (r0 != r3) goto L4d
        L42:
            char r0 = r5.b()
            if (r0 == r2) goto L0
            if (r0 == r1) goto L0
            if (r0 != 0) goto L42
            goto L0
        L4d:
            if (r0 == 0) goto L53
            r1 = 32
            if (r0 <= r1) goto L0
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.alipay.c.c():char");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0146, code lost:
        throw a("Unterminated string");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d() {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.alipay.c.d():java.lang.Object");
    }

    public final String toString() {
        return " at character " + this.f43242a;
    }
}