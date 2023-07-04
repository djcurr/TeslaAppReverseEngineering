package de;

/* loaded from: classes.dex */
public class c extends pf.a {

    /* renamed from: a  reason: collision with root package name */
    private String f23917a;

    /* renamed from: b  reason: collision with root package name */
    private final b f23918b;

    public c(String str, b bVar) {
        this.f23918b = bVar;
        l(str);
    }

    @Override // pf.a, com.facebook.imagepipeline.producers.s0
    public void h(String str, String str2, boolean z11) {
        b bVar = this.f23918b;
        if (bVar != null) {
            bVar.a(this.f23917a, d.a(str2), z11, str2);
        }
    }

    public void l(String str) {
        this.f23917a = str;
    }
}