package ra;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import ha.f;
import java.util.List;

/* loaded from: classes.dex */
public class d implements f<Uri, Drawable> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f49331a;

    public d(Context context) {
        this.f49331a = context.getApplicationContext();
    }

    private Context d(Uri uri, String str) {
        if (str.equals(this.f49331a.getPackageName())) {
            return this.f49331a;
        }
        try {
            return this.f49331a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e11) {
            if (str.contains(this.f49331a.getPackageName())) {
                return this.f49331a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e11);
        }
    }

    private int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e11) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e11);
        }
    }

    private int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    private int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // ha.f
    /* renamed from: c */
    public ja.c<Drawable> b(Uri uri, int i11, int i12, ha.e eVar) {
        Context d11 = d(uri, uri.getAuthority());
        return c.d(a.b(this.f49331a, d11, g(d11, uri)));
    }

    @Override // ha.f
    /* renamed from: h */
    public boolean a(Uri uri, ha.e eVar) {
        return uri.getScheme().equals("android.resource");
    }
}