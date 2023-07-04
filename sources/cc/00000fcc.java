package c8;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public class i implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f8952a;

    /* renamed from: b  reason: collision with root package name */
    private final a f8953b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f8954c;

    /* loaded from: classes.dex */
    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a forId(int i11) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                return MERGE;
                            }
                            return EXCLUDE_INTERSECTIONS;
                        }
                        return INTERSECT;
                    }
                    return SUBTRACT;
                }
                return ADD;
            }
            return MERGE;
        }
    }

    public i(String str, a aVar, boolean z11) {
        this.f8952a = str;
        this.f8953b = aVar;
        this.f8954c = z11;
    }

    @Override // c8.c
    public x7.c a(com.airbnb.lottie.a aVar, d8.b bVar) {
        if (!aVar.o()) {
            h8.d.c("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new x7.l(this);
    }

    public a b() {
        return this.f8953b;
    }

    public String c() {
        return this.f8952a;
    }

    public boolean d() {
        return this.f8954c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f8953b + CoreConstants.CURLY_RIGHT;
    }
}