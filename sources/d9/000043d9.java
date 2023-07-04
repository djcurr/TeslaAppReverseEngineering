package com.plaid.internal;

import android.content.res.Resources;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Button$ButtonPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.g6;
import com.plaid.link.result.LinkErrorCode;
import java.util.List;

/* loaded from: classes2.dex */
public final class g3 {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f18613a;

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18614a;

        static {
            int[] iArr = new int[Pane$PaneRendering.b.values().length];
            iArr[Pane$PaneRendering.b.BUTTON.ordinal()] = 1;
            f18614a = iArr;
        }
    }

    public g3(Resources resources) {
        kotlin.jvm.internal.s.g(resources, "resources");
        this.f18613a = resources;
    }

    public final Pane$PaneRendering a(String str, String str2, String str3) {
        Pane$PaneRendering.a newBuilder = Pane$PaneRendering.newBuilder();
        newBuilder.a("error_pane_id");
        newBuilder.b("local_error_pane");
        newBuilder.a(Pane$Navigation.newBuilder().b(true).a(false).build());
        Button$ButtonPane.Rendering.a newBuilder2 = Button$ButtonPane.Rendering.newBuilder();
        Common$RenderedAssetAppearance.a newBuilder3 = Common$RenderedAssetAppearance.newBuilder();
        Common$RenderedAsset build = Common$RenderedAsset.newBuilder().a(d.SDK_ASSET_HEADER_FINAL_ERROR).build();
        newBuilder3.a(build);
        newBuilder3.b(build);
        newBuilder2.a(newBuilder3.build());
        newBuilder2.b(z6.a(str));
        newBuilder2.a(z6.a(str2));
        newBuilder2.a(Common$ButtonContent.newBuilder().a(z6.a(str3)));
        newBuilder.a(newBuilder2.build());
        Pane$PaneRendering build2 = newBuilder.build();
        kotlin.jvm.internal.s.f(build2, "newBuilder().apply {\n   …d()\n      )\n    }.build()");
        return build2;
    }

    public final f3 a(Pane$PaneRendering pane$PaneRendering, String str, String str2, String str3, List<vd> list, LinkErrorCode linkErrorCode) {
        vd a11 = vd.CREATOR.a(pane$PaneRendering, str2);
        Pane$PaneRendering.b renderingCase = pane$PaneRendering.getRenderingCase();
        if ((renderingCase == null ? -1 : a.f18614a[renderingCase.ordinal()]) == 1) {
            Common$LocalizedString content = pane$PaneRendering.getButton().getContent();
            return new f3(new g6.h(str2, a11, str3, (content == null || (r2 = z6.a(content, this.f18613a, null, 0, 6)) == null) ? "" : "", linkErrorCode.getJson(), list, str), pane$PaneRendering);
        }
        throw new r5("Unsupported local error");
    }
}