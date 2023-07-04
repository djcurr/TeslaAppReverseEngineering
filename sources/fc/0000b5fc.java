package tv;

import android.content.Context;
import android.net.Uri;
import h00.p;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import nr.n;
import v20.e1;
import vz.b0;
import vz.r;

/* loaded from: classes6.dex */
public final class i implements n<a> {

    /* renamed from: b  reason: collision with root package name */
    private final androidx.activity.result.d<String[]> f52576b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f52577c;

    /* loaded from: classes6.dex */
    public static abstract class a {

        /* renamed from: tv.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1166a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C1166a f52578a = new C1166a();

            private C1166a() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            private final String f52579a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String absoluteFilePath) {
                super(null);
                s.g(absoluteFilePath, "absoluteFilePath");
                this.f52579a = absoluteFilePath;
            }

            public final String a() {
                return this.f52579a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk.inquiry.document.DocumentSelectWorker$run$1", f = "DocumentSelectWorker.kt", l = {31, 42, 44}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<kotlinx.coroutines.flow.f<? super a>, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f52580a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f52581b;

        b(zz.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f52581b = obj;
            return bVar;
        }

        @Override // h00.p
        public final Object invoke(kotlinx.coroutines.flow.f<? super a> fVar, zz.d<? super b0> dVar) {
            return ((b) create(fVar, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            kotlinx.coroutines.flow.f fVar;
            d11 = a00.d.d();
            int i11 = this.f52580a;
            if (i11 == 0) {
                r.b(obj);
                fVar = (kotlinx.coroutines.flow.f) this.f52581b;
                cw.g gVar = new cw.g();
                this.f52581b = fVar;
                this.f52580a = 1;
                obj = gVar.e(this);
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
                fVar = (kotlinx.coroutines.flow.f) this.f52581b;
                r.b(obj);
            }
            Uri uri = (Uri) obj;
            if (uri != null) {
                File file = new File(i.this.f52577c.getExternalFilesDir(""), "document_select_file");
                InputStream openInputStream = i.this.f52577c.getContentResolver().openInputStream(uri);
                s.e(openInputStream);
                s.f(openInputStream, "context.contentResolver.…m(documentSelectResult)!!");
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    e00.a.b(openInputStream, fileOutputStream, 0, 2, null);
                    e00.b.a(fileOutputStream, null);
                    String absolutePath = file.getAbsolutePath();
                    s.f(absolutePath, "localFile.absolutePath");
                    a.b bVar = new a.b(absolutePath);
                    this.f52581b = null;
                    this.f52580a = 2;
                    if (fVar.emit(bVar, this) == d11) {
                        return d11;
                    }
                } finally {
                }
            } else {
                a.C1166a c1166a = a.C1166a.f52578a;
                this.f52581b = null;
                this.f52580a = 3;
                if (fVar.emit(c1166a, this) == d11) {
                    return d11;
                }
            }
            return b0.f54756a;
        }
    }

    public i(androidx.activity.result.d<String[]> openDocumentLauncher, Context context) {
        s.g(openDocumentLauncher, "openDocumentLauncher");
        s.g(context, "context");
        this.f52576b = openDocumentLauncher;
        this.f52577c = context;
    }

    @Override // nr.n
    public boolean a(n<?> nVar) {
        return n.b.a(this, nVar);
    }

    public final void c() {
        this.f52576b.b(new String[]{"image/*", "application/pdf"});
    }

    @Override // nr.n
    public kotlinx.coroutines.flow.e<a> run() {
        return kotlinx.coroutines.flow.g.y(kotlinx.coroutines.flow.g.v(new b(null)), e1.b());
    }
}