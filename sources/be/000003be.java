package androidx.camera.core;

import a0.e;
import androidx.camera.core.impl.l1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class m0 implements z.j0 {
    public static z.j0 d(l1 l1Var, long j11, int i11) {
        return new e(l1Var, j11, i11);
    }

    @Override // z.j0
    public abstract l1 a();

    @Override // z.j0
    public void b(e.b bVar) {
        bVar.m(c());
    }

    @Override // z.j0
    public abstract int c();

    @Override // z.j0
    public abstract long getTimestamp();
}