package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class g0 {

    /* renamed from: a  reason: collision with root package name */
    private static final g0 f16268a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final g0 f16269b = new c();

    /* loaded from: classes3.dex */
    private static final class b extends g0 {

        /* renamed from: c  reason: collision with root package name */
        private static final Class<?> f16270c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j11) {
            return (List) p1.A(obj, j11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static <L> List<L> g(Object obj, long j11, int i11) {
            e0 e0Var;
            List<L> arrayList;
            List<L> f11 = f(obj, j11);
            if (f11.isEmpty()) {
                if (f11 instanceof f0) {
                    arrayList = new e0(i11);
                } else if ((f11 instanceof z0) && (f11 instanceof a0.i)) {
                    arrayList = ((a0.i) f11).mutableCopyWithCapacity(i11);
                } else {
                    arrayList = new ArrayList<>(i11);
                }
                p1.O(obj, j11, arrayList);
                return arrayList;
            }
            if (f16270c.isAssignableFrom(f11.getClass())) {
                ArrayList arrayList2 = new ArrayList(f11.size() + i11);
                arrayList2.addAll(f11);
                p1.O(obj, j11, arrayList2);
                e0Var = arrayList2;
            } else if (f11 instanceof o1) {
                e0 e0Var2 = new e0(f11.size() + i11);
                e0Var2.addAll((o1) f11);
                p1.O(obj, j11, e0Var2);
                e0Var = e0Var2;
            } else if ((f11 instanceof z0) && (f11 instanceof a0.i)) {
                a0.i iVar = (a0.i) f11;
                if (iVar.isModifiable()) {
                    return f11;
                }
                a0.i mutableCopyWithCapacity = iVar.mutableCopyWithCapacity(f11.size() + i11);
                p1.O(obj, j11, mutableCopyWithCapacity);
                return mutableCopyWithCapacity;
            } else {
                return f11;
            }
            return e0Var;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g0
        void c(Object obj, long j11) {
            Object unmodifiableList;
            List list = (List) p1.A(obj, j11);
            if (list instanceof f0) {
                unmodifiableList = ((f0) list).getUnmodifiableView();
            } else if (f16270c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof z0) && (list instanceof a0.i)) {
                    a0.i iVar = (a0.i) list;
                    if (iVar.isModifiable()) {
                        iVar.makeImmutable();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            p1.O(obj, j11, unmodifiableList);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g0
        <E> void d(Object obj, Object obj2, long j11) {
            List f11 = f(obj2, j11);
            List g11 = g(obj, j11, f11.size());
            int size = g11.size();
            int size2 = f11.size();
            if (size > 0 && size2 > 0) {
                g11.addAll(f11);
            }
            if (size > 0) {
                f11 = g11;
            }
            p1.O(obj, j11, f11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g0
        <L> List<L> e(Object obj, long j11) {
            return g(obj, j11, 10);
        }
    }

    /* loaded from: classes3.dex */
    private static final class c extends g0 {
        private c() {
            super();
        }

        static <E> a0.i<E> f(Object obj, long j11) {
            return (a0.i) p1.A(obj, j11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g0
        void c(Object obj, long j11) {
            f(obj, j11).makeImmutable();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
        @Override // com.google.crypto.tink.shaded.protobuf.g0
        <E> void d(Object obj, Object obj2, long j11) {
            a0.i<E> f11 = f(obj, j11);
            a0.i<E> f12 = f(obj2, j11);
            int size = f11.size();
            int size2 = f12.size();
            a0.i<E> iVar = f11;
            iVar = f11;
            if (size > 0 && size2 > 0) {
                boolean isModifiable = f11.isModifiable();
                a0.i<E> iVar2 = f11;
                if (!isModifiable) {
                    iVar2 = f11.mutableCopyWithCapacity(size2 + size);
                }
                iVar2.addAll(f12);
                iVar = iVar2;
            }
            if (size > 0) {
                f12 = iVar;
            }
            p1.O(obj, j11, f12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g0
        <L> List<L> e(Object obj, long j11) {
            a0.i f11 = f(obj, j11);
            if (f11.isModifiable()) {
                return f11;
            }
            int size = f11.size();
            a0.i mutableCopyWithCapacity = f11.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            p1.O(obj, j11, mutableCopyWithCapacity);
            return mutableCopyWithCapacity;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g0 a() {
        return f16268a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g0 b() {
        return f16269b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c(Object obj, long j11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void d(Object obj, Object obj2, long j11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> e(Object obj, long j11);

    private g0() {
    }
}