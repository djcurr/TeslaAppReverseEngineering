package androidx.camera.core;

import androidx.camera.core.impl.c0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements androidx.camera.core.impl.z {

        /* renamed from: a  reason: collision with root package name */
        final List<androidx.camera.core.impl.c0> f2445a;

        a(List<androidx.camera.core.impl.c0> list) {
            if (list != null && !list.isEmpty()) {
                this.f2445a = Collections.unmodifiableList(new ArrayList(list));
                return;
            }
            throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
        }

        @Override // androidx.camera.core.impl.z
        public List<androidx.camera.core.impl.c0> a() {
            return this.f2445a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static androidx.camera.core.impl.z a(List<androidx.camera.core.impl.c0> list) {
        return new a(list);
    }

    static androidx.camera.core.impl.z b(androidx.camera.core.impl.c0... c0VarArr) {
        return new a(Arrays.asList(c0VarArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static androidx.camera.core.impl.z c() {
        return b(new c0.a());
    }
}