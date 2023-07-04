package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* loaded from: classes.dex */
public class ThrowableProxy implements IThrowableProxy {
    private static final Method GET_SUPPRESSED_METHOD;
    private static final StackTraceElementProxy[] NO_STACK_TRACE;
    private static final ThrowableProxy[] NO_SUPPRESSED;
    private boolean calculatedPackageData;
    private ThrowableProxy cause;
    private String className;
    int commonFrames;
    private String message;
    private transient PackagingDataCalculator packagingDataCalculator;
    StackTraceElementProxy[] stackTraceElementProxyArray;
    private ThrowableProxy[] suppressed;
    private Throwable throwable;

    static {
        Method method;
        try {
            method = Throwable.class.getMethod("getSuppressed", new Class[0]);
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        GET_SUPPRESSED_METHOD = method;
        NO_SUPPRESSED = new ThrowableProxy[0];
        NO_STACK_TRACE = new StackTraceElementProxy[0];
    }

    public ThrowableProxy(Throwable th2) {
        this(th2, Collections.newSetFromMap(new IdentityHashMap(1)));
    }

    private ThrowableProxy(Throwable th2, Set<Throwable> set) {
        this.suppressed = NO_SUPPRESSED;
        this.calculatedPackageData = false;
        this.throwable = th2;
        this.className = th2.getClass().getName();
        this.message = th2.getMessage();
        this.stackTraceElementProxyArray = ThrowableProxyUtil.steArrayToStepArray(th2.getStackTrace());
        if (set.contains(th2)) {
            this.className = "CIRCULAR REFERENCE:" + th2.getClass().getName();
            this.stackTraceElementProxyArray = NO_STACK_TRACE;
            return;
        }
        set.add(th2);
        Throwable cause = th2.getCause();
        if (cause != null) {
            ThrowableProxy throwableProxy = new ThrowableProxy(cause, set);
            this.cause = throwableProxy;
            throwableProxy.commonFrames = ThrowableProxyUtil.findNumberOfCommonFrames(cause.getStackTrace(), this.stackTraceElementProxyArray);
        }
        Method method = GET_SUPPRESSED_METHOD;
        if (method != null) {
            try {
                Object invoke = method.invoke(th2, new Object[0]);
                if (invoke instanceof Throwable[]) {
                    Throwable[] thArr = (Throwable[]) invoke;
                    if (thArr.length > 0) {
                        this.suppressed = new ThrowableProxy[thArr.length];
                        for (int i11 = 0; i11 < thArr.length; i11++) {
                            this.suppressed[i11] = new ThrowableProxy(thArr[i11], set);
                            this.suppressed[i11].commonFrames = ThrowableProxyUtil.findNumberOfCommonFrames(thArr[i11].getStackTrace(), this.stackTraceElementProxyArray);
                        }
                    }
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public void calculatePackagingData() {
        PackagingDataCalculator packagingDataCalculator;
        if (this.calculatedPackageData || (packagingDataCalculator = getPackagingDataCalculator()) == null) {
            return;
        }
        this.calculatedPackageData = true;
        packagingDataCalculator.calculate(this);
    }

    public void fullDump() {
        StackTraceElementProxy[] stackTraceElementProxyArr;
        StringBuilder sb2 = new StringBuilder();
        for (StackTraceElementProxy stackTraceElementProxy : this.stackTraceElementProxyArray) {
            String stackTraceElementProxy2 = stackTraceElementProxy.toString();
            sb2.append('\t');
            sb2.append(stackTraceElementProxy2);
            ThrowableProxyUtil.subjoinPackagingData(sb2, stackTraceElementProxy);
            sb2.append(CoreConstants.LINE_SEPARATOR);
        }
        System.out.println(sb2.toString());
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public IThrowableProxy getCause() {
        return this.cause;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public String getClassName() {
        return this.className;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public int getCommonFrames() {
        return this.commonFrames;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public String getMessage() {
        return this.message;
    }

    public PackagingDataCalculator getPackagingDataCalculator() {
        if (this.throwable != null && this.packagingDataCalculator == null) {
            this.packagingDataCalculator = new PackagingDataCalculator();
        }
        return this.packagingDataCalculator;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public StackTraceElementProxy[] getStackTraceElementProxyArray() {
        return this.stackTraceElementProxyArray;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public IThrowableProxy[] getSuppressed() {
        return this.suppressed;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }
}