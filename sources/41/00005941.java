package com.stripe.android.stripe3ds2.views;

import android.graphics.Bitmap;
import v20.o0;
import vz.b0;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.stripe3ds2.views.ImageRepository$getImage$2", f = "ImageRepository.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class ImageRepository$getImage$2 extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super Bitmap>, Object> {
    final /* synthetic */ String $imageUrl;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ImageRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageRepository$getImage$2(String str, ImageRepository imageRepository, zz.d<? super ImageRepository$getImage$2> dVar) {
        super(2, dVar);
        this.$imageUrl = str;
        this.this$0 = imageRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
        return new ImageRepository$getImage$2(this.$imageUrl, this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super Bitmap> dVar) {
        return ((ImageRepository$getImage$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        ImageRepository imageRepository;
        Bitmap localImage;
        Object remoteImage;
        String str;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            String str2 = this.$imageUrl;
            if (str2 == null) {
                return null;
            }
            imageRepository = this.this$0;
            localImage = imageRepository.getLocalImage(str2);
            if (localImage != null) {
                return localImage;
            }
            this.L$0 = imageRepository;
            this.L$1 = str2;
            this.label = 1;
            remoteImage = imageRepository.getRemoteImage(str2, this);
            if (remoteImage == d11) {
                return d11;
            }
            str = str2;
            obj = remoteImage;
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            str = (String) this.L$1;
            imageRepository = (ImageRepository) this.L$0;
            r.b(obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        imageRepository.cacheImage(str, bitmap);
        return bitmap;
    }
}