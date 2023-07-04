package lj;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class d implements ej.a<d> {

    /* renamed from: a  reason: collision with root package name */
    public final String f37205a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f37206b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f37207c;

    /* JADX INFO: Access modifiers changed from: protected */
    public d(String str, List<String> list, boolean z11) {
        this.f37205a = str;
        this.f37206b = Collections.unmodifiableList(list);
        this.f37207c = z11;
    }
}