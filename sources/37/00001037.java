package ch.qos.logback.classic.html;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.html.CssBuilder;

/* loaded from: classes.dex */
public class DefaultCssBuilder implements CssBuilder {
    @Override // ch.qos.logback.core.html.CssBuilder
    public void addCss(StringBuilder sb2) {
        sb2.append("<style  type=\"text/css\">");
        String str = CoreConstants.LINE_SEPARATOR;
        sb2.append(str);
        sb2.append("table { margin-left: 2em; margin-right: 2em; border-left: 2px solid #AAA; }");
        sb2.append(str);
        sb2.append("TR.even { background: #FFFFFF; }");
        sb2.append(str);
        sb2.append("TR.odd { background: #EAEAEA; }");
        sb2.append(str);
        sb2.append("TR.warn TD.Level, TR.error TD.Level, TR.fatal TD.Level {font-weight: bold; color: #FF4040 }");
        sb2.append(str);
        sb2.append("TD { padding-right: 1ex; padding-left: 1ex; border-right: 2px solid #AAA; }");
        sb2.append(str);
        sb2.append("TD.Time, TD.Date { text-align: right; font-family: courier, monospace; font-size: smaller; }");
        sb2.append(str);
        sb2.append("TD.Thread { text-align: left; }");
        sb2.append(str);
        sb2.append("TD.Level { text-align: right; }");
        sb2.append(str);
        sb2.append("TD.Logger { text-align: left; }");
        sb2.append(str);
        sb2.append("TR.header { background: #596ED5; color: #FFF; font-weight: bold; font-size: larger; }");
        sb2.append(str);
        sb2.append("TD.Exception { background: #A2AEE8; font-family: courier, monospace;}");
        sb2.append(str);
        sb2.append("</style>");
        sb2.append(str);
    }
}