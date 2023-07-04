package t;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import t.k0;

/* loaded from: classes.dex */
public final class k0 implements androidx.camera.core.impl.r {

    /* renamed from: a  reason: collision with root package name */
    private final String f51072a;

    /* renamed from: b  reason: collision with root package name */
    private final u.d f51073b;

    /* renamed from: d  reason: collision with root package name */
    private s f51075d;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.camera.core.impl.e1 f51079h;

    /* renamed from: c  reason: collision with root package name */
    private final Object f51074c = new Object();

    /* renamed from: e  reason: collision with root package name */
    private a<Integer> f51076e = null;

    /* renamed from: f  reason: collision with root package name */
    private a<z.a1> f51077f = null;

    /* renamed from: g  reason: collision with root package name */
    private List<Pair<androidx.camera.core.impl.e, Executor>> f51078g = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a<T> extends androidx.lifecycle.d0<T> {

        /* renamed from: b  reason: collision with root package name */
        private LiveData<T> f51080b;

        /* renamed from: c  reason: collision with root package name */
        private T f51081c;

        a(T t11) {
            this.f51081c = t11;
        }

        @Override // androidx.lifecycle.d0
        public <S> void b(LiveData<S> liveData, androidx.lifecycle.g0<? super S> g0Var) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        void d(LiveData<T> liveData) {
            LiveData liveData2 = (LiveData<T>) this.f51080b;
            if (liveData2 != null) {
                super.c(liveData2);
            }
            this.f51080b = liveData;
            super.b(liveData, new androidx.lifecycle.g0() { // from class: t.j0
                {
                    k0.a.this = this;
                }

                @Override // androidx.lifecycle.g0
                public final void onChanged(Object obj) {
                    k0.a.this.setValue(obj);
                }
            });
        }

        @Override // androidx.lifecycle.LiveData
        public T getValue() {
            LiveData<T> liveData = this.f51080b;
            return liveData == null ? this.f51081c : liveData.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(String str, u.d dVar) {
        this.f51072a = (String) v3.h.f(str);
        this.f51073b = dVar;
        new y.h(this);
        this.f51079h = w.d.a(str, dVar);
    }

    private void m() {
        n();
    }

    private void n() {
        String str;
        int k11 = k();
        if (k11 == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (k11 == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (k11 == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (k11 == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (k11 != 4) {
            str = "Unknown value: " + k11;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        androidx.camera.core.n0.e("Camera2CameraInfo", "Device Level: " + str);
    }

    @Override // androidx.camera.core.impl.r
    public String a() {
        return this.f51072a;
    }

    @Override // androidx.camera.core.impl.r
    public void b(Executor executor, androidx.camera.core.impl.e eVar) {
        synchronized (this.f51074c) {
            s sVar = this.f51075d;
            if (sVar == null) {
                if (this.f51078g == null) {
                    this.f51078g = new ArrayList();
                }
                this.f51078g.add(new Pair<>(eVar, executor));
                return;
            }
            sVar.x(executor, eVar);
        }
    }

    @Override // androidx.camera.core.impl.r
    public Integer c() {
        Integer num = (Integer) this.f51073b.a(CameraCharacteristics.LENS_FACING);
        v3.h.f(num);
        int intValue = num.intValue();
        if (intValue != 0) {
            return intValue != 1 ? null : 1;
        }
        return 0;
    }

    @Override // androidx.camera.core.impl.r
    public androidx.camera.core.impl.e1 d() {
        return this.f51079h;
    }

    @Override // androidx.camera.core.impl.r
    public void e(androidx.camera.core.impl.e eVar) {
        synchronized (this.f51074c) {
            s sVar = this.f51075d;
            if (sVar == null) {
                List<Pair<androidx.camera.core.impl.e, Executor>> list = this.f51078g;
                if (list == null) {
                    return;
                }
                Iterator<Pair<androidx.camera.core.impl.e, Executor>> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (it2.next().first == eVar) {
                        it2.remove();
                    }
                }
                return;
            }
            sVar.b0(eVar);
        }
    }

    @Override // z.d
    public LiveData<Integer> f() {
        synchronized (this.f51074c) {
            s sVar = this.f51075d;
            if (sVar == null) {
                if (this.f51076e == null) {
                    this.f51076e = new a<>(0);
                }
                return this.f51076e;
            }
            a<Integer> aVar = this.f51076e;
            if (aVar != null) {
                return aVar;
            }
            return sVar.J().e();
        }
    }

    @Override // z.d
    public String g() {
        return k() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // z.d
    public int h(int i11) {
        Integer valueOf = Integer.valueOf(j());
        int b11 = a0.b.b(i11);
        Integer c11 = c();
        boolean z11 = true;
        return a0.b.a(b11, valueOf.intValue(), (c11 == null || 1 != c11.intValue()) ? false : false);
    }

    public u.d i() {
        return this.f51073b;
    }

    int j() {
        Integer num = (Integer) this.f51073b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        v3.h.f(num);
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        Integer num = (Integer) this.f51073b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        v3.h.f(num);
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(s sVar) {
        synchronized (this.f51074c) {
            this.f51075d = sVar;
            a<z.a1> aVar = this.f51077f;
            if (aVar != null) {
                aVar.d(sVar.L().d());
            }
            a<Integer> aVar2 = this.f51076e;
            if (aVar2 != null) {
                aVar2.d(this.f51075d.J().e());
            }
            List<Pair<androidx.camera.core.impl.e, Executor>> list = this.f51078g;
            if (list != null) {
                for (Pair<androidx.camera.core.impl.e, Executor> pair : list) {
                    this.f51075d.x((Executor) pair.second, (androidx.camera.core.impl.e) pair.first);
                }
                this.f51078g = null;
            }
        }
        m();
    }
}