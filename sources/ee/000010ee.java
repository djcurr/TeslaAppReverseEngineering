package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.action.ActionUtil;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class PropertyAction extends Action {
    static String INVALID_ATTRIBUTES = "In <property> element, either the \"file\" attribute alone, or the \"resource\" element alone, or both the \"name\" and \"value\" attributes must be set.";
    static final String RESOURCE_ATTRIBUTE = "resource";

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
        String str2;
        String subst;
        StringBuilder sb2;
        String str3;
        StringBuilder sb3;
        String str4;
        if ("substitutionProperty".equals(str)) {
            addWarn("[substitutionProperty] element has been deprecated. Please use the [property] element instead.");
        }
        String value = attributes.getValue("name");
        String value2 = attributes.getValue("value");
        ActionUtil.Scope stringToScope = ActionUtil.stringToScope(attributes.getValue("scope"));
        if (!checkFileAttributeSanity(attributes)) {
            if (!checkResourceAttributeSanity(attributes)) {
                if (checkValueNameAttributesSanity(attributes)) {
                    ActionUtil.setProperty(interpretationContext, value, interpretationContext.subst(RegularEscapeUtil.basicEscape(value2).trim()), stringToScope);
                    return;
                }
                str2 = INVALID_ATTRIBUTES;
                addError(str2);
                return;
            }
            subst = interpretationContext.subst(attributes.getValue(RESOURCE_ATTRIBUTE));
            URL resourceBySelfClassLoader = Loader.getResourceBySelfClassLoader(subst);
            if (resourceBySelfClassLoader == null) {
                sb3 = new StringBuilder();
                str4 = "Could not find resource [";
                sb3.append(str4);
                sb3.append(subst);
                sb3.append("].");
                str2 = sb3.toString();
                addError(str2);
                return;
            }
            try {
                loadAndSetProperties(interpretationContext, FirebasePerfUrlConnection.openStream(resourceBySelfClassLoader), stringToScope);
                return;
            } catch (IOException e11) {
                e = e11;
                sb2 = new StringBuilder();
                str3 = "Could not read resource file [";
                sb2.append(str3);
                sb2.append(subst);
                sb2.append("].");
                addError(sb2.toString(), e);
            }
        }
        subst = interpretationContext.subst(attributes.getValue(Action.FILE_ATTRIBUTE));
        try {
            loadAndSetProperties(interpretationContext, new FileInputStream(subst), stringToScope);
        } catch (FileNotFoundException unused) {
            sb3 = new StringBuilder();
            str4 = "Could not find properties file [";
        } catch (IOException e12) {
            e = e12;
            sb2 = new StringBuilder();
            str3 = "Could not read properties file [";
            sb2.append(str3);
            sb2.append(subst);
            sb2.append("].");
            addError(sb2.toString(), e);
        }
    }

    boolean checkFileAttributeSanity(Attributes attributes) {
        return !OptionHelper.isEmpty(attributes.getValue(Action.FILE_ATTRIBUTE)) && OptionHelper.isEmpty(attributes.getValue("name")) && OptionHelper.isEmpty(attributes.getValue("value")) && OptionHelper.isEmpty(attributes.getValue(RESOURCE_ATTRIBUTE));
    }

    boolean checkResourceAttributeSanity(Attributes attributes) {
        return !OptionHelper.isEmpty(attributes.getValue(RESOURCE_ATTRIBUTE)) && OptionHelper.isEmpty(attributes.getValue("name")) && OptionHelper.isEmpty(attributes.getValue("value")) && OptionHelper.isEmpty(attributes.getValue(Action.FILE_ATTRIBUTE));
    }

    boolean checkValueNameAttributesSanity(Attributes attributes) {
        return !OptionHelper.isEmpty(attributes.getValue("name")) && !OptionHelper.isEmpty(attributes.getValue("value")) && OptionHelper.isEmpty(attributes.getValue(Action.FILE_ATTRIBUTE)) && OptionHelper.isEmpty(attributes.getValue(RESOURCE_ATTRIBUTE));
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
    }

    public void finish(InterpretationContext interpretationContext) {
    }

    void loadAndSetProperties(InterpretationContext interpretationContext, InputStream inputStream, ActionUtil.Scope scope) {
        Properties properties = new Properties();
        properties.load(inputStream);
        inputStream.close();
        ActionUtil.setProperties(interpretationContext, properties, scope);
    }
}