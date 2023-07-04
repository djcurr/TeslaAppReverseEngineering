package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;
import java.net.URL;
import java.security.CodeSource;
import java.util.HashMap;

/* loaded from: classes.dex */
public class PackagingDataCalculator {
    static final StackTraceElementProxy[] STEP_ARRAY_TEMPLATE = new StackTraceElementProxy[0];
    HashMap<String, ClassPackagingData> cache = new HashMap<>();

    private Class<?> bestEffortLoadClass(ClassLoader classLoader, String str) {
        Class<?> loadClass = loadClass(classLoader, str);
        if (loadClass != null) {
            return loadClass;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != classLoader) {
            loadClass = loadClass(contextClassLoader, str);
        }
        if (loadClass != null) {
            return loadClass;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    private ClassPackagingData computeBySTEP(StackTraceElementProxy stackTraceElementProxy, ClassLoader classLoader) {
        String className = stackTraceElementProxy.ste.getClassName();
        ClassPackagingData classPackagingData = this.cache.get(className);
        if (classPackagingData != null) {
            return classPackagingData;
        }
        Class<?> bestEffortLoadClass = bestEffortLoadClass(classLoader, className);
        ClassPackagingData classPackagingData2 = new ClassPackagingData(getCodeLocation(bestEffortLoadClass), getImplementationVersion(bestEffortLoadClass), false);
        this.cache.put(className, classPackagingData2);
        return classPackagingData2;
    }

    private String getCodeLocation(Class<?> cls) {
        URL location;
        if (cls != null) {
            try {
                CodeSource codeSource = cls.getProtectionDomain().getCodeSource();
                if (codeSource == null || (location = codeSource.getLocation()) == null) {
                    return "na";
                }
                String url = location.toString();
                String codeLocation = getCodeLocation(url, '/');
                return codeLocation != null ? codeLocation : getCodeLocation(url, CoreConstants.ESCAPE_CHAR);
            } catch (Exception unused) {
                return "na";
            }
        }
        return "na";
    }

    private String getCodeLocation(String str, char c11) {
        int lastIndexOf = str.lastIndexOf(c11);
        if (isFolder(lastIndexOf, str)) {
            return str.substring(str.lastIndexOf(c11, lastIndexOf - 1) + 1);
        }
        if (lastIndexOf > 0) {
            return str.substring(lastIndexOf + 1);
        }
        return null;
    }

    private String getImplementationVersion(Class<?> cls) {
        Package r22;
        String implementationVersion;
        return (cls == null || (r22 = cls.getPackage()) == null || (implementationVersion = r22.getImplementationVersion()) == null) ? "na" : implementationVersion;
    }

    private boolean isFolder(int i11, String str) {
        return i11 != -1 && i11 + 1 == str.length();
    }

    private Class<?> loadClass(ClassLoader classLoader, String str) {
        if (classLoader == null) {
            return null;
        }
        try {
            return classLoader.loadClass(str);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    private void populateFrames(StackTraceElementProxy[] stackTraceElementProxyArr) {
        int findNumberOfCommonFrames = STEUtil.findNumberOfCommonFrames(new Throwable("local stack reference").getStackTrace(), stackTraceElementProxyArr);
        int length = stackTraceElementProxyArr.length - findNumberOfCommonFrames;
        for (int i11 = 0; i11 < findNumberOfCommonFrames; i11++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArr[length + i11];
            stackTraceElementProxy.setClassPackagingData(computeBySTEP(stackTraceElementProxy, null));
        }
        populateUncommonFrames(findNumberOfCommonFrames, stackTraceElementProxyArr, null);
    }

    private void populateUncommonFrames(int i11, StackTraceElementProxy[] stackTraceElementProxyArr, ClassLoader classLoader) {
        int length = stackTraceElementProxyArr.length - i11;
        for (int i12 = 0; i12 < length; i12++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArr[i12];
            stackTraceElementProxy.setClassPackagingData(computeBySTEP(stackTraceElementProxy, classLoader));
        }
    }

    public void calculate(IThrowableProxy iThrowableProxy) {
        while (iThrowableProxy != null) {
            populateFrames(iThrowableProxy.getStackTraceElementProxyArray());
            IThrowableProxy[] suppressed = iThrowableProxy.getSuppressed();
            if (suppressed != null) {
                for (IThrowableProxy iThrowableProxy2 : suppressed) {
                    populateFrames(iThrowableProxy2.getStackTraceElementProxyArray());
                }
            }
            iThrowableProxy = iThrowableProxy.getCause();
        }
    }
}