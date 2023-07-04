package androidx.work;

/* loaded from: classes.dex */
public abstract class m {

    /* loaded from: classes.dex */
    class a extends m {
        a() {
        }

        @Override // androidx.work.m
        public l a(String str) {
            return null;
        }
    }

    public static m c() {
        return new a();
    }

    public abstract l a(String str);

    public final l b(String str) {
        l a11 = a(str);
        return a11 == null ? l.a(str) : a11;
    }
}