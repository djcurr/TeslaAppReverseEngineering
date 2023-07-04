package h60;

import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;

/* loaded from: classes5.dex */
public class b extends DHParameterSpec {

    /* renamed from: a  reason: collision with root package name */
    private final BigInteger f28923a;

    /* renamed from: b  reason: collision with root package name */
    private final BigInteger f28924b;

    /* renamed from: c  reason: collision with root package name */
    private final int f28925c;

    /* renamed from: d  reason: collision with root package name */
    private u50.n f28926d;

    public b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i11) {
        this(bigInteger, bigInteger2, bigInteger3, bigInteger4, 0, i11);
    }

    public b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i11, int i12) {
        super(bigInteger, bigInteger3, i12);
        this.f28923a = bigInteger2;
        this.f28924b = bigInteger4;
        this.f28925c = i11;
    }

    public b(u50.i iVar) {
        this(iVar.f(), iVar.g(), iVar.b(), iVar.c(), iVar.e(), iVar.d());
        this.f28926d = iVar.h();
    }

    public u50.i a() {
        return new u50.i(getP(), getG(), this.f28923a, this.f28925c, getL(), this.f28924b, this.f28926d);
    }

    public BigInteger b() {
        return this.f28923a;
    }
}