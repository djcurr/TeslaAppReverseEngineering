package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.recyclerview.widget.l;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.base.zak;
import com.google.android.gms.internal.base.zal;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class zae extends zag {
    private final WeakReference zac;

    public zae(ImageView imageView, int i11) {
        super(Uri.EMPTY, i11);
        Asserts.checkNotNull(imageView);
        this.zac = new WeakReference(imageView);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zae) {
            ImageView imageView = (ImageView) this.zac.get();
            ImageView imageView2 = (ImageView) ((zae) obj).zac.get();
            return (imageView2 == null || imageView == null || !Objects.equal(imageView2, imageView)) ? false : true;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.images.zag
    public final void zaa(Drawable drawable, boolean z11, boolean z12, boolean z13) {
        ImageView imageView = (ImageView) this.zac.get();
        if (imageView != null) {
            if (!z12 && !z13 && (imageView instanceof zal)) {
                zal zalVar = (zal) imageView;
                throw null;
            }
            boolean z14 = false;
            if (!z12 && !z11) {
                z14 = true;
            }
            if (z14) {
                Drawable drawable2 = imageView.getDrawable();
                if (drawable2 == null) {
                    drawable2 = null;
                } else if (drawable2 instanceof zak) {
                    drawable2 = ((zak) drawable2).zaa();
                }
                drawable = new zak(drawable2, drawable);
            }
            imageView.setImageDrawable(drawable);
            if (imageView instanceof zal) {
                zal zalVar2 = (zal) imageView;
                throw null;
            } else if (drawable == null || !z14) {
            } else {
                ((zak) drawable).zab(l.f.DEFAULT_SWIPE_ANIMATION_DURATION);
            }
        }
    }

    public zae(ImageView imageView, Uri uri) {
        super(uri, 0);
        Asserts.checkNotNull(imageView);
        this.zac = new WeakReference(imageView);
    }
}