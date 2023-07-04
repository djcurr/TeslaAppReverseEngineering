package md;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j {

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f38482a;

        /* renamed from: b  reason: collision with root package name */
        private final a f38483b;

        /* renamed from: c  reason: collision with root package name */
        private a f38484c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f38485d;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            String f38486a;

            /* renamed from: b  reason: collision with root package name */
            Object f38487b;

            /* renamed from: c  reason: collision with root package name */
            a f38488c;

            private a() {
            }
        }

        private a d() {
            a aVar = new a();
            this.f38484c.f38488c = aVar;
            this.f38484c = aVar;
            return aVar;
        }

        private b e(String str, Object obj) {
            a d11 = d();
            d11.f38487b = obj;
            d11.f38486a = (String) k.g(str);
            return this;
        }

        public b a(String str, int i11) {
            return e(str, String.valueOf(i11));
        }

        public b b(String str, Object obj) {
            return e(str, obj);
        }

        public b c(String str, boolean z11) {
            return e(str, String.valueOf(z11));
        }

        public String toString() {
            boolean z11 = this.f38485d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f38482a);
            sb2.append(CoreConstants.CURLY_LEFT);
            String str = "";
            for (a aVar = this.f38483b.f38488c; aVar != null; aVar = aVar.f38488c) {
                Object obj = aVar.f38487b;
                if (!z11 || obj != null) {
                    sb2.append(str);
                    String str2 = aVar.f38486a;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    str = ", ";
                }
            }
            sb2.append(CoreConstants.CURLY_RIGHT);
            return sb2.toString();
        }

        private b(String str) {
            a aVar = new a();
            this.f38483b = aVar;
            this.f38484c = aVar;
            this.f38485d = false;
            this.f38482a = (String) k.g(str);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static b c(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}