package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public enum f {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;
    
    public static final a Companion = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(boolean z11, boolean z12, boolean z13) {
            if (z11) {
                return f.SEALED;
            }
            if (z12) {
                return f.ABSTRACT;
            }
            if (z13) {
                return f.OPEN;
            }
            return f.FINAL;
        }
    }
}