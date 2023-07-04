package gd;

import android.net.Uri;
import md.k;

/* loaded from: classes.dex */
public class i implements d {

    /* renamed from: a  reason: collision with root package name */
    final String f27906a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f27907b;

    public i(String str) {
        this(str, false);
    }

    @Override // gd.d
    public String a() {
        return this.f27906a;
    }

    @Override // gd.d
    public boolean b(Uri uri) {
        return this.f27906a.contains(uri.toString());
    }

    @Override // gd.d
    public boolean c() {
        return this.f27907b;
    }

    @Override // gd.d
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f27906a.equals(((i) obj).f27906a);
        }
        return false;
    }

    @Override // gd.d
    public int hashCode() {
        return this.f27906a.hashCode();
    }

    public String toString() {
        return this.f27906a;
    }

    public i(String str, boolean z11) {
        this.f27906a = (String) k.g(str);
        this.f27907b = z11;
    }
}