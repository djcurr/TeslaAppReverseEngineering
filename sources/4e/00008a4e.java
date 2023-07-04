package na;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;
import na.n;

/* loaded from: classes.dex */
public class s<Data> implements n<Integer, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final n<Uri, Data> f40758a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f40759b;

    /* loaded from: classes.dex */
    public static final class a implements o<Integer, AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f40760a;

        public a(Resources resources) {
            this.f40760a = resources;
        }

        @Override // na.o
        public void a() {
        }

        @Override // na.o
        public n<Integer, AssetFileDescriptor> c(r rVar) {
            return new s(this.f40760a, rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class b implements o<Integer, ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f40761a;

        public b(Resources resources) {
            this.f40761a = resources;
        }

        @Override // na.o
        public void a() {
        }

        @Override // na.o
        public n<Integer, ParcelFileDescriptor> c(r rVar) {
            return new s(this.f40761a, rVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class c implements o<Integer, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f40762a;

        public c(Resources resources) {
            this.f40762a = resources;
        }

        @Override // na.o
        public void a() {
        }

        @Override // na.o
        public n<Integer, InputStream> c(r rVar) {
            return new s(this.f40762a, rVar.d(Uri.class, InputStream.class));
        }
    }

    /* loaded from: classes.dex */
    public static class d implements o<Integer, Uri> {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f40763a;

        public d(Resources resources) {
            this.f40763a = resources;
        }

        @Override // na.o
        public void a() {
        }

        @Override // na.o
        public n<Integer, Uri> c(r rVar) {
            return new s(this.f40763a, v.c());
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.f40759b = resources;
        this.f40758a = nVar;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f40759b.getResourcePackageName(num.intValue()) + '/' + this.f40759b.getResourceTypeName(num.intValue()) + '/' + this.f40759b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e11) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e11);
                return null;
            }
            return null;
        }
    }

    @Override // na.n
    /* renamed from: c */
    public n.a<Data> b(Integer num, int i11, int i12, ha.e eVar) {
        Uri d11 = d(num);
        if (d11 == null) {
            return null;
        }
        return this.f40758a.b(d11, i11, i12, eVar);
    }

    @Override // na.n
    /* renamed from: e */
    public boolean a(Integer num) {
        return true;
    }
}