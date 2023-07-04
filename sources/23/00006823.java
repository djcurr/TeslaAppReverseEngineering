package eu;

import android.content.Context;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.encoder.LayoutWrappingEncoder;
import ch.qos.logback.core.rolling.RollingFileAppender;
import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.util.FileSize;
import ch.qos.logback.core.util.StatusPrinter;
import com.tesla.logging.e;
import h00.l;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.text.d;
import n80.a;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import wz.e0;
import wz.w;

/* loaded from: classes6.dex */
public final class b extends a.b {

    /* renamed from: d  reason: collision with root package name */
    private static boolean f25251d;

    /* renamed from: c  reason: collision with root package name */
    public static final b f25250c = new b();

    /* renamed from: e  reason: collision with root package name */
    private static final Logger f25252e = LoggerFactory.getLogger(b.class);

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f25253a;

        /* renamed from: b  reason: collision with root package name */
        private final String f25254b;

        public a(List<String> logs, String str) {
            s.g(logs, "logs");
            this.f25253a = logs;
            this.f25254b = str;
        }

        public final List<String> a() {
            return this.f25253a;
        }

        public final String b() {
            return this.f25254b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return s.c(this.f25253a, aVar.f25253a) && s.c(this.f25254b, aVar.f25254b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f25253a.hashCode() * 31;
            String str = this.f25254b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            List<String> list = this.f25253a;
            String str = this.f25254b;
            return "FileLoggingTreeConfigurationResult(logs=" + list + ", fatalErrorMessages=" + str + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: eu.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0493b extends u implements l<Status, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0493b f25255a = new C0493b();

        C0493b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final CharSequence invoke(Status status) {
            String message = status.getMessage();
            s.f(message, "it.message");
            return message;
        }
    }

    private b() {
    }

    @Override // n80.a.c
    protected boolean h(String str, int i11) {
        return i11 >= 3;
    }

    @Override // n80.a.c
    protected void i(int i11, String str, String message, Throwable th2) {
        s.g(message, "message");
        String str2 = e.f21875a.a(str) + " " + message;
        if (i11 == 3) {
            f25252e.debug(str2);
        } else if (i11 == 4) {
            f25252e.info(str2);
        } else if (i11 == 5) {
            f25252e.warn(str2);
        } else if (i11 != 6) {
        } else {
            f25252e.error(str2);
        }
    }

    public final a n(Context context, String childDirName, String processName) {
        List i11;
        s.g(context, "context");
        s.g(childDirName, "childDirName");
        s.g(processName, "processName");
        if (f25251d) {
            i11 = w.i();
            return new a(i11, null);
        }
        ArrayList arrayList = new ArrayList();
        f25251d = true;
        String absolutePath = context.getCacheDir().getAbsolutePath();
        String str = File.separator;
        String str2 = absolutePath + str + "logs" + str + childDirName;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        ILoggerFactory iLoggerFactory = LoggerFactory.getILoggerFactory();
        Objects.requireNonNull(iLoggerFactory, "null cannot be cast to non-null type ch.qos.logback.classic.LoggerContext");
        LoggerContext loggerContext = (LoggerContext) iLoggerFactory;
        loggerContext.reset();
        RollingFileAppender rollingFileAppender = new RollingFileAppender();
        rollingFileAppender.setContext(loggerContext);
        rollingFileAppender.setAppend(true);
        SizeAndTimeBasedRollingPolicy sizeAndTimeBasedRollingPolicy = new SizeAndTimeBasedRollingPolicy();
        sizeAndTimeBasedRollingPolicy.setContext(loggerContext);
        sizeAndTimeBasedRollingPolicy.setMaxFileSize(FileSize.valueOf("512kb"));
        sizeAndTimeBasedRollingPolicy.setTotalSizeCap(FileSize.valueOf("5mb"));
        sizeAndTimeBasedRollingPolicy.setMaxHistory(30);
        sizeAndTimeBasedRollingPolicy.setFileNamePattern(str2 + "/log." + childDirName + ".%i.%d{yyyy-MM-dd}.txt");
        sizeAndTimeBasedRollingPolicy.setParent(rollingFileAppender);
        sizeAndTimeBasedRollingPolicy.start();
        eu.a aVar = new eu.a(processName);
        aVar.setContext(loggerContext);
        aVar.start();
        LayoutWrappingEncoder layoutWrappingEncoder = new LayoutWrappingEncoder();
        layoutWrappingEncoder.setContext(loggerContext);
        layoutWrappingEncoder.setLayout(aVar);
        layoutWrappingEncoder.setCharset(d.f35187b);
        layoutWrappingEncoder.start();
        rollingFileAppender.setRollingPolicy(sizeAndTimeBasedRollingPolicy);
        rollingFileAppender.setEncoder(layoutWrappingEncoder);
        rollingFileAppender.start();
        Logger logger = LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        Objects.requireNonNull(logger, "null cannot be cast to non-null type ch.qos.logback.classic.Logger");
        ch.qos.logback.classic.Logger logger2 = (ch.qos.logback.classic.Logger) logger;
        logger2.setLevel(Level.DEBUG);
        logger2.addAppender(rollingFileAppender);
        StatusPrinter.print(loggerContext);
        List<Status> copyOfStatusList = loggerContext.getStatusManager().getCopyOfStatusList();
        s.f(copyOfStatusList, "loggerContext.statusManager.copyOfStatusList");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : copyOfStatusList) {
            if (((Status) obj).getLevel() == 2) {
                arrayList2.add(obj);
            }
        }
        return new a(arrayList, arrayList2.isEmpty() ^ true ? e0.l0(arrayList2, ", ", null, null, 0, null, C0493b.f25255a, 30, null) : null);
    }
}