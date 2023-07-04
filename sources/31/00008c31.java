package net.time4j.tz.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import net.time4j.tz.m;
import net.time4j.tz.p;
import net.time4j.tz.q;

/* loaded from: classes5.dex */
final class e implements m, Serializable {
    private static final long serialVersionUID = 1374714021808040253L;
    private final p offset;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(p pVar) {
        this.offset = pVar;
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
        if (obj instanceof e) {
            return this.offset.equals(((e) obj).offset);
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
        return "EmptyTransitionModel=" + this.offset.a();
    }
}