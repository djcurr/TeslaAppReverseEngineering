package ch.qos.logback.core.html;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.ConverterUtil;
import ch.qos.logback.core.pattern.parser.Parser;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import ch.qos.logback.core.spi.ScanException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class HTMLLayoutBase<E> extends LayoutBase<E> {
    protected CssBuilder cssBuilder;
    protected Converter<E> head;
    protected String pattern;
    protected String title = "Logback Log Messages";
    protected long counter = 0;

    private void buildHeaderRowForTable(StringBuilder sb2) {
        sb2.append("<tr class=\"header\">");
        sb2.append(CoreConstants.LINE_SEPARATOR);
        for (Converter<E> converter = this.head; converter != null; converter = converter.getNext()) {
            if (computeConverterName(converter) != null) {
                sb2.append("<td class=\"");
                sb2.append(computeConverterName(converter));
                sb2.append("\">");
                sb2.append(computeConverterName(converter));
                sb2.append("</td>");
                sb2.append(CoreConstants.LINE_SEPARATOR);
            }
        }
        sb2.append("</tr>");
        sb2.append(CoreConstants.LINE_SEPARATOR);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String computeConverterName(Converter<E> converter) {
        String simpleName = converter.getClass().getSimpleName();
        int indexOf = simpleName.indexOf("Converter");
        return indexOf == -1 ? simpleName : simpleName.substring(0, indexOf);
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getContentType() {
        return "text/html";
    }

    public CssBuilder getCssBuilder() {
        return this.cssBuilder;
    }

    protected abstract Map<String, String> getDefaultConverterMap();

    public Map<String, String> getEffectiveConverterMap() {
        Map map;
        HashMap hashMap = new HashMap();
        Map<String, String> defaultConverterMap = getDefaultConverterMap();
        if (defaultConverterMap != null) {
            hashMap.putAll(defaultConverterMap);
        }
        Context context = getContext();
        if (context != null && (map = (Map) context.getObject(CoreConstants.PATTERN_RULE_REGISTRY)) != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getFileFooter() {
        return CoreConstants.LINE_SEPARATOR + "</body></html>";
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getFileHeader() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"");
        sb2.append(" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">");
        String str = CoreConstants.LINE_SEPARATOR;
        sb2.append(str);
        sb2.append("<html>");
        sb2.append(str);
        sb2.append("  <head>");
        sb2.append(str);
        sb2.append("    <title>");
        sb2.append(this.title);
        sb2.append("</title>");
        sb2.append(str);
        this.cssBuilder.addCss(sb2);
        sb2.append(str);
        sb2.append("  </head>");
        sb2.append(str);
        sb2.append("<body>");
        sb2.append(str);
        return sb2.toString();
    }

    public String getPattern() {
        return this.pattern;
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getPresentationFooter() {
        return "</table>";
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getPresentationHeader() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<hr/>");
        String str = CoreConstants.LINE_SEPARATOR;
        sb2.append(str);
        sb2.append("<p>Log session start time ");
        sb2.append(new Date());
        sb2.append("</p><p></p>");
        sb2.append(str);
        sb2.append(str);
        sb2.append("<table cellspacing=\"0\">");
        sb2.append(str);
        buildHeaderRowForTable(sb2);
        return sb2.toString();
    }

    public String getTitle() {
        return this.title;
    }

    public void setCssBuilder(CssBuilder cssBuilder) {
        this.cssBuilder = cssBuilder;
    }

    public void setPattern(String str) {
        this.pattern = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        boolean z11;
        try {
            Parser parser = new Parser(this.pattern);
            parser.setContext(getContext());
            Converter<E> compile = parser.compile(parser.parse(), getEffectiveConverterMap());
            this.head = compile;
            ConverterUtil.startConverters(compile);
            z11 = false;
        } catch (ScanException e11) {
            addError("Incorrect pattern found", e11);
            z11 = true;
        }
        if (z11) {
            return;
        }
        this.started = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void startNewTableIfLimitReached(StringBuilder sb2) {
        if (this.counter >= AbstractComponentTracker.LINGERING_TIMEOUT) {
            this.counter = 0L;
            sb2.append("</table>");
            String str = CoreConstants.LINE_SEPARATOR;
            sb2.append(str);
            sb2.append("<p></p>");
            sb2.append("<table cellspacing=\"0\">");
            sb2.append(str);
            buildHeaderRowForTable(sb2);
        }
    }
}