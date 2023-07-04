package ge;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class f<INFO> implements d<INFO> {

    /* renamed from: a  reason: collision with root package name */
    private final List<d<? super INFO>> f27962a = new ArrayList(2);

    private synchronized void d(String str, Throwable th2) {
        Log.e("FdingControllerListener", str, th2);
    }

    @Override // ge.d
    public void a(String str, INFO info) {
        int size = this.f27962a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                d<? super INFO> dVar = this.f27962a.get(i11);
                if (dVar != null) {
                    dVar.a(str, info);
                }
            } catch (Exception e11) {
                d("InternalListener exception in onIntermediateImageSet", e11);
            }
        }
    }

    public synchronized void b(d<? super INFO> dVar) {
        this.f27962a.add(dVar);
    }

    public synchronized void c() {
        this.f27962a.clear();
    }

    @Override // ge.d
    public synchronized void e(String str, Throwable th2) {
        int size = this.f27962a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                d<? super INFO> dVar = this.f27962a.get(i11);
                if (dVar != null) {
                    dVar.e(str, th2);
                }
            } catch (Exception e11) {
                d("InternalListener exception in onFailure", e11);
            }
        }
    }

    @Override // ge.d
    public synchronized void f(String str) {
        int size = this.f27962a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                d<? super INFO> dVar = this.f27962a.get(i11);
                if (dVar != null) {
                    dVar.f(str);
                }
            } catch (Exception e11) {
                d("InternalListener exception in onRelease", e11);
            }
        }
    }

    public synchronized void g(d<? super INFO> dVar) {
        int indexOf = this.f27962a.indexOf(dVar);
        if (indexOf != -1) {
            this.f27962a.set(indexOf, null);
        }
    }

    @Override // ge.d
    public synchronized void l(String str, INFO info, Animatable animatable) {
        int size = this.f27962a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                d<? super INFO> dVar = this.f27962a.get(i11);
                if (dVar != null) {
                    dVar.l(str, info, animatable);
                }
            } catch (Exception e11) {
                d("InternalListener exception in onFinalImageSet", e11);
            }
        }
    }

    @Override // ge.d
    public synchronized void p(String str, Object obj) {
        int size = this.f27962a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                d<? super INFO> dVar = this.f27962a.get(i11);
                if (dVar != null) {
                    dVar.p(str, obj);
                }
            } catch (Exception e11) {
                d("InternalListener exception in onSubmit", e11);
            }
        }
    }

    @Override // ge.d
    public void q(String str, Throwable th2) {
        int size = this.f27962a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                d<? super INFO> dVar = this.f27962a.get(i11);
                if (dVar != null) {
                    dVar.q(str, th2);
                }
            } catch (Exception e11) {
                d("InternalListener exception in onIntermediateImageFailed", e11);
            }
        }
    }
}