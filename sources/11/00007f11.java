package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.e0;
import wz.p;

/* loaded from: classes5.dex */
public enum e {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);
    
    public static final Set<e> ALL;
    public static final Set<e> ALL_EXCEPT_ANNOTATIONS;
    public static final a Companion = new a(null);
    private final boolean includeByDefault;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Set<e> S0;
        Set<e> E0;
        e[] values = values();
        ArrayList arrayList = new ArrayList();
        for (e eVar : values) {
            if (eVar.getIncludeByDefault()) {
                arrayList.add(eVar);
            }
        }
        S0 = e0.S0(arrayList);
        ALL_EXCEPT_ANNOTATIONS = S0;
        E0 = p.E0(values());
        ALL = E0;
    }

    e(boolean z11) {
        this.includeByDefault = z11;
    }

    public final boolean getIncludeByDefault() {
        return this.includeByDefault;
    }
}