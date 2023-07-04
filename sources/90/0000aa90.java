package pf;

import com.facebook.imagepipeline.producers.p0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private final List<d> f46447a;

    public b(Set<d> set) {
        this.f46447a = new ArrayList(set.size());
        for (d dVar : set) {
            if (dVar != null) {
                this.f46447a.add(dVar);
            }
        }
    }

    private void l(String str, Throwable th2) {
        nd.a.k("ForwardingRequestListener2", str, th2);
    }

    @Override // pf.d
    public void a(p0 p0Var) {
        int size = this.f46447a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f46447a.get(i11).a(p0Var);
            } catch (Exception e11) {
                l("InternalListener exception in onRequestStart", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.r0
    public void b(p0 p0Var, String str, boolean z11) {
        int size = this.f46447a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f46447a.get(i11).b(p0Var, str, z11);
            } catch (Exception e11) {
                l("InternalListener exception in onProducerFinishWithSuccess", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.r0
    public void c(p0 p0Var, String str, Map<String, String> map) {
        int size = this.f46447a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f46447a.get(i11).c(p0Var, str, map);
            } catch (Exception e11) {
                l("InternalListener exception in onProducerFinishWithCancellation", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.r0
    public void d(p0 p0Var, String str) {
        int size = this.f46447a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f46447a.get(i11).d(p0Var, str);
            } catch (Exception e11) {
                l("InternalListener exception in onProducerStart", e11);
            }
        }
    }

    @Override // pf.d
    public void e(p0 p0Var) {
        int size = this.f46447a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f46447a.get(i11).e(p0Var);
            } catch (Exception e11) {
                l("InternalListener exception in onRequestSuccess", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.r0
    public boolean f(p0 p0Var, String str) {
        int size = this.f46447a.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f46447a.get(i11).f(p0Var, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // pf.d
    public void g(p0 p0Var) {
        int size = this.f46447a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f46447a.get(i11).g(p0Var);
            } catch (Exception e11) {
                l("InternalListener exception in onRequestCancellation", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.r0
    public void h(p0 p0Var, String str, String str2) {
        int size = this.f46447a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f46447a.get(i11).h(p0Var, str, str2);
            } catch (Exception e11) {
                l("InternalListener exception in onIntermediateChunkStart", e11);
            }
        }
    }

    @Override // pf.d
    public void i(p0 p0Var, Throwable th2) {
        int size = this.f46447a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f46447a.get(i11).i(p0Var, th2);
            } catch (Exception e11) {
                l("InternalListener exception in onRequestFailure", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.r0
    public void j(p0 p0Var, String str, Map<String, String> map) {
        int size = this.f46447a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f46447a.get(i11).j(p0Var, str, map);
            } catch (Exception e11) {
                l("InternalListener exception in onProducerFinishWithSuccess", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.r0
    public void k(p0 p0Var, String str, Throwable th2, Map<String, String> map) {
        int size = this.f46447a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f46447a.get(i11).k(p0Var, str, th2, map);
            } catch (Exception e11) {
                l("InternalListener exception in onProducerFinishWithFailure", e11);
            }
        }
    }
}