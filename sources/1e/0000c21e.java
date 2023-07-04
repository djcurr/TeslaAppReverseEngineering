package y7;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final List<a<c8.m, Path>> f59281a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a<Integer, Integer>> f59282b;

    /* renamed from: c  reason: collision with root package name */
    private final List<c8.h> f59283c;

    public h(List<c8.h> list) {
        this.f59283c = list;
        this.f59281a = new ArrayList(list.size());
        this.f59282b = new ArrayList(list.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f59281a.add(list.get(i11).b().l());
            this.f59282b.add(list.get(i11).c().l());
        }
    }

    public List<a<c8.m, Path>> a() {
        return this.f59281a;
    }

    public List<c8.h> b() {
        return this.f59283c;
    }

    public List<a<Integer, Integer>> c() {
        return this.f59282b;
    }
}