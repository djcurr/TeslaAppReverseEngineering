package uu;

import com.tesla.messagedecoding.CommandMessageDecoder;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.s;
import ot.m;

/* loaded from: classes6.dex */
public interface f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f53677a = a.f53678a;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f53678a = new a();

        private a() {
        }

        public final f a(vu.a sessionManager, m transport) {
            s.g(sessionManager, "sessionManager");
            s.g(transport, "transport");
            return new i(sessionManager, transport);
        }
    }

    /* loaded from: classes6.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f53679a;

        /* renamed from: b  reason: collision with root package name */
        private final h f53680b;

        public b(String str, h hVar) {
            this.f53679a = str;
            this.f53680b = hVar;
        }

        public final String a() {
            return this.f53679a;
        }

        public final h b() {
            return this.f53680b;
        }

        public final h c() {
            return this.f53680b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return s.c(this.f53679a, bVar.f53679a) && s.c(this.f53680b, bVar.f53680b);
            }
            return false;
        }

        public int hashCode() {
            String str = this.f53679a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            h hVar = this.f53680b;
            return hashCode + (hVar != null ? hVar.hashCode() : 0);
        }

        public String toString() {
            String str = this.f53679a;
            h hVar = this.f53680b;
            return "Request(requestId=" + str + ", request=" + hVar + ")";
        }
    }

    List<uu.a> a(yt.b bVar);

    boolean b(String str);

    b c(qt.c cVar, CommandMessageDecoder.Result result, com.tesla.logging.g gVar);

    b d(yt.f fVar, com.tesla.logging.g gVar);

    h e(String str);

    void f(h hVar);

    Collection<h> g(yt.b bVar, String str);

    h h(String str);

    h i(String str);

    h j(String str, String str2);

    void k(h hVar);
}