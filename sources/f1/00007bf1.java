package jj;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f33833a;

    /* renamed from: b  reason: collision with root package name */
    public final long f33834b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f33835c;

    /* renamed from: d  reason: collision with root package name */
    public final List<e> f33836d;

    public f(String str, long j11, List<a> list, List<e> list2) {
        this(str, j11, list, list2, null);
    }

    public int a(int i11) {
        int size = this.f33835c.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (this.f33835c.get(i12).f33796b == i11) {
                return i12;
            }
        }
        return -1;
    }

    public f(String str, long j11, List<a> list, List<e> list2, d dVar) {
        this.f33833a = str;
        this.f33834b = j11;
        this.f33835c = Collections.unmodifiableList(list);
        this.f33836d = Collections.unmodifiableList(list2);
    }
}