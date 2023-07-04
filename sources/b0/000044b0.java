package com.plaid.internal;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.core.crashreporting.internal.CrashStorage", f = "CrashStorage.kt", l = {53}, m = "loadEvents")
/* loaded from: classes2.dex */
public final class n2 extends kotlin.coroutines.jvm.internal.d {

    /* renamed from: a  reason: collision with root package name */
    public Object f19054a;

    /* renamed from: b  reason: collision with root package name */
    public Object f19055b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f19056c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k2 f19057d;

    /* renamed from: e  reason: collision with root package name */
    public int f19058e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(k2 k2Var, zz.d<? super n2> dVar) {
        super(dVar);
        this.f19057d = k2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f19056c = obj;
        this.f19058e |= Integer.MIN_VALUE;
        return k2.a(this.f19057d, null, null, this);
    }
}