package io.grpc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes5.dex */
public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    private final String f30553a;

    /* renamed from: b  reason: collision with root package name */
    private final Collection<s0<?, ?>> f30554b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f30555c;

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private String f30556a;

        /* renamed from: b  reason: collision with root package name */
        private List<s0<?, ?>> f30557b;

        /* renamed from: c  reason: collision with root package name */
        private Object f30558c;

        /* JADX INFO: Access modifiers changed from: private */
        public b e(Collection<s0<?, ?>> collection) {
            this.f30557b.addAll(collection);
            return this;
        }

        public b f(s0<?, ?> s0Var) {
            this.f30557b.add((s0) com.google.common.base.u.p(s0Var, "method"));
            return this;
        }

        public d1 g() {
            return new d1(this);
        }

        public b h(String str) {
            this.f30556a = (String) com.google.common.base.u.p(str, "name");
            return this;
        }

        public b i(Object obj) {
            this.f30558c = obj;
            return this;
        }

        private b(String str) {
            this.f30557b = new ArrayList();
            h(str);
        }
    }

    public static b c(String str) {
        return new b(str);
    }

    static void d(String str, Collection<s0<?, ?>> collection) {
        HashSet hashSet = new HashSet(collection.size());
        for (s0<?, ?> s0Var : collection) {
            com.google.common.base.u.p(s0Var, "method");
            String d11 = s0Var.d();
            com.google.common.base.u.l(str.equals(d11), "service names %s != %s", d11, str);
            com.google.common.base.u.k(hashSet.add(s0Var.c()), "duplicate name %s", s0Var.c());
        }
    }

    public Collection<s0<?, ?>> a() {
        return this.f30554b;
    }

    public String b() {
        return this.f30553a;
    }

    public String toString() {
        return com.google.common.base.o.c(this).d("name", this.f30553a).d("schemaDescriptor", this.f30555c).d("methods", this.f30554b).m().toString();
    }

    public d1(String str, Collection<s0<?, ?>> collection) {
        this(c(str).e((Collection) com.google.common.base.u.p(collection, "methods")));
    }

    private d1(b bVar) {
        String str = bVar.f30556a;
        this.f30553a = str;
        d(str, bVar.f30557b);
        this.f30554b = Collections.unmodifiableList(new ArrayList(bVar.f30557b));
        this.f30555c = bVar.f30558c;
    }
}