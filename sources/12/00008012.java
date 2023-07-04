package kotlinx.coroutines.internal;

import kotlinx.coroutines.ThreadContextElement;
import v20.z2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public final zz.g f35486a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f35487b;

    /* renamed from: c  reason: collision with root package name */
    private final ThreadContextElement<Object>[] f35488c;

    /* renamed from: d  reason: collision with root package name */
    private int f35489d;

    public m0(zz.g gVar, int i11) {
        this.f35486a = gVar;
        this.f35487b = new Object[i11];
        this.f35488c = new z2[i11];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(z2<?> z2Var, Object obj) {
        Object[] objArr = this.f35487b;
        int i11 = this.f35489d;
        objArr[i11] = obj;
        ThreadContextElement<Object>[] threadContextElementArr = this.f35488c;
        this.f35489d = i11 + 1;
        threadContextElementArr[i11] = z2Var;
    }

    public final void b(zz.g gVar) {
        int length = this.f35488c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i11 = length - 1;
            z2 z2Var = this.f35488c[length];
            kotlin.jvm.internal.s.e(z2Var);
            z2Var.t0(gVar, this.f35487b[length]);
            if (i11 < 0) {
                return;
            }
            length = i11;
        }
    }
}