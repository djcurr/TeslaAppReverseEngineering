package org.slf4j;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.NOPLoggerFactory;
import org.slf4j.helpers.SubstituteLogger;
import org.slf4j.helpers.SubstituteLoggerFactory;
import org.slf4j.helpers.Util;
import org.slf4j.impl.StaticLoggerBinder;

/* loaded from: classes5.dex */
public final class LoggerFactory {
    static final String CODES_PREFIX = "http://www.slf4j.org/codes.html";
    static final int FAILED_INITIALIZATION = 2;
    static volatile int INITIALIZATION_STATE = 0;
    static final String JAVA_VENDOR_PROPERTY = "java.vendor.url";
    static final String LOGGER_NAME_MISMATCH_URL = "http://www.slf4j.org/codes.html#loggerNameMismatch";
    static final String MULTIPLE_BINDINGS_URL = "http://www.slf4j.org/codes.html#multiple_bindings";
    static final int NOP_FALLBACK_INITIALIZATION = 4;
    static final String NO_STATICLOGGERBINDER_URL = "http://www.slf4j.org/codes.html#StaticLoggerBinder";
    static final String NULL_LF_URL = "http://www.slf4j.org/codes.html#null_LF";
    static final int ONGOING_INITIALIZATION = 1;
    static final String REPLAY_URL = "http://www.slf4j.org/codes.html#replay";
    static final String SUBSTITUTE_LOGGER_URL = "http://www.slf4j.org/codes.html#substituteLogger";
    static final int SUCCESSFUL_INITIALIZATION = 3;
    static final int UNINITIALIZED = 0;
    static final String UNSUCCESSFUL_INIT_MSG = "org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit";
    static final String UNSUCCESSFUL_INIT_URL = "http://www.slf4j.org/codes.html#unsuccessfulInit";
    static final String VERSION_MISMATCH = "http://www.slf4j.org/codes.html#version_mismatch";
    static final SubstituteLoggerFactory SUBST_FACTORY = new SubstituteLoggerFactory();
    static final NOPLoggerFactory NOP_FALLBACK_FACTORY = new NOPLoggerFactory();
    static final String DETECT_LOGGER_NAME_MISMATCH_PROPERTY = "slf4j.detectLoggerNameMismatch";
    static boolean DETECT_LOGGER_NAME_MISMATCH = Util.safeGetBooleanSystemProperty(DETECT_LOGGER_NAME_MISMATCH_PROPERTY);
    private static final String[] API_COMPATIBILITY_LIST = {"1.6", "1.7"};
    private static String STATIC_LOGGER_BINDER_PATH = "org/slf4j/impl/StaticLoggerBinder.class";

    private LoggerFactory() {
    }

    private static final void bind() {
        Set<URL> set = null;
        try {
            try {
                if (!isAndroid()) {
                    set = findPossibleStaticLoggerBinderPathSet();
                    reportMultipleBindingAmbiguity(set);
                }
                StaticLoggerBinder.getSingleton();
                INITIALIZATION_STATE = 3;
                reportActualBinding(set);
            } catch (Exception e11) {
                failedBinding(e11);
                throw new IllegalStateException("Unexpected initialization failure", e11);
            } catch (NoClassDefFoundError e12) {
                if (messageContainsOrgSlf4jImplStaticLoggerBinder(e12.getMessage())) {
                    INITIALIZATION_STATE = 4;
                    Util.report("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                    Util.report("Defaulting to no-operation (NOP) logger implementation");
                    Util.report("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                } else {
                    failedBinding(e12);
                    throw e12;
                }
            } catch (NoSuchMethodError e13) {
                String message = e13.getMessage();
                if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                    INITIALIZATION_STATE = 2;
                    Util.report("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                    Util.report("Your binding is version 1.5.5 or earlier.");
                    Util.report("Upgrade your binding to version 1.6.x.");
                }
                throw e13;
            }
        } finally {
            postBindCleanUp();
        }
    }

    private static void emitReplayOrSubstituionWarning(SubstituteLoggingEvent substituteLoggingEvent, int i11) {
        if (substituteLoggingEvent.getLogger().isDelegateEventAware()) {
            emitReplayWarning(i11);
        } else if (substituteLoggingEvent.getLogger().isDelegateNOP()) {
        } else {
            emitSubstitutionWarning();
        }
    }

    private static void emitReplayWarning(int i11) {
        Util.report("A number (" + i11 + ") of logging calls during the initialization phase have been intercepted and are");
        Util.report("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        Util.report("See also http://www.slf4j.org/codes.html#replay");
    }

    private static void emitSubstitutionWarning() {
        Util.report("The following set of substitute loggers may have been accessed");
        Util.report("during the initialization phase. Logging calls during this");
        Util.report("phase were not honored. However, subsequent logging calls to these");
        Util.report("loggers will work as normally expected.");
        Util.report("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    static void failedBinding(Throwable th2) {
        INITIALIZATION_STATE = 2;
        Util.report("Failed to instantiate SLF4J LoggerFactory", th2);
    }

    static Set<URL> findPossibleStaticLoggerBinderPathSet() {
        Enumeration<URL> resources;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = LoggerFactory.class.getClassLoader();
            if (classLoader == null) {
                resources = ClassLoader.getSystemResources(STATIC_LOGGER_BINDER_PATH);
            } else {
                resources = classLoader.getResources(STATIC_LOGGER_BINDER_PATH);
            }
            while (resources.hasMoreElements()) {
                linkedHashSet.add(resources.nextElement());
            }
        } catch (IOException e11) {
            Util.report("Error getting resources from path", e11);
        }
        return linkedHashSet;
    }

    private static void fixSubstituteLoggers() {
        SubstituteLoggerFactory substituteLoggerFactory = SUBST_FACTORY;
        synchronized (substituteLoggerFactory) {
            substituteLoggerFactory.postInitialization();
            for (SubstituteLogger substituteLogger : substituteLoggerFactory.getLoggers()) {
                substituteLogger.setDelegate(getLogger(substituteLogger.getName()));
            }
        }
    }

    public static ILoggerFactory getILoggerFactory() {
        if (INITIALIZATION_STATE == 0) {
            synchronized (LoggerFactory.class) {
                if (INITIALIZATION_STATE == 0) {
                    INITIALIZATION_STATE = 1;
                    performInitialization();
                }
            }
        }
        int i11 = INITIALIZATION_STATE;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        return NOP_FALLBACK_FACTORY;
                    }
                    throw new IllegalStateException("Unreachable code");
                }
                return StaticLoggerBinder.getSingleton().getLoggerFactory();
            }
            throw new IllegalStateException(UNSUCCESSFUL_INIT_MSG);
        }
        return SUBST_FACTORY;
    }

    public static Logger getLogger(String str) {
        return getILoggerFactory().getLogger(str);
    }

    private static boolean isAmbiguousStaticLoggerBinderPathSet(Set<URL> set) {
        return set.size() > 1;
    }

    private static boolean isAndroid() {
        String safeGetSystemProperty = Util.safeGetSystemProperty(JAVA_VENDOR_PROPERTY);
        if (safeGetSystemProperty == null) {
            return false;
        }
        return safeGetSystemProperty.toLowerCase().contains("android");
    }

    private static boolean messageContainsOrgSlf4jImplStaticLoggerBinder(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("org/slf4j/impl/StaticLoggerBinder") || str.contains("org.slf4j.impl.StaticLoggerBinder");
    }

    private static boolean nonMatchingClasses(Class<?> cls, Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    private static final void performInitialization() {
        bind();
        if (INITIALIZATION_STATE == 3) {
            versionSanityCheck();
        }
    }

    private static void postBindCleanUp() {
        fixSubstituteLoggers();
        replayEvents();
        SUBST_FACTORY.clear();
    }

    private static void replayEvents() {
        LinkedBlockingQueue<SubstituteLoggingEvent> eventQueue = SUBST_FACTORY.getEventQueue();
        int size = eventQueue.size();
        ArrayList<SubstituteLoggingEvent> arrayList = new ArrayList(128);
        int i11 = 0;
        while (eventQueue.drainTo(arrayList, 128) != 0) {
            for (SubstituteLoggingEvent substituteLoggingEvent : arrayList) {
                replaySingleEvent(substituteLoggingEvent);
                int i12 = i11 + 1;
                if (i11 == 0) {
                    emitReplayOrSubstituionWarning(substituteLoggingEvent, size);
                }
                i11 = i12;
            }
            arrayList.clear();
        }
    }

    private static void replaySingleEvent(SubstituteLoggingEvent substituteLoggingEvent) {
        if (substituteLoggingEvent == null) {
            return;
        }
        SubstituteLogger logger = substituteLoggingEvent.getLogger();
        String name = logger.getName();
        if (!logger.isDelegateNull()) {
            if (logger.isDelegateNOP()) {
                return;
            }
            if (logger.isDelegateEventAware()) {
                logger.log(substituteLoggingEvent);
                return;
            } else {
                Util.report(name);
                return;
            }
        }
        throw new IllegalStateException("Delegate logger cannot be null at this state.");
    }

    private static void reportActualBinding(Set<URL> set) {
        if (set == null || !isAmbiguousStaticLoggerBinderPathSet(set)) {
            return;
        }
        Util.report("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    private static void reportMultipleBindingAmbiguity(Set<URL> set) {
        if (isAmbiguousStaticLoggerBinderPathSet(set)) {
            Util.report("Class path contains multiple SLF4J bindings.");
            Iterator<URL> it2 = set.iterator();
            while (it2.hasNext()) {
                Util.report("Found binding in [" + it2.next() + "]");
            }
            Util.report("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    static void reset() {
        INITIALIZATION_STATE = 0;
    }

    private static final void versionSanityCheck() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z11 = false;
            for (String str2 : API_COMPATIBILITY_LIST) {
                if (str.startsWith(str2)) {
                    z11 = true;
                }
            }
            if (z11) {
                return;
            }
            Util.report("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(API_COMPATIBILITY_LIST).toString());
            Util.report("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th2) {
            Util.report("Unexpected problem occured during version sanity check", th2);
        }
    }

    public static Logger getLogger(Class<?> cls) {
        Class<?> callingClass;
        Logger logger = getLogger(cls.getName());
        if (DETECT_LOGGER_NAME_MISMATCH && (callingClass = Util.getCallingClass()) != null && nonMatchingClasses(cls, callingClass)) {
            Util.report(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", logger.getName(), callingClass.getName()));
            Util.report("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return logger;
    }
}