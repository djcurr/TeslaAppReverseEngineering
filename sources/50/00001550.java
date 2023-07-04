package com.bumptech.glide.load.engine;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class t implements ha.b {

    /* renamed from: j  reason: collision with root package name */
    private static final bb.g<Class<?>, byte[]> f10714j = new bb.g<>(50);

    /* renamed from: b  reason: collision with root package name */
    private final ka.b f10715b;

    /* renamed from: c  reason: collision with root package name */
    private final ha.b f10716c;

    /* renamed from: d  reason: collision with root package name */
    private final ha.b f10717d;

    /* renamed from: e  reason: collision with root package name */
    private final int f10718e;

    /* renamed from: f  reason: collision with root package name */
    private final int f10719f;

    /* renamed from: g  reason: collision with root package name */
    private final Class<?> f10720g;

    /* renamed from: h  reason: collision with root package name */
    private final ha.e f10721h;

    /* renamed from: i  reason: collision with root package name */
    private final ha.h<?> f10722i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(ka.b bVar, ha.b bVar2, ha.b bVar3, int i11, int i12, ha.h<?> hVar, Class<?> cls, ha.e eVar) {
        this.f10715b = bVar;
        this.f10716c = bVar2;
        this.f10717d = bVar3;
        this.f10718e = i11;
        this.f10719f = i12;
        this.f10722i = hVar;
        this.f10720g = cls;
        this.f10721h = eVar;
    }

    private byte[] c() {
        bb.g<Class<?>, byte[]> gVar = f10714j;
        byte[] g11 = gVar.g(this.f10720g);
        if (g11 == null) {
            byte[] bytes = this.f10720g.getName().getBytes(ha.b.f29009a);
            gVar.k(this.f10720g, bytes);
            return bytes;
        }
        return g11;
    }

    @Override // ha.b
    public void b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f10715b.g(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f10718e).putInt(this.f10719f).array();
        this.f10717d.b(messageDigest);
        this.f10716c.b(messageDigest);
        messageDigest.update(bArr);
        ha.h<?> hVar = this.f10722i;
        if (hVar != null) {
            hVar.b(messageDigest);
        }
        this.f10721h.b(messageDigest);
        messageDigest.update(c());
        this.f10715b.e(bArr);
    }

    @Override // ha.b
    public boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            return this.f10719f == tVar.f10719f && this.f10718e == tVar.f10718e && bb.k.d(this.f10722i, tVar.f10722i) && this.f10720g.equals(tVar.f10720g) && this.f10716c.equals(tVar.f10716c) && this.f10717d.equals(tVar.f10717d) && this.f10721h.equals(tVar.f10721h);
        }
        return false;
    }

    @Override // ha.b
    public int hashCode() {
        int hashCode = (((((this.f10716c.hashCode() * 31) + this.f10717d.hashCode()) * 31) + this.f10718e) * 31) + this.f10719f;
        ha.h<?> hVar = this.f10722i;
        if (hVar != null) {
            hashCode = (hashCode * 31) + hVar.hashCode();
        }
        return (((hashCode * 31) + this.f10720g.hashCode()) * 31) + this.f10721h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f10716c + ", signature=" + this.f10717d + ", width=" + this.f10718e + ", height=" + this.f10719f + ", decodedResourceClass=" + this.f10720g + ", transformation='" + this.f10722i + CoreConstants.SINGLE_QUOTE_CHAR + ", options=" + this.f10721h + CoreConstants.CURLY_RIGHT;
    }
}