package t0;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import c1.i;
import c1.y;
import c1.z;
import h00.l;
import h00.q;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import o1.f;
import s1.h;
import vz.b0;

/* loaded from: classes.dex */
public final class g {

    /* loaded from: classes.dex */
    public static final class a extends u implements l<y0, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f51270a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar) {
            super(1);
            this.f51270a = fVar;
        }

        public final void a(y0 y0Var) {
            s.g(y0Var, "$this$null");
            y0Var.b("bringRectangleOnScreenRequester");
            y0Var.a().b("bringRectangleOnScreenRequester", this.f51270a);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(y0 y0Var) {
            a(y0Var);
            return b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends u implements q<o1.f, i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f51271a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends u implements l<z, y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f51272a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f51273b;

            /* renamed from: t0.g$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1137a implements y {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f51274a;

                public C1137a(f fVar) {
                    this.f51274a = fVar;
                }

                @Override // c1.y
                public void dispose() {
                    this.f51274a.b(null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, View view) {
                super(1);
                this.f51272a = fVar;
                this.f51273b = view;
            }

            @Override // h00.l
            public final y invoke(z DisposableEffect) {
                s.g(DisposableEffect, "$this$DisposableEffect");
                this.f51272a.b(this.f51273b);
                return new C1137a(this.f51272a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(3);
            this.f51271a = fVar;
        }

        public final o1.f a(o1.f composed, i iVar, int i11) {
            s.g(composed, "$this$composed");
            iVar.x(-711358161);
            View view = (View) iVar.A(androidx.compose.ui.platform.z.k());
            c1.b0.a(view, new a(this.f51271a, view), iVar, 8);
            f.a aVar = o1.f.f42062f1;
            iVar.N();
            return aVar;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final o1.f b(o1.f fVar, f bringRectangleOnScreenRequester) {
        s.g(fVar, "<this>");
        s.g(bringRectangleOnScreenRequester, "bringRectangleOnScreenRequester");
        return o1.e.a(fVar, x0.c() ? new a(bringRectangleOnScreenRequester) : x0.a(), new b(bringRectangleOnScreenRequester));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect c(h hVar) {
        return new Rect((int) hVar.i(), (int) hVar.l(), (int) hVar.j(), (int) hVar.e());
    }
}