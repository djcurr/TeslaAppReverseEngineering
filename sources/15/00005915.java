package com.stripe.android.stripe3ds2.views;

import android.graphics.Bitmap;
import androidx.lifecycle.b0;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getImage$1", f = "ChallengeActivityViewModel.kt", l = {70, 69}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class ChallengeActivityViewModel$getImage$1 extends kotlin.coroutines.jvm.internal.l implements h00.p<b0<Bitmap>, zz.d<? super vz.b0>, Object> {
    final /* synthetic */ int $densityDpi;
    final /* synthetic */ ChallengeResponseData.Image $imageData;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChallengeActivityViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActivityViewModel$getImage$1(ChallengeActivityViewModel challengeActivityViewModel, ChallengeResponseData.Image image, int i11, zz.d<? super ChallengeActivityViewModel$getImage$1> dVar) {
        super(2, dVar);
        this.this$0 = challengeActivityViewModel;
        this.$imageData = image;
        this.$densityDpi = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        ChallengeActivityViewModel$getImage$1 challengeActivityViewModel$getImage$1 = new ChallengeActivityViewModel$getImage$1(this.this$0, this.$imageData, this.$densityDpi, dVar);
        challengeActivityViewModel$getImage$1.L$0 = obj;
        return challengeActivityViewModel$getImage$1;
    }

    @Override // h00.p
    public final Object invoke(b0<Bitmap> b0Var, zz.d<? super vz.b0> dVar) {
        return ((ChallengeActivityViewModel$getImage$1) create(b0Var, dVar)).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        b0 b0Var;
        ImageRepository imageRepository;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            b0Var = (b0) this.L$0;
            imageRepository = this.this$0.imageRepository;
            ChallengeResponseData.Image image = this.$imageData;
            String urlForDensity = image == null ? null : image.getUrlForDensity(this.$densityDpi);
            this.L$0 = b0Var;
            this.label = 1;
            obj = imageRepository.getImage$3ds2sdk_release(urlForDensity, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return vz.b0.f54756a;
        } else {
            b0Var = (b0) this.L$0;
            r.b(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (b0Var.emit(obj, this) == d11) {
            return d11;
        }
        return vz.b0.f54756a;
    }
}