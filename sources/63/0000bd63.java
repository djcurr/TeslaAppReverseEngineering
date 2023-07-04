package wv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk.inquiry.governmentid.b;
import com.withpersona.sdk.inquiry.governmentid.network.Id;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m0;
import pv.i;
import wv.j;

/* loaded from: classes6.dex */
public final class j implements pr.u<b.d.a> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ pr.d<b.d.a> f56319a;

    /* loaded from: classes6.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.r<b.d.a, pr.s, Context, ViewGroup, View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ pv.i f56320a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ pv.n f56321b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ pv.l f56322c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ pv.p f56323d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ pv.v f56324e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: wv.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public /* synthetic */ class C1277a extends kotlin.jvm.internal.p implements h00.p<b.d.a, pr.s, vz.b0> {
            C1277a(Object obj) {
                super(2, obj, f.class, "showRendering", "showRendering(Lcom/withpersona/sdk/inquiry/governmentid/GovernmentIdWorkflow$Screen$CameraScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
            }

            public final void d(b.d.a p02, pr.s p12) {
                kotlin.jvm.internal.s.g(p02, "p0");
                kotlin.jvm.internal.s.g(p12, "p1");
                ((f) this.receiver).a(p02, p12);
            }

            @Override // h00.p
            public /* bridge */ /* synthetic */ vz.b0 invoke(b.d.a aVar, pr.s sVar) {
                d(aVar, sVar);
                return vz.b0.f54756a;
            }
        }

        /* loaded from: classes6.dex */
        public /* synthetic */ class b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f56325a;

            static {
                int[] iArr = new int[Id.b.values().length];
                iArr[Id.b.Front.ordinal()] = 1;
                iArr[Id.b.Back.ordinal()] = 2;
                iArr[Id.b.BarcodePdf417.ordinal()] = 3;
                iArr[Id.b.FrontOrBack.ordinal()] = 4;
                iArr[Id.b.PassportSignature.ordinal()] = 5;
                f56325a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(pv.i iVar, pv.n nVar, pv.l lVar, pv.p pVar, pv.v vVar) {
            super(4);
            this.f56320a = iVar;
            this.f56321b = nVar;
            this.f56322c = lVar;
            this.f56323d = pVar;
            this.f56324e = vVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void c(pv.i cameraPreview, xv.b this_apply, b.d.a initialRendering, pv.n governmentIdFrontFeed, pv.l governmentIdBarcodePdf417Feed, pv.p governmentIdFrontOrBackFeed, pv.v noOpFeed) {
            kotlin.jvm.internal.s.g(cameraPreview, "$cameraPreview");
            kotlin.jvm.internal.s.g(this_apply, "$this_apply");
            kotlin.jvm.internal.s.g(initialRendering, "$initialRendering");
            kotlin.jvm.internal.s.g(governmentIdFrontFeed, "$governmentIdFrontFeed");
            kotlin.jvm.internal.s.g(governmentIdBarcodePdf417Feed, "$governmentIdBarcodePdf417Feed");
            kotlin.jvm.internal.s.g(governmentIdFrontOrBackFeed, "$governmentIdFrontOrBackFeed");
            kotlin.jvm.internal.s.g(noOpFeed, "$noOpFeed");
            PreviewView previewView = this_apply.f57751j;
            kotlin.jvm.internal.s.f(previewView, "this.previewView");
            i.a aVar = i.a.BACK;
            int i11 = b.f56325a[initialRendering.a().ordinal()];
            if (i11 != 1) {
                if (i11 == 2 || i11 == 3) {
                    governmentIdFrontFeed = governmentIdBarcodePdf417Feed;
                } else if (i11 == 4) {
                    governmentIdFrontFeed = governmentIdFrontOrBackFeed;
                } else if (i11 != 5) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    governmentIdFrontFeed = noOpFeed;
                }
            }
            cameraPreview.e(previewView, aVar, governmentIdFrontFeed);
        }

        @Override // h00.r
        /* renamed from: b */
        public final View invoke(final b.d.a initialRendering, pr.s initialViewEnvironment, Context context, ViewGroup viewGroup) {
            Context context2;
            kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
            kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
            kotlin.jvm.internal.s.g(context, "context");
            if (viewGroup == null || (context2 = viewGroup.getContext()) == null) {
                context2 = context;
            }
            LayoutInflater cloneInContext = LayoutInflater.from(context2).cloneInContext(context);
            final pv.i iVar = this.f56320a;
            final pv.n nVar = this.f56321b;
            final pv.l lVar = this.f56322c;
            final pv.p pVar = this.f56323d;
            final pv.v vVar = this.f56324e;
            final xv.b c11 = xv.b.c(cloneInContext);
            ConstraintLayout root = c11.getRoot();
            kotlin.jvm.internal.s.f(root, "root");
            kotlin.jvm.internal.s.f(c11, "this");
            pr.x.a(root, initialRendering, initialViewEnvironment, new C1277a(new f(c11, iVar)));
            c11.f57751j.post(new Runnable() { // from class: wv.i
                @Override // java.lang.Runnable
                public final void run() {
                    j.a.c(pv.i.this, c11, initialRendering, nVar, lVar, pVar, vVar);
                }
            });
            ConstraintLayout root2 = c11.getRoot();
            kotlin.jvm.internal.s.f(root2, "from(container?.context …         }.root\n        }");
            return root2;
        }
    }

    public j(pv.n governmentIdFrontFeed, pv.l governmentIdBarcodePdf417Feed, pv.p governmentIdFrontOrBackFeed, pv.v noOpFeed, pv.i cameraPreview) {
        kotlin.jvm.internal.s.g(governmentIdFrontFeed, "governmentIdFrontFeed");
        kotlin.jvm.internal.s.g(governmentIdBarcodePdf417Feed, "governmentIdBarcodePdf417Feed");
        kotlin.jvm.internal.s.g(governmentIdFrontOrBackFeed, "governmentIdFrontOrBackFeed");
        kotlin.jvm.internal.s.g(noOpFeed, "noOpFeed");
        kotlin.jvm.internal.s.g(cameraPreview, "cameraPreview");
        this.f56319a = new pr.d<>(m0.b(b.d.a.class), new a(cameraPreview, governmentIdFrontFeed, governmentIdBarcodePdf417Feed, governmentIdFrontOrBackFeed, noOpFeed));
    }

    @Override // pr.u
    /* renamed from: b */
    public View a(b.d.a initialRendering, pr.s initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
        kotlin.jvm.internal.s.g(initialRendering, "initialRendering");
        kotlin.jvm.internal.s.g(initialViewEnvironment, "initialViewEnvironment");
        kotlin.jvm.internal.s.g(contextForNewView, "contextForNewView");
        return this.f56319a.a(initialRendering, initialViewEnvironment, contextForNewView, viewGroup);
    }

    @Override // pr.u
    public n00.d<? super b.d.a> getType() {
        return this.f56319a.getType();
    }
}