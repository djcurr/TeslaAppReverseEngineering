package h10;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import t00.k;
import u20.p;
import wz.e0;

/* loaded from: classes5.dex */
public final class e implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.g {

    /* renamed from: a  reason: collision with root package name */
    private final h f28573a;

    /* renamed from: b  reason: collision with root package name */
    private final l10.d f28574b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f28575c;

    /* renamed from: d  reason: collision with root package name */
    private final j20.h<l10.a, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f28576d;

    /* loaded from: classes5.dex */
    static final class a extends u implements h00.l<l10.a, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> {
        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c invoke(l10.a annotation) {
            s.g(annotation, "annotation");
            return f10.c.f25521a.e(annotation, e.this.f28573a, e.this.f28575c);
        }
    }

    public e(h c11, l10.d annotationOwner, boolean z11) {
        s.g(c11, "c");
        s.g(annotationOwner, "annotationOwner");
        this.f28573a = c11;
        this.f28574b = annotationOwner;
        this.f28575c = z11;
        this.f28576d = c11.a().u().h(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean b1(u10.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        return this.f28574b.getAnnotations().isEmpty() && !this.f28574b.C();
    }

    @Override // java.lang.Iterable
    public Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterator() {
        u20.h S;
        u20.h B;
        u20.h F;
        u20.h s11;
        S = e0.S(this.f28574b.getAnnotations());
        B = p.B(S, this.f28576d);
        F = p.F(B, f10.c.f25521a.a(k.a.f51344n, this.f28574b, this.f28573a));
        s11 = p.s(F);
        return s11.iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c l(u10.c fqName) {
        s.g(fqName, "fqName");
        l10.a l11 = this.f28574b.l(fqName);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c invoke = l11 == null ? null : this.f28576d.invoke(l11);
        return invoke == null ? f10.c.f25521a.a(fqName, this.f28574b, this.f28573a) : invoke;
    }

    public /* synthetic */ e(h hVar, l10.d dVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, dVar, (i11 & 4) != 0 ? false : z11);
    }
}