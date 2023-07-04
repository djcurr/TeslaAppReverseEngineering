package y20;

import java.util.Arrays;
import kotlinx.coroutines.flow.h0;
import vz.b0;
import vz.q;
import y20.c;

/* loaded from: classes5.dex */
public abstract class a<S extends c<?>> {

    /* renamed from: a  reason: collision with root package name */
    private S[] f58991a;

    /* renamed from: b  reason: collision with root package name */
    private int f58992b;

    /* renamed from: c  reason: collision with root package name */
    private int f58993c;

    /* renamed from: d  reason: collision with root package name */
    private w f58994d;

    public static final /* synthetic */ int e(a aVar) {
        return aVar.f58992b;
    }

    public static final /* synthetic */ c[] f(a aVar) {
        return aVar.f58991a;
    }

    public final h0<Integer> c() {
        w wVar;
        synchronized (this) {
            wVar = this.f58994d;
            if (wVar == null) {
                wVar = new w(k());
                this.f58994d = wVar;
            }
        }
        return wVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final S g() {
        S s11;
        w wVar;
        synchronized (this) {
            S[] l11 = l();
            if (l11 == null) {
                l11 = i(2);
                this.f58991a = l11;
            } else if (k() >= l11.length) {
                Object[] copyOf = Arrays.copyOf(l11, l11.length * 2);
                kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
                this.f58991a = (S[]) ((c[]) copyOf);
                l11 = (S[]) ((c[]) copyOf);
            }
            int i11 = this.f58993c;
            do {
                s11 = l11[i11];
                if (s11 == null) {
                    s11 = h();
                    l11[i11] = s11;
                }
                i11++;
                if (i11 >= l11.length) {
                    i11 = 0;
                }
            } while (!s11.a(this));
            this.f58993c = i11;
            this.f58992b = k() + 1;
            wVar = this.f58994d;
        }
        if (wVar != null) {
            wVar.Y(1);
        }
        return s11;
    }

    protected abstract S h();

    protected abstract S[] i(int i11);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j(S s11) {
        w wVar;
        int i11;
        zz.d[] b11;
        synchronized (this) {
            this.f58992b = k() - 1;
            wVar = this.f58994d;
            i11 = 0;
            if (k() == 0) {
                this.f58993c = 0;
            }
            b11 = s11.b(this);
        }
        int length = b11.length;
        while (i11 < length) {
            zz.d dVar = b11[i11];
            i11++;
            if (dVar != null) {
                q.a aVar = vz.q.f54772b;
                dVar.resumeWith(vz.q.b(b0.f54756a));
            }
        }
        if (wVar == null) {
            return;
        }
        wVar.Y(-1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int k() {
        return this.f58992b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final S[] l() {
        return this.f58991a;
    }
}