package e30;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.s;
import wz.w;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private List<? extends Annotation> f24547a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f24548b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<String> f24549c;

    /* renamed from: d  reason: collision with root package name */
    private final List<f> f24550d;

    /* renamed from: e  reason: collision with root package name */
    private final List<List<Annotation>> f24551e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Boolean> f24552f;

    public a(String serialName) {
        List<? extends Annotation> i11;
        s.g(serialName, "serialName");
        i11 = w.i();
        this.f24547a = i11;
        this.f24548b = new ArrayList();
        this.f24549c = new HashSet();
        this.f24550d = new ArrayList();
        this.f24551e = new ArrayList();
        this.f24552f = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(a aVar, String str, f fVar, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list = w.i();
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        aVar.a(str, fVar, list, z11);
    }

    public final void a(String elementName, f descriptor, List<? extends Annotation> annotations, boolean z11) {
        s.g(elementName, "elementName");
        s.g(descriptor, "descriptor");
        s.g(annotations, "annotations");
        if (this.f24549c.add(elementName)) {
            this.f24548b.add(elementName);
            this.f24550d.add(descriptor);
            this.f24551e.add(annotations);
            this.f24552f.add(Boolean.valueOf(z11));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered").toString());
    }

    public final List<Annotation> c() {
        return this.f24547a;
    }

    public final List<List<Annotation>> d() {
        return this.f24551e;
    }

    public final List<f> e() {
        return this.f24550d;
    }

    public final List<String> f() {
        return this.f24548b;
    }

    public final List<Boolean> g() {
        return this.f24552f;
    }

    public final void h(List<? extends Annotation> list) {
        s.g(list, "<set-?>");
        this.f24547a = list;
    }
}