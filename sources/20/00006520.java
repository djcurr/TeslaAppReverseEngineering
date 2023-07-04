package d20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k20.d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.p;
import w00.i0;
import wz.e0;
import wz.x;

/* loaded from: classes5.dex */
public final class n extends d20.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f23492c = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private final h f23493b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(String message, Collection<? extends d0> types) {
            int t11;
            s.g(message, "message");
            s.g(types, "types");
            t11 = x.t(types, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (d0 d0Var : types) {
                arrayList.add(d0Var.m());
            }
            s20.e<h> b11 = r20.a.b(arrayList);
            h b12 = d20.b.f23440d.b(message, b11);
            return b11.size() <= 1 ? b12 : new n(message, b12, null);
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends u implements h00.l<kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f23494a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final kotlin.reflect.jvm.internal.impl.descriptors.a invoke(kotlin.reflect.jvm.internal.impl.descriptors.a selectMostSpecificInEachOverridableGroup) {
            s.g(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
            return selectMostSpecificInEachOverridableGroup;
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends u implements h00.l<kotlin.reflect.jvm.internal.impl.descriptors.h, kotlin.reflect.jvm.internal.impl.descriptors.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f23495a = new c();

        c() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final kotlin.reflect.jvm.internal.impl.descriptors.a invoke(kotlin.reflect.jvm.internal.impl.descriptors.h selectMostSpecificInEachOverridableGroup) {
            s.g(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
            return selectMostSpecificInEachOverridableGroup;
        }
    }

    /* loaded from: classes5.dex */
    static final class d extends u implements h00.l<i0, kotlin.reflect.jvm.internal.impl.descriptors.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f23496a = new d();

        d() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final kotlin.reflect.jvm.internal.impl.descriptors.a invoke(i0 selectMostSpecificInEachOverridableGroup) {
            s.g(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
            return selectMostSpecificInEachOverridableGroup;
        }
    }

    private n(String str, h hVar) {
        this.f23493b = hVar;
    }

    public /* synthetic */ n(String str, h hVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, hVar);
    }

    public static final h j(String str, Collection<? extends d0> collection) {
        return f23492c.a(str, collection);
    }

    @Override // d20.a, d20.h
    public Collection<i0> a(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        return w10.l.a(super.a(name, location), d.f23496a);
    }

    @Override // d20.a, d20.h
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> c(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        return w10.l.a(super.c(name, location), c.f23495a);
    }

    @Override // d20.a, d20.k
    public Collection<w00.i> g(d20.d kindFilter, h00.l<? super u10.f, Boolean> nameFilter) {
        List y02;
        s.g(kindFilter, "kindFilter");
        s.g(nameFilter, "nameFilter");
        Collection<w00.i> g11 = super.g(kindFilter, nameFilter);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : g11) {
            if (((w00.i) obj) instanceof kotlin.reflect.jvm.internal.impl.descriptors.a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        p pVar = new p(arrayList, arrayList2);
        y02 = e0.y0(w10.l.a((List) pVar.a(), b.f23494a), (List) pVar.b());
        return y02;
    }

    @Override // d20.a
    protected h i() {
        return this.f23493b;
    }
}