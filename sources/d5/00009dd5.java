package org.spongycastle.i18n;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;

/* loaded from: classes4.dex */
public class MissingEntryException extends RuntimeException {
    private String debugMsg;
    protected final String key;
    protected final ClassLoader loader;
    protected final Locale locale;
    protected final String resource;

    public MissingEntryException(String str, String str2, String str3, Locale locale, ClassLoader classLoader) {
        super(str);
        this.resource = str2;
        this.key = str3;
        this.locale = locale;
        this.loader = classLoader;
    }

    public ClassLoader getClassLoader() {
        return this.loader;
    }

    public String getDebugMsg() {
        URL[] uRLs;
        if (this.debugMsg == null) {
            this.debugMsg = "Can not find entry " + this.key + " in resource file " + this.resource + " for the locale " + this.locale + ".";
            ClassLoader classLoader = this.loader;
            if (classLoader instanceof URLClassLoader) {
                this.debugMsg += " The following entries in the classpath were searched: ";
                for (int i11 = 0; i11 != ((URLClassLoader) classLoader).getURLs().length; i11++) {
                    this.debugMsg += uRLs[i11] + " ";
                }
            }
        }
        return this.debugMsg;
    }

    public String getKey() {
        return this.key;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public String getResource() {
        return this.resource;
    }

    public MissingEntryException(String str, Throwable th2, String str2, String str3, Locale locale, ClassLoader classLoader) {
        super(str, th2);
        this.resource = str2;
        this.key = str3;
        this.locale = locale;
        this.loader = classLoader;
    }
}