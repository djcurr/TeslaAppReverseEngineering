package net.time4j.engine;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.time4j.engine.a;
import net.time4j.engine.v;

/* loaded from: classes5.dex */
public abstract class b<U extends v, P extends a<U>> implements h0<U, P>, Comparator<U> {

    /* renamed from: a  reason: collision with root package name */
    private final List<U> f40946a;

    /* JADX INFO: Access modifiers changed from: protected */
    public b(boolean z11, U... uArr) {
        this(Arrays.asList(uArr), z11);
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(U u11, U u12) {
        return Double.compare(u12.getLength(), u11.getLength());
    }

    private b(List<U> list, boolean z11) {
        if (!list.isEmpty()) {
            Collections.sort(list, this);
            int i11 = 0;
            int size = list.size();
            while (i11 < size) {
                U u11 = list.get(i11);
                i11++;
                for (int i12 = i11; i12 < size; i12++) {
                    if (u11.equals(list.get(i12))) {
                        throw new IllegalArgumentException("Duplicate unit: " + u11);
                    }
                }
            }
            this.f40946a = Collections.unmodifiableList(list);
            return;
        }
        throw new IllegalArgumentException("Missing units.");
    }
}