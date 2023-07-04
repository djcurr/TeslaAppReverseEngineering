package mx;

import io.grpc.internal.o2;
import io.grpc.internal.p2;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
class o implements p2 {
    @Override // io.grpc.internal.p2
    public o2 a(int i11) {
        return new n(new okio.f(), Math.min((int) PKIFailureInfo.badCertTemplate, Math.max(4096, i11)));
    }
}