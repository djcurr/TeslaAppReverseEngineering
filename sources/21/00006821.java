package eu;

import android.os.Process;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.LayoutBase;
import com.tesla.logging.c;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.r;
import kotlin.text.v;
import kotlin.text.w;
import kotlin.text.y;
import m00.l;

/* loaded from: classes6.dex */
public final class a extends LayoutBase<ILoggingEvent> {

    /* renamed from: a  reason: collision with root package name */
    private final String f25248a;

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f25249b;

    /* renamed from: eu.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0492a {
        private C0492a() {
        }

        public /* synthetic */ C0492a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0492a(null);
    }

    public a(String processName) {
        s.g(processName, "processName");
        this.f25248a = processName;
        this.f25249b = new StringBuilder();
    }

    private final String a(Object obj, char c11, char c12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c11);
        sb2.append(obj);
        sb2.append(c12);
        return sb2.toString();
    }

    private final String g(Object obj, int i11, char c11, char c12) {
        int i12;
        String k02;
        String valueOf = String.valueOf(obj);
        i12 = l.i(valueOf.length(), i11);
        String substring = valueOf.substring(0, i12);
        s.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        k02 = w.k0(a(substring, c11, c12), i11 + 2, (char) 0, 2, null);
        return k02;
    }

    static /* synthetic */ String j(a aVar, Object obj, int i11, char c11, char c12, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            c11 = '[';
        }
        if ((i12 & 4) != 0) {
            c12 = ']';
        }
        return aVar.g(obj, i11, c11, c12);
    }

    @Override // ch.qos.logback.core.Layout
    public String doLayout(ILoggingEvent event) {
        int Z;
        String a11;
        String str;
        String D;
        CharSequence d12;
        char f12;
        CharSequence d13;
        CharSequence u02;
        s.g(event, "event");
        String msg = event.getMessage();
        try {
            s.f(msg, "msg");
            Z = w.Z(msg, "[JS] ", 0, false, 6, null);
            if (Z != -1) {
                int i11 = Z + 5;
                int i12 = i11 + 29;
                String substring = msg.substring(i11, i12);
                s.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                if (substring != null) {
                    d13 = w.d1(substring);
                    a11 = w.v0(d13.toString(), ":");
                    u02 = w.u0(msg, i11, i12);
                    str = u02.toString();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            } else {
                a11 = c.f21873a.a(new Date(event.getTimeStamp()));
                str = msg;
            }
            D = v.D(str, "\n", "", false, 4, null);
            if (D != null) {
                d12 = w.d1(D);
                String obj = d12.toString();
                StringBuilder sb2 = this.f25249b;
                sb2.append(a11);
                sb2.append(" ");
                String level = event.getLevel().toString();
                s.f(level, "event.level.toString()");
                f12 = y.f1(level);
                sb2.append(j(this, Character.valueOf(f12), 1, (char) 0, (char) 0, 6, null));
                sb2.append(g(Integer.valueOf(Process.myPid()), 5, '<', '>'));
                sb2.append(g(this.f25248a, 10, '<', '>'));
                sb2.append(" ");
                String threadName = event.getThreadName();
                s.f(threadName, "event.threadName");
                sb2.append(j(this, threadName, 20, (char) 0, (char) 0, 6, null));
                sb2.append(" ");
                sb2.append(obj);
                sb2.append('\n');
                s.f(sb2, "append('\\n')");
                String sb3 = sb2.toString();
                s.f(sb3, "stringBuilder.apply {\n  …Line()\n      }.toString()");
                r.i(this.f25249b);
                return sb3;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        } catch (Exception e11) {
            String message = e11.getMessage();
            return "ERROR THROWN ON LAYOUT FOR FILE LOGGING: " + message + " `original message: " + msg + "`";
        }
    }
}