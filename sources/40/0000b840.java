package v;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f53752a;

    /* renamed from: v.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C1207a implements b {

        /* renamed from: a  reason: collision with root package name */
        private final InputConfiguration f53753a;

        C1207a(Object obj) {
            this.f53753a = (InputConfiguration) obj;
        }

        @Override // v.a.b
        public Object b() {
            return this.f53753a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return Objects.equals(this.f53753a, ((b) obj).b());
            }
            return false;
        }

        public int hashCode() {
            return this.f53753a.hashCode();
        }

        public String toString() {
            return this.f53753a.toString();
        }
    }

    /* loaded from: classes.dex */
    private interface b {
        Object b();
    }

    private a(b bVar) {
        this.f53752a = bVar;
    }

    public static a b(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 23) {
            return new a(new C1207a(obj));
        }
        return null;
    }

    public Object a() {
        return this.f53752a.b();
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f53752a.equals(((a) obj).f53752a);
        }
        return false;
    }

    public int hashCode() {
        return this.f53752a.hashCode();
    }

    public String toString() {
        return this.f53752a.toString();
    }
}