package com.bumptech.glide.load.engine;

import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class d implements ha.b {

    /* renamed from: b  reason: collision with root package name */
    private final ha.b f10562b;

    /* renamed from: c  reason: collision with root package name */
    private final ha.b f10563c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(ha.b bVar, ha.b bVar2) {
        this.f10562b = bVar;
        this.f10563c = bVar2;
    }

    @Override // ha.b
    public void b(MessageDigest messageDigest) {
        this.f10562b.b(messageDigest);
        this.f10563c.b(messageDigest);
    }

    @Override // ha.b
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f10562b.equals(dVar.f10562b) && this.f10563c.equals(dVar.f10563c);
        }
        return false;
    }

    @Override // ha.b
    public int hashCode() {
        return (this.f10562b.hashCode() * 31) + this.f10563c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f10562b + ", signature=" + this.f10563c + CoreConstants.CURLY_RIGHT;
    }
}