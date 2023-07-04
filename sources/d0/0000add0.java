package qe;

import android.net.Uri;

/* loaded from: classes3.dex */
public class a implements gd.d {

    /* renamed from: a  reason: collision with root package name */
    private final String f48063a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f48064b;

    public a(int i11, boolean z11) {
        this.f48063a = "anim://" + i11;
        this.f48064b = z11;
    }

    @Override // gd.d
    public String a() {
        return this.f48063a;
    }

    @Override // gd.d
    public boolean b(Uri uri) {
        return uri.toString().startsWith(this.f48063a);
    }

    @Override // gd.d
    public boolean c() {
        return false;
    }

    @Override // gd.d
    public boolean equals(Object obj) {
        if (this.f48064b) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            return this.f48063a.equals(((a) obj).f48063a);
        }
        return super.equals(obj);
    }

    @Override // gd.d
    public int hashCode() {
        if (!this.f48064b) {
            return super.hashCode();
        }
        return this.f48063a.hashCode();
    }
}