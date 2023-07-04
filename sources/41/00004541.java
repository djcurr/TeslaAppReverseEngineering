package com.plaid.internal;

import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.plaid.core.webview.PlaidWebview;
import com.plaid.internal.wa;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class r8 extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.activity.result.d<String> f19357a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.activity.result.d<vz.b0> f19358b;

    /* renamed from: c  reason: collision with root package name */
    public final PlaidWebview.a f19359c;

    /* renamed from: d  reason: collision with root package name */
    public final c8 f19360d;

    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PermissionRequest f19361a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String[] f19362b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PermissionRequest permissionRequest, String[] strArr) {
            super(0);
            this.f19361a = permissionRequest;
            this.f19362b = strArr;
        }

        @Override // h00.a
        public vz.b0 invoke() {
            this.f19361a.grant(this.f19362b);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PermissionRequest f19363a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PermissionRequest permissionRequest) {
            super(0);
            this.f19363a = permissionRequest;
        }

        @Override // h00.a
        public vz.b0 invoke() {
            this.f19363a.deny();
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.a<vz.b0> {
        public c() {
            super(0);
        }

        @Override // h00.a
        public vz.b0 invoke() {
            androidx.activity.result.d<vz.b0> dVar = r8.this.f19358b;
            vz.b0 b0Var = vz.b0.f54756a;
            dVar.b(b0Var);
            return b0Var;
        }
    }

    public r8(androidx.activity.result.d<String> inputFileResultContract, androidx.activity.result.d<vz.b0> takePictureContract, PlaidWebview.a listener, c8 permissionHelper) {
        kotlin.jvm.internal.s.g(inputFileResultContract, "inputFileResultContract");
        kotlin.jvm.internal.s.g(takePictureContract, "takePictureContract");
        kotlin.jvm.internal.s.g(listener, "listener");
        kotlin.jvm.internal.s.g(permissionHelper, "permissionHelper");
        this.f19357a = inputFileResultContract;
        this.f19358b = takePictureContract;
        this.f19359c = listener;
        this.f19360d = permissionHelper;
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        boolean D;
        List d11;
        if (permissionRequest == null) {
            return;
        }
        String[] resources = permissionRequest.getResources();
        kotlin.jvm.internal.s.f(resources, "request.resources");
        D = wz.p.D(resources, "android.webkit.resource.VIDEO_CAPTURE");
        if (D) {
            d11 = wz.v.d("android.webkit.resource.VIDEO_CAPTURE");
            Object[] array = d11.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            if (this.f19360d.a()) {
                permissionRequest.grant(strArr);
            } else {
                this.f19360d.a(new a(permissionRequest, strArr), new b(permissionRequest));
            }
        }
        String[] resources2 = permissionRequest.getResources();
        kotlin.jvm.internal.s.f(resources2, "request.resources");
        ArrayList<String> arrayList = new ArrayList();
        int length = resources2.length;
        int i11 = 0;
        while (i11 < length) {
            String str = resources2[i11];
            i11++;
            if (!kotlin.jvm.internal.s.c(str, "android.webkit.resource.VIDEO_CAPTURE")) {
                arrayList.add(str);
            }
        }
        for (String str2 : arrayList) {
            wa.a.b(wa.f19678a, kotlin.jvm.internal.s.p("WebView requesting unsupported permission - ", str2), false, 2);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView view, int i11) {
        kotlin.jvm.internal.s.g(view, "view");
        if (i11 == 100) {
            i11 = 0;
        }
        super.onProgressChanged(view, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002c  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onShowFileChooser(android.webkit.WebView r3, android.webkit.ValueCallback<android.net.Uri[]> r4, android.webkit.WebChromeClient.FileChooserParams r5) {
        /*
            r2 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.plaid.core.webview.PlaidWebview$a r1 = r2.f19359c
            r1.a(r4)
            r4 = 1
            if (r5 != 0) goto Ld
            goto L15
        Ld:
            boolean r1 = r5.isCaptureEnabled()
            if (r1 != r4) goto L15
            r1 = r4
            goto L16
        L15:
            r1 = r0
        L16:
            if (r1 == 0) goto L4c
            java.lang.String[] r5 = r5.getAcceptTypes()
            if (r5 != 0) goto L1f
            goto L29
        L1f:
            java.lang.String r1 = "image/jpeg"
            boolean r5 = wz.l.D(r5, r1)
            if (r5 != r4) goto L29
            r5 = r4
            goto L2a
        L29:
            r5 = r0
        L2a:
            if (r5 == 0) goto L4c
            if (r3 != 0) goto L2f
            return r0
        L2f:
            com.plaid.internal.c8 r3 = r2.f19360d
            boolean r3 = r3.a()
            if (r3 == 0) goto L3f
            androidx.activity.result.d<vz.b0> r3 = r2.f19358b
            vz.b0 r5 = vz.b0.f54756a
            r3.b(r5)
            goto L4b
        L3f:
            com.plaid.internal.c8 r3 = r2.f19360d
            com.plaid.internal.r8$c r5 = new com.plaid.internal.r8$c
            r5.<init>()
            com.plaid.internal.b8 r0 = com.plaid.internal.b8.f18227a
            r3.a(r5, r0)
        L4b:
            return r4
        L4c:
            androidx.activity.result.d<java.lang.String> r3 = r2.f19357a
        */
        //  java.lang.String r5 = "*/*"
        /*
            r3.b(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.r8.onShowFileChooser(android.webkit.WebView, android.webkit.ValueCallback, android.webkit.WebChromeClient$FileChooserParams):boolean");
    }
}