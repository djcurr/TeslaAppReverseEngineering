package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.Crash;
import java.util.List;
import java.util.UUID;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.core.crashreporting.internal.CrashStorage$storeCrashes$2", f = "CrashStorage.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class o2 extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19124a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k2 f19125b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Crash[] f19126c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(k2 k2Var, Crash[] crashArr, zz.d<? super o2> dVar) {
        super(2, dVar);
        this.f19125b = k2Var;
        this.f19126c = crashArr;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new o2(this.f19125b, this.f19126c, dVar);
    }

    @Override // h00.p
    public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
        return new o2(this.f19125b, this.f19126c, dVar).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        List e11;
        d11 = a00.d.d();
        int i11 = this.f19124a;
        if (i11 == 0) {
            vz.r.b(obj);
            ra raVar = this.f19125b.f18918a;
            String str = UUID.randomUUID() + ".txt";
            com.google.gson.e eVar = this.f19125b.f18920c;
            e11 = wz.o.e(this.f19126c);
            String r11 = eVar.r(e11);
            kotlin.jvm.internal.s.f(r11, "gson.toJson(crashes.asList())");
            this.f19124a = 1;
            if (raVar.a(str, r11, this) == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            vz.r.b(obj);
        }
        return vz.b0.f54756a;
    }
}