package gd;

import android.net.Uri;
import java.util.List;
import md.k;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    final List<d> f27903a;

    public f(List<d> list) {
        this.f27903a = (List) k.g(list);
    }

    @Override // gd.d
    public String a() {
        return this.f27903a.get(0).a();
    }

    @Override // gd.d
    public boolean b(Uri uri) {
        for (int i11 = 0; i11 < this.f27903a.size(); i11++) {
            if (this.f27903a.get(i11).b(uri)) {
                return true;
            }
        }
        return false;
    }

    @Override // gd.d
    public boolean c() {
        return false;
    }

    public List<d> d() {
        return this.f27903a;
    }

    @Override // gd.d
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return this.f27903a.equals(((f) obj).f27903a);
        }
        return false;
    }

    @Override // gd.d
    public int hashCode() {
        return this.f27903a.hashCode();
    }

    public String toString() {
        return "MultiCacheKey:" + this.f27903a.toString();
    }
}