package androidx.work;

import android.os.Build;
import androidx.work.c0;

/* loaded from: classes.dex */
public final class s extends c0 {

    /* loaded from: classes.dex */
    public static final class a extends c0.a<a, s> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f6535c.f34408d = OverwritingInputMerger.class.getName();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.c0.a
        /* renamed from: i */
        public s c() {
            if (this.f6533a && Build.VERSION.SDK_INT >= 23 && this.f6535c.f34414j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new s(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.c0.a
        /* renamed from: j */
        public a d() {
            return this;
        }
    }

    s(a aVar) {
        super(aVar.f6534b, aVar.f6535c, aVar.f6536d);
    }

    public static s e(Class<? extends ListenableWorker> cls) {
        return new a(cls).b();
    }
}