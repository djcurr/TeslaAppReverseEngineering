package kotlinx.coroutines.internal;

import kotlin.KotlinNothingValueException;
import v20.g1;
import v20.l2;
import v20.x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class y extends l2 implements x0 {

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f35526b;

    /* renamed from: c  reason: collision with root package name */
    private final String f35527c;

    public y(Throwable th2, String str) {
        this.f35526b = th2;
        this.f35527c = str;
    }

    private final Void Z0() {
        String p11;
        if (this.f35526b != null) {
            String str = this.f35527c;
            String str2 = "";
            if (str != null && (p11 = kotlin.jvm.internal.s.p(". ", str)) != null) {
                str2 = p11;
            }
            throw new IllegalStateException(kotlin.jvm.internal.s.p("Module with the Main dispatcher had failed to initialize", str2), this.f35526b);
        }
        x.d();
        throw new KotlinNothingValueException();
    }

    @Override // v20.j0
    public boolean P0(zz.g gVar) {
        Z0();
        throw new KotlinNothingValueException();
    }

    @Override // v20.l2, v20.j0
    public v20.j0 Q0(int i11) {
        Z0();
        throw new KotlinNothingValueException();
    }

    @Override // v20.l2
    public l2 R0() {
        return this;
    }

    @Override // v20.j0
    /* renamed from: X0 */
    public Void I0(zz.g gVar, Runnable runnable) {
        Z0();
        throw new KotlinNothingValueException();
    }

    @Override // v20.x0
    /* renamed from: b1 */
    public Void J(long j11, v20.o<? super vz.b0> oVar) {
        Z0();
        throw new KotlinNothingValueException();
    }

    @Override // v20.x0
    public g1 l(long j11, Runnable runnable, zz.g gVar) {
        Z0();
        throw new KotlinNothingValueException();
    }

    @Override // v20.l2, v20.j0
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        Throwable th2 = this.f35526b;
        sb2.append(th2 != null ? kotlin.jvm.internal.s.p(", cause=", th2) : "");
        sb2.append(']');
        return sb2.toString();
    }
}