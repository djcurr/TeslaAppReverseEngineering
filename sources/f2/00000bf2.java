package b20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import wz.b0;

/* loaded from: classes5.dex */
public final class a implements f {

    /* renamed from: b  reason: collision with root package name */
    private final List<f> f7354b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends f> inner) {
        s.g(inner, "inner");
        this.f7354b = inner;
    }

    @Override // b20.f
    public List<u10.f> a(w00.c thisDescriptor) {
        s.g(thisDescriptor, "thisDescriptor");
        List<f> list = this.f7354b;
        ArrayList arrayList = new ArrayList();
        for (f fVar : list) {
            b0.z(arrayList, fVar.a(thisDescriptor));
        }
        return arrayList;
    }

    @Override // b20.f
    public void b(w00.c thisDescriptor, u10.f name, Collection<h> result) {
        s.g(thisDescriptor, "thisDescriptor");
        s.g(name, "name");
        s.g(result, "result");
        for (f fVar : this.f7354b) {
            fVar.b(thisDescriptor, name, result);
        }
    }

    @Override // b20.f
    public void c(w00.c thisDescriptor, u10.f name, Collection<h> result) {
        s.g(thisDescriptor, "thisDescriptor");
        s.g(name, "name");
        s.g(result, "result");
        for (f fVar : this.f7354b) {
            fVar.c(thisDescriptor, name, result);
        }
    }

    @Override // b20.f
    public void d(w00.c thisDescriptor, List<w00.b> result) {
        s.g(thisDescriptor, "thisDescriptor");
        s.g(result, "result");
        for (f fVar : this.f7354b) {
            fVar.d(thisDescriptor, result);
        }
    }

    @Override // b20.f
    public List<u10.f> e(w00.c thisDescriptor) {
        s.g(thisDescriptor, "thisDescriptor");
        List<f> list = this.f7354b;
        ArrayList arrayList = new ArrayList();
        for (f fVar : list) {
            b0.z(arrayList, fVar.e(thisDescriptor));
        }
        return arrayList;
    }
}