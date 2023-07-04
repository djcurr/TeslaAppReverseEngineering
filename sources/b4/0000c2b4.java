package yi;

import ak.v;
import java.nio.ByteBuffer;
import java.util.Arrays;
import wi.d;
import wi.g;

/* loaded from: classes3.dex */
public final class b extends g {
    @Override // wi.g
    protected wi.a b(d dVar, ByteBuffer byteBuffer) {
        return new wi.a(c(new v(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(v vVar) {
        return new a((String) ak.a.e(vVar.w()), (String) ak.a.e(vVar.w()), vVar.E(), vVar.E(), Arrays.copyOfRange(vVar.d(), vVar.e(), vVar.f()));
    }
}