package ep;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f25227a;

    /* renamed from: b  reason: collision with root package name */
    private final int f25228b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f25229c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(List<b> list, int i11, boolean z11) {
        this.f25227a = new ArrayList(list);
        this.f25228b = i11;
        this.f25229c = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<b> a() {
        return this.f25227a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f25228b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(List<b> list) {
        return this.f25227a.equals(list);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f25227a.equals(cVar.a()) && this.f25229c == cVar.f25229c;
        }
        return false;
    }

    public int hashCode() {
        return this.f25227a.hashCode() ^ Boolean.valueOf(this.f25229c).hashCode();
    }

    public String toString() {
        return "{ " + this.f25227a + " }";
    }
}