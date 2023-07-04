package hs;

import android.content.Context;
import kotlin.jvm.internal.s;
import zu.g;

/* loaded from: classes6.dex */
public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Context f29421a;

    public a(Context context) {
        s.g(context, "context");
        this.f29421a = context;
    }

    @Override // zu.g
    public boolean a() {
        return !cs.a.Companion.a().a(this.f29421a);
    }
}