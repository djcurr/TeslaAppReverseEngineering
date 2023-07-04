package net.time4j.tz;

import ch.qos.logback.core.CoreConstants;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class j extends l implements m {
    private static final long serialVersionUID = 7807230388259573234L;

    /* renamed from: y  reason: collision with root package name */
    private static final j f41534y = new j(p.f41597k);
    private final p offset;

    private j(p pVar) {
        if (pVar.i() == 0) {
            this.offset = pVar;
            return;
        }
        int k11 = pVar.k();
        this.offset = p.s(pVar.i() < 0 ? k11 - 1 : k11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j R(p pVar) {
        if (pVar.k() == 0 && pVar.i() == 0) {
            return f41534y;
        }
        return new j(pVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.offset.i() != 0) {
            throw new InvalidObjectException("Fractional offset is invalid.");
        }
    }

    @Override // net.time4j.tz.l
    public p A(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return this.offset;
    }

    @Override // net.time4j.tz.l
    public p B(net.time4j.base.f fVar) {
        return this.offset;
    }

    @Override // net.time4j.tz.l
    public o E() {
        return l.f41537c;
    }

    @Override // net.time4j.tz.l
    public boolean I(net.time4j.base.f fVar) {
        return false;
    }

    @Override // net.time4j.tz.l
    public boolean J() {
        return true;
    }

    @Override // net.time4j.tz.l
    public boolean K(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return false;
    }

    @Override // net.time4j.tz.l
    public l Q(o oVar) {
        return this;
    }

    @Override // net.time4j.tz.m
    public q a(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return null;
    }

    @Override // net.time4j.tz.m
    public q b(net.time4j.base.f fVar) {
        return null;
    }

    @Override // net.time4j.tz.m
    public boolean c() {
        return false;
    }

    @Override // net.time4j.tz.m
    public p d() {
        return this.offset;
    }

    @Override // net.time4j.tz.m
    public List<p> e(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return Collections.singletonList(this.offset);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.offset.equals(((j) obj).offset);
        }
        return false;
    }

    public int hashCode() {
        return this.offset.hashCode();
    }

    @Override // net.time4j.tz.m
    public boolean isEmpty() {
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append('[');
        sb2.append(j.class.getName());
        sb2.append(CoreConstants.COLON_CHAR);
        sb2.append(this.offset);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.tz.l
    public String w(d dVar, Locale locale) {
        if (dVar.isAbbreviation()) {
            return this.offset.toString();
        }
        return this.offset.a();
    }

    @Override // net.time4j.tz.l
    public m y() {
        return this;
    }

    @Override // net.time4j.tz.l
    public k z() {
        return this.offset;
    }
}