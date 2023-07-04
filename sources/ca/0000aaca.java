package pj;

import ak.v;
import java.util.List;
import nj.d;
import nj.f;

/* loaded from: classes3.dex */
public final class a extends d {

    /* renamed from: n  reason: collision with root package name */
    private final b f46578n;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        v vVar = new v(list.get(0));
        this.f46578n = new b(vVar.I(), vVar.I());
    }

    @Override // nj.d
    protected f A(byte[] bArr, int i11, boolean z11) {
        if (z11) {
            this.f46578n.r();
        }
        return new c(this.f46578n.b(bArr, i11));
    }
}