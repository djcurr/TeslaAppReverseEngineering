package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.views.ImageRepository;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.stripe3ds2.views.ImageRepository$ImageSupplier$Default", f = "ImageRepository.kt", l = {60}, m = "getBitmap")
/* loaded from: classes6.dex */
public final class ImageRepository$ImageSupplier$Default$getBitmap$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ImageRepository.ImageSupplier.Default this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageRepository$ImageSupplier$Default$getBitmap$1(ImageRepository.ImageSupplier.Default r12, zz.d<? super ImageRepository$ImageSupplier$Default$getBitmap$1> dVar) {
        super(dVar);
        this.this$0 = r12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getBitmap(null, this);
    }
}