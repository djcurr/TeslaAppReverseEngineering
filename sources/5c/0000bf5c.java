package xe;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import xe.b;

/* loaded from: classes3.dex */
public class d<I> extends a<I> {

    /* renamed from: a  reason: collision with root package name */
    private final List<b<I>> f57372a = new ArrayList(2);

    private synchronized void D(String str, Throwable th2) {
        Log.e("FwdControllerListener2", str, th2);
    }

    public synchronized void C(b<I> bVar) {
        this.f57372a.add(bVar);
    }

    public synchronized void J(b<I> bVar) {
        int indexOf = this.f57372a.indexOf(bVar);
        if (indexOf != -1) {
            this.f57372a.remove(indexOf);
        }
    }

    @Override // xe.a, xe.b
    public void g(String str, Object obj, b.a aVar) {
        int size = this.f57372a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                b<I> bVar = this.f57372a.get(i11);
                if (bVar != null) {
                    bVar.g(str, obj, aVar);
                }
            } catch (Exception e11) {
                D("ForwardingControllerListener2 exception in onSubmit", e11);
            }
        }
    }

    @Override // xe.a, xe.b
    public void j(String str, Throwable th2, b.a aVar) {
        int size = this.f57372a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                b<I> bVar = this.f57372a.get(i11);
                if (bVar != null) {
                    bVar.j(str, th2, aVar);
                }
            } catch (Exception e11) {
                D("ForwardingControllerListener2 exception in onFailure", e11);
            }
        }
    }

    @Override // xe.a, xe.b
    public void l(String str, b.a aVar) {
        int size = this.f57372a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                b<I> bVar = this.f57372a.get(i11);
                if (bVar != null) {
                    bVar.l(str, aVar);
                }
            } catch (Exception e11) {
                D("ForwardingControllerListener2 exception in onRelease", e11);
            }
        }
    }

    @Override // xe.a, xe.b
    public void m(String str, I i11, b.a aVar) {
        int size = this.f57372a.size();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                b<I> bVar = this.f57372a.get(i12);
                if (bVar != null) {
                    bVar.m(str, i11, aVar);
                }
            } catch (Exception e11) {
                D("ForwardingControllerListener2 exception in onFinalImageSet", e11);
            }
        }
    }
}