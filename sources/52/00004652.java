package com.plaid.internal;

import android.os.Build;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.a7;
import com.plaid.internal.wa;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class y1 implements b7 {

    /* renamed from: a  reason: collision with root package name */
    public final a7 f19873a;

    /* renamed from: b  reason: collision with root package name */
    public final h00.q<Integer, String, String, vz.b0> f19874b;

    /* renamed from: c  reason: collision with root package name */
    public final Pattern f19875c;

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f19876d;

    /* JADX WARN: Multi-variable type inference failed */
    public y1(a7 minPriority, h00.q<? super Integer, ? super String, ? super String, vz.b0> qVar) {
        List<String> l11;
        kotlin.jvm.internal.s.g(minPriority, "minPriority");
        this.f19873a = minPriority;
        this.f19874b = qVar;
        this.f19875c = Pattern.compile("(\\$\\d+)+$");
        l11 = wz.w.l(wa.class.getName(), wa.a.class.getName(), y1.class.getName());
        this.f19876d = l11;
    }

    public final void a(int i11, Throwable th2, String str, Object[] objArr, boolean z11) {
        String S0;
        String str2;
        if (z11) {
            return;
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        kotlin.jvm.internal.s.f(stackTrace, "Throwable().stackTrace");
        int length = stackTrace.length;
        int i12 = 0;
        while (i12 < length) {
            StackTraceElement stackTraceElement = stackTrace[i12];
            i12++;
            if (!this.f19876d.contains(stackTraceElement.getClassName())) {
                String className = stackTraceElement.getClassName();
                kotlin.jvm.internal.s.f(className, "element.className");
                int i13 = 2;
                S0 = kotlin.text.w.S0(className, CoreConstants.DOT, null, 2, null);
                Matcher matcher = this.f19875c.matcher(S0);
                if (matcher.find()) {
                    S0 = matcher.replaceAll("");
                    kotlin.jvm.internal.s.f(S0, "m.replaceAll(\"\")");
                }
                if (S0.length() > 23 && Build.VERSION.SDK_INT < 24) {
                    S0 = S0.substring(0, 23);
                    kotlin.jvm.internal.s.f(S0, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                a7.a aVar = a7.Companion;
                a7 logLevel = this.f19873a;
                aVar.getClass();
                kotlin.jvm.internal.s.g(logLevel, "logLevel");
                switch (a7.a.C0325a.f18170a[logLevel.ordinal()]) {
                    case 1:
                        i13 = 7;
                        break;
                    case 2:
                        i13 = 3;
                        break;
                    case 3:
                        i13 = 6;
                        break;
                    case 4:
                        i13 = 4;
                        break;
                    case 5:
                        break;
                    case 6:
                        i13 = 5;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                if (i11 < i13) {
                    return;
                }
                if (!(str == null || str.length() == 0)) {
                    if (!(objArr.length == 0)) {
                        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                        str = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
                        kotlin.jvm.internal.s.f(str, "format(this, *args)");
                    }
                    if (th2 != null) {
                        str2 = ((Object) str) + '\n' + a(th2);
                    } else {
                        str2 = str;
                    }
                } else if (th2 == null) {
                    return;
                } else {
                    str2 = a(th2);
                }
                try {
                    a(i11, S0, str2);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // com.plaid.internal.b7
    public void b(String str, Object[] args, boolean z11) {
        kotlin.jvm.internal.s.g(args, "args");
        a(6, new Throwable(), kotlin.jvm.internal.s.p("Plog.e: ", str), Arrays.copyOf(args, args.length), z11);
    }

    @Override // com.plaid.internal.b7
    public void c(String str, Object[] args, boolean z11) {
        kotlin.jvm.internal.s.g(args, "args");
        a(4, null, str, Arrays.copyOf(args, args.length), z11);
    }

    @Override // com.plaid.internal.b7
    public void d(String str, Object[] args, boolean z11) {
        kotlin.jvm.internal.s.g(args, "args");
        a(3, null, str, Arrays.copyOf(args, args.length), z11);
    }

    @Override // com.plaid.internal.b7
    public void b(Throwable th2, String str, Object[] args, boolean z11) {
        kotlin.jvm.internal.s.g(args, "args");
        a(6, th2, str, Arrays.copyOf(args, args.length), z11);
    }

    @Override // com.plaid.internal.b7
    public void a(String str, Object[] args, boolean z11) {
        kotlin.jvm.internal.s.g(args, "args");
        a(5, null, str, Arrays.copyOf(args, args.length), z11);
    }

    @Override // com.plaid.internal.b7
    public void a(Throwable th2, String str, Object[] args, boolean z11) {
        kotlin.jvm.internal.s.g(args, "args");
        a(5, th2, str, Arrays.copyOf(args, args.length), z11);
    }

    @Override // com.plaid.internal.b7
    public void a(Throwable th2, boolean z11) {
        a(6, th2, null, new Object[0], z11);
    }

    public final void a(int i11, String str, String str2) {
        int Y;
        int min;
        if (str2.length() < 4000) {
            h00.q<Integer, String, String, vz.b0> qVar = this.f19874b;
            if (qVar != null) {
                qVar.invoke(Integer.valueOf(i11), str, str2);
            }
            if (i11 == 7) {
                Log.wtf(str, str2);
                return;
            } else {
                Log.println(i11, str, str2);
                return;
            }
        }
        int i12 = 0;
        int length = str2.length();
        while (i12 < length) {
            Y = kotlin.text.w.Y(str2, '\n', i12, false, 4, null);
            if (Y == -1) {
                Y = length;
            }
            while (true) {
                min = Math.min(Y, i12 + 4000);
                String substring = str2.substring(i12, min);
                kotlin.jvm.internal.s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                h00.q<Integer, String, String, vz.b0> qVar2 = this.f19874b;
                if (qVar2 != null) {
                    qVar2.invoke(Integer.valueOf(i11), str, substring);
                }
                if (i11 == 7) {
                    Log.wtf(str, substring);
                } else {
                    Log.println(i11, str, substring);
                }
                if (min >= Y) {
                    break;
                }
                i12 = min;
            }
            i12 = min + 1;
        }
    }

    public final String a(Throwable th2) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.s.f(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}