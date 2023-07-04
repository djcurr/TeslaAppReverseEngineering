package com.alipay.android.phone.mrpc.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;

/* loaded from: classes.dex */
public final class o extends t {

    /* renamed from: b  reason: collision with root package name */
    public String f10103b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f10104c;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10108g;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<Header> f10106e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public Map<String, String> f10107f = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public String f10105d = "application/x-www-form-urlencoded";

    public o(String str) {
        this.f10103b = str;
    }

    public final String a() {
        return this.f10103b;
    }

    public final void a(String str) {
        this.f10105d = str;
    }

    public final void a(String str, String str2) {
        if (this.f10107f == null) {
            this.f10107f = new HashMap();
        }
        this.f10107f.put(str, str2);
    }

    public final void a(Header header) {
        this.f10106e.add(header);
    }

    public final void a(boolean z11) {
        this.f10108g = z11;
    }

    public final void a(byte[] bArr) {
        this.f10104c = bArr;
    }

    public final String b(String str) {
        Map<String, String> map = this.f10107f;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public final byte[] b() {
        return this.f10104c;
    }

    public final String c() {
        return this.f10105d;
    }

    public final ArrayList<Header> d() {
        return this.f10106e;
    }

    public final boolean e() {
        return this.f10108g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            byte[] bArr = this.f10104c;
            if (bArr == null) {
                if (oVar.f10104c != null) {
                    return false;
                }
            } else if (!bArr.equals(oVar.f10104c)) {
                return false;
            }
            String str = this.f10103b;
            String str2 = oVar.f10103b;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Map<String, String> map = this.f10107f;
        int hashCode = ((map == null || !map.containsKey("id")) ? 1 : this.f10107f.get("id").hashCode() + 31) * 31;
        String str = this.f10103b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return String.format("Url : %s,HttpHeader: %s", this.f10103b, this.f10106e);
    }
}