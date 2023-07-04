package atd.i;

import android.content.Context;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String f6878a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f6879b;

    public a(String str, Object obj) {
        this.f6878a = str;
        this.f6879b = obj;
    }

    @Override // atd.i.b
    public String a() {
        return this.f6878a;
    }

    @Override // atd.i.b
    public Object a(Context context) {
        return this.f6879b;
    }
}