package vg;

import android.content.Context;
import android.net.Uri;
import java.util.Objects;

/* loaded from: classes3.dex */
public class a {
    private boolean isResource;
    private double mSize;
    private String mSource;
    private Uri mUri;

    public a(Context context, String str, double d11, double d12) {
        this.mSource = str;
        this.mSize = d11 * d12;
        this.mUri = computeUri(context);
    }

    private Uri computeLocalUri(Context context) {
        this.isResource = true;
        return c.b().e(context, this.mSource);
    }

    private Uri computeUri(Context context) {
        try {
            Uri parse = Uri.parse(this.mSource);
            return parse.getScheme() == null ? computeLocalUri(context) : parse;
        } catch (Exception unused) {
            return computeLocalUri(context);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return Double.compare(aVar.mSize, this.mSize) == 0 && this.isResource == aVar.isResource && Objects.equals(this.mUri, aVar.mUri) && Objects.equals(this.mSource, aVar.mSource);
    }

    public double getSize() {
        return this.mSize;
    }

    public String getSource() {
        return this.mSource;
    }

    public Uri getUri() {
        return (Uri) wf.a.c(this.mUri);
    }

    public int hashCode() {
        return Objects.hash(this.mUri, this.mSource, Double.valueOf(this.mSize), Boolean.valueOf(this.isResource));
    }

    public boolean isResource() {
        return this.isResource;
    }

    public a(Context context, String str) {
        this(context, str, 0.0d, 0.0d);
    }
}