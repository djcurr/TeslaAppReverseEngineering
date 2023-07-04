package n10;

import java.util.List;

/* loaded from: classes5.dex */
public interface u {

    /* loaded from: classes5.dex */
    public static final class a implements u {

        /* renamed from: a  reason: collision with root package name */
        public static final a f40227a = new a();

        private a() {
        }

        @Override // n10.u
        public List<String> a(String packageFqName) {
            List<String> i11;
            kotlin.jvm.internal.s.g(packageFqName, "packageFqName");
            i11 = wz.w.i();
            return i11;
        }
    }

    List<String> a(String str);
}