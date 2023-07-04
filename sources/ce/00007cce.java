package k2;

import android.content.res.Configuration;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<C0635b, WeakReference<a>> f34210a = new HashMap<>();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final x1.c f34211a;

        /* renamed from: b  reason: collision with root package name */
        private final int f34212b;

        public a(x1.c imageVector, int i11) {
            s.g(imageVector, "imageVector");
            this.f34211a = imageVector;
            this.f34212b = i11;
        }

        public final int a() {
            return this.f34212b;
        }

        public final x1.c b() {
            return this.f34211a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return s.c(this.f34211a, aVar.f34211a) && this.f34212b == aVar.f34212b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f34211a.hashCode() * 31) + Integer.hashCode(this.f34212b);
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.f34211a + ", configFlags=" + this.f34212b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* renamed from: k2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0635b {

        /* renamed from: a  reason: collision with root package name */
        private final Resources.Theme f34213a;

        /* renamed from: b  reason: collision with root package name */
        private final int f34214b;

        public C0635b(Resources.Theme theme, int i11) {
            s.g(theme, "theme");
            this.f34213a = theme;
            this.f34214b = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0635b) {
                C0635b c0635b = (C0635b) obj;
                return s.c(this.f34213a, c0635b.f34213a) && this.f34214b == c0635b.f34214b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f34213a.hashCode() * 31) + Integer.hashCode(this.f34214b);
        }

        public String toString() {
            return "Key(theme=" + this.f34213a + ", id=" + this.f34214b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public final void a() {
        this.f34210a.clear();
    }

    public final a b(C0635b key) {
        s.g(key, "key");
        WeakReference<a> weakReference = this.f34210a.get(key);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final void c(int i11) {
        Iterator<Map.Entry<C0635b, WeakReference<a>>> it2 = this.f34210a.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<C0635b, WeakReference<a>> next = it2.next();
            s.f(next, "it.next()");
            a aVar = next.getValue().get();
            if (aVar == null || Configuration.needNewResources(i11, aVar.a())) {
                it2.remove();
            }
        }
    }

    public final void d(C0635b key, a imageVectorEntry) {
        s.g(key, "key");
        s.g(imageVectorEntry, "imageVectorEntry");
        this.f34210a.put(key, new WeakReference<>(imageVectorEntry));
    }
}