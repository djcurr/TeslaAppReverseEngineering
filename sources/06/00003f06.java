package com.nimbusds.jose;

import java.io.Serializable;
import java.util.Map;
import nq.j;
import nq.l;

/* loaded from: classes2.dex */
public final class c implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f17930a;

    /* renamed from: b  reason: collision with root package name */
    private final String f17931b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f17932c;

    /* renamed from: d  reason: collision with root package name */
    private final nq.c f17933d;

    /* renamed from: e  reason: collision with root package name */
    private final b f17934e;

    /* loaded from: classes2.dex */
    public enum a {
        JSON,
        STRING,
        BYTE_ARRAY,
        BASE64URL,
        JWS_OBJECT,
        SIGNED_JWT
    }

    public c(String str) {
        if (str != null) {
            this.f17930a = null;
            this.f17931b = str;
            this.f17932c = null;
            this.f17933d = null;
            this.f17934e = null;
            a aVar = a.STRING;
            return;
        }
        throw new IllegalArgumentException("The string must not be null");
    }

    private static String a(byte[] bArr) {
        if (bArr != null) {
            return new String(bArr, l.f41779a);
        }
        return null;
    }

    private static byte[] b(String str) {
        if (str != null) {
            return str.getBytes(l.f41779a);
        }
        return null;
    }

    public nq.c c() {
        nq.c cVar = this.f17933d;
        return cVar != null ? cVar : nq.c.e(d());
    }

    public byte[] d() {
        byte[] bArr = this.f17932c;
        if (bArr != null) {
            return bArr;
        }
        nq.c cVar = this.f17933d;
        if (cVar != null) {
            return cVar.a();
        }
        return b(toString());
    }

    public String toString() {
        String str = this.f17931b;
        if (str != null) {
            return str;
        }
        b bVar = this.f17934e;
        if (bVar != null) {
            if (bVar.a() != null) {
                return this.f17934e.a();
            }
            return this.f17934e.l();
        }
        Map<String, Object> map = this.f17930a;
        if (map != null) {
            return j.o(map);
        }
        byte[] bArr = this.f17932c;
        if (bArr != null) {
            return a(bArr);
        }
        nq.c cVar = this.f17933d;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    public c(byte[] bArr) {
        if (bArr != null) {
            this.f17930a = null;
            this.f17931b = null;
            this.f17932c = bArr;
            this.f17933d = null;
            this.f17934e = null;
            a aVar = a.BYTE_ARRAY;
            return;
        }
        throw new IllegalArgumentException("The byte array must not be null");
    }

    public c(nq.c cVar) {
        if (cVar != null) {
            this.f17930a = null;
            this.f17931b = null;
            this.f17932c = null;
            this.f17933d = cVar;
            this.f17934e = null;
            a aVar = a.BASE64URL;
            return;
        }
        throw new IllegalArgumentException("The Base64URL-encoded object must not be null");
    }
}