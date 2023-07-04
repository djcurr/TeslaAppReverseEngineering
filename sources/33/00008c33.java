package net.time4j.tz.model;

import java.io.Serializable;
import net.time4j.c0;
import net.time4j.g0;

@net.time4j.format.c("iso8601")
/* loaded from: classes5.dex */
public class g extends d implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: e  reason: collision with root package name */
    private final transient byte f41577e;

    /* JADX INFO: Access modifiers changed from: protected */
    public g(c0 c0Var, int i11, i iVar, int i12) {
        super(i11, iVar, i12);
        this.f41577e = (byte) c0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.tz.model.d
    public String a() {
        return "iso8601";
    }

    @Override // net.time4j.tz.model.d
    public final g0 b(int i11) {
        return (g0) j(i11).G(c(), net.time4j.f.DAYS);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.tz.model.d
    public int h(long j11) {
        return net.time4j.base.b.i(net.time4j.base.b.l(j11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.tz.model.d
    public int i(net.time4j.base.a aVar) {
        return aVar.getYear();
    }

    protected g0 j(int i11) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte k() {
        return this.f41577e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean l(g gVar) {
        return f().equals(gVar.f()) && c() == gVar.c() && d() == gVar.d() && e() == gVar.e() && this.f41577e == gVar.f41577e;
    }
}