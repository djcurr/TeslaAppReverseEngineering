package androidx.work;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Set<a> f6537a = new HashSet();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f6538a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f6539b;

        a(Uri uri, boolean z11) {
            this.f6538a = uri;
            this.f6539b = z11;
        }

        public Uri a() {
            return this.f6538a;
        }

        public boolean b() {
            return this.f6539b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6539b == aVar.f6539b && this.f6538a.equals(aVar.f6538a);
        }

        public int hashCode() {
            return (this.f6538a.hashCode() * 31) + (this.f6539b ? 1 : 0);
        }
    }

    public void a(Uri uri, boolean z11) {
        this.f6537a.add(new a(uri, z11));
    }

    public Set<a> b() {
        return this.f6537a;
    }

    public int c() {
        return this.f6537a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f6537a.equals(((d) obj).f6537a);
    }

    public int hashCode() {
        return this.f6537a.hashCode();
    }
}