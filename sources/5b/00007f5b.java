package kotlin.text;

import java.util.List;

/* loaded from: classes5.dex */
public interface g {

    /* loaded from: classes5.dex */
    public static final class a {
        public static b a(g gVar) {
            return new b(gVar);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final g f35202a;

        public b(g match) {
            kotlin.jvm.internal.s.g(match, "match");
            this.f35202a = match;
        }

        public final g a() {
            return this.f35202a;
        }
    }

    b a();

    List<String> b();

    m00.i c();

    String getValue();

    g next();
}