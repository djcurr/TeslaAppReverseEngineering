package io.realm.internal;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import io.realm.l0;
import io.realm.z;

/* loaded from: classes5.dex */
public interface m extends l0 {

    /* loaded from: classes5.dex */
    public static class a<E extends l0> {
        @SuppressFBWarnings({"URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD"})

        /* renamed from: a  reason: collision with root package name */
        public int f31949a;

        /* renamed from: b  reason: collision with root package name */
        public final E f31950b;

        public a(int i11, E e11) {
            this.f31949a = i11;
            this.f31950b = e11;
        }
    }

    z d();

    void f();
}