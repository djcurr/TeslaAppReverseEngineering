package io.sentry;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class p3<T> {

    /* renamed from: a  reason: collision with root package name */
    private final List<T> f32374a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p3(List<T> list) {
        this.f32374a = new ArrayList(list == null ? new ArrayList<>(0) : list);
    }

    public List<T> a() {
        return this.f32374a;
    }
}