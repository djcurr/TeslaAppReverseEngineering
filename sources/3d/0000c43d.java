package z3;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: i  reason: collision with root package name */
    private int f60170i;

    /* renamed from: j  reason: collision with root package name */
    private int f60171j;

    /* renamed from: k  reason: collision with root package name */
    private LayoutInflater f60172k;

    @Deprecated
    public c(Context context, int i11, Cursor cursor, boolean z11) {
        super(context, cursor, z11);
        this.f60171j = i11;
        this.f60170i = i11;
        this.f60172k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // z3.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f60172k.inflate(this.f60171j, viewGroup, false);
    }

    @Override // z3.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f60172k.inflate(this.f60170i, viewGroup, false);
    }
}