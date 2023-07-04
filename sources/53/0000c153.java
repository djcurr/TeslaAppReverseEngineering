package y00;

import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public final class w implements v {

    /* renamed from: a  reason: collision with root package name */
    private final List<x> f58911a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<x> f58912b;

    /* renamed from: c  reason: collision with root package name */
    private final List<x> f58913c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<x> f58914d;

    public w(List<x> allDependencies, Set<x> modulesWhoseInternalsAreVisible, List<x> directExpectedByDependencies, Set<x> allExpectedByDependencies) {
        kotlin.jvm.internal.s.g(allDependencies, "allDependencies");
        kotlin.jvm.internal.s.g(modulesWhoseInternalsAreVisible, "modulesWhoseInternalsAreVisible");
        kotlin.jvm.internal.s.g(directExpectedByDependencies, "directExpectedByDependencies");
        kotlin.jvm.internal.s.g(allExpectedByDependencies, "allExpectedByDependencies");
        this.f58911a = allDependencies;
        this.f58912b = modulesWhoseInternalsAreVisible;
        this.f58913c = directExpectedByDependencies;
        this.f58914d = allExpectedByDependencies;
    }

    @Override // y00.v
    public List<x> a() {
        return this.f58911a;
    }

    @Override // y00.v
    public List<x> b() {
        return this.f58913c;
    }

    @Override // y00.v
    public Set<x> c() {
        return this.f58912b;
    }
}