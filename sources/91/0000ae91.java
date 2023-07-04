package qu;

import android.content.Context;
import android.net.Uri;
import com.tesla.report.upload.UploadReportsWorker;
import hy.m;
import hy.q;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import su.b;
import wz.v;
import wz.x;

/* loaded from: classes6.dex */
public final class h {

    /* renamed from: b */
    private static final com.tesla.logging.g f48490b;

    /* renamed from: a */
    private final Context f48491a;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
        f48490b = com.tesla.logging.g.f21878b.a("ReportService");
    }

    public h(Context context) {
        s.g(context, "context");
        this.f48491a = context.getApplicationContext();
    }

    public static /* synthetic */ q a(su.b bVar, File file) {
        return f(bVar, file);
    }

    public static /* synthetic */ File b(h hVar, String str, File file) {
        return e(hVar, str, file);
    }

    public static /* synthetic */ void c(File file, Throwable th2) {
        g(file, th2);
    }

    public static final File e(h this$0, String reportId, File file) {
        List<? extends Uri> d11;
        s.g(this$0, "this$0");
        s.g(reportId, "$reportId");
        s.g(file, "$file");
        tu.a aVar = tu.a.f52550a;
        Context appContext = this$0.f48491a;
        s.f(appContext, "appContext");
        Uri fromFile = Uri.fromFile(file);
        s.f(fromFile, "fromFile(this)");
        d11 = v.d(fromFile);
        aVar.a(appContext, "report-logs-" + reportId, d11);
        return file;
    }

    public static final q f(su.b uploadReport, File it2) {
        s.g(uploadReport, "$uploadReport");
        s.f(it2, "it");
        return su.b.c(uploadReport, it2, null, 2, null);
    }

    public static final void g(File file, Throwable th2) {
        s.g(file, "$file");
        com.tesla.logging.g gVar = f48490b;
        String name = file.getName();
        gVar.d("error encountered during upload: " + name + "!", th2);
    }

    public final void d(wt.c request) {
        int t11;
        String c11;
        s.g(request, "request");
        final String e11 = request.e();
        ArrayList<File> arrayList = new ArrayList();
        wt.a c12 = request.c();
        if (c12 != null && (c11 = c12.c()) != null) {
            ru.a aVar = ru.a.f49666a;
            Context appContext = this.f48491a;
            s.f(appContext, "appContext");
            List<File> b11 = aVar.b(appContext, e11, c11);
            if (b11 != null) {
                arrayList.addAll(b11);
            }
        }
        if (request.d() != null) {
            ru.a aVar2 = ru.a.f49666a;
            Context appContext2 = this.f48491a;
            s.f(appContext2, "appContext");
            List<File> c13 = aVar2.c(appContext2, e11);
            if (c13 != null) {
                arrayList.addAll(c13);
            }
        }
        UploadReportsWorker.a aVar3 = UploadReportsWorker.f21965d;
        Context appContext3 = this.f48491a;
        s.f(appContext3, "appContext");
        aVar3.a(appContext3, e11);
        b.a aVar4 = su.b.f50653d;
        Context appContext4 = this.f48491a;
        s.f(appContext4, "appContext");
        final su.b a11 = aVar4.a(appContext4);
        t11 = x.t(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(t11);
        for (final File file : arrayList) {
            arrayList2.add(m.l(new Callable() { // from class: qu.e
                {
                    h.this = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return h.b(h.this, e11, file);
                }
            }).k(new ky.h() { // from class: qu.g
                @Override // ky.h
                public final Object apply(Object obj) {
                    return h.a(su.b.this, (File) obj);
                }
            }).f(new ky.f() { // from class: qu.f
                @Override // ky.f
                public final void accept(Object obj) {
                    h.c(file, (Throwable) obj);
                }
            }).w(bz.a.c()));
        }
        m.d(arrayList2).A(bz.a.c()).v();
    }
}