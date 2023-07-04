package r5;

import b6.h;
import h00.p;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;
import v20.o0;
import vz.b0;
import vz.r;

@kotlin.coroutines.jvm.internal.f(c = "coil.RealImageLoader$executeChain$2", f = "RealImageLoader.kt", l = {238}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g extends l implements p<o0, zz.d<? super h>, Object> {

    /* renamed from: a  reason: collision with root package name */
    private o0 f49246a;

    /* renamed from: b  reason: collision with root package name */
    Object f49247b;

    /* renamed from: c  reason: collision with root package name */
    int f49248c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l0 f49249d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ b6.g f49250e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l0 l0Var, b6.g gVar, zz.d dVar) {
        super(2, dVar);
        this.f49249d = l0Var;
        this.f49250e = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(Object obj, zz.d<?> completion) {
        s.g(completion, "completion");
        g gVar = new g(this.f49249d, this.f49250e, completion);
        gVar.f49246a = (o0) obj;
        return gVar;
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super h> dVar) {
        return ((g) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.f49248c;
        if (i11 == 0) {
            r.b(obj);
            o0 o0Var = this.f49246a;
            b6.g gVar = this.f49250e;
            this.f49247b = o0Var;
            this.f49248c = 1;
            obj = ((x5.c) this.f49249d.f34916a).h(gVar, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            o0 o0Var2 = (o0) this.f49247b;
            r.b(obj);
        }
        return obj;
    }
}