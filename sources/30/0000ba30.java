package vn;

import xn.m;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private h f54549a;

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        h hVar = this.f54549a;
        if (hVar instanceof m) {
            ((m) hVar).b0();
            return;
        }
        throw new UnsupportedOperationException("Stored renderer is not a KmlRenderer");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Iterable<xn.b> b() {
        h hVar = this.f54549a;
        if (hVar instanceof m) {
            return ((m) hVar).g0();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(h hVar) {
        this.f54549a = hVar;
    }
}