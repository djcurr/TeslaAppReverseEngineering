package t3;

import java.util.Locale;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final t3.e f51615a = new e(null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final t3.e f51616b = new e(null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final t3.e f51617c;

    /* renamed from: d  reason: collision with root package name */
    public static final t3.e f51618d;

    /* loaded from: classes.dex */
    private static class a implements c {

        /* renamed from: b  reason: collision with root package name */
        static final a f51619b = new a(true);

        /* renamed from: a  reason: collision with root package name */
        private final boolean f51620a;

        private a(boolean z11) {
            this.f51620a = z11;
        }

        @Override // t3.f.c
        public int a(CharSequence charSequence, int i11, int i12) {
            int i13 = i12 + i11;
            boolean z11 = false;
            while (i11 < i13) {
                int a11 = f.a(Character.getDirectionality(charSequence.charAt(i11)));
                if (a11 != 0) {
                    if (a11 != 1) {
                        continue;
                        i11++;
                        z11 = z11;
                    } else if (!this.f51620a) {
                        return 1;
                    }
                } else if (this.f51620a) {
                    return 0;
                }
                z11 = true;
                i11++;
                z11 = z11;
            }
            if (z11) {
                return this.f51620a ? 1 : 0;
            }
            return 2;
        }
    }

    /* loaded from: classes.dex */
    private static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        static final b f51621a = new b();

        private b() {
        }

        @Override // t3.f.c
        public int a(CharSequence charSequence, int i11, int i12) {
            int i13 = i12 + i11;
            int i14 = 2;
            while (i11 < i13 && i14 == 2) {
                i14 = f.b(Character.getDirectionality(charSequence.charAt(i11)));
                i11++;
            }
            return i14;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        int a(CharSequence charSequence, int i11, int i12);
    }

    /* loaded from: classes.dex */
    private static abstract class d implements t3.e {

        /* renamed from: a  reason: collision with root package name */
        private final c f51622a;

        d(c cVar) {
            this.f51622a = cVar;
        }

        private boolean c(CharSequence charSequence, int i11, int i12) {
            int a11 = this.f51622a.a(charSequence, i11, i12);
            if (a11 != 0) {
                if (a11 != 1) {
                    return b();
                }
                return false;
            }
            return true;
        }

        @Override // t3.e
        public boolean a(CharSequence charSequence, int i11, int i12) {
            if (charSequence != null && i11 >= 0 && i12 >= 0 && charSequence.length() - i12 >= i11) {
                if (this.f51622a == null) {
                    return b();
                }
                return c(charSequence, i11, i12);
            }
            throw new IllegalArgumentException();
        }

        protected abstract boolean b();
    }

    /* loaded from: classes.dex */
    private static class e extends d {

        /* renamed from: b  reason: collision with root package name */
        private final boolean f51623b;

        e(c cVar, boolean z11) {
            super(cVar);
            this.f51623b = z11;
        }

        @Override // t3.f.d
        protected boolean b() {
            return this.f51623b;
        }
    }

    /* renamed from: t3.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C1144f extends d {

        /* renamed from: b  reason: collision with root package name */
        static final C1144f f51624b = new C1144f();

        C1144f() {
            super(null);
        }

        @Override // t3.f.d
        protected boolean b() {
            return g.b(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f51621a;
        f51617c = new e(bVar, false);
        f51618d = new e(bVar, true);
        new e(a.f51619b, false);
        C1144f c1144f = C1144f.f51624b;
    }

    static int a(int i11) {
        if (i11 != 0) {
            return (i11 == 1 || i11 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i11) {
        if (i11 != 0) {
            if (i11 == 1 || i11 == 2) {
                return 0;
            }
            switch (i11) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}