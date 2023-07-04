package hr;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f29420a = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(char c11) {
            boolean c12;
            if (!Character.isLetterOrDigit(c11)) {
                c12 = kotlin.text.b.c(c11);
                if (!c12 && c11 != '-') {
                    return false;
                }
            }
            return true;
        }

        public final boolean b(char c11) {
            boolean c12;
            if (!Character.isDigit(c11)) {
                c12 = kotlin.text.b.c(c11);
                if (!c12 && c11 != '-') {
                    return false;
                }
            }
            return true;
        }
    }
}