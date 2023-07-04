package g30;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public final class p1 implements e30.f, m {

    /* renamed from: a  reason: collision with root package name */
    private final e30.f f27625a;

    /* renamed from: b  reason: collision with root package name */
    private final String f27626b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<String> f27627c;

    public p1(e30.f original) {
        kotlin.jvm.internal.s.g(original, "original");
        this.f27625a = original;
        this.f27626b = original.h() + '?';
        this.f27627c = e1.a(original);
    }

    @Override // g30.m
    public Set<String> a() {
        return this.f27627c;
    }

    @Override // e30.f
    public boolean b() {
        return true;
    }

    @Override // e30.f
    public int c(String name) {
        kotlin.jvm.internal.s.g(name, "name");
        return this.f27625a.c(name);
    }

    @Override // e30.f
    public int d() {
        return this.f27625a.d();
    }

    @Override // e30.f
    public String e(int i11) {
        return this.f27625a.e(i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1) && kotlin.jvm.internal.s.c(this.f27625a, ((p1) obj).f27625a);
    }

    @Override // e30.f
    public List<Annotation> f(int i11) {
        return this.f27625a.f(i11);
    }

    @Override // e30.f
    public e30.f g(int i11) {
        return this.f27625a.g(i11);
    }

    @Override // e30.f
    public List<Annotation> getAnnotations() {
        return this.f27625a.getAnnotations();
    }

    @Override // e30.f
    public e30.j getKind() {
        return this.f27625a.getKind();
    }

    @Override // e30.f
    public String h() {
        return this.f27626b;
    }

    public int hashCode() {
        return this.f27625a.hashCode() * 31;
    }

    @Override // e30.f
    public boolean i(int i11) {
        return this.f27625a.i(i11);
    }

    @Override // e30.f
    public boolean isInline() {
        return this.f27625a.isInline();
    }

    public final e30.f j() {
        return this.f27625a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27625a);
        sb2.append('?');
        return sb2.toString();
    }
}