package d10;

import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public interface c {

    /* loaded from: classes5.dex */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f23289a = new a();

        private a() {
        }

        @Override // d10.c
        public boolean a() {
            return false;
        }

        @Override // d10.c
        public void b(String filePath, e position, String scopeFqName, f scopeKind, String name) {
            s.g(filePath, "filePath");
            s.g(position, "position");
            s.g(scopeFqName, "scopeFqName");
            s.g(scopeKind, "scopeKind");
            s.g(name, "name");
        }
    }

    boolean a();

    void b(String str, e eVar, String str2, f fVar, String str3);
}