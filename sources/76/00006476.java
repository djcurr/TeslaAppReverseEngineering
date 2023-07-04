package cw;

import android.net.Uri;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.activity.result.d<Uri> f23149a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.activity.result.d<String[]> f23150b;

    public a(androidx.activity.result.d<Uri> pictureLaunchResultLauncher, androidx.activity.result.d<String[]> openDocumentResultLauncher) {
        s.g(pictureLaunchResultLauncher, "pictureLaunchResultLauncher");
        s.g(openDocumentResultLauncher, "openDocumentResultLauncher");
        this.f23149a = pictureLaunchResultLauncher;
        this.f23150b = openDocumentResultLauncher;
    }

    public final androidx.activity.result.d<String[]> a() {
        return this.f23150b;
    }

    public final androidx.activity.result.d<Uri> b() {
        return this.f23149a;
    }
}