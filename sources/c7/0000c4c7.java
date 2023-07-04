package zc;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<c> f60406a;

    /* renamed from: b  reason: collision with root package name */
    private final String f60407b;

    public k() {
        this("");
    }

    public void a(c cVar) {
        this.f60406a.add(cVar);
    }

    public Iterable<c> b() {
        return this.f60406a;
    }

    public String c() {
        return this.f60407b;
    }

    public int d() {
        return this.f60406a.size();
    }

    public k(String str) {
        this.f60406a = new ArrayList<>();
        this.f60407b = str;
    }
}