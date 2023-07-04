package a2;

import c1.o0;
import c1.s1;
import h00.l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final l<a, Boolean> f134a;

    /* renamed from: b  reason: collision with root package name */
    private final o0 f135b;

    /* JADX WARN: Multi-variable type inference failed */
    private c(int i11, l<? super a, Boolean> lVar) {
        o0 d11;
        this.f134a = lVar;
        d11 = s1.d(a.c(i11), null, 2, null);
        this.f135b = d11;
    }

    public /* synthetic */ c(int i11, l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, lVar);
    }

    @Override // a2.b
    public int a() {
        return ((a) this.f135b.getValue()).i();
    }

    public void b(int i11) {
        this.f135b.setValue(a.c(i11));
    }
}