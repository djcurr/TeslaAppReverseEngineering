package b8;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class n<V, O> implements m<V, O> {

    /* renamed from: a  reason: collision with root package name */
    final List<i8.a<V>> f7558a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(List<i8.a<V>> list) {
        this.f7558a = list;
    }

    @Override // b8.m
    public boolean k() {
        return this.f7558a.isEmpty() || (this.f7558a.size() == 1 && this.f7558a.get(0).h());
    }

    @Override // b8.m
    public List<i8.a<V>> m() {
        return this.f7558a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f7558a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f7558a.toArray()));
        }
        return sb2.toString();
    }
}