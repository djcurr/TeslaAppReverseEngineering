package pf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class c implements e {

    /* renamed from: a  reason: collision with root package name */
    private final List<e> f46448a;

    public c(Set<e> set) {
        this.f46448a = new ArrayList(set.size());
        for (e eVar : set) {
            if (eVar != null) {
                this.f46448a.add(eVar);
            }
        }
    }

    private void m(String str, Throwable th2) {
        nd.a.k("ForwardingRequestListener", str, th2);
    }

    @Override // pf.e
    public void a(com.facebook.imagepipeline.request.a aVar, Object obj, String str, boolean z11) {
        int size = this.f46448a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f46448a.get(i11).a(aVar, obj, str, z11);
            } catch (Exception e11) {
                m("InternalListener exception in onRequestStart", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.s0
    public void b(String str, String str2) {
        int size = this.f46448a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f46448a.get(i11).b(str, str2);
            } catch (Exception e11) {
                m("InternalListener exception in onProducerStart", e11);
            }
        }
    }

    @Override // pf.e
    public void c(com.facebook.imagepipeline.request.a aVar, String str, boolean z11) {
        int size = this.f46448a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f46448a.get(i11).c(aVar, str, z11);
            } catch (Exception e11) {
                m("InternalListener exception in onRequestSuccess", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.s0
    public boolean d(String str) {
        int size = this.f46448a.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f46448a.get(i11).d(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.s0
    public void e(String str, String str2, Map<String, String> map) {
        int size = this.f46448a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f46448a.get(i11).e(str, str2, map);
            } catch (Exception e11) {
                m("InternalListener exception in onProducerFinishWithSuccess", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.s0
    public void f(String str, String str2, Throwable th2, Map<String, String> map) {
        int size = this.f46448a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f46448a.get(i11).f(str, str2, th2, map);
            } catch (Exception e11) {
                m("InternalListener exception in onProducerFinishWithFailure", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.s0
    public void g(String str, String str2, Map<String, String> map) {
        int size = this.f46448a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f46448a.get(i11).g(str, str2, map);
            } catch (Exception e11) {
                m("InternalListener exception in onProducerFinishWithCancellation", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.s0
    public void h(String str, String str2, boolean z11) {
        int size = this.f46448a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f46448a.get(i11).h(str, str2, z11);
            } catch (Exception e11) {
                m("InternalListener exception in onProducerFinishWithSuccess", e11);
            }
        }
    }

    @Override // pf.e
    public void i(com.facebook.imagepipeline.request.a aVar, String str, Throwable th2, boolean z11) {
        int size = this.f46448a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f46448a.get(i11).i(aVar, str, th2, z11);
            } catch (Exception e11) {
                m("InternalListener exception in onRequestFailure", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.s0
    public void j(String str, String str2, String str3) {
        int size = this.f46448a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f46448a.get(i11).j(str, str2, str3);
            } catch (Exception e11) {
                m("InternalListener exception in onIntermediateChunkStart", e11);
            }
        }
    }

    @Override // pf.e
    public void k(String str) {
        int size = this.f46448a.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                this.f46448a.get(i11).k(str);
            } catch (Exception e11) {
                m("InternalListener exception in onRequestCancellation", e11);
            }
        }
    }

    public void l(e eVar) {
        this.f46448a.add(eVar);
    }

    public c(e... eVarArr) {
        this.f46448a = new ArrayList(eVarArr.length);
        for (e eVar : eVarArr) {
            if (eVar != null) {
                this.f46448a.add(eVar);
            }
        }
    }
}