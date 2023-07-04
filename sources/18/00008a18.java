package na;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import ch.qos.logback.core.joran.action.Action;
import java.io.InputStream;
import na.n;

/* loaded from: classes.dex */
public class a<Data> implements n<Uri, Data> {

    /* renamed from: c  reason: collision with root package name */
    private static final int f40688c = 22;

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f40689a;

    /* renamed from: b  reason: collision with root package name */
    private final InterfaceC0798a<Data> f40690b;

    /* renamed from: na.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0798a<Data> {
        com.bumptech.glide.load.data.d<Data> b(AssetManager assetManager, String str);
    }

    /* loaded from: classes.dex */
    public static class b implements o<Uri, ParcelFileDescriptor>, InterfaceC0798a<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final AssetManager f40691a;

        public b(AssetManager assetManager) {
            this.f40691a = assetManager;
        }

        @Override // na.o
        public void a() {
        }

        @Override // na.a.InterfaceC0798a
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> b(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // na.o
        public n<Uri, ParcelFileDescriptor> c(r rVar) {
            return new a(this.f40691a, this);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements o<Uri, InputStream>, InterfaceC0798a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final AssetManager f40692a;

        public c(AssetManager assetManager) {
            this.f40692a = assetManager;
        }

        @Override // na.o
        public void a() {
        }

        @Override // na.a.InterfaceC0798a
        public com.bumptech.glide.load.data.d<InputStream> b(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // na.o
        public n<Uri, InputStream> c(r rVar) {
            return new a(this.f40692a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0798a<Data> interfaceC0798a) {
        this.f40689a = assetManager;
        this.f40690b = interfaceC0798a;
    }

    @Override // na.n
    /* renamed from: c */
    public n.a<Data> b(Uri uri, int i11, int i12, ha.e eVar) {
        return new n.a<>(new ab.d(uri), this.f40690b.b(this.f40689a, uri.toString().substring(f40688c)));
    }

    @Override // na.n
    /* renamed from: d */
    public boolean a(Uri uri) {
        return Action.FILE_ATTRIBUTE.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}