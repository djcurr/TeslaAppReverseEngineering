package pr;

import org.slf4j.Marker;

/* loaded from: classes2.dex */
public interface e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f46856a = a.f46857a;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f46857a = new a();

        private a() {
        }

        public final String a(Object value, String name) {
            kotlin.jvm.internal.s.g(value, "value");
            kotlin.jvm.internal.s.g(name, "name");
            e eVar = value instanceof e ? (e) value : null;
            return kotlin.jvm.internal.s.p(eVar == null ? value.getClass().getName() : eVar.a(), name.length() == 0 ? "" : kotlin.jvm.internal.s.p(Marker.ANY_NON_NULL_MARKER, name));
        }
    }

    String a();
}