package ej;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.h;
import ej.a;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes3.dex */
public final class b<T extends a<T>> implements h.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final h.a<? extends T> f25185a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f25186b;

    public b(h.a<? extends T> aVar, List<c> list) {
        this.f25185a = aVar;
        this.f25186b = list;
    }

    @Override // com.google.android.exoplayer2.upstream.h.a
    /* renamed from: b */
    public T a(Uri uri, InputStream inputStream) {
        T a11 = this.f25185a.a(uri, inputStream);
        List<c> list = this.f25186b;
        return (list == null || list.isEmpty()) ? a11 : (T) a11.a(this.f25186b);
    }
}