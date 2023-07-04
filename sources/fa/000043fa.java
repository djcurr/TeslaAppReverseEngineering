package com.plaid.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;

/* loaded from: classes2.dex */
public final class gb {

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.extensions.RenderedAssetAppearanceExtensionsKt", f = "RenderedAssetAppearanceExtensions.kt", l = {36}, m = "toDrawable")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f18675a;

        /* renamed from: b  reason: collision with root package name */
        public int f18676b;

        public a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18675a = obj;
            this.f18676b |= Integer.MIN_VALUE;
            return gb.a((Common$RenderedAsset) null, (Context) null, this);
        }
    }

    public static final Object a(Common$RenderedAssetAppearance common$RenderedAssetAppearance, Context context, zz.d<? super Drawable> dVar) {
        Common$RenderedAsset darkAppearance;
        if (common$RenderedAssetAppearance.hasLightAppearance()) {
            darkAppearance = common$RenderedAssetAppearance.getLightAppearance();
        } else {
            darkAppearance = common$RenderedAssetAppearance.hasDarkAppearance() ? common$RenderedAssetAppearance.getDarkAppearance() : null;
        }
        if (darkAppearance == null) {
            return null;
        }
        return a(darkAppearance, context, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset r4, android.content.Context r5, zz.d<? super android.graphics.drawable.Drawable> r6) {
        /*
            boolean r0 = r6 instanceof com.plaid.internal.gb.a
            if (r0 == 0) goto L13
            r0 = r6
            com.plaid.internal.gb$a r0 = (com.plaid.internal.gb.a) r0
            int r1 = r0.f18676b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18676b = r1
            goto L18
        L13:
            com.plaid.internal.gb$a r0 = new com.plaid.internal.gb$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f18675a
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f18676b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r6)
            goto L58
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            vz.r.b(r6)
            boolean r6 = r4.hasUrl()
            if (r6 == 0) goto L5f
            b6.g$a r6 = new b6.g$a
            r6.<init>(r5)
            java.lang.String r4 = r4.getUrl()
            b6.g$a r4 = r6.b(r4)
            b6.g r4 = r4.a()
            r5.d r5 = r5.a.a(r5)
            r0.f18676b = r3
            java.lang.Object r6 = r5.b(r4, r0)
            if (r6 != r1) goto L58
            return r1
        L58:
            b6.h r6 = (b6.h) r6
            android.graphics.drawable.Drawable r4 = r6.a()
            return r4
        L5f:
            boolean r6 = r4.hasBytes()
            if (r6 == 0) goto L7d
            com.google.protobuf.ByteString r4 = r4.getBytes()
            byte[] r4 = r4.toByteArray()
            android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r5 = r5.getResources()
            int r0 = r4.length
            r1 = 0
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeByteArray(r4, r1, r0)
            r6.<init>(r5, r4)
            return r6
        L7d:
            boolean r6 = r4.hasAsset()
            if (r6 == 0) goto L9b
            com.plaid.internal.d r4 = r4.getAsset()
            if (r4 != 0) goto L8a
            goto L9b
        L8a:
            int r4 = com.plaid.internal.a4.a(r4)
            android.content.res.Resources r6 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            android.graphics.drawable.Drawable r4 = l3.h.f(r6, r4, r5)
            return r4
        L9b:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.gb.a(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset, android.content.Context, zz.d):java.lang.Object");
    }
}