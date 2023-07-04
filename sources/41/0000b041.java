package r60;

import java.math.BigInteger;
import n60.j;
import n60.r;

/* loaded from: classes5.dex */
public class e implements d {

    /* renamed from: a  reason: collision with root package name */
    protected final f f49260a;

    /* renamed from: b  reason: collision with root package name */
    protected final j f49261b;

    public e(n60.e eVar, f fVar) {
        this.f49260a = fVar;
        this.f49261b = new r(eVar.m(fVar.a()));
    }

    @Override // r60.d
    public BigInteger[] decomposeScalar(BigInteger bigInteger) {
        return c.b(this.f49260a.b(), bigInteger);
    }

    @Override // r60.a
    public j getPointMap() {
        return this.f49261b;
    }

    @Override // r60.a
    public boolean hasEfficientPointMap() {
        return true;
    }
}