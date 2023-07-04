package xj;

import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.z0;
import fj.v;

/* loaded from: classes3.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    private a f57586a;

    /* renamed from: b  reason: collision with root package name */
    private zj.d f57587b;

    /* loaded from: classes3.dex */
    public interface a {
        void b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zj.d a() {
        return (zj.d) ak.a.e(this.f57587b);
    }

    public final void b(a aVar, zj.d dVar) {
        this.f57586a = aVar;
        this.f57587b = dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        a aVar = this.f57586a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public abstract void d(Object obj);

    public abstract n e(ci.n[] nVarArr, v vVar, j.a aVar, z0 z0Var);
}