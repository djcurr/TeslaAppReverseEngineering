package org.spongycastle.i18n;

import com.adyen.checkout.components.model.payments.request.Address;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TimeZone;
import org.spongycastle.i18n.filter.Filter;
import org.spongycastle.i18n.filter.TrustedInput;
import org.spongycastle.i18n.filter.UntrustedInput;
import org.spongycastle.i18n.filter.UntrustedUrlInput;

/* loaded from: classes4.dex */
public class LocalizedMessage {
    public static final String DEFAULT_ENCODING = "ISO-8859-1";
    protected FilteredArguments arguments;
    protected String encoding;
    protected FilteredArguments extraArgs;
    protected Filter filter;

    /* renamed from: id  reason: collision with root package name */
    protected final String f43632id;
    protected ClassLoader loader;
    protected final String resource;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public class FilteredArguments {
        protected static final int FILTER = 1;
        protected static final int FILTER_URL = 2;
        protected static final int NO_FILTER = 0;
        protected int[] argFilterType;
        protected Object[] arguments;
        protected Filter filter;
        protected Object[] filteredArgs;
        protected boolean[] isLocaleSpecific;
        protected Object[] unpackedArgs;

        FilteredArguments(LocalizedMessage localizedMessage) {
            this(new Object[0]);
        }

        private Object filter(int i11, Object obj) {
            Filter filter = this.filter;
            if (filter != null) {
                if (obj == null) {
                    obj = Address.ADDRESS_NULL_PLACEHOLDER;
                }
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            return null;
                        }
                        return filter.doFilterUrl(obj.toString());
                    }
                    return filter.doFilter(obj.toString());
                }
            }
            return obj;
        }

        public Object[] getArguments() {
            return this.arguments;
        }

        public Filter getFilter() {
            return this.filter;
        }

        public Object[] getFilteredArgs(Locale locale) {
            Object filter;
            Object[] objArr = new Object[this.unpackedArgs.length];
            int i11 = 0;
            while (true) {
                Object[] objArr2 = this.unpackedArgs;
                if (i11 >= objArr2.length) {
                    return objArr;
                }
                Object[] objArr3 = this.filteredArgs;
                if (objArr3[i11] != null) {
                    filter = objArr3[i11];
                } else {
                    Object obj = objArr2[i11];
                    if (this.isLocaleSpecific[i11]) {
                        filter = filter(this.argFilterType[i11], ((LocaleString) obj).getLocaleString(locale));
                    } else {
                        filter = filter(this.argFilterType[i11], obj);
                        this.filteredArgs[i11] = filter;
                    }
                }
                objArr[i11] = filter;
                i11++;
            }
        }

        public boolean isEmpty() {
            return this.unpackedArgs.length == 0;
        }

        public void setFilter(Filter filter) {
            if (filter != this.filter) {
                for (int i11 = 0; i11 < this.unpackedArgs.length; i11++) {
                    this.filteredArgs[i11] = null;
                }
            }
            this.filter = filter;
        }

        FilteredArguments(Object[] objArr) {
            this.filter = null;
            this.arguments = objArr;
            this.unpackedArgs = new Object[objArr.length];
            this.filteredArgs = new Object[objArr.length];
            this.isLocaleSpecific = new boolean[objArr.length];
            this.argFilterType = new int[objArr.length];
            for (int i11 = 0; i11 < objArr.length; i11++) {
                if (objArr[i11] instanceof TrustedInput) {
                    this.unpackedArgs[i11] = ((TrustedInput) objArr[i11]).getInput();
                    this.argFilterType[i11] = 0;
                } else if (objArr[i11] instanceof UntrustedInput) {
                    this.unpackedArgs[i11] = ((UntrustedInput) objArr[i11]).getInput();
                    if (objArr[i11] instanceof UntrustedUrlInput) {
                        this.argFilterType[i11] = 2;
                    } else {
                        this.argFilterType[i11] = 1;
                    }
                } else {
                    this.unpackedArgs[i11] = objArr[i11];
                    this.argFilterType[i11] = 1;
                }
                this.isLocaleSpecific[i11] = this.unpackedArgs[i11] instanceof LocaleString;
            }
        }
    }

    public LocalizedMessage(String str, String str2) {
        this.encoding = DEFAULT_ENCODING;
        this.extraArgs = null;
        this.filter = null;
        this.loader = null;
        if (str != null && str2 != null) {
            this.f43632id = str2;
            this.resource = str;
            this.arguments = new FilteredArguments(this);
            return;
        }
        throw null;
    }

    protected String addExtraArgs(String str, Locale locale) {
        if (this.extraArgs != null) {
            StringBuffer stringBuffer = new StringBuffer(str);
            Object[] filteredArgs = this.extraArgs.getFilteredArgs(locale);
            for (Object obj : filteredArgs) {
                stringBuffer.append(obj);
            }
            return stringBuffer.toString();
        }
        return str;
    }

    protected String formatWithTimeZone(String str, Object[] objArr, Locale locale, TimeZone timeZone) {
        MessageFormat messageFormat = new MessageFormat(" ");
        messageFormat.setLocale(locale);
        messageFormat.applyPattern(str);
        if (!timeZone.equals(TimeZone.getDefault())) {
            Format[] formats = messageFormat.getFormats();
            for (int i11 = 0; i11 < formats.length; i11++) {
                if (formats[i11] instanceof DateFormat) {
                    DateFormat dateFormat = (DateFormat) formats[i11];
                    dateFormat.setTimeZone(timeZone);
                    messageFormat.setFormat(i11, dateFormat);
                }
            }
        }
        return messageFormat.format(objArr);
    }

    public Object[] getArguments() {
        return this.arguments.getArguments();
    }

    public ClassLoader getClassLoader() {
        return this.loader;
    }

    public String getEntry(String str, Locale locale, TimeZone timeZone) {
        ResourceBundle bundle;
        String str2 = this.f43632id;
        if (str != null) {
            str2 = str2 + "." + str;
        }
        String str3 = str2;
        try {
            ClassLoader classLoader = this.loader;
            if (classLoader == null) {
                bundle = ResourceBundle.getBundle(this.resource, locale);
            } else {
                bundle = ResourceBundle.getBundle(this.resource, locale, classLoader);
            }
            String string = bundle.getString(str3);
            if (!this.encoding.equals(DEFAULT_ENCODING)) {
                string = new String(string.getBytes(DEFAULT_ENCODING), this.encoding);
            }
            if (!this.arguments.isEmpty()) {
                string = formatWithTimeZone(string, this.arguments.getFilteredArgs(locale), locale, timeZone);
            }
            return addExtraArgs(string, locale);
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException(e11);
        } catch (MissingResourceException unused) {
            String str4 = "Can't find entry " + str3 + " in resource file " + this.resource + ".";
            String str5 = this.resource;
            ClassLoader classLoader2 = this.loader;
            if (classLoader2 == null) {
                classLoader2 = getClassLoader();
            }
            throw new MissingEntryException(str4, str5, str3, locale, classLoader2);
        }
    }

    public Object[] getExtraArgs() {
        FilteredArguments filteredArguments = this.extraArgs;
        if (filteredArguments == null) {
            return null;
        }
        return filteredArguments.getArguments();
    }

    public Filter getFilter() {
        return this.filter;
    }

    public String getId() {
        return this.f43632id;
    }

    public String getResource() {
        return this.resource;
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.loader = classLoader;
    }

    public void setExtraArgument(Object obj) {
        setExtraArguments(new Object[]{obj});
    }

    public void setExtraArguments(Object[] objArr) {
        if (objArr != null) {
            FilteredArguments filteredArguments = new FilteredArguments(objArr);
            this.extraArgs = filteredArguments;
            filteredArguments.setFilter(this.filter);
            return;
        }
        this.extraArgs = null;
    }

    public void setFilter(Filter filter) {
        this.arguments.setFilter(filter);
        FilteredArguments filteredArguments = this.extraArgs;
        if (filteredArguments != null) {
            filteredArguments.setFilter(filter);
        }
        this.filter = filter;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Resource: \"");
        stringBuffer.append(this.resource);
        stringBuffer.append("\" Id: \"");
        stringBuffer.append(this.f43632id);
        stringBuffer.append("\"");
        stringBuffer.append(" Arguments: ");
        stringBuffer.append(this.arguments.getArguments().length);
        stringBuffer.append(" normal");
        FilteredArguments filteredArguments = this.extraArgs;
        if (filteredArguments != null && filteredArguments.getArguments().length > 0) {
            stringBuffer.append(", ");
            stringBuffer.append(this.extraArgs.getArguments().length);
            stringBuffer.append(" extra");
        }
        stringBuffer.append(" Encoding: ");
        stringBuffer.append(this.encoding);
        stringBuffer.append(" ClassLoader: ");
        stringBuffer.append(this.loader);
        return stringBuffer.toString();
    }

    public LocalizedMessage(String str, String str2, String str3) {
        this.encoding = DEFAULT_ENCODING;
        this.extraArgs = null;
        this.filter = null;
        this.loader = null;
        if (str != null && str2 != null) {
            this.f43632id = str2;
            this.resource = str;
            this.arguments = new FilteredArguments(this);
            if (Charset.isSupported(str3)) {
                this.encoding = str3;
                return;
            }
            throw new UnsupportedEncodingException("The encoding \"" + str3 + "\" is not supported.");
        }
        throw null;
    }

    public LocalizedMessage(String str, String str2, Object[] objArr) {
        this.encoding = DEFAULT_ENCODING;
        this.extraArgs = null;
        this.filter = null;
        this.loader = null;
        if (str != null && str2 != null && objArr != null) {
            this.f43632id = str2;
            this.resource = str;
            this.arguments = new FilteredArguments(objArr);
            return;
        }
        throw null;
    }

    public LocalizedMessage(String str, String str2, String str3, Object[] objArr) {
        this.encoding = DEFAULT_ENCODING;
        this.extraArgs = null;
        this.filter = null;
        this.loader = null;
        if (str != null && str2 != null && objArr != null) {
            this.f43632id = str2;
            this.resource = str;
            this.arguments = new FilteredArguments(objArr);
            if (Charset.isSupported(str3)) {
                this.encoding = str3;
                return;
            }
            throw new UnsupportedEncodingException("The encoding \"" + str3 + "\" is not supported.");
        }
        throw null;
    }
}