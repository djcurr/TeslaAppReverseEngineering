package kj;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<Uri, byte[]> f34686a;

    /* loaded from: classes3.dex */
    class a extends LinkedHashMap<Uri, byte[]> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f34687a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e eVar, int i11, float f11, boolean z11, int i12) {
            super(i11, f11, z11);
            this.f34687a = i12;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > this.f34687a;
        }
    }

    public e(int i11) {
        this.f34686a = new a(this, i11 + 1, 1.0f, false, i11);
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.f34686a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        return this.f34686a.put((Uri) ak.a.e(uri), (byte[]) ak.a.e(bArr));
    }

    public byte[] c(Uri uri) {
        return this.f34686a.remove(ak.a.e(uri));
    }
}