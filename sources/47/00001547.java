package com.bumptech.glide.load.engine;

import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
class m implements ha.b {

    /* renamed from: b  reason: collision with root package name */
    private final Object f10678b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10679c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10680d;

    /* renamed from: e  reason: collision with root package name */
    private final Class<?> f10681e;

    /* renamed from: f  reason: collision with root package name */
    private final Class<?> f10682f;

    /* renamed from: g  reason: collision with root package name */
    private final ha.b f10683g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<Class<?>, ha.h<?>> f10684h;

    /* renamed from: i  reason: collision with root package name */
    private final ha.e f10685i;

    /* renamed from: j  reason: collision with root package name */
    private int f10686j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Object obj, ha.b bVar, int i11, int i12, Map<Class<?>, ha.h<?>> map, Class<?> cls, Class<?> cls2, ha.e eVar) {
        this.f10678b = bb.j.d(obj);
        this.f10683g = (ha.b) bb.j.e(bVar, "Signature must not be null");
        this.f10679c = i11;
        this.f10680d = i12;
        this.f10684h = (Map) bb.j.d(map);
        this.f10681e = (Class) bb.j.e(cls, "Resource class must not be null");
        this.f10682f = (Class) bb.j.e(cls2, "Transcode class must not be null");
        this.f10685i = (ha.e) bb.j.d(eVar);
    }

    @Override // ha.b
    public void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // ha.b
    public boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            return this.f10678b.equals(mVar.f10678b) && this.f10683g.equals(mVar.f10683g) && this.f10680d == mVar.f10680d && this.f10679c == mVar.f10679c && this.f10684h.equals(mVar.f10684h) && this.f10681e.equals(mVar.f10681e) && this.f10682f.equals(mVar.f10682f) && this.f10685i.equals(mVar.f10685i);
        }
        return false;
    }

    @Override // ha.b
    public int hashCode() {
        if (this.f10686j == 0) {
            int hashCode = this.f10678b.hashCode();
            this.f10686j = hashCode;
            int hashCode2 = (hashCode * 31) + this.f10683g.hashCode();
            this.f10686j = hashCode2;
            int i11 = (hashCode2 * 31) + this.f10679c;
            this.f10686j = i11;
            int i12 = (i11 * 31) + this.f10680d;
            this.f10686j = i12;
            int hashCode3 = (i12 * 31) + this.f10684h.hashCode();
            this.f10686j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f10681e.hashCode();
            this.f10686j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f10682f.hashCode();
            this.f10686j = hashCode5;
            this.f10686j = (hashCode5 * 31) + this.f10685i.hashCode();
        }
        return this.f10686j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f10678b + ", width=" + this.f10679c + ", height=" + this.f10680d + ", resourceClass=" + this.f10681e + ", transcodeClass=" + this.f10682f + ", signature=" + this.f10683g + ", hashCode=" + this.f10686j + ", transformations=" + this.f10684h + ", options=" + this.f10685i + CoreConstants.CURLY_RIGHT;
    }
}