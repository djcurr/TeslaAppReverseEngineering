package em;

import am.a0;
import android.content.Context;
import bm.g;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.o;
import java.nio.charset.Charset;
import nh.e;
import nh.f;
import nh.h;
import ph.t;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: b */
    private static final g f25200b = new g();

    /* renamed from: c */
    private static final String f25201c = f("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d */
    private static final String f25202d = f("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e */
    private static final e<a0, byte[]> f25203e = new e() { // from class: em.a
        @Override // nh.e
        public final Object apply(Object obj) {
            return c.a((a0) obj);
        }
    };

    /* renamed from: a */
    private final f<a0> f25204a;

    c(f<a0> fVar, e<a0, byte[]> eVar) {
        this.f25204a = fVar;
    }

    public static /* synthetic */ byte[] a(a0 a0Var) {
        return e(a0Var);
    }

    public static /* synthetic */ void b(TaskCompletionSource taskCompletionSource, o oVar, Exception exc) {
        d(taskCompletionSource, oVar, exc);
    }

    public static c c(Context context) {
        t.f(context);
        nh.g h11 = t.c().h(new com.google.android.datatransport.cct.a(f25201c, f25202d));
        nh.b b11 = nh.b.b("json");
        e<a0, byte[]> eVar = f25203e;
        return new c(h11.a("FIREBASE_CRASHLYTICS_REPORT", a0.class, b11, eVar), eVar);
    }

    public static /* synthetic */ void d(TaskCompletionSource taskCompletionSource, o oVar, Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
        } else {
            taskCompletionSource.trySetResult(oVar);
        }
    }

    public static /* synthetic */ byte[] e(a0 a0Var) {
        return f25200b.E(a0Var).getBytes(Charset.forName("UTF-8"));
    }

    private static String f(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
            for (int i11 = 0; i11 < str.length(); i11++) {
                sb2.append(str.charAt(i11));
                if (str2.length() > i11) {
                    sb2.append(str2.charAt(i11));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    public Task<o> g(final o oVar) {
        a0 b11 = oVar.b();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f25204a.b(nh.c.f(b11), new h() { // from class: em.b
            @Override // nh.h
            public final void a(Exception exc) {
                c.b(TaskCompletionSource.this, oVar, exc);
            }
        });
        return taskCompletionSource.getTask();
    }
}