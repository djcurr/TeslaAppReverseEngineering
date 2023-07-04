package z2;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: b  reason: collision with root package name */
    private int f60090b;

    /* renamed from: a  reason: collision with root package name */
    private final List<h00.l<y, vz.b0>> f60089a = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final int f60091c = 1000;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f60092a;

        public a(Object id2) {
            kotlin.jvm.internal.s.g(id2, "id");
            this.f60092a = id2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.s.c(this.f60092a, ((a) obj).f60092a);
        }

        public int hashCode() {
            return this.f60092a.hashCode();
        }

        public String toString() {
            return "BaselineAnchor(id=" + this.f60092a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Object f60093a;

        /* renamed from: b  reason: collision with root package name */
        private final int f60094b;

        public b(Object id2, int i11) {
            kotlin.jvm.internal.s.g(id2, "id");
            this.f60093a = id2;
            this.f60094b = i11;
        }

        public final Object a() {
            return this.f60093a;
        }

        public final int b() {
            return this.f60094b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return kotlin.jvm.internal.s.c(this.f60093a, bVar.f60093a) && this.f60094b == bVar.f60094b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f60093a.hashCode() * 31) + Integer.hashCode(this.f60094b);
        }

        public String toString() {
            return "HorizontalAnchor(id=" + this.f60093a + ", index=" + this.f60094b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Object f60095a;

        /* renamed from: b  reason: collision with root package name */
        private final int f60096b;

        public c(Object id2, int i11) {
            kotlin.jvm.internal.s.g(id2, "id");
            this.f60095a = id2;
            this.f60096b = i11;
        }

        public final Object a() {
            return this.f60095a;
        }

        public final int b() {
            return this.f60096b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return kotlin.jvm.internal.s.c(this.f60095a, cVar.f60095a) && this.f60096b == cVar.f60096b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f60095a.hashCode() * 31) + Integer.hashCode(this.f60096b);
        }

        public String toString() {
            return "VerticalAnchor(id=" + this.f60095a + ", index=" + this.f60096b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public final void a(y state) {
        kotlin.jvm.internal.s.g(state, "state");
        Iterator<T> it2 = this.f60089a.iterator();
        while (it2.hasNext()) {
            ((h00.l) it2.next()).invoke(state);
        }
    }

    public final int b() {
        return this.f60090b;
    }

    public void c() {
        this.f60089a.clear();
        this.f60090b = 0;
    }
}