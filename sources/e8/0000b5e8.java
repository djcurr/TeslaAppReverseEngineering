package tv;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import h00.p;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import nr.n;
import vz.b0;
import vz.r;

/* loaded from: classes6.dex */
public final class a implements n<AbstractC1162a> {

    /* renamed from: b  reason: collision with root package name */
    private final androidx.activity.result.d<Uri> f52554b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f52555c;

    /* renamed from: tv.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC1162a {

        /* renamed from: tv.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1163a extends AbstractC1162a {

            /* renamed from: a  reason: collision with root package name */
            public static final C1163a f52556a = new C1163a();

            private C1163a() {
                super(null);
            }
        }

        /* renamed from: tv.a$a$b */
        /* loaded from: classes6.dex */
        public static final class b extends AbstractC1162a {

            /* renamed from: a  reason: collision with root package name */
            private final String f52557a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String absoluteFilePath) {
                super(null);
                s.g(absoluteFilePath, "absoluteFilePath");
                this.f52557a = absoluteFilePath;
            }

            public final String a() {
                return this.f52557a;
            }
        }

        private AbstractC1162a() {
        }

        public /* synthetic */ AbstractC1162a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.inquiry.document.DocumentCameraWorker$run$1", f = "DocumentCameraWorker.kt", l = {31, 32, 34}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<kotlinx.coroutines.flow.f<? super AbstractC1162a>, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f52558a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f52559b;

        b(zz.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f52559b = obj;
            return bVar;
        }

        @Override // h00.p
        public final Object invoke(kotlinx.coroutines.flow.f<? super AbstractC1162a> fVar, zz.d<? super b0> dVar) {
            return ((b) create(fVar, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            kotlinx.coroutines.flow.f fVar;
            d11 = a00.d.d();
            int i11 = this.f52558a;
            if (i11 == 0) {
                r.b(obj);
                fVar = (kotlinx.coroutines.flow.f) this.f52559b;
                cw.l lVar = new cw.l();
                this.f52559b = fVar;
                this.f52558a = 1;
                obj = lVar.e(this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return b0.f54756a;
            } else {
                fVar = (kotlinx.coroutines.flow.f) this.f52559b;
                r.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                String absolutePath = a.this.d().getAbsolutePath();
                s.f(absolutePath, "localFilePath().absolutePath");
                AbstractC1162a.b bVar = new AbstractC1162a.b(absolutePath);
                this.f52559b = null;
                this.f52558a = 2;
                if (fVar.emit(bVar, this) == d11) {
                    return d11;
                }
            } else {
                AbstractC1162a.C1163a c1163a = AbstractC1162a.C1163a.f52556a;
                this.f52559b = null;
                this.f52558a = 3;
                if (fVar.emit(c1163a, this) == d11) {
                    return d11;
                }
            }
            return b0.f54756a;
        }
    }

    public a(androidx.activity.result.d<Uri> pictureLauncher, Context context) {
        s.g(pictureLauncher, "pictureLauncher");
        s.g(context, "context");
        this.f52554b = pictureLauncher;
        this.f52555c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File d() {
        return new File(this.f52555c.getExternalFilesDir(""), "document_camera_photo_time.jpg");
    }

    @Override // nr.n
    public boolean a(n<?> nVar) {
        return n.b.a(this, nVar);
    }

    public final void c() {
        Context context = this.f52555c;
        this.f52554b.b(FileProvider.getUriForFile(context, s.p(context.getPackageName(), ".persona.provider"), d()));
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<AbstractC1162a> run() {
        return kotlinx.coroutines.flow.g.v(new b(null));
    }
}