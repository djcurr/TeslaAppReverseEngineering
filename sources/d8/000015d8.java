package com.dylanvann.fastimage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import na.g;
import na.h;

/* loaded from: classes.dex */
public class FastImageSource extends vg.a {
    private static final String ANDROID_CONTENT_SCHEME = "content";
    private static final String ANDROID_RESOURCE_SCHEME = "android.resource";
    private static final String DATA_SCHEME = "data";
    private static final String LOCAL_FILE_SCHEME = "file";
    private static final String LOCAL_RESOURCE_SCHEME = "res";
    private h mHeaders;
    private Uri mUri;

    public FastImageSource(Context context, String str) {
        this(context, str, null);
    }

    public static boolean isBase64Uri(Uri uri) {
        return "data".equals(uri.getScheme());
    }

    public static boolean isContentUri(Uri uri) {
        return ANDROID_CONTENT_SCHEME.equals(uri.getScheme());
    }

    public static boolean isLocalFileUri(Uri uri) {
        return "file".equals(uri.getScheme());
    }

    public static boolean isLocalResourceUri(Uri uri) {
        return LOCAL_RESOURCE_SCHEME.equals(uri.getScheme());
    }

    public static boolean isResourceUri(Uri uri) {
        return ANDROID_RESOURCE_SCHEME.equals(uri.getScheme());
    }

    public g getGlideUrl() {
        return new g(getUri().toString(), getHeaders());
    }

    public h getHeaders() {
        return this.mHeaders;
    }

    public Object getSourceForLoad() {
        if (isContentUri()) {
            return getSource();
        }
        if (isBase64Resource()) {
            return getSource();
        }
        if (isResource()) {
            return getUri();
        }
        if (isLocalFile()) {
            return getUri().toString();
        }
        return getGlideUrl();
    }

    @Override // vg.a
    public Uri getUri() {
        return this.mUri;
    }

    public boolean isBase64Resource() {
        Uri uri = this.mUri;
        return uri != null && isBase64Uri(uri);
    }

    public boolean isLocalFile() {
        Uri uri = this.mUri;
        return uri != null && isLocalFileUri(uri);
    }

    @Override // vg.a
    public boolean isResource() {
        Uri uri = this.mUri;
        return uri != null && isResourceUri(uri);
    }

    public FastImageSource(Context context, String str, h hVar) {
        this(context, str, 0.0d, 0.0d, hVar);
    }

    public boolean isContentUri() {
        Uri uri = this.mUri;
        return uri != null && isContentUri(uri);
    }

    public FastImageSource(Context context, String str, double d11, double d12, h hVar) {
        super(context, str, d11, d12);
        this.mHeaders = hVar == null ? h.f40714a : hVar;
        this.mUri = super.getUri();
        if (isResource() && TextUtils.isEmpty(this.mUri.toString())) {
            throw new Resources.NotFoundException("Local Resource Not Found. Resource: '" + getSource() + "'.");
        } else if (isLocalResourceUri(this.mUri)) {
            String uri = this.mUri.toString();
            this.mUri = Uri.parse(uri.replace("res:/", "android.resource://" + context.getPackageName() + "/"));
        }
    }
}